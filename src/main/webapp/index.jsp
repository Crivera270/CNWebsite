<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>

<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" href="Style.css">
    <style>
        button.animation {
            background-image: url('f.jpg');
            width: 228px;
            height: 222px;
            background-color: pink;
            position: relative;
            animation-name: example;
            animation-duration: 5s;
            animation-delay: 2s;
            border: white;
        }

        @keyframes example {
            0%   {left:0; top:0;}
            25%  {left:200px; top:0;}
            50%  { left:400px; top:0;}
            75%  { left: 800px; top:0;}
            100% {left:2000px; top:0;}

        }
    </style>
</head>


<div class="header">
<button class = "logo"> CN </button>
<p class="LLC">Carmen Negron Designs LLC</p>
</div>

<div class="topnav">
    <a class="active" href="Classes">Classes</a>
    <a href="Community">Community</a>
    <a href="Reviews">Reviews</a>
    <a href="Pricing">Pricing</a>
</div>

<div class = "mid">
<p class ="rightbutton">Contact me here!</p>
<button onclick = "window.location.href='hello-servlet';" class ="button" > <3 </button>
<h2>MAKING YOUR DREAMS COME TRUE</h2>
<h4>FASHION DESIGNER AND SEAMSTRESS -- COUTURE DESIGNS AND WEDDING DRESS ALTERATIONS</h4>
</div>

<button class = "animation">  </button>
<br/>
<br/>

<div class = "pictures">
    <img class ="pics" src="Dress1.jpg" alt="Dress" >
    <div class="desc">Alterations</div>
</div>
<div class = "pictures">
    <img class ="pics" src="Dress1.jpg" alt="Dress" >
    <div class="desc">Custom Pieces</div>
</div>

<div class = "pictures">
    <img class ="pics" src="Dress1.jpg" alt="Dress" >
    <div class="desc">Classes</div>
</div>
<div class ="blocker"></div>
<div class="slidecontainer">
    <p>How much would you pay for your dream dress?    $0 - $20,000</p>
    <input type="range" min="1" max="10000" value="1000" class="slider" id="myRange">
</div>

<div class="video">
    <img  src = "f.jpg" alt ="Carmen Negron">
</div>



<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>




<footer>
    <h2>About me</h2>
    <img class = "carmen" src = "f.jpg" alt ="Carmen Negron">
</footer>
</body>
</html>