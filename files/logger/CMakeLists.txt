cmake_minimum_required(VERSION 3.21.1)

project(logger)

if(WIN32)
    include(GenerateExportHeader)
endif()

find_package(Boost 1.74 COMPONENTS log REQUIRED)

add_library(logger SHARED logger/src/lib/logger.cpp)
set_target_properties(logger PROPERTIES
    VERSION   1.0.0
    SOVERSION 1
)
target_compile_definitions(logger PRIVATE BOOST_ALL_DYN_LINK)
target_include_directories(logger PRIVATE logger/src/include)
target_link_libraries(logger Boost::log)
if(WIN32)
    generate_export_header(logger)
endif()
install(TARGETS logger
    LIBRARY
        COMPONENT Runtime
        NAMELINK_SKIP
        DESTINATION lib
)
install(TARGETS logger
    LIBRARY
        COMPONENT Development
        NAMELINK_ONLY
        DESTINATION lib
)
