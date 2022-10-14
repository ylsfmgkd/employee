<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <h1>修改员工信息</h1>
    <form action="update" method="post">
        <table>
            <tr>
                <td>员工编号</td>
<%--                <td><input type="text" name="eid" value="${e.eid}"></td>--%>
                <td width="81%" align="left" valign="middle">${employee.eid}<input type="hidden" name="eid" id="textfield1" value="${employee.eid}"></td>
            </tr>
            <tr>
                <td>员工姓名</td>
                <td><input type="text" name="ename" value="${e.ename}"></td>
            </tr>

            <tr>
                <td>员工性别</td>
                <td><input type="text" name="esex" value="${e.esex}"></td>
            </tr>
            <tr>
                <td>员工毕业院校</td>
                <td><input type="text" name="eschool" value="${e.eschool}"></td>
            </tr>
            <tr>
                <td>员工电话</td>
                <td><input type="text" name="etel" value="${e.etel}"></td>
            </tr>
            <tr>
                <td>员工部门</td>
                <td><input type="text" name="did" value="${e.did}"></td>
            </tr>
            <tr>
                <td>员工职位</td>
                <td><input type="text" name="wid" value="${e.wid}"></td>
            </tr>

            <tr>
                <td><input type="submit" value="修改员工信息"></td>
                <td><input type="reset" value="重置"></td>
            </tr>
        </table>
    </form>

</center>
</body>
</html>

