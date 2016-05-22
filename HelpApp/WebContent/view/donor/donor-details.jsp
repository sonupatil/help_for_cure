<jsp:include page="../../header.jsp"></jsp:include>


    <!-- Services Section -->

 		
 		
 			<form class="form-horizontal">
			<fieldset>
			
			<!-- Form Name -->
			<legend>Donor Details</legend>
			
			
			
			<!-- Multiple Radios (inline) -->
			<div class="form-group">
			  <label class="col-md-4 control-label" for="radios">Donation Type</label>
			  <div class="col-md-4"> 
			    <label class="radio-inline" for="radios-0">
			      <input type="radio" name="radios" id="radios-0" value="1" checked="checked">
			      Money
			    </label> 
			    <label class="radio-inline" for="radios-1">
			      <input type="radio" name="radios" id="radios-1" value="2">
			      Organ
			    </label>
			  </div>
			</div>
			

			<!-- Textarea -->
			<div class="form-group">
			  <label class="col-md-4 control-label" for="textarea">Address</label>
			  <div class="col-md-4">                     
			    <textarea class="form-control" id="textarea" name="textarea"></textarea>
			  </div>
			</div>
			
			<!-- Text input-->
			<div class="form-group">
			  <label class="col-md-4 control-label" for="textinput">CIty</label>  
			  <div class="col-md-4">
			  <input id="textinput" name="textinput" type="text" placeholder="CIty" class="form-control input-md" required="">
			    
			  </div>
			</div>
				
			<!-- Text input-->
			<div class="form-group">
			  <label class="col-md-4 control-label" for="textinput">State</label>  
			  <div class="col-md-4">
			  <input id="textinput" name="textinput" type="text" placeholder="State" class="form-control input-md" required="">
			    
			  </div>
			</div>
				
			<!-- Text input-->
			<div class="form-group">
			  <label class="col-md-4 control-label" for="textinput">Country</label>  
			  <div class="col-md-4">
			  <input id="textinput" name="textinput" type="text" placeholder="Country" class="form-control input-md" required="">
			    
			  </div>
			</div>
			
			<!-- Text input-->
			<div class="form-group">
			  <label class="col-md-4 control-label" for="textinput">Pin Code</label>  
			  <div class="col-md-4">
			  <input id="textinput" name="textinput" type="text" placeholder="" class="form-control input-md" required="">
			    
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
			 			
 			
 			
 			
 			

    



<jsp:include page="../../footer.jsp"></jsp:include>