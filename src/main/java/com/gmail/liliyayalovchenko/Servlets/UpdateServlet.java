package com.gmail.liliyayalovchenko.Servlets;

import com.gmail.liliyayalovchenko.Domain.Task;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "UpdateServlet", urlPatterns = "{/updateList}")
public class UpdateServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Task> tasks = (List<Task>) request.getSession().getAttribute("list");
        List<Task> chekedTasks = new ArrayList<>();
        List<String> statuses = Arrays.asList(request.getParameterValues("isDone"));

        for (Task task : tasks) {
            String taskName = task.getName();
            if (!statuses.contains(taskName)) {
                chekedTasks.add(task);
            }
        }

        request.getSession().setAttribute("list", chekedTasks);
        request.setAttribute("list", chekedTasks);
        request.getRequestDispatcher("/index.jsp").forward(request, response);

    }
}
