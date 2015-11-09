<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html>
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
    <title>Assign Task</title>
    <body>
        <h1>Assign Task</h1>
        
         <table style="width:50%">
        			
        			<tr>
        				<td>
        					Select Project Name
        				</td>
        				<td colspan="4">
		        				<select path="projectId">
		   							<option value="NONE" label="--- Select ---"/>
		   							<c:forEach var="project" items="${projects}">
		       								<option value="${project.projectPK}" label="${project.Name}"/>
		       						</c:forEach>
									</select>
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
			        	<td></td>
			        	<td></td>
			        	<td></td>
			        	<td></td>
			        	<td><a href="#">Update</a></td>
			        </tr> 
			         </c:forEach>
        </table>
     </body>
</html>