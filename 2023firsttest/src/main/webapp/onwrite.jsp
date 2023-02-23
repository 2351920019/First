<%@ page language="java" contentType="text/html; charset=UTF-8"

    pageEncoding="UTF-8"%>
    
    <html>
    
    <form action="onwrite1.jsp" method="get">
        <table align="center" border="3" width="700">
         
         <tr>
               <td>栏目：</td>
                <td>
                    <label>
                        <input type="radio" name="lanmu" value="栏目一"checked>栏目一
                        <input type="radio" name="lanmu" value="栏目二">栏目二
                        <input type="radio" name="lanmu" value="栏目三" >栏目三
                    </label>
                </td>
         
            </tr> 
            
            <tr>
                <td>标题:</td>
                <td>
                    <label>
                        <input type="text" name="biaoti" maxlength="20"/>
                    </label>
                </td>
            </tr>
          
          <tr>
                <td>关键字:</td>
                <td>
                    <label>
                        <input type="text" name="guanjianzi" maxlength="20"/>
                    </label>
                </td>
            </tr>
            
         <tr>
                <td>撰稿人:</td>
                <td>
                    <label>
                        <input type="text" name="zhuangaoren" maxlength="20"/>
                    </label>
                </td>
            </tr>
         

         
         <tr>
                <td>内容:</td>
                <td>
                    <label>
                        <input type="text" name="neirong" maxlength="1500"/>
                    </label>
                </td>
            </tr>
         
  
      
        

        
            <tr align="center">
                <td colspan="2">               
                    <button>提交</button>    
                </td>
            </tr>

        </table>
    </form>
    
    

    
    
    
    </html>