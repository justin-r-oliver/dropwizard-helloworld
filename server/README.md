# DropWizard Hello World

Simple Dropwizard application demonstrating the following:

* resource serving
* asset bundles

Based on steps found in:
* http://www.dropwizard.io/0.9.1/docs/getting-started.html
* http://www.dropwizard.io/0.9.1/docs/manual/core.html#man-core-bundles

## Usage

Start up:

java -jar target/dropwizard-helloworld-server-1.0-SNAPSHOT.jar server hello-world.yml


Serve resource:

http://localhost:8080/api/hello-world

Serve asset:

http://localhost:8080/

