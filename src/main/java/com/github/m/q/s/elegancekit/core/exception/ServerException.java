package com.github.m.q.s.elegancekit.core.exception;

/**
 *@Author: mqs
 *@CreateTime: 2024-12-04
 *@Description: ${description}
 *@Version: 1.0
 */
public class ServerException extends RuntimeException {

    private int code;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public ServerException(){}

    public ServerException(int code, String message) {
        super(message);
        this.code = code;
    }

    private Exception realException;

    public Exception getRealException() {
        return realException;
    }

    public void setRealException(Exception realException) {
        this.realException = realException;
    }

    public ServerException(final int errorCode, final String message, Exception trueException) {
        super(message);
        this.realException = trueException;
        this.code = errorCode;
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }

    @Override
    public String toString() {
        return "ServerException{" +
                "code=" + code +
                ", message=" + super.getMessage() +
                '}';
    }
}
