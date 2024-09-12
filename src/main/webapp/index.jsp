<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" href="Style.css">
    <style>
        button.animation {
            width: 100px;
            height: 100px;
            background-color: pink;
            position: relative;
            animation-name: example;
            animation-duration: 5s;
            animation-delay: 2s;
            border: white;
        }

        @keyframes example {
            0%   {background-color:pink; left:0px; top:0px;}
            25%  {background-color:red; left:200px; top:0px;}
            50%  {background-color:blue; left:400px; top:0px;}
            75%  {background-color:green; left: 800px; top:0px;}
            100% {background-color:black; left:2000px; top:0px;}

        }
    </style>
</head>


<div class="header">
<button class = "logo"> CN </button>
<p class="LLC">Carmen Negron Designs LLC</p>
</div>

<div class = "mid">
<p class ="rightbutton">Contact me here!</p>
<button onclick = "window.location.href='hello-servlet';" class ="button" > <3 </button>
<h2>MAKING YOUR DREAMS COME TRUE</h2>
<h4>FASHION DESIGNER AND SEAMSTRESS -- COUTURE DESIGNS AND WEDDING DRESS ALTERATIONS</h4>
</div>

<button class = "animation"> :) </button>
<br/>
<br/>

<div class = "pictures">
    <img src="Dress1.jpg" alt="Dress" >
    <div class="desc">Alterations</div>
</div>
<div class = "pictures">
    <img src="Dress1.jpg" alt="Dress" >
    <div class="desc">Custom Pieces</div>
</div>

<div class = "pictures">
    <img src="Dress1.jpg" alt="Dress" >
    <div class="desc">Classes</div>
</div>


<div class="slidecontainer">
    <p>How much would you pay for your dream dress?    $0 - $20,000</p>
    <input type="range" min="1" max="10000" value="50" class="slider" id="myRange">
</div>

<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>

<p class ="dotted">video here</p>




<footer>
    <p>About me</p>
</footer>
</body>
</html>