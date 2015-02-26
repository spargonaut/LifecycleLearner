builds and deploys/runs on an avd with android studio 1.0.2

run the application to see when certain methods get called.

you'll probably get better logging messages on an actual device as oppsed to an emulator, but YMMV.

have fun

build on the CLI with: ./gradlew clean build

the tests won't currently run from Android Studio, but they will from the CLI (haven't tested running the tests with IntelliJ yet)
