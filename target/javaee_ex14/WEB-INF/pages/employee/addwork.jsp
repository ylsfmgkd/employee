<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新设职位</title>
</head>
<body>
<tbody>
<tr>
    <td colspan="2" align="left" valign="top"><form id="form1" name="form1" method="post" action="addwork">
        <table width="100%" border="0" cellspacing="0" cellpadding="0">
            <tbody>
            <tr>
                <td width="19%" height="40" align="right" valign="middle">职位编号：</td>
                <td width="81%" align="left" valign="middle"><input type="text" name="wid"></td>
            </tr>
            <tr>
                <td height="40" align="right" valign="middle">职位名称：</td>
                <td align="left" valign="middle"><input type="text" name="wname"></td>
            </tr>
            <tr>
                <td height="40" align="right" valign="middle">职位薪酬：</td>
                <td align="left" valign="middle"><input type="text" name="wsalary"></td>
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