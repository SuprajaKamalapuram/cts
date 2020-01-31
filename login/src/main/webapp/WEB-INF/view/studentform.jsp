<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
 <%@page isELIgnored="false" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="processForm" modelAttribute="student">
First Name:<form:input type="text" name="firstName" path="firstName" maxlength="20" required="required"/><br/><br/>
Last Name:<form:input type="text" name="lastName" path="lastName" required="required"/><br/><br/>
Age:<form:input type="number" name="age" path="age" min="18" max="55" /><br/><br/>
Email:<form:input type="email" name="email" path="email"/> <br/><br/>
ZipCode:<form:input type="text" required="" pattern="([0-9]{6}|[0-9]{3}\s[0-9]{3})" path="zipCode"/><br/><br/>
Country:<form:select path="country">
<form:option value="select" label="select..."/>
<form:option value="India" label="India"/>
<form:option value="USA" label="USA"/>
<form:option value="China" label="China"/>
</form:select><br/><br/>
Operating Systems: 
Windows<form:checkbox path="OperatingSystems" value="Windows"/>
MAC OS<form:checkbox path="OperatingSystems" value="MAC OS"/>
Linux<form:checkbox path="OperatingSystems" value="Linux"/><br></br>
<br/>
Gender:
Male<form:radiobutton path="gender" value="Male"/>
Female<form:radiobutton path="gender" value="Female"/>
Other<form:radiobutton path="gender" value="Other"/>
<br></br><br/>
<input type="submit" value="login" />
</form:form>
</body>
</html>