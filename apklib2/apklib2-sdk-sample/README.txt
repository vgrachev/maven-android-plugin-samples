
!!! 6 easy steps to test apklib2 with ant build.xml from sdk !!!

1. create new android project:

    android create project \
	--target 10 \
	--name apklib2_sdk_sample \
	--path apklib2-sdk-sample \
	--activity MainActivity \
	--package com.jayway.maven.plugins.android.generation2.samples.apklibs.mainapp

2. copy resources & sources from apklib2-mainapp

    cp -R ../apklib2-mainapp/res apklib2-sdk-sample
    cp -R ../apklib2-mainapp/src apklib2-sdk-sample

3. copy and unzip libraries apklib2-lib1 & apklib2-lib2

    mkdir lib1
    cp ../apklib2-lib1/target/*.apklib2 lib1
    cd lib1 unzip *.apklib2
    cd ../

    mkdir lib2
    cp ../apklib2-lib2/target/*.apklib2 lib2
    cd lib2 unzip *.apklib2
    cd ../

4. link this libraries in project.properties

    echo "android.library.reference.1=../lib1" >> apklib2-sdk-sample/project.properties
    echo "android.library.reference.2=../lib2" >> apklib2-sdk-sample/project.properties

5. download commons-io-2.1.jar from http://commons.apache.org/io/download_io.cgi to apklib2-sdk-sample/libs

6. go to apklib2-sdk-sample and run
    ant debug

    enjoy!

PS: or just run ./create_project.sh and "ant debug"