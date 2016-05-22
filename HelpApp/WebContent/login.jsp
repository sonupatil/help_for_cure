<!DOCTYPE html>
<%@page import="help.statics.AllLinks"%>
<html lang="en">
    <head> 
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="stylesheet" type="text/css" href="<%=AllLinks.siteLink %>css/bootstrap.css">

		<!-- Website CSS style -->
		<link rel="stylesheet" type="text/css" href="<%=AllLinks.siteLink %>css/login.css">
<!-- 
		Website Font style
	    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.6.1/css/font-awesome.min.css">
		
		Google Fonts
		<link href='https://fonts.googleapis.com/css?family=Passion+One' rel='stylesheet' type='text/css'>
		<link href='https://fonts.googleapis.com/css?family=Oxygen' rel='stylesheet' type='text/css'>
		 -->
		<title>Admin</title>
	</head>
	<body>
		<div class="container">
			<div class="row main">
				<div class="panel-heading">
	               <div class="panel-title text-center">
	               		<h1 class="title">Help For Cure</h1>
	               		<hr />
	               	</div>
	            </div> 
				<div class="main-login main-center">
					<form class="form-horizontal" method="post" action="<%=AllLinks.siteLink %>/LoginServlet">
						
						<div class="form-group">
							<label for="name" class="cols-sm-2 control-label">Mobile</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-user fa" aria-hidden="true"></i></span>
									<input type="number" class="form-control" name="mobileNumber" min="10" id="name"  placeholder="Enter your Mobile Number"/>
								</div>
							</div>
						</div>

					
						<div class="form-group">
							<label for="password" class="cols-sm-2 control-label">Password</label>
							<div class="cols-sm-10">
								<div class="input-group">
									<span class="input-group-addon"><i class="fa fa-lock fa-lg" aria-hidden="true"></i></span>
									<input type="password" class="form-control" name="password" id="password"  placeholder="Enter your Password"/>
								</div>
							</div>
						</div>

						<div class="form-group ">
							<button type="submit"  class="btn btn-primary btn-lg btn-block login-button">Login</button>
						</div>
						<a href="<%=AllLinks.siteLink %>"><strong>Go To Home Page</strong></a>
			
					</form>
				</div>
				</div>
		</div>

		<script type="text/javascript" src="assets/js/bootstrap.js"></script>
	</body>
</html>