<jsp:directive.include file="/WEB-INF/views/includes.jsp" />

<c:if test="${not empty SPRING_SECURITY_LAST_EXCEPTION.message}">
	<div class="alert alert-error">
		Não foi possível realizar o Login!<br><br>
        Motivo: <b>${sessionScope.SPRING_SECURITY_LAST_EXCEPTION.message}</b>
	</div>
</c:if>

<script>
	$(window).ready(function() {
		$('#j_username').focus();
	});
</script>

<div class="row">
	<div class="login-form">
		<h2>Login</h2>
		<form name="formLogin" id="formLogin"  action="<c:url value='/j_spring_security_check'/>" method="post">
			<fieldset>
				<div class="clearfix">

					<input type="text" 
						placeholder="usuario@email.com.br"
						id="j_username" 
						name="j_username">

				</div>
				<div class="clearfix">

					<input type="password" 
						placeholder="senha" 
						name="j_password">

				</div>
				<button class="btn btn-primary" type="submit">Login</button>
			</fieldset>
		</form>
	</div>
</div>
