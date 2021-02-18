# Spring Boot Remote Syslog Client

## Author

Rodrigo Fabián Andrés Fuentealba Cartes
rodrigo.fuentealba.cartes@protonmail.com

## License

This code is intended for testing purposes, therefore it is public domain.

## What is this?

For a certain project I had to configure several Spring Boot applications to write logs to a remote server.
Therefore I wrote this small application (it just responds with "OK" when visiting http://localhost:8080/),
and used it to test and fine tune the remote server configuration.

## How can I use it?

If you have a Spring Boot application, you can take the file **src/main/resources/logback.xml**, and modify
your remote syslog server's location.

Then in your code, you can use:

	Logger logger = (Logger) LoggerFactory.getLogger("logname");

And then invoke it with:

	logger.debug("Your log.");
	logger.info("Your log.");
	logger.warn("Your log.");
	logger.error("Your log.");

That's all.

Have fun!