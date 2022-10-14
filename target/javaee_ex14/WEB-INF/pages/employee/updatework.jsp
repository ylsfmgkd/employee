<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <h1>修改职务信息</h1>
    <form action="updatework" method="post">
        <table>
            <tr>
                <td>职位编号</td>
                <td width="81%" align="left" valign="middle">${work.wid}<input type="hidden" name="wid" id="textfield1" value="${work.wid}"></td>
            </tr>
            <tr>
                <td>职位姓名</td>
                <td><input type="text" name="wname" value="${wname}"></td>
            </tr>

            <tr>
                <td>职位薪酬</td>
                <td><input type="text" name="wsalary" value="${wsalary}"></td>
            </tr>
            <tr>
                <td><input type="submit" value="修改"></td>
                <td><input type="reset" value="重置"></td>
            </tr>
        </table>
    </form>

</center>
</body>
</html>