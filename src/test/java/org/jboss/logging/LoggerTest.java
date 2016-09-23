package org.jboss.logging;

import static org.junit.Assert.*;

/**
 * Created by yannickb on 22/09/2016.
 */
public class LoggerTest {
    @org.junit.Test
    public void getLoggerPlugin() throws Exception {
        Logger log = Logger.getLogger("test");
        LoggerPlugin loggerPlugin = log.getLoggerPlugin();
        assertNotNull(loggerPlugin);
        assertTrue(loggerPlugin instanceof Log4jLoggerPlugin);

    }

}