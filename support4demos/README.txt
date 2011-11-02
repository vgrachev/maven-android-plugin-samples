This project code is a copy of the Support4Demos application available with
the SDK as a sample for the V4 r4 compatibility library.

http://developer.android.com/sdk/compatibility-library.html
http://developer.android.com/resources/samples/Support4Demos/index.html

You will need Android 4.0 and the Android compatibility library from your
SDK deployed into your Maven repository. Use the Maven Android SDK Deployer
to do that.

https://github.com/mosabua/maven-android-sdk-deployer

To build, deploy and run the app on all attached devices/emulators.

mvn clean install android:deploy android:run