<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- let's add tag srping:url -->
<spring:url value="/resources/css/default.css" var="defaultCSS" />
<spring:url value="/resources/js/default.js" var="defaultJS" />
<spring:url value="/resources/img/" var="defaultImg" />
<spring:url value="/resources/js/jquery-1.12.1.min.js" var="jquery112" />

<script src="${jquery112}"></script>
<link href="${defaultCSS}" rel="stylesheet" />
<script src="${defaultJS}"></script>
<!-- Finish adding tags -->

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Annie's Resume</title>
</head>
<body>
<div id="page-header">
  <h2>Why she shouldn't be missed from your employee list?</h2>
</div>
<div id="boxes">
	<a id="square1" class="box lightbox" href="viewSummary.jsp?page=summary"><span id="sum-text">Summary</span></a>
	<a id="square2" class="box lightbox"  href="viewSummary.jsp?page=career"><span id="career-highlights">Career Highlights</span></a>
	<a id="square3" class="box" href=""></a>
	<a id="square4" class="box" href=""></a>
	<a id="square5" class="box" href=""></a>
</div>

</body>
</html>