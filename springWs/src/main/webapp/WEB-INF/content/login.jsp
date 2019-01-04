<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>login</title>
 	<script src="./js/jquery-1.12.3.min.js"></script>
	<link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
	<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	<style type="text/css">
		.vertical-center{
		  position: absolute;
		  top: 50%;
		  left: 50%;
		  transform: translate(-50%, -50%);
		}
	</style>
  </head>
  <body>
    <div class="container vertical-center">
	<div class="col-md-6 col-md-offset-3">
	      <form  action="loginvalidate" method="post">
	        <h2 style="text-align: center;">登录</h2>
	        <label for="username" class="sr-only">用户名:</label>
	        <input type="text" name="username" id="username" class="form-control">
	        <label for="password" class="sr-only">密码:</label>
	        <input type="password" name="password" id="password" class="form-control">
	        <label for="pic" class="sr-only">验证码:</label>
	        <input type="text" name="pic" id="pic" class="form-control">              
	                        验证码：<img src="authImg" width="120" height="40">  
	        <button class="btn btn-lg btn-primary btn-block" type="submit">login</button>
	      </form>    	
	</div>
    </div> <!-- /container -->
  </body>
</html>
