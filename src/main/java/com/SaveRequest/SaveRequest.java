package com.SaveRequest;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/save")
public class SaveRequest extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/forma.html").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("userName");
        String surName = req.getParameter("userSurName");
        String age = req.getParameter("userAge");

        if (!name.isBlank() && !surName.isBlank() && !age.isBlank()) {
            req.getRequestDispatcher("/save-request.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("/forma.html");
        }
    }
}
