#Sample Ratpack Application
-----------------------------

A simple ratpack application to mess around with it. Generated with lazy bones.


    <proj>
      |
      +- src
          |
          +- ratpack
          |     |
          |     +- Ratpack.groovy
          |     +- ratpack.properties
          |     +- public // Static assets in here
          |          |
          |          +- images
          |          +- lib
          |          +- scripts
          |          +- styles
          |
          +- main
          |   |
          |   +- groovy
                   |
                   +- // App classes in here!
          |
          +- test
              |
              +- groovy
                   |
                   +- // Spock tests in here!

start app with

    ./gradlew run