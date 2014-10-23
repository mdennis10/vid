<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
<link rel="stylesheet" href="resources/css/theme.css">
</head>
<body>
	<div class="container">
      <div class="row">
        <jsp:include page="includes/sidebar.jsp"/>
        <div class="col-xs-11 col-xs-offset-1 main">
          <div class="page-header">
          	<div class="row">
          		<div class="col-xs-6">
          			<h1 class="page-title">Featured</h1>
          		</div>
          		<div class="col-xs-4 col-xs-offset-2">
          			<input type="text" id="search" class="form-control" placeholder="Search">
          		</div>
          	</div>
       	  </div>
          

          <div class="row placeholders">
            <div class="col-xs-4 placeholder">
             <a href="play">
              <img src="//i.ytimg.com/vi/7-7knsP2n5w/mqdefault.jpg">
              </a>
               <div class="video-info">
              	<a href="#" class="song-title">
              		<h2 class="song-name">La La La</h2>
              		<p class="artist-name">Shakira</p>
              	</a>
              </div>
            </div>
            
            <div class="col-xs-4 placeholder">
              <a href="play">
       		  <img src="//i.ytimg.com/vi/0KSOMA3QBU0/mqdefault.jpg">
       		  </a>
       		  <div class="video-info">
              	<a href="#" class="song-title">
              		<h2 class="song-name">Dark Horse</h2>
              		<p class="artist-name">Katy Perry</p>
              	</a>
              </div>
            </div>
	        <div class="col-xs-4 placeholder">
	        	<a href="play">
	        	<img src="//i.ytimg.com/vi/u3u22OYqFGo/mqdefault.jpg">
	        	</a>
	            <div class="video-info">
              	<a href="#" class="song-title">
              		<h2 class="song-name">Black Widow</h2>
              		<p class="artist-name">Iggy Azalea ft. Rita Ora</p>
              	</a>
              </div>
	        </div>
          </div>
		  <div class="row placeholders">
		  <div class="col-xs-4 placeholder">
		  	  <a href="play">
              <img src="//i.ytimg.com/vi/iS1g8G_njx8/mqdefault.jpg">
              </a>
              <div class="video-info">
              	<a href="#" class="song-title">
              		<h2 class="song-name">Problem</h2>
              		<p class="artist-name">Ariana Grande ft. Iggy Azalea</p>
              	</a>
              </div>
            </div>
            <div class="col-xs-4 placeholder">
              <a href="play">
       		  <img src="//i.ytimg.com/vi/JXRN_LkCa_o/mqdefault.jpg">
       		  </a>
              <div class="video-info">
              	<a href="#" class="song-title">
              		<h2 class="song-name">Loyal</h2>
              		<p class="artist-name">Chris Brown f. Lil Wyne, Tyga</p>
              	</a>
              </div>
            </div>
	        <div class="col-xs-4 placeholder">
	        	<a href="play">
	        	<img src="//i.ytimg.com/vi/EHkozMIXZ8w/mqdefault.jpg">
	        	</a>
	            <div class="video-info">
              	<a href="#" class="song-title">
              		<h2 class="song-name">The Monster</h2>
              		<p class="artist-name">Eminem ft. Rihanna</p>
              	</a>
              </div>
	        </div>
		  </div>
          </div><!-- /.main -->
        </div><!-- /.row -->
      </div><!-- /.container -->
	<jsp:include page="includes/footer.jsp"/>
</body>
<!-- <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script> -->
</html>