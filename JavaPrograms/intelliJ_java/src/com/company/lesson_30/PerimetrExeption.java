package com.company.lesson_30;



public class PerimetrExeption extends Exception {
    public PerimetrExeption() {
    }

    public PerimetrExeption(String message) {
        super(message);
    }

    public PerimetrExeption(String message, Throwable cause) {
        super(message, cause);
    }

    public PerimetrExeption(Throwable cause) {
        super(cause);
    }

    public PerimetrExeption(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
