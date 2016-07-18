package com.gmail.liliyayalovchenko.Servlets;

import com.gmail.liliyayalovchenko.Domain.Task;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "AddTask", urlPatterns = "{/addTask}")
public class AddTaskServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Task> taskList = (List<Task>) request.getSession().getAttribute("list") != null ?
                (List<Task>) request.getSession().getAttribute("list") : new ArrayList<>();
        String name = request.getParameter("name");
        String category = request.getParameter("category");

        boolean result = taskList.add(new Task(name, category, false));
        String message = result ? "Task successfully added!" :
                "Task already exist in list and cannot be added twice!";

        request.setAttribute("message", message);
        request.setAttribute("list", taskList);
        request.getSession().setAttribute("list", taskList);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }


}
