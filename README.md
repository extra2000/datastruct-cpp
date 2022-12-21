# datastruct-cpp

| License | Versioning |
| ------- | ---------- |
| [![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT) | [![semantic-release](https://img.shields.io/badge/%20%20%F0%9F%93%A6%F0%9F%9A%80-semantic--release-e10079.svg)](https://github.com/semantic-release/semantic-release) |

Data Structure and Programming Technique for C++14.


## Building for Arty-Z7-20 FPGA

To build for FPGA, see [extra2000/vitis-cpp-datastruct](https://github.com/extra2000/vitis-cpp-datastruct.git).


## Building for `aarch64` and `amd64` using Podman

Prerequisites:
* Host: GNU/Linux only
* Container: Podman `3.4.7` and above. Make sure to configure for rootless.

Build image:
```
podman build -t extra2000/datastruct-cpp -f Dockerfile
```

Create directory for building:
```
mkdir -pv build
chcon -R -v -t container_file_t ./build ./files
```

Build source:
```
podman run -it --rm -v ./files:/opt/files:ro -v ./build:/opt/build:rw --workdir /opt/build extra2000/datastruct-cpp cmake /opt/files
podman run -it --rm -v ./files:/opt/files:ro -v ./build:/opt/build:rw --workdir /opt/build extra2000/datastruct-cpp make -j$(nproc)
```

How to run:
```
podman run -it --rm -v ./build:/opt/build:rw --workdir /opt/build extra2000/datastruct-cpp bash
./datastruct_async_signal
./datastruct_async_timer
./datastruct_big_integer
./datastruct_class
./datastruct_class_template
./datastruct_file_operations --cfgfile test.cfg
./datastruct_float_multiprecision
./datastruct_linkedlist
./datastruct_vector
./datastruct_thread_timer
./datastruct_thread_timer_class
./helloworld
```


## Building for Windows 11 using Microsoft Visual Studio

Prerequisites:
* Windows 11
* Microsoft Visual Studio Community 2022

Launch `Developer PowerShell for VS 2022` and follow instructions below.

Create `build` directory:
```
New-Item -ItemType Directory -Force -Path build
```

Clone `vcpkg` into `build\`:
```
git clone https://github.com/Microsoft/vcpkg.git build\vcpkg
```

*Note: Using [vcpkg](https://vcpkg.io/en/index.html) is recommended by [Microsoft](https://docs.microsoft.com/en-us/visualstudio/test/how-to-use-boost-test-for-cpp?view=vs-2022#install-boost).*

`cd` into build:
```
cd build
```

Bootstrap `vcpkg`:
```
.\vcpkg\bootstrap-vcpkg.bat
```

Install `Boost` locally for this project:
```
.\vcpkg\vcpkg.exe install boost:x64-windows
```

Build project:
```
cmake -DCMAKE_BUILD_TYPE=Debug -DCMAKE_TOOLCHAIN_FILE="../build/vcpkg/scripts/buildsystems/vcpkg.cmake" ../files
```

Compile:
```
cmake --build .
```

How to run:
```
.\Debug\datastruct_async_signal.exe
.\Debug\datastruct_async_timer.exe
.\Debug\datastruct_big_integer.exe
.\Debug\datastruct_class.exe
.\Debug\datastruct_class_template.exe
.\Debug\datastruct_file_operations.exe --cfgfile test.cfg
.\Debug\datastruct_float_multiprecision.exe
.\Debug\datastruct_linkedlist.exe
.\Debug\datastruct_vector.exe
.\Debug\datastruct_thread_timer.exe
.\Debug\datastruct_thread_timer_class.exe
.\Debug\helloworld.exe
```
