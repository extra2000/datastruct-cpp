cmake_minimum_required(VERSION 3.21.1)

project(helloworld)

find_package(Boost 1.74 REQUIRED)

add_executable(helloworld helloworld/src/main.cpp)
target_include_directories(helloworld PRIVATE logger/src/include)
target_link_libraries(helloworld logger)
install(TARGETS helloworld RUNTIME DESTINATION bin)
