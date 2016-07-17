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
  <h2 class="tasks-header">Task status</h2>

  <p class="text-left" style="color: #22264b; font-size: 20px; font-style: italic">${message}</p>
  <a href="<c:url value="/index.jsp"/>">Go tasks list</a>

  </div>


</body>
</html>
