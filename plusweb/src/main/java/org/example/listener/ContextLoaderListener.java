package org.example.listener;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import org.example.config.SpringConfiguration;
import org.example.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ContextLoaderListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext=sce.getServletContext();

//        String contextConfigLocation=servletContext.getInitParameter("contextConfigLocation");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfiguration.class);

        servletContext.setAttribute("app",applicationContext);
        System.out.println("container done");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContextListener.super.contextDestroyed(sce);
    }

}
