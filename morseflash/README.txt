MorseFlash

MorseFlash is a (very) simple sample application written by Manfred Moser <manfred@simpligility.com>

It was created to demonstrate the project setup needed to use the maven-android-plugin in a more complex project
including separate libraries as well as instrumentation testing.

In the following are a couple of pointers to building the project.

Device/Emulator
---------------

ensure that you have a emulator with Android 1.6 or higher running or an equivalent device attached. If you would like
the build to start and emulator ensure that an avd with the name "16" exists.

Full Build
----------

A full build can be executed with the command

mvn clean install

This will build everything as well as deploy the app to the emulator/device and execute the instrumentation tests there.

Release Build
-------------

A release type build like it would be necessary for publication of the application to the Android market and the necessary
steps for it is configured. The following preparation for the execution is necessary:

TODO

After this preparation the release build can be invoked with

mvn clean install -P release