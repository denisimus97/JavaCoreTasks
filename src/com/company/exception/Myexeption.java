package com.company.exception;

import java.sql.SQLOutput;
import java.util.*;

public class Myexeption extends Exception {
    private Throwable cause = this;
    private String detailMessage;


    @Override
    public synchronized Throwable initCause(Throwable cause) {
        if (this.cause != this)
            throw new IllegalStateException("Can't overwrite cause with " +
                    Objects.toString(cause, "a null"), this);
        if (cause == this)
            throw new IllegalArgumentException("Self-causation not permitted", this);
        this.cause = cause;
        return this;
    }

    @Override
    public Throwable getCause() {

        return (cause == this ? null : cause);
    }

    @Override
    public String getMessage() {
        return "Error. Bad quantity of elements.";
    }

    @Override
    public String toString() {
        if (cause != this)
            return cause.toString() + "\n" + getMessage();
        else return getMessage();
    }

}




