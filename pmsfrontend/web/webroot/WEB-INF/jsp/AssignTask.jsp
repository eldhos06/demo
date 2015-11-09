<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
<head>
<style>
			table, td, th {
			    border: 1px solid black;
			}
			
			table {
			    width: 100%;
			}
			
			th {
			    text-align: left;
			}
		</style>
		
		
<script src="//code.jquery.com/jquery-1.11.3.min.js"></script>
		<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
		<script type="text/javascript">
		
		function getProjectId() {
		   alert("Hii");
		   $('#myForm').attr('action', '${pageContext.servletContext.contextPath}/pmsTask/' + $('#projectId').val());
		        
		}
	function myFunction(taskid) {
		   alert("Hii");
		   
		   
		   $.ajax({
		        type: "POST",
		        url: "${pageContext.servletContext.contextPath}/pmsTask/"+ taskid/$('#projectId').val()/$('#projectId').val(),
		        data: "",
		        success: function(response){
		        	 alert(response);
		        	},
		        error: function(e){
		        	alert('Error: ' + e);
		       		 }
		        });
		        
		}
		</script>

</head>

    <title>Assign Task</title>
    <body>
    <form id="myForm" method="post" onsubmit="return getProjectId();">
        <h1>Assign Task</h1>
        
         <table style="width:50%">
        			
        			<tr>
        				<td>
        					Select Project Name
        				</td>
        				<td colspan="3">
		        				<select path="projectId" id="projectId" name="projectId">
		   							<option value="0" label="--- Select ---"/>
		   							<c:forEach var="project" items="${projects}">
		       								<option value="${project.projectPK}" label="${project.name}"/>
		       						</c:forEach>
								</select>
        				</td>
        				<td>
        					 <input type="submit" value="Refresh" Id="dfjdf"/> 
        				</td>
        			</tr>
       
			        <tr>
			        <td>Task Code</td>
			        <td>Task Description</td>
			        <td>Assigned To</td>
			        <td>Status</td>
			        <td> </td>	
			        </tr>
			         <c:forEach var="task" items="${tasks}">
			        <tr>
			        
			        	<td>${task.name}</td>
			        	<td>${task.description}</td>
			        	<td>${task.assignedTo}</td>
			        	<td>
			        			<select path="status" id="status${task.taskPK}" name="status">
		   							<c:forEach var="Stat" items="${Status}">
		       								<option value="${Stat}" label="${Stat}"/>
		       						</c:forEach>
								</select>
			        	</td>
			        	
			        	<td><input type="button" value="Update" Id="update"/></td>
			        </tr> 
			         </c:forEach>
        </table>
     </form>      
     </body>
</html>