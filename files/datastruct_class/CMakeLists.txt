cmake_minimum_required(VERSION 3.21.1)

project(datastruct_class)

find_package(Boost 1.74 REQUIRED)

add_executable(datastruct_class
    datastruct_class/src/main.cpp
    datastruct_class/src/lib/engine.cpp
)
target_include_directories(datastruct_class PRIVATE
    logger/src/include
    datastruct_class/src/include
)
target_link_libraries(datastruct_class
    logger
)
install(TARGETS datastruct_class RUNTIME DESTINATION bin)
