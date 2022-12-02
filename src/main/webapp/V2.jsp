<%@page import="com.kim.sep214.main.Beaver"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<hr>
${param.x }<p>
${param.y }<p>
${param.x * param.y }<p>
${z }<p>
<hr>
${b.name }:${b.age }:${b.height }:${b.weight }<p>
<hr>
${param.klsdjgfklsdfsdklfsdklf }<!-- 媛��� ���� �� 洹몃�� ���닿���嫄� ���� -->
<hr>
${bvs }<p>
${bvs[1] }<p>
${bvs[2].name }<p>
${bvs[3].age },${bvs[3].age }<p>
</body>
</html>