package app.ecom.filters;

import java.io.IOException;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.*;

//@WebFilter("/*")
public class AuthFilter implements Filter {

    @Override
    public void doFilter(ServletRequest req, ServletResponse res,
                         FilterChain chain)
            throws IOException, ServletException {
    	
    	System.out.println("Auth filter");
        HttpServletRequest request = (HttpServletRequest) req;
        HttpServletResponse response = (HttpServletResponse) res;

        String uri = request.getRequestURI();

        // Public resources/urls
        if (uri.endsWith("login.jsp")
                || uri.endsWith("/login")
                || uri.contains("/css/")
                || uri.contains("/js/")) {
        	
        	System.out.println("publice resources/urls before do filter");
            chain.doFilter(req, res);
            System.out.println("publice resources/urls after do filter");
            return;
        }

        HttpSession session = request.getSession(false);

        if (session != null && session.getAttribute("username") != null) {
        	System.out.println("loged in /urls before do filter");
            chain.doFilter(req, res); // user is logged in
            System.out.println("loged in /urls after do filter");
        } else {
            response.sendRedirect(
                request.getContextPath() + "/login.jsp");
        }
    }
}
