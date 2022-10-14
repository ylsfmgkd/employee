<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored ="false" %>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>员工信息管理</title>
    <style>
    *{
    margin: 0;
    padding: 0;
    }
    body{
    position: relative;
    }
    a{
    text-decoration: none;
    color: white;

    }
    li{
    list-style: none;
    }
    .head{
    width: 1400px;
    height: 50px;
    margin: auto;
    background-color: pink;
    }
    .head img,
    .head span {
    float: right;
    line-height: 50px;
    }
    .bd{
    margin: auto;
    width: 1400px;
    text-align: center;
    }
    .bd table{
    margin: auto;
    padding: 100px;
    }
    .bd table tr th{
    width: 175px;
    height: 30px;
    padding: 30px 0;
    }
    .bd table tr td{
    width: 175px;
    height: 30px;
    padding: 30px 0;
    }
    .bd table tr:nth-child(odd){
    background-color: rgb(240, 238, 238);
    }
    .bd table tr a{
    color: white;
    display: inline-block;
    margin: 2px;
    padding: 2px;
    background-color: pink;
    }
    .bd table tr a:hover{
    background-color: skyblue;
    color: #000;
    }
    .fudong{
    position: absolute;
    left: 30px;
    top: 153px;
    }
    ul li{
    font-size: 20px;
    background-color: pink;
    display: block;
    width: 100px;
    padding: 15px;
    }
    ul li a:hover{
    background-color: skyblue;
    color: #000;
    }
    </style>
</head>
<body>
<div class="head"><img src="#" alt="#"> </div>
<ul class="fudong">
    <li><a href="${pageContext.request.contextPath}/employee/listpage">员工管理</a></li>
    <li><a href="${pageContext.request.contextPath}/employee/show_department">部门管理</a></li>
    <li><a href="${pageContext.request.contextPath}/employee/show_work">职位管理</a></li>
    <li><a href="${pageContext.request.contextPath}/employee/to_select">查询员工</a></li>
</ul>
<div class="bd">
<table width="100%" border="1" cellspacing="0" cellpadding="0" style="border-collapse:collapse">
    <tbody>
    <tr id="table-title">
        <td height="30" align="center" valign="middle" bgcolor="#F0F0F0">&nbsp;</td>
        <td height="30" align="center" valign="middle" bgcolor="#F0F0F0">员工编号</td>
        <td height="30" align="center" valign="middle" bgcolor="#F0F0F0">员工姓名</td>
        <td height="30" align="center" valign="middle" bgcolor="#F0F0F0">员工性别</td>
        <td height="30" align="center" valign="middle" bgcolor="#F0F0F0">员工毕业院校</td>
        <td height="30" align="center" valign="middle" bgcolor="#F0F0F0">员工电话</td>
        <td height="30" align="center" valign="middle" bgcolor="#F0F0F0">员工职位</td>
        <td height="30" align="center" valign="middle" bgcolor="#F0F0F0">员工部门</td>
        <td height="30" align="center" valign="middle" bgcolor="#F0F0F0"><a href="${pageContext.request.contextPath}/employee/to_add">雇佣员工</a></td>
    </tr>
    <c:forEach items="${employees}" var="employee">
        <tr id="${employee.eid}">
            <td height="30" align="center" valign="middle"><input type="checkbox" name="eids" value="${employee.eid}"/></td>
            <td height="30" align="center" valign="middle">${employee.eid}</td>
            <td height="30" align="center" valign="middle">${employee.ename}</td>
            <td height="30" align="center" valign="middle">${employee.esex}</td>
            <td height="30" align="center" valign="middle">${employee.eschool}</td>
            <td height="30" align="center" valign="middle">${employee.etel}</td>
            <td height="30" align="center" valign="middle">${employee.wid}</td>
            <td height="30" align="center" valign="middle">${employee.did}</td>
            <td height="30" align="center" valign="middle">
                <a href="${pageContext.request.contextPath}/employee/delete?eid=${employee.eid}">删除</a>&nbsp;&nbsp;
                <a href="${pageContext.request.contextPath}/employee/to_update?eid=${employee.eid}">修改</a></td>
        </tr>
    </c:forEach>
    <tr id="table-last">
        <td height="30" colspan="7" align="left" valign="middle">&nbsp;&nbsp;
            <input type="button" name="submit2" id="btn-delete-employees" value="删除"></td>
    </tr>
    </tbody>
</table>

    <tr>
        <td width="38" height="40" align="left" valign="middle">&nbsp;</td>
        <td width="727" align="left" valign="middle">&nbsp;</td>
    </tr>
    </tbody>
</table>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>
<script type="text/javascript">
    $("#btn-delete-employees").click(function(){
        var eids = "";
        $('[name=eids]:checkbox:checked').each(function () {
            eids += $(this).val() + ",";
        })
        eids = eids.substr(0, eids.length - 1);

        $.post("${pageContext.request.contextPath}/employee/deletes",{"eids":eids},
            function(data){
                if (data === "OK"){
                    eids = eids.split(",");
                    for (var i = 0; i < eids.length; i ++)
                        confirm("批量删除成功！")
                    $("#"+eids[i]).remove();
                    window.location.reload();
                }
            })
    })

    function delete_employee(eid) {
        //alert(sno);

        $.post("${pageContext.request.contextPath}/employee/delete",
            {"eid":eid},
            function(data){
                if (data === "OK"){
                    $("#"+eid).remove();
                    confirm("删除完成！")
                }
            })
    }
</script>
</body>
</html>
