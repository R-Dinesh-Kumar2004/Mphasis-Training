package com.demo.servlet;

import java.time.LocalDateTime;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

public class ServerListner implements ServletContextListener{
	
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Time of start : "+LocalDateTime.now());
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("Time of cleanup : "+LocalDateTime.now());
	}
}
