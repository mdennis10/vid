<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<!DOCTYPE html>
<html>
  <head>
    <title>Welcome</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- Bootstrap -->
    <link rel="stylesheet" href="resources/css/bootstrap.min.css">
    <link rel="stylesheet" href="resources/css/style.css">
    <link rel="stylesheet" href="resources/css/animate-custom.css">
    <link href="resources/css/jquery.mCustomScrollbar.css" rel="stylesheet" type="text/css" />
   
  </head>
  <body>
    <div class="container" style="width: 1180px;">
      <div class="row">
          <div class="col-xs-9 right-sec"></div>

          <div class="col-xs-3 pull-right left-sec">
			<%@ include file="includes/activity-stream.jsp" %>
          </div>
      </div>
    </div><!--/.end container-->
  	<%@ include file="includes/bottom-panel.jsp"%>
  	
  </body>
</html>

  
