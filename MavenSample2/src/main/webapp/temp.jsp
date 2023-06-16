<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	    <div id="container">
        <p>Hello, World!</p>
        <p style = display:none;>Hidden Text</p>
    </div>
    <button onclick="func1()">TEXT</button>
    <button onclick="func2()">HTML</button>

    <script>
        // 1. div 요소에 접근하기
        let divText = document.getElementById('container');
        console.log('요소 가져오기: ', divText);
        // 2. text버튼 클릭 시, 요소에서 내용만 가져오기
        const func1 = () => {
            console.log(divText.innerText);
        }
        // 3. html 버튼 클릭 시, 요소에 태그까지 가져오기
        const func2 = () => {
            console.log(divText.innerHTML);
            divText.innerHTML = '<h1>JavaScripot</h1>';
        }
        
    </script>

</body>
</html>