===============================================================================
MAVEN ANDROID PLUGIN VERSION 2 - NATIVE SAMPLES
===============================================================================

The Native Samples is a set of simple examples that aims to demonstrate the
usage of the native compilation capabilities of the Maven Android plugin.

-- Pre-requisites

The Android Native Development Kit (Android NDK) must be installed on the local
machine.  In order to configure the NDK for Maven Android plugin, set an environment
variable to point to the NDK install directory.

export ANDROID_NDK_HOME=<path to the Android NDK>

Alternatively, you can provide the path to the NDK on the Maven command line:

mvn -Dandroid.ndk.path=<path to the Android NDK> clean install

-- Native Samples Scope

The examples cover the following scenarios:

- building only a native library (native-code)
- building a APK referencing a native library as part of the source tree (java-with-native-library)
- building a APK referencing a native library as a dependency (java-with-native-dependency)
- building a native library & APK containing the built library (mixed-java-native-library)

-- Building the Native Samples

All the native samples should build with the usual 'mvn clean install' command.

-- Running the Native Samples

For the native samples that produce and APK, the resulting artifact (.apk) should be installable
directly on the target device and/or emulator.