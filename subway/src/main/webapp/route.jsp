<%--
  Created by IntelliJ IDEA.
  User: gao'yi'pin
  Date: 2023/3/13
  Time: 16:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="subway.useing" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<html >
<head>
    <title>路线查询</title>
</head>

<body >
<%

    String startname=request.getParameter("departure");
    String stopname=request.getParameter("destination");

    useing me=new useing();
    int stop1=me.findshortrole(startname, stopname);
    int stop2=me.findfewrole(startname, stopname);
    
    
    out.println("起点:"+startname+"<br>");
	out.println("终点:"+stopname+"<br>");
	out.println("最短线路！！！"+"<br>");
	out.println("经过站点数:"+stop1+"<br>");
	out.println("最短线路:"+me.role+"<br>");
    
    out.println("----------------------------------"+"<br>");
    out.println("----------------------------------"+"<br>");
    out.println("----------------------------------"+"<br>");
    
    out.println("最少换乘线路！！！"+"<br>");
	out.println("经过站点数:"+me.temp[stop2]+"<br>");
	out.println("最少换乘:"+me.anllrole[stop2]+"<br>");
	
   /*
    if(!temp.equals("-1")){
    	out.println("----------------------------" + "<br>");
    	out.println("起点:"+form+"<br>");
    	out.println("终点:"+after+"<br>");
    	out.println("----------------------------" + "<br>");
        out.println("经过站点数:"+me.zhandianshu+"<br>");
        out.println("经过线路:"+temp+"<br>");
        for(int i=0;i<=me.jieshu;i++){
        	out.println("----------------------------" + "<br>");
            out.println(me.finda[i]+ "<br>");
        }
        
    }
    */
    /*if(!temp.equals("-1")){
        out.println("----------------------------" + "<br>");
        out.println("起点:"+form+"<br>");
        out.println("终点:"+after+"<br>");
        out.println("----------------------------" + "<br>");
        out.println("经过站点数:"+me.zhandianshu+"<br>");
        out.println("经过线路:"+temp+"<br>");

        for(){
            out.println();
        }

    }*/

   /* else{
        out.println("----------------------------" + "<br>");
        out.println("起点:"++"<br>");
        out.println("终点:"++"<br>");
        out.println("----------------------------" + "<br>");
        out.println("经过站点数:"++"<br>");
        out.println("经过线路:"++"<br>");

        for(){
            out.println();
        }

        out.println("换乘"++"号线""<br>");
    }*/
%>

</body>
</html>
