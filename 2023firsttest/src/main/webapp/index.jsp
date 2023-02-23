<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>
    
    <html>
    
    <form action="using.jsp" method="get">
        <table align="center" border="3" width="700">
         
         
          <tr>
               <td>角色：</td>
                <td>
                    <label>
                        <input type="radio" name="juese" value="user"checked>普通用户
                        <input type="radio" name="juese" value="vipuser">新闻撰稿人
                        <input type="radio" name="juese" value="vvipuser" >新闻栏目管理员
                        <input type="radio" name="juese" value="admin">系统管理员
                    </label>
                </td>
            </tr>
         
         
         <tr>
                <td>登录名:</td>
                <td>
                    <label>
                        <input type="text" name="dengluming" maxlength="20"/>
                    </label>
                </td>
            </tr>
         
         <tr>
                <td>密码:</td>
                <td>
                    <label>
                        <input type="text" name="mima" maxlength="20"/>
                    </label>
                </td>
            </tr>
      
        

        
            <tr align="center">
                <td colspan="2">               
                    <button>登录</button>    
                </td>
            </tr>

        </table>
    </form>
    
    
 <div  align="center">
<a href="zhuces.jsp">
<button align="center">注册</button>
</a>

    
    
    
    
    </html>