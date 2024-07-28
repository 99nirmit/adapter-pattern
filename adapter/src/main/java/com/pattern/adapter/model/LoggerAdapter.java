package com.pattern.adapter.model;

public class LoggerAdapter implements NewLogger{

    private OldLogger oldLogger;

    public LoggerAdapter(OldLogger oldLogger) {
        this.oldLogger = oldLogger;
    }

    @Override
    public void log(String message) {
        oldLogger.logMsg(message);
    }
}
