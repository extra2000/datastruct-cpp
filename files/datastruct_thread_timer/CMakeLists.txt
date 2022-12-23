cmake_minimum_required(VERSION 3.21.1)

project(datastruct_thread_timer)

find_package(Boost 1.74 COMPONENTS log chrono thread REQUIRED)

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
