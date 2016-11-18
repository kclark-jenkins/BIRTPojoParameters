package org.krisbox.birt.examples.birt.pojo.utils.impl;

import org.apache.log4j.Logger;
import org.krisbox.birt.examples.birt.pojo.utils.BIRTPojoLogger;

public class BIRTPojoLoggerImpl implements BIRTPojoLogger {
    private final Logger LOGGER = Logger.getLogger(BIRTPojoLogger.class);

    public void debug(Object msg) {
        LOGGER.debug(msg);
    }

    public void info(Object msg) {
        LOGGER.info(msg);
    }

    public void warn(Object msg) {
        LOGGER.warn(msg);
    }

    public void error(Object msg) {
        LOGGER.error(msg);
    }

    public void fatal(Object msg) {
        LOGGER.fatal(msg);
    }
}
