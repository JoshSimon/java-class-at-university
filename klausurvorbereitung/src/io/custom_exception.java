package io;

public class custom_exception extends Exception {

    public custom_exception () {

    }

    public custom_exception (String message) {
        super (message);
    }

    public custom_exception (Throwable cause) {
        super (cause);
    }

    public custom_exception (String message, Throwable cause) {
        super (message, cause);
    }
}