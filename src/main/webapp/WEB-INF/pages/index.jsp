<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<html>
    <head>
        <title>fetch</title>
        <style>
            .stl{
                width:100px;
                height:100px;
                border:1px solid red;
            }
        </style>
    </head>
<body> 

<h1>Fetch 例子6</h1>

<input type="button" onclick="testPost()" value="fetch post"/>

<input type="button" onclick="testGet()" value="fetch get"/>

<input type="button" onclick="test03()" value="fetch post"/>

<input type="button" onclick="test04()" value="fetch post"/>


<script>

function testGet(){
    fetch(
        "/ajaxserver/SysUser/queryById/402881e846e119dc0146e119e1ed0006",
        {
         	'method':'GET',
         	headers:{
	         	'Access-Control-Allow-Origin': '*',
	            'Accept': 'application/json',
	            'Content-Type': 'application/json',
	            'aa':'1234'
         	}
        }
    ).then(function(res){
		return res.text();
	}).then(function(res){
    	alert(res);
    })
}


function testPost(){
    fetch(
        "/ajaxserver/SysUser/saveSysUser",
        {
         	'method':'POST',
         	headers:{
	         	'Access-Control-Allow-Origin': '*',
	            'Accept': 'application/json',
	            'Content-Type': 'application/json',
	            'aa':'1234'
         	},
         	
         	//body 只有POST的方式才可以发送的
        	body:JSON.stringify({
        			"userName":"a3a2a",
        			"userSex":"1",
        			"userMail":"aaa@ccc.com",
        			"userTel":"1234",
        			"userStatus":"1",
        			"userBirthday":"2015-01-01",
        			"orgId":"5"
        	})
        }
    ).then(function(res){
		return res.text();
	}).then(function(res){
    	alert(res);
    })
}







</script>



</body>
</html>
