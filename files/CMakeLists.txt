cmake_minimum_required(VERSION 3.21.1)

project(CPPDataStruct)

# TODO: "CMAKE_HOST_SYSTEM_PROCESSOR" doesn't work when cross compiling "armv7l" on x86_64.
#       because the "CMAKE_HOST_SYSTEM_PROCESSOR" will returns as "x86_64"
# if (${CMAKE_HOST_SYSTEM_PROCESSOR} STREQUAL "armv7l")
#     include(${CMAKE_SOURCE_DIR}/datastruct_asm_inline/CMakeLists.txt)
# endif()

include(${CMAKE_SOURCE_DIR}/logger/CMakeLists.txt)
include(${CMAKE_SOURCE_DIR}/datastruct_async_signal/CMakeLists.txt)
include(${CMAKE_SOURCE_DIR}/datastruct_async_timer/CMakeLists.txt)
include(${CMAKE_SOURCE_DIR}/datastruct_big_integer/CMakeLists.txt)
include(${CMAKE_SOURCE_DIR}/datastruct_class/CMakeLists.txt)
include(${CMAKE_SOURCE_DIR}/datastruct_class_template/CMakeLists.txt)
include(${CMAKE_SOURCE_DIR}/datastruct_file_operations/CMakeLists.txt)
include(${CMAKE_SOURCE_DIR}/datastruct_float_multiprecision/CMakeLists.txt)
include(${CMAKE_SOURCE_DIR}/datastruct_linkedlist/CMakeLists.txt)
include(${CMAKE_SOURCE_DIR}/datastruct_thread_timer/CMakeLists.txt)
include(${CMAKE_SOURCE_DIR}/datastruct_thread_timer_class/CMakeLists.txt)
include(${CMAKE_SOURCE_DIR}/datastruct_vector/CMakeLists.txt)
include(${CMAKE_SOURCE_DIR}/helloworld/CMakeLists.txt)
