cmake_minimum_required(VERSION 3.21.1)

project(CPPDataStruct)

find_package(Boost 1.74 REQUIRED)

add_executable(datastruct_linkedlist
    datastruct_linkedlist/src/main.cpp
    datastruct_linkedlist/src/lib/engine.cpp
)
target_include_directories(datastruct_linkedlist PRIVATE
    logger/src/include
    datastruct_linkedlist/src/include
)
if(WIN32)
    target_link_libraries(datastruct_linkedlist logger bcrypt)
else()
    target_link_libraries(datastruct_linkedlist logger)
endif()
install(TARGETS datastruct_linkedlist RUNTIME DESTINATION bin)
