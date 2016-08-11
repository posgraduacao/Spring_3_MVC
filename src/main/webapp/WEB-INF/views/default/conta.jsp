<jsp:directive.include file="/WEB-INF/views/includes.jsp" />

<html>
<head>
<style>
.errorClass {
	color: red;
}

</style>
</head>

<body>
	<c:url var="urlPost" value="/requisicao/calcular/somar" />
	<form:form modelAttribute="conta" action="${urlPost}" method="POST">
	  
	  	<%--
	  	 --%>
		<form:errors path="*" cssClass="errorClass" /><br><br>  
		
		Operador 1:<br>
		<form:input path="operator1" cssErrorClass="errorClass"  />
		<%--
		 --%>
		<form:errors path="operator1" />
		<br>+<br>
		
		<%--
		<fmt:message key="label.operador2"/>
		 --%>
		Operador 2:<br>
		<form:input path="operator2" />
		<%--
		     --%>
		<form:errors path="operator2" />
		<br><br>
		<input type="submit" value="Calcular" />  
	</form:form> 
</body>
</html>