<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
<link rel="stylesheet" href="resources/css/theme.css">
</head>
<body>
	<div class="container">
		<jsp:include page="includes/sidebar.jsp"/>
		<div class="col-xs-11 col-xs-offset-1 main">
			<div class="page-header">
          	<div class="row">
          		<div class="col-xs-6">
          			<h3 class="song-name pull-left"><strong>Dark Horse</strong> Katy Perry</h3>
   
          		</div>
          		<div class="col-xs-4 col-xs-offset-2">
          			<input type="text" id="search" class="form-control" placeholder="Search">
          		</div>
          	</div>
         	</div>
      		<div class="row">
      			<div class="col-xs-12">
      			
      			<div class="video-wrapper pull-left"></div>
      			
      			</div>
      		</div>
			<div class="row placeholders" style="margin-top:10px">
			<h4 style="margin-left:13px">Related Videos</h4>
			 <div class="col-xs-3 placeholder">
	             <a href="play">
	              <img src="//i.ytimg.com/vi/7-7knsP2n5w/mqdefault.jpg" width="196">
	              </a>
	               <div class="video-info">
	              	<a href="#" class="song-title">
	              		<h2 class="song-name">La La La</h2>
	              		<p class="artist-name">Shakira</p>
	              	</a>
	              </div>
            </div>
            <div class="col-xs-3 placeholder">
              <a href="play">
       		  <img src="//i.ytimg.com/vi/0KSOMA3QBU0/mqdefault.jpg" width="196">
       		  </a>
       		  <div class="video-info">
              	<a href="#" class="song-title">
              		<h2 class="song-name">Dark Horse</h2>
              		<p class="artist-name">Katy Perry</p>
              	</a>
              </div>
            </div>
            <div class="col-xs-3 placeholder">
	        	<a href="play">
	        	<img src="//i.ytimg.com/vi/u3u22OYqFGo/mqdefault.jpg" width="196">
	        	</a>
	            <div class="video-info">
              	<a href="#" class="song-title">
              		<h2 class="song-name">Black Widow</h2>
              		<p class="artist-name">Iggy Azalea ft. Rita Ora</p>
              	</a>
              </div>
	        </div>
	        <div class="col-xs-3 placeholder">
		  	  <a href="play">
              <img src="//i.ytimg.com/vi/iS1g8G_njx8/mqdefault.jpg" width="196">
              </a>
              <div class="video-info">
              	<a href="#" class="song-title">
              		<h2 class="song-name">Problem</h2>
              		<p class="artist-name">Ariana Grande ft. Iggy Azalea</p>
              	</a>
              </div>
            </div>
			</div><!-- /.row -->
		</div>
	</div><!-- /.container -->
	<jsp:include page="includes/footer.jsp"/>
</body>
</html>