SUMMARY = "C++ Data Struct Application"
SECTION = "PETALINUX/apps"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = "boost"

SRC_URI = "\
    file://datastruct_asm_inline/CMakeLists.txt \
    file://datastruct_asm_inline/src/ \
    file://datastruct_async_signal/CMakeLists.txt \
    file://datastruct_async_signal/src/ \
    file://datastruct_async_timer/CMakeLists.txt \
    file://datastruct_async_timer/src/ \
    file://datastruct_big_integer/CMakeLists.txt \
    file://datastruct_big_integer/src/ \
    file://datastruct_class/CMakeLists.txt \
    file://datastruct_class/src/ \
    file://datastruct_class_template/CMakeLists.txt \
    file://datastruct_class_template/src/ \
    file://datastruct_file_operations/CMakeLists.txt \
    file://datastruct_file_operations/src/ \
    file://datastruct_float_multiprecision/CMakeLists.txt \
    file://datastruct_float_multiprecision/src/ \
    file://datastruct_linkedlist/CMakeLists.txt \
    file://datastruct_linkedlist/src/ \
    file://datastruct_thread_timer/CMakeLists.txt \
    file://datastruct_thread_timer/src/ \
    file://datastruct_thread_timer_class/CMakeLists.txt \
    file://datastruct_thread_timer_class/src/ \
    file://datastruct_vector/CMakeLists.txt \
    file://datastruct_vector/src/ \
    file://helloworld/CMakeLists.txt \
    file://helloworld/src/ \
    file://logger/CMakeLists.txt \
    file://logger/src/ \
    file://CMakeLists.txt \
    "

S = "${WORKDIR}"

inherit cmake

EXTRA_OECMAKE = ""
