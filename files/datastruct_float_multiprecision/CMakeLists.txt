cmake_minimum_required(VERSION 3.21.1)

project(datastruct_float_multiprecision)

find_package(Boost 1.74 REQUIRED)

add_executable(datastruct_float_multiprecision datastruct_float_multiprecision/src/main.cpp)
target_include_directories(datastruct_float_multiprecision PRIVATE
    logger/src/include
    datastruct_float_multiprecision/src/include
)
target_link_libraries(datastruct_float_multiprecision logger)
install(TARGETS datastruct_float_multiprecision RUNTIME DESTINATION bin)
