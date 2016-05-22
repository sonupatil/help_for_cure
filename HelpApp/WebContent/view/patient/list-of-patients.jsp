
<%@page import="help.dao.SelectQuery"%>
<%@page import="help.models.Patient"%>
<%@page import="java.util.List"%>
<% 

List<Patient> pt = SelectQuery.getPatientList();


%>



<jsp:include page="../../header.jsp"></jsp:include>

    <!-- Services Section -->
    <section id="services">
        <div class="container">
          <h1>We are working on it</h1>
      <% if(pt!=null){ %>      
            <table class="table">
			<thead>
				<tr>
					<th>
						Sr.No
					</th>
					<th>
						Patients Name
					</th>
					<th>
						Disease
					</th>
					<th>
						Address
					</th>
					<th>
						Stage
					</th>
				</tr>
			</thead>
			<tbody>
			<% for(int i=0;i<pt.size();i++){ %>
				<tr>
					<td>
						<%= i %>
					</td>
					<td>
						<%= pt.get(i).getName() %>
					</td>
					<td>
						<%= pt.get(i).getDiseaseName() %>
					</td>
					<td>
						<%= pt.get(i).getAddress() %>
					</td>
					<td>
						<%= pt.get(i).getStage() %>
					</td>
				</tr>
				<% } %>
			</tbody>
		</table>
            <% }else{ %>
            <h1>Nothing to show</h1>
            <% } %>
        </div>
    </section>
    

<jsp:include page="../../footer.jsp"></jsp:include>