<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html> 
<html> 
<head> 
	<title>My Page</title> 
	<meta name="viewport" content="width=device-width, initial-scale=1"> 
	<link rel="stylesheet" href="http://code.jquery.com/mobile/1.2.1/jquery.mobile-1.2.1.min.css" />
	<script src="http://code.jquery.com/jquery-1.8.3.min.js"></script>
	<script src="http://code.jquery.com/mobile/1.2.1/jquery.mobile-1.2.1.min.js"></script>
	<script type="text/javascript" src="https://www.google.com/jsapi"></script>
    <script type="text/javascript">
      google.load("visualization", "1", {packages:["corechart"]});
      google.setOnLoadCallback(drawChart);
      function drawChart() {
        var data = google.visualization.arrayToDataTable([
          ['Task', 'Hours per Day'],
          ['Work',     11],
          ['Eat',      2],
          ['Commute',  2],
          ['Watch TV', 2],
          ['Sleep',    7]
        ]);

        var options = {
        	legend: 'none'
        };

        var chart = new google.visualization.PieChart(document.getElementById('piechart'));
        chart.draw(data, options);
      }
    </script>
</head> 
<body> 
<div data-role="page">
	<div>
		 <div id="piechart" style="width: 100%; height: 300px;"></div>
		<label for="email" class="ui-hidden-accessible">E-mail : </label>
		<input type="email" name="email" id="input_email" value="" placeholder="user@email.com"/>
		<label for="password" class="ui-hidden-accessible">Password : </label>
		<input type="password" name="password" id="input_password" value="" placeholder="password"/>
		
		<a href="index.html" data-role="button" data-inline="true" style="width:40%" data-theme="b">Register</a>
		<a href="index.html" data-role="button" data-inline="true" style="width:40%">Login</a>	
	</div>
</div><!-- /page -->
</body>
</html>