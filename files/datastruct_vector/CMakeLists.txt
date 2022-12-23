cmake_minimum_required(VERSION 3.21.1)

project(datastruct_vector)

find_package(Boost 1.74 REQUIRED)

add_executable(datastruct_vector datastruct_vector/src/main.cpp)
target_include_directories(datastruct_vector PRIVATE logger/src/include)
target_link_libraries(datastruct_vector logger)
install(TARGETS datastruct_vector RUNTIME DESTINATION bin)
