package com.demo.servlet;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

public class AppLogListner implements ServletContextListener {

    private FileWriter writer;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        try {
            ServletContext context = sce.getServletContext();

            String logPath =
                context.getRealPath("/") + "application.log";

            System.out.println("LOG PATH = " + logPath);

            writer = new FileWriter(logPath, true);

            context.setAttribute("LOG_WRITER", writer);

            writer.write(
                "APPLICATION STARTED at " +
                LocalDateTime.now() + "\n"
            );
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        try {
            ServletContext context = sce.getServletContext();
            FileWriter writer =
                (FileWriter) context.getAttribute("LOG_WRITER");

            writer.write(
                "APPLICATION STOPPED at " +
                LocalDateTime.now() + "\n"
            );
            writer.flush();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}