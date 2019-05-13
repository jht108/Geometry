package com.grometry.log;

import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author jht
 * @date 2019/5/13 -23:05
 */
@Controller
@RequestMapping(value = "/log")
public class LogDemo {
    public static final Logger log = LoggerFactory.getLogger(LogDemo.class);
    public static void main(String[] args) {
        String name = "gromary";
        log.debug("My name is "+name);
    }
    @RequestMapping(value = "/debug")
    public void debug() {
        System.out.println("why");
        log.debug("debug hello world!");
    }

    @RequestMapping(value = "/file")
    @ResponseBody
    public String fileAppender(){
        log.debug("file appender!");
        return "hello world";
    }
}
