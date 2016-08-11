<jsp:directive.include file="/WEB-INF/views/includes.jsp" />

<!DOCTYPE html>
<html>

	<head>
		<title><tiles:getAsString name="title"/></title>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link rel="shortcut icon" href="<c:url value="/resources/img/favicon.ico"/>" type="image/x-icon" >
		
		<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap_3.0.2.css"/>"/>
		<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/error.css"/>"/>
		<style type="text/css">
			body {
				padding-top: 10px;
				padding-bottom: 10px;
			}
			.sidebar-nav {
				padding: 9px 0;
			}
			.container {
				width: 80%;
			}

			/* The white background content wrapper */
			.container > .content {
				background-color: #fff;
				padding: 40px;
				margin: 0 -20px; 
				-webkit-border-radius: 10px 10px 10px 10px;
				   -moz-border-radius: 10px 10px 10px 10px;
				        border-radius: 10px 10px 10px 10px;
				-webkit-box-shadow: 0 1px 2px rgba(0,0,0,.15);
				   -moz-box-shadow: 0 1px 2px rgba(0,0,0,.15);
				        box-shadow: 0 1px 2px rgba(0,0,0,.15);
			}

			.login-form {
				margin-left: 65px;
			}
			
			legend {
				margin-right: -50px;
				font-weight: bold;
				color: #404040;
			}

		</style>
		
		<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
	    <!--[if lt IE 9]>
	      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
	    <![endif]-->
    
		<script src="<c:url value="/resources/js/jquery-1.10.2.js"/>"></script>
		<script src="<c:url value="/resources/js/jquery-ui-1.9.2.custom.min.js"/>"></script>
		<script src="<c:url value="/resources/js/bootstrap_3.0.2.js"/>"></script>
		
	</head>

	<body>
		

		<div class="container">
			<div class="content">
				<tiles:insertAttribute name="content" />
			</div>
		</div> <!-- /container -->

	</body>
</html>
