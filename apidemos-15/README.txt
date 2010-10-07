apidemos-15-app
    A demo app with some different things in it. (Source code is from the official Android SDK samples.)
    To compile and install to local maven repository:

    cd apidemos-15-app
    mvn install
    
apidemos-15-instrumentationtest
    Tests that can be run on the device. (Source code is from the official Android SDK samples.)
    To compile, install to connected phone/emulator, and run the tests on the device:

    cd apidemos-15-instrumentationtest
    mvn install

You can have it all built, the app deployed and the tests executed in one command line call if you run
    
    mvn clean install

in the apidemos-15 folder.