<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>Tindog</title>
<link rel="icon" href="./assets/imgs/favicon-32x32.png">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">

<link rel="stylesheet" href="./assets/styles/floatinglabel.css" />

<link rel="stylesheet" href="./assets/styles/style.css" />
</head>
<body>

<!--  <div class="preload">
    	<img src="./assets/imgs/loading_spinner.gif" />
    </div> -->

	<form action="" method="POST" class="form-signin">
		<div class="text-center mb-4">
			<img class="mb-4" src="./assets/imgs/logo.jpg" alt="" width="150"
				height="100">
			<h1 class="h3 mb-3 font-weight-normal">Bienvenido al Tindog</h1>
			<p>El lugar para conocer perros y perras interesantes!</p>
		</div>

		<div class="form-label-group">
			<input type="email" name="correo" id="inputEmail"
				class="form-control" placeholder="Email address" required autofocus>
			<label for="inputEmail">Email address</label>
		</div>

		<div class="form-label-group">
			<input type="password" name="contrasena" id="inputPassword"
				class="form-control" placeholder="Password" required> <label
				for="inputPassword">Password</label>
		</div>

		<div class="checkbox mb-3">
			<label> <input type="checkbox" value="remember-me">
				Remember me
			</label>
		</div>
		<button class="btn btn-lg btn-primary btn-block" type="submit">Entrar</button>
		<p>
			Nuevo? Clique <a href="./register"> aqui </a>para registrarse!
		</p>


		</div>
		<p class="mt-5 mb-3 text-muted text-center">&copy; 2018</p>
	</form>
</body>

<!-- <script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.3/jquery.min.js" type="text/javascript"></script>
<script src="./assets/script/script.js"></script> -->
</html>
