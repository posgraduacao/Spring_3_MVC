<jsp:directive.include file="/WEB-INF/views/includes.jsp" />

<!DOCTYPE html>
<html>

	<head>
		<title><tiles:getAsString name="title"/></title>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=no">
		
		<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap_2.3.2.css"/>"/>
		<style type="text/css">
			/* Override some defaults */
			html, body {
				background-color: #eee;
			}
			body {
				padding-top: 95px;
				padding-bottom: 40px;
			}
			.sidebar-nav {
				padding: 9px 0;
			}
			.container {
				width: 300px;
			}

			/* The white background content wrapper */
			.container > .content {
				background-color: #fff;
				padding: 20px;
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
    
		<script src="http://code.jquery.com/jquery-latest.js"></script>
		<script src="<c:url value="/resources/js/bootstrap_2.3.2.js"/>"></script>
		
	</head>

	<body>
		<div class="navbar navbar-inverse navbar-fixed-top">
			<div class="navbar-inner">
				<div class="container-fluid">
					LOGO
				</div>
			</div>
		</div>

		<div class="container">
			<div class="content">
				<tiles:insertAttribute name="content" />
			</div>
		</div> <!-- /container -->
		
	</body>
</html>
