<jsp:include page="../../header.jsp"></jsp:include>


    <!-- Services Section -->
    <section id="services">
        <div class="container">
           
           
           
           
           <form class="form-horizontal">
				<fieldset>
				
				<!-- Form Name -->
				<legend>Register as Donor</legend>
					
				<!-- Multiple Radios -->
				<div class="form-group">
				  <label class="col-md-4 control-label" for="radios">Who are you</label>
				  <div class="col-md-4">
				  <div class="radio">
				    <label for="radios-0">
				      <input type="radio" name="radios" id="radios-0" value="1" checked="checked">
				      Individual
				    </label>
					</div>
				  <div class="radio">
				    <label for="radios-1">
				      <input type="radio" name="radios" id="radios-1" value="2">
				      Organisation
				    </label>
					</div>
				  </div>
				</div>
				
				<!-- Text input-->
				<div class="form-group">
				  <label class="col-md-4 control-label" for="textinput">Name</label>  
				  <div class="col-md-4">
				  <input id="textinput" name="textinput" type="text" placeholder="Name" class="form-control input-md" required="">
				    
				  </div>
				</div>
				
				<!-- Text input-->
				<div class="form-group">
				  <label class="col-md-4 control-label" for="textinput">Email</label>  
				  <div class="col-md-4">
				  <input id="textinput" name="textinput" type="text" placeholder="Email" class="form-control input-md" required="">
				    
				  </div>
				</div>
				
				
				<!-- Text input-->
				<div class="form-group">
				  <label class="col-md-4 control-label" for="textinput">Mobile Number</label>  
				  <div class="col-md-4">
				  <input id="textinput" name="textinput" type="number" placeholder="Mobile Number" class="form-control input-md" required="">
				    
				  </div>
				</div>
				
				<!-- Password input-->
				<div class="form-group">
				  <label class="col-md-4 control-label" for="passwordinput">Create a Password</label>
				  <div class="col-md-4">
				    <input id="passwordinput" name="passwordinput" type="password" placeholder="Password" class="form-control input-md" required="">
				    
				  </div>
				</div>
				
				<!-- Button -->
				<div class="form-group">
				  <label class="col-md-4 control-label" for="singlebutton"></label>
				  <div class="col-md-4">
				    <button id="singlebutton" name="singlebutton" class="btn btn-primary">Submit</button>
				  </div>
				</div>
				
				</fieldset>
				</form>
           
           
           
           
           
        </div>
    </section>
    



<jsp:include page="../../footer.jsp"></jsp:include>