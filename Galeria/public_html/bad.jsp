<%@ page contentType="text/html;charset=windows-1252"%>
<html>
<head>
<link type="text/css" rel="stylesheet" href="css/bootstrap.min.css">
<link type="text/css" rel="stylesheet" href="css/estilo.css">
<script type="text/javascript"  src="js/jquery-1.11.0.min.js"></script>
<script type="text/javascript" src="js/jquery-ui.min.js"></script> 
<script type="text/javascript" src="js/animated_bg.js"></script>
<script type="text/javascript" src="js/jquery-3.4.1.min.js"></script>	
<meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
<title>
Error
</title>
</head>
<body Class="animated_bg">
<center>
<h1 class="ml2">Error! <%=session.getAttribute("error")%></h1>
<h1 class="ml2">Intentelo Mas Tarde..</h1>
</center>
<p></p>
<center><img src="img/homero.gif"></center>
<script src="https://cdnjs.cloudflare.com/ajax/libs/animejs/2.0.2/anime.min.js"></script>
<script>
// Wrap every letter in a span
$('.ml2').each(function(){
  $(this).html($(this).text().replace(/([^\x00-\x80]|\w)/g, "<span class='letter'>$&</span>"));
});

anime.timeline({loop: true})
  .add({
    targets: '.ml2 .letter',
    scale: [4,1],
    opacity: [0,1],
    translateZ: 0,
    easing: "easeOutExpo",
    duration: 950,
    delay: function(el, i) {
      return 70*i;
    }
  }).add({
    targets: '.ml2',
    opacity: 0,
    duration: 1000,
    easing: "easeOutExpo",
    delay: 1000
  });
</script>
<script>
	jQuery(document).ready(function(){

		$('.animated_bg2').animatedBG({
			colorSet: ['#abebfe', '#aad667', '#57e6ee', '#ff7ebb'],
			speed: 2000
		});

		$('.animated_bg3').animatedBG({
			colorSet: ['#71a98b', '#b15c8e', '#dc6b68', '#6c5a94', '#b14c4e', '#736357'],
			speed: 6000
		});

	});
</script>
</body>
</html>
