cmake_minimum_required(VERSION 3.21.1)

project(datastruct_big_integer)

find_package(Boost 1.74 REQUIRED)

add_executable(datastruct_big_integer datastruct_big_integer/src/main.cpp)
target_include_directories(datastruct_big_integer PRIVATE
    logger/src/include
    datastruct_big_integer/src/include
)
target_link_libraries(datastruct_big_integer logger)
install(TARGETS datastruct_big_integer RUNTIME DESTINATION bin)
