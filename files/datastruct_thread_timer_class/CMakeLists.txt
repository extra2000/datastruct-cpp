cmake_minimum_required(VERSION 3.21.1)

project(datastruct_thread_timer_class)

find_package(Boost 1.74 COMPONENTS log chrono thread REQUIRED)

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
