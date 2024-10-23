<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>

<head>
    <title>JSP - Hello World</title>
    <link rel="stylesheet" href="Style.css">
    <style>
        button.animation {
            background-image: url('f2.jpg');
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
        .slidecontainer{
            padding: 14px 50px;

        }
        .slider{
            -webkit-appearance: none;
            width: 25%;
            height: 25px;
            background: #ecdfdf;
            outline: none;
            opacity: 0.7;
            -webkit-transition: .2s;
            transition: opacity .2s;
        }
        .slider:hover {
            opacity: 1;
        }
        .slider::-webkit-slider-thumb {
            -webkit-appearance: none;
            appearance: none;
            width: 25px;
            height: 25px;
            background: black;
            cursor: pointer;
        }
    </style>
</head>



<div class="header">
<button class = "logo"> CN </button>
<p class="LLC">Carmen Negron Designs LLC</p>
</div>

<div class="topnav">
    <a class="active" href="class-servlet">Classes</a>
    <a href="comm-servlet">Community</a>
    <a href="rev-servlet">Reviews</a>
    <a href="price-servlet">Pricing</a>
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
    <img class ="pics" src="Dress2.jpeg" alt="Dress" >
    <div class="desc">Alterations
    <p>To ensure everything is perfect, I require your wedding dress at least
        8 weeks before your wedding day. Throughout the alteration process, you’ll
        typically have 2 to 3 fittings to make sure the dress is tailored perfectly to you.</p>
    </div>
</div>
<div class = "pictures">
    <img class ="pics" src="Dress3.jpeg" alt="Dress" >
    <div class="desc">Custom Pieces
    <p>We’ll work together to bring your vision to life, choosing fabrics and
        colors that match your style. Every gown reflects my dedication to expert craftsmanship.</p></div>
</div>

<div class = "pictures">
    <img class ="pics" src="Dress4.jpeg" alt="Dress" >
    <div class="desc">Classes
    <p>Whether you're a complete beginner or looking to refine your skills,
        our classes offer a fun and supportive environment. Learn to sew your own
        projects, explore various techniques, and unleash your creativity. </p></div>
</div>
<div class ="blocker"></div>


<div class="slidecontainer">
    <p>How much would you pay for your dream dress?    $0 - $20,000</p>
    <input type="range" min="1" max="10000" value="1000" class="slider" id="myRange">
    <p>$<span id="demo"></span></p>
</div>
<script>
    var slider = document.getElementById("myRange");
    var output = document.getElementById("demo");
    output.innerHTML = slider.value;

    slider.oninput = function() {
        output.innerHTML = this.value;
    }
</script>

<div class="video">

    <video width="500" height="500"  controls autoplay>
        <source src="VideoDress.mp4" type="video/mp4">
        Your browser does not support the video tag.
    </video>
</div>




<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>
<br/>






<img class = "carmen" src = "Cshort.jpeg" alt ="Carmen Negron">
<footer>
    <h2>About me</h2>
    <p> My home studio is open by appointment only, offering a professional
        person to person consultation. With over 30 years of experience on this art.
        I offer a high stand customer service, fashion knowledge and a high
        level of exceptional craftsmanship.
        Each bride experience a smooth process from beginning to end and I do all
        that I can to make the experience a very special one.I have a passion for
        creating timeless, fashion-forward pieces that balance classic elegance with
        modern style. My designs are inspired by the beauty of everyday life, and I
        specialize in creating looks that are both classy and sophisticated. I
        believe that a dress should not only fit the body but also reflect the
        personality of the person wearing it. My focus is to create exclusive,
        one-of-a-kind designs that allow each wearer to express their own unique
        and beautiful style.</p>
    <img class = "carmen" src = "C2.jpg" alt ="Carmen Negron">
</footer>
</body>
</html>