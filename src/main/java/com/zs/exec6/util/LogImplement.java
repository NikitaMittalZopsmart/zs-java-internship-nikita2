package com.zs.exec6.util;

import java.util.logging.Logger;

/**
 * This class is used to make a logger object to implment logging.
 */
public class LogImplement {
    private static java.util.logging.Logger logger;

    /**
     * This is returning a logger object.
     *
     * @return Returning a logger object.
     */
    public static void getLog() {
        System.setProperty("java.util.logging.config.file",
                "/home/raramuri/IdeaProjects/zs-java-internship-nikita/src/main/resources/logging.properties");




    }
    public static Logger initialize()
    {
        logger=logger = java.util.logging.Logger.getLogger(LogImplement.class.getName());
        return logger;
    }
}
