<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Expression Language</title>
</head>
<body>
${1<2}
${1+2+3}
${10.2 + 20.3}
${50 mod 8}
${(10==20) ? "true" : "false"}
${param.cpf}
${param.senha}
</body>
</html>