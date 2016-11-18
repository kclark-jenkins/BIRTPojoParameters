package org.krisbox.birt.examples.birt.pojo.utils;

public interface BIRTPojoLogger {
    public void debug(Object msg);
    public void info(Object msg);
    public void warn(Object msg);
    public void error(Object msg);
    public void fatal(Object msg);
}
