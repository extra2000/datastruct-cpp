cmake_minimum_required(VERSION 3.21.1)

project(datastruct_class_template)

find_package(Boost 1.74 REQUIRED)

add_executable(datastruct_class_template datastruct_class_template/src/main.cpp)
target_include_directories(datastruct_class_template PRIVATE
    logger/src/include
    datastruct_class_template/src/include
)
target_link_libraries(datastruct_class_template
    logger
)
install(TARGETS datastruct_class_template RUNTIME DESTINATION bin)
