cmake_minimum_required(VERSION 3.21.1)

project(datastruct_async_timer)

find_package(Boost 1.74 COMPONENTS log REQUIRED)

add_executable(datastruct_async_timer datastruct_async_timer/src/main.cpp)
target_compile_definitions(datastruct_async_timer PRIVATE BOOST_ALL_DYN_LINK)
target_include_directories(datastruct_async_timer PRIVATE logger/src/include)
target_link_libraries(datastruct_async_timer
    logger
    Boost::log
)
install(TARGETS datastruct_async_timer RUNTIME DESTINATION bin)
