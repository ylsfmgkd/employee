<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工信息录入</title>
</head>
<body>
<tbody>
<tr>
    <td colspan="2" align="left" valign="top"><form id="form1" name="form1" method="post" action="add">
        <table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tbody>

            <tr>
                <td height="40" align="right" valign="middle">员工姓名：</td>
                <td align="left" valign="middle"><input type="text" name="ename"></td>
            </tr>
            <tr>
                <td height="40" align="right" valign="middle">员工性别：</td>
                <td align="left" valign="middle">
                    <select name="esex">
                        <option value="男">男</option>
                        <option value="女">女</option>
                    </select></td>
            </tr>
            <tr>
                <td height="40" align="right" valign="middle">员工毕业院校：</td>
                <td align="left" valign="middle"><input type="text" name="eschool"></td>
            </tr>
            <tr>
                <td height="40" align="right" valign="middle">员工电话：</td>
                <td align="left" valign="middle"><input type="text" name="etel"></td>
            </tr>
            <tr>
                <td height="40" align="right" valign="middle">员工部门：</td>
                <td align="left" valign="middle"><input type="text" name="did"></td>
            </tr>
            <tr>
                <td height="40" align="right" valign="middle">员工职位：</td>
                <td align="left" valign="middle"><input type="text" name="wid"></td>
            </tr>

            <tr>
                <td height="40" align="right" valign="middle">&nbsp;</td>
                <td align="left" valign="middle"><input type="submit" value="添加"></td>
            </tr>
            </tbody>
        </table></form>
    </td>
</tr>
</tbody>
</body>
</html>

