<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no" />
<meta http-equiv="X-UA-Compatible" content="IE=Edge">
<title>壹贝贝营养配餐管理云平台-平台端</title>
</head>
    <body>
    <div>
        <label>用户名：</label><input id="name">
        <label>年龄：</label><input id="age">
        <button style="width: 50px;height: 20px;" onclick="save()">提交</button>
    </div>
    <div>
        <ul id="userList"></ul>
    </div>

        <script src="/js/jquery-3.3.1.min.js"></script>
        <script>
            $(document).ready(function(){
                showList();
            });

            function save(){
                $.post('/user/add',{name:$('#name').val(),age:$('#age').val()},function(res){
                    if(res.flag){
                        showList();
                    }else{
                        alert(res.msg);
                    }
                },'json');
            }
        	
        	//发送验证码
           function showList(){
        	    $.get('/user/query',{},function(res){
                    console.log(res)
                    if(res.flag){
                        var obj = res.data;
                        var html = '';
                        if(obj.length > 0){
                            for (var i = 0; i < obj.length; i++) {
                                html += '<li>姓名：' + obj[i].name + '~年龄：' + obj[i].age + '</li>';
                            }
                        }else{
                           html = '暂无用户';
                        }
                        $('#userList').html(html);
                    }else{
                        alert(res.msg);
                    }
			  },'json');
           }
        </script>
    </body>
</html>