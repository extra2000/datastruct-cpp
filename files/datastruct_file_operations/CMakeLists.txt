cmake_minimum_required(VERSION 3.21.1)

project(datastruct_file_operations)

find_package(Boost 1.74 COMPONENTS program_options filesystem REQUIRED)

add_executable(datastruct_file_operations
    datastruct_file_operations/src/main.cpp
    datastruct_file_operations/src/lib/engine.cpp
)
target_include_directories(datastruct_file_operations PRIVATE
    logger/src/include
    datastruct_file_operations/src/include
)
if(WIN32)
    target_link_libraries(datastruct_file_operations
        logger
        Boost::program_options
        Boost::filesystem
        bcrypt
    )
else()
    target_link_libraries(datastruct_file_operations
        logger
        Boost::program_options
        Boost::filesystem
    )
endif()
install(TARGETS datastruct_file_operations RUNTIME DESTINATION bin)
