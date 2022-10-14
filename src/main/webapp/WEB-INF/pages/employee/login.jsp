<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false"%>
<link rel="stylesheet" href="https://www.layuicdn.com/layui-v2.5.5/css/layui.css">
<script src="https://www.layuicdn.com/layui-v2.5.5/layui.js"></script>
<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
<div style="background-color:cadetblue;width: 500px;height: 380px;margin-left: 33%;margin-top: 10%;border-radius: 20px">
    <div style="margin-left: 163px;margin-top: 87px;position: absolute">
        <h1 style="color: white;margin-left: 40px;margin-bottom: 10px;" >
            登&nbsp;&nbsp;&nbsp;&nbsp;录
        </h1>
        <form action="login" method="post">

            <div class="layui-input-inline">
                <input  class="layui-input" type="text" placeholder="账号"  autocomplete="off" name="username">
            </div>
            <br>
            <div class="layui-input-inline" style="margin-top: 10px;">
                <input class="layui-input" type="password" placeholder="密码" autocomplete="off" name="password">
            </div>
            <br>
            <div style="margin-top: 6px;margin-left: 0px">
                <span style="color: red">${msg}</span>
            </div><br>
            <div class="layui-input-inline" style="margin-top: -13px">
                <input type="submit" value="登录">
                <button><a href="to_register">立即注册</a></button>
            </div>
        </form>
    </div>
</div>