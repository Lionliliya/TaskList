package com.gmail.liliyayalovchenko.Servlets;

import com.gmail.liliyayalovchenko.Dao.Dao;
import com.gmail.liliyayalovchenko.Dao.DaoImplementation;
import com.gmail.liliyayalovchenko.Domain.Task;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "AddTask", urlPatterns = "{/addTask}")
public class AddTaskServlet extends HttpServlet {

    private Dao taskManager = new DaoImplementation();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String category = request.getParameter("category");
        boolean result = taskManager.addTask(new Task(name, category, false));
        String message = result ? "Task successfully added!" :
                "Task already exist in list and cannot be added twice!";

        request.setAttribute("message", message);
        request.setAttribute("list", taskManager.getAllTAsks());
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

}
