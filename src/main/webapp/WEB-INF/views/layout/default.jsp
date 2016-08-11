<jsp:directive.include file="/WEB-INF/views/includes.jsp" />

<!DOCTYPE html>
<html>
	<head>
		<title><tiles:getAsString name="title"/></title>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0">

		<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap_3.0.2.css"/>"/>
		<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/custom-theme/jquery-ui-1.10.0.custom.css"/>" />
		<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/font-awesome-3.0.1.css"/>" />
		<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap-formhelpers.css"/>" />
		<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap-select.css"/>" />
		<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/validationEngine.jquery.css"/>" />
		
		
		<style type="text/css">
		</style>

		<!-- Le HTML5 shim, for IE6-8 support of HTML5 elements -->
	    <!--[if lt IE 9]>
			<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
	    <![endif]-->
    
    	<script type="text/javascript">
		</script>
		
		<script src="<c:url value="/resources/js/jquery-latest.js"/>"></script>
		<script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
		<script src="<c:url value="/resources/js/jquery.validate.min.js"/>"></script>
		<script src="<c:url value="/resources/js/messages_pt_BR.js"/>"></script>
		<script src="<c:url value="/resources/js/bootstrap-formhelpers-phone.format.js"/>"></script>
		<script src="<c:url value="/resources/js/bootstrap-formhelpers-phone.js"/>"></script>
		<script src="<c:url value="/resources/js/bootstrap-select.js"/>"></script>
		<script src="<c:url value="/resources/js/jquery.validationEngine-pt_BR.js"/>"></script>
		<script src="<c:url value="/resources/js/jquery.validationEngine.js"/>"></script>
		
		
		<script type="text/javascript">
		
		
			$(document).ready(function() {
				
				
				
			});
			
		</script>
		
	</head>

	<body >
		<tiles:insertAttribute name="content" />
	</body>
</html>
