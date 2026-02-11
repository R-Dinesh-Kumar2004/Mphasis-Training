package com.servlet;

import jakarta.servlet.AsyncContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

@WebServlet(value = "/temperature", asyncSupported = true)
public class TemperatureServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		AsyncContext asyncContext = request.startAsync();
		
		asyncContext.start(() -> {
			try {
				Thread.sleep(2000);
				int temperature = 20 + new Random().nextInt(10);
				asyncContext.getResponse().getWriter().write(String.valueOf(temperature));
				
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				asyncContext.complete();
			}
		});
	}
}
