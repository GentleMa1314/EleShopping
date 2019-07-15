package com.mj.Aop;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

public class WebLog4j {

    private Logger logger=Logger.getLogger(getClass());

    @Pointcut("execution(public * com.mj.controller..*.*(..))")
    public void webLog() {



    }



    @Before("webLog()")
    public void doBefore(JoinPoint joinPoint) throws Throwable {

        // 接收到请求，记录请求内容

        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();

        HttpServletRequest request = attributes.getRequest();

        // 记录下请求内容

        logger.info("---------------request----------------");

        logger.info("URL : " + request.getRequestURL().toString());

        logger.info("HTTP_METHOD : " + request.getMethod());

        logger.info("IP : " + request.getRemoteAddr());

        Enumeration<String> enu = request.getParameterNames();

        while (enu.hasMoreElements()) {

            String name = (String) enu.nextElement();

            logger.info("name:" + name + "value" + request.getParameter(name));

        }

    }



    @AfterReturning(returning = "ret", pointcut = "webLog()")

    public void doAfterReturning(Object ret) throws Throwable {

        logger.info("---------------response----------------");

        // 处理完请求，返回内容

        logger.info("RESPONSE : " + ret);

    }
}
