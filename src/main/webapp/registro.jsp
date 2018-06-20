<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>TindogRegistro</title>
<link rel="icon" href="./assets/imgs/favicon-32x32.png">
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">
<link rel="stylesheet" href="./assets/styles/style.css" />
</head>
<body>

	<section>

		<div class="media">
			<img class="tlogo2" src="./assets/imgs/logo.jpg"
				alt="tindog placeholder image">
		</div>
		<h2>Registro Usuario</h2>

		<div class="container-fluid">

			<form action="" method="post">
				<div class="form-group">

					<div>
						<input type="hidden" name="uid" value="${user.uid}" />
					</div>
					<div class="form-group">
						<label for="exampleFormControlFile1">Seleccione su imagen
							de perfil:</label> <input type="file" class="form-control-file"
							id="exampleFormControlFile1" name="imagen" value="${user.image}"
							required>
					</div>
					<!-- Imagen: <input type="image" name="image" width="100" height="30"><br/> -->

					<div class="row">
						<div class="col">
							Nombre: <input type="text" class="form-control"
								placeholder="First name" name="nombre" value="${user.firstname}"
								required>
						</div>
						<div class="col">
							Apellidos: <input type="text" class="form-control"
								placeholder="Last name" name="apellido"
								value="${user.secondname}" required>
						</div>
					</div>

					<label for="exampleInputEmail1">Correo Electronico:</label> <input
						type="email" name="correo" value="${user.email}"
						class="form-control" id="exampleInputEmail1"
						aria-describedby="emailHelp" placeholder="Enter email" required>

					<div class="form-group">
						<label for="exampleInputPassword1">Password:</label> <input
							type="password" name="contrasena" value="${user.password}"
							class="form-control" id="exampleInputPassword1"
							placeholder="Password" required>
					</div>
					<div class="form-group">

						Age: <input type="number" name="edad" value="${user.age}" min="1"
							max="100" class="form-control" placeholder="Edad" required>
					</div>
					<!-- Edad: <input type="number" name="age"><br/> -->
					<div class="form-group">
						<label for="exampleFormControlTextarea1">Interests:</label>
						<textarea class="form-control" id="exampleFormControlTextarea1"
							rows="3" name="intereses" value="${user.interests}" required></textarea>
					</div>


					Sexo:<br> Masculino: <input type="radio" name="sexo"
						value="Masculino" required><br> Femenino: <input
						type="radio" name="sexo" value="Femenino" required><br>

					<div class="form-group">
						<label for="exampleFormControlTextarea1">Sobre mi:</label>
						<textarea class="form-control" id="exampleFormControlTextarea2"
							rows="3" name="sobreMi" value="${user.aboutme}" required></textarea>
					</div>

					<button class="btn btn-primary">Salvar</button>


				</div>


			</form>


		</div>


	</section>
</body>
</html>








