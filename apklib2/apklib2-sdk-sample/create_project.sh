#!/bin/bash

android create project \
--target android-10 \
--name apklib2_sdk_sample \
--path apklib2-sdk-sample \
--activity MainActivity \
--package com.jayway.maven.plugins.android.generation2.samples.apklibs.mainapp

cp -R ../apklib2-mainapp/res apklib2-sdk-sample
cp -R ../apklib2-mainapp/src/main/java/com apklib2-sdk-sample/src

mkdir lib1
cp ../apklib2-lib1/target/*.apklib2 lib1
cd lib1; unzip *.apklib2; cd ../

mkdir lib2
cp ../apklib2-lib2/target/*.apklib2 lib2
cd lib2; unzip *.apklib2; cd ../

echo "android.library.reference.1=../lib1" >> apklib2-sdk-sample/project.properties
echo "android.library.reference.2=../lib2" >> apklib2-sdk-sample/project.properties

cp commons-io-2.1.jar apklib2-sdk-sample/libs