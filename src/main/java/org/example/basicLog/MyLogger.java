package org.example.basicLog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyLogger {

    private static final Logger logger = LoggerFactory.getLogger(MyLogger.class);

    public void myMethod() {
        logger.debug("debug message");
        logger.info("info message");
        logger.warn("warning message");
        logger.error("error message", new Exception("Something went wrong!"));
    }

    public static void main(String[] args) {
        MyLogger logger = new MyLogger();
        logger.myMethod();
    }
}
