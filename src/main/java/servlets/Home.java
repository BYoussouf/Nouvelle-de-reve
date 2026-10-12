/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author Florian Manse
 */
@WebServlet(name = "home", urlPatterns = "/home")
public class Home extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response
    ) throws ServletException, IOException {        
        this.getServletContext()
                .getRequestDispatcher("/WEB-INF/home.jsp")
                .forward(request, response);
    }

}