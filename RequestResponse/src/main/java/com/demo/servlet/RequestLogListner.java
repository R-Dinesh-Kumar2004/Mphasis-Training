package com.demo.servlet;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.http.HttpServletRequest;

public class RequestLogListner implements ServletRequestListener {

    @Override
    public void requestInitialized(ServletRequestEvent sre) {

        try {
            ServletContext context =
                sre.getServletContext();

            FileWriter writer =
                (FileWriter) context.getAttribute("LOG_WRITER");

            HttpServletRequest req =
                (HttpServletRequest) sre.getServletRequest();

            writer.write(
                "REQUEST START | " +
                "Time=" + LocalDateTime.now() +
                " | Method=" + req.getMethod() +
                " | URI=" + req.getRequestURI() +
                " | Query=" + req.getQueryString() +
                "\n"
            );
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void requestDestroyed(ServletRequestEvent sre) {

        try {
            ServletContext context =
                sre.getServletContext();

            FileWriter writer =
                (FileWriter) context.getAttribute("LOG_WRITER");

            writer.write(
                "REQUEST END   | " +
                "Time=" + LocalDateTime.now() +
                " | Response sent\n"
            );
            writer.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}