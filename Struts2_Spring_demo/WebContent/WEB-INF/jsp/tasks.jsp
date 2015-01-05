<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Tasks</title>
</head>
<body>
	<s:iterator value="tasks" var="task">
    	<li>
    	${task.num}&nbsp;&nbsp;&nbsp;&nbsp;
    	${task.name}&nbsp;&nbsp;&nbsp;&nbsp;
    	${task.desc}
    	</li>
    </s:iterator>
</body>
</html>