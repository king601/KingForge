package com.king601.kingforge.util;

import com.king601.kingforge.reference.Reference;
import cpw.mods.fml.common.FMLLog;
import org.apache.logging.log4j.Level;

public class LogHelper {

    // Need to credit Pahimar as his code was a major reference for this
    // Thanks Pahimar of EE3 http://github.com/Pahimar for being a great reference
    public static void log(Level logLevel, Object object) {
        FMLLog.log(Reference.MOD_NAME, logLevel, String.valueOf(object));
    }

    public static void all(Object object) {
        log(Level.ALL, object);
    }

    public static void debug(Object object) {
        log(Level.DEBUG, object);
    }

    public static void error(Object object) {
        log(Level.ERROR, object);
    }

    public static void fatal(Object object) {
        log(Level.FATAL, object);
    }

    public static void info (Object object) {
        log(Level.INFO, object);
    }

    public static void off(Object object) {
        log(Level.OFF, object);
    }

    public static void trace(Object object) {
        log(Level.TRACE, object);
    }

    public static void warn(Object object) {
        log(Level.WARN, object);
    }

}
