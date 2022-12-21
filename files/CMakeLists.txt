cmake_minimum_required(VERSION 3.21.1)

project(CPPDataStruct)

if(WIN32)
    include(GenerateExportHeader)
endif()

find_package(Boost 1.74 COMPONENTS log chrono thread program_options filesystem REQUIRED)

# logger
add_library(logger SHARED logger/src/lib/logger.cpp)
set_target_properties(logger PROPERTIES
    VERSION   1.0.0
    SOVERSION 1
)
target_compile_definitions(logger PRIVATE BOOST_ALL_DYN_LINK)
target_include_directories(logger PRIVATE logger/src/include)
target_link_libraries(logger Boost::log)
if(WIN32)
    generate_export_header(logger)
endif()
install(TARGETS logger
    LIBRARY
        COMPONENT Runtime
        NAMELINK_SKIP
        DESTINATION lib
)
install(TARGETS logger
    LIBRARY
        COMPONENT Development
        NAMELINK_ONLY
        DESTINATION lib
)

# datastruct_async_signal
add_executable(datastruct_async_signal datastruct_async_signal/src/main.cpp)
target_compile_definitions(datastruct_async_signal PRIVATE BOOST_ALL_DYN_LINK)
target_include_directories(datastruct_async_signal PRIVATE logger/src/include)
target_link_libraries(datastruct_async_signal
    logger
    Boost::log
)
install(TARGETS datastruct_async_signal RUNTIME DESTINATION bin)

# datastruct_async_timer
add_executable(datastruct_async_timer datastruct_async_timer/src/main.cpp)
target_compile_definitions(datastruct_async_timer PRIVATE BOOST_ALL_DYN_LINK)
target_include_directories(datastruct_async_timer PRIVATE logger/src/include)
target_link_libraries(datastruct_async_timer
    logger
    Boost::log
)
install(TARGETS datastruct_async_timer RUNTIME DESTINATION bin)

# datastruct_big_integer
add_executable(datastruct_big_integer datastruct_big_integer/src/main.cpp)
target_include_directories(datastruct_big_integer PRIVATE
    logger/src/include
    datastruct_big_integer/src/include
)
target_link_libraries(datastruct_big_integer logger)
install(TARGETS datastruct_big_integer RUNTIME DESTINATION bin)

# datastruct_class
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

# datastruct_class_template
add_executable(datastruct_class_template datastruct_class_template/src/main.cpp)
target_include_directories(datastruct_class_template PRIVATE
    logger/src/include
    datastruct_class_template/src/include
)
target_link_libraries(datastruct_class_template
    logger
)
install(TARGETS datastruct_class_template RUNTIME DESTINATION bin)

# datastruct_file_operations
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

# datastruct_float_multiprecision
add_executable(datastruct_float_multiprecision datastruct_float_multiprecision/src/main.cpp)
target_include_directories(datastruct_float_multiprecision PRIVATE
    logger/src/include
    datastruct_float_multiprecision/src/include
)
target_link_libraries(datastruct_float_multiprecision logger)
install(TARGETS datastruct_float_multiprecision RUNTIME DESTINATION bin)

# datastruct_linkedlist
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

# datastruct_thread_timer
add_executable(datastruct_thread_timer datastruct_thread_timer/src/main.cpp)
target_compile_definitions(datastruct_thread_timer PRIVATE BOOST_ALL_DYN_LINK)
target_include_directories(datastruct_thread_timer PRIVATE logger/src/include)
target_link_libraries(datastruct_thread_timer
    logger
    Boost::log
    Boost::chrono
    Boost::thread
)
install(TARGETS datastruct_thread_timer RUNTIME DESTINATION bin)

# datastruct_thread_timer_class
add_executable(datastruct_thread_timer_class
    datastruct_thread_timer_class/src/main.cpp
    datastruct_thread_timer_class/src/lib/engine.cpp
)
target_compile_definitions(datastruct_thread_timer_class PRIVATE BOOST_ALL_DYN_LINK)
target_include_directories(datastruct_thread_timer_class PRIVATE
    logger/src/include
    datastruct_thread_timer_class/src/include
)
target_link_libraries(datastruct_thread_timer_class
    logger
    Boost::log
    Boost::chrono
    Boost::thread
)
install(TARGETS datastruct_thread_timer_class RUNTIME DESTINATION bin)

# datastruct_vector
add_executable(datastruct_vector datastruct_vector/src/main.cpp)
target_include_directories(datastruct_vector PRIVATE logger/src/include)
target_link_libraries(datastruct_vector logger)
install(TARGETS datastruct_vector RUNTIME DESTINATION bin)

# helloworld
add_executable(helloworld helloworld/src/main.cpp)
target_include_directories(helloworld PRIVATE logger/src/include)
target_link_libraries(helloworld logger)
install(TARGETS helloworld RUNTIME DESTINATION bin)
