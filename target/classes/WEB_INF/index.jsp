<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html lang="en">
<head>
    <title>Task List</title>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="Simple task list">
    <meta name="author" content="Liliya Yalovchenko">
    <link rel="stylesheet" type="text/css" href="css/bootstrap.css">
</head>
<body style="background-color: #e8edf3">

<div class="container-fluid">
    <h2 class="tasks-header">Task list</h2>

    <p class="text-left" style="color: #22264b; font-style: italic">You can add a new task to the list, remove one or update status to set task
        status completed</p>
    <c:if test="${ not empty message}">
        <p>${message}</p>
    </c:if>

    <div class="table-responsive">
        <table class="table table-striped">
            <thead>
            <tr>
                <th>#</th>
                <th>Name</th>
                <th>Category</th>
                <th>Complete</th>
            </tr>
            </thead>
            <tbody>


            <%! int numb = 1; %>
            <c:forEach var="task" items="${list}">
                <tr>
                    <td><% numb++;%></td>
                    <td>${task.name}</td>
                    <td>${task.category}</td>
                    <td>
                        <input type="radio" name="isDone">
                    </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>
    <div class="row"><input type="submit" value="Update tasks"></div>

    <hr style="width: 95%;">
    <form role="form" action="/addTask" method="post">
        <div class="form-group">
            <label for="taskname">Task name</label>
            <input type="text" class="form-control" id="taskname" name="name" placeholder="Enter task name">
        </div>
        <div class="form-group">
            <label for="taskCategory">Category</label>
            <input type="text" class="form-control" id="taskCategory" name="category" placeholder="Enter category">
        </div>

        <button type="submit" class="btn btn-default">Add task</button>
    </form>
</div>

</body>
</html>
