https://guides.gradle.org/creating-multi-project-builds/

gradle init --dsl kotlin

mkdir greeting-library
cd greeting-library
gradle build

mkdir greeter
cd greeter
gradle build
