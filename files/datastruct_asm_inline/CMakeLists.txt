cmake_minimum_required(VERSION 3.21.1)

project(datastruct_asm_inline)

find_package(Boost 1.74 REQUIRED)

add_executable(datastruct_asm_inline datastruct_asm_inline/src/main.cpp)
target_include_directories(datastruct_asm_inline PRIVATE logger/src/include)
target_link_libraries(datastruct_asm_inline logger)
install(TARGETS datastruct_asm_inline RUNTIME DESTINATION bin)
