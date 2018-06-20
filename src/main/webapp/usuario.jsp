<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!doctype html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<title>TinDogUsuario</title>
<link rel="icon" href="./assets/imgs/favicon-32x32.png">
<link rel="stylesheet" href="./assets/styles/style.css" />
</head>
<body>

	<section>

		<ul>
			<c:forEach items="${showusers}" var="unUser">

				<%-- 			<li><a href="./detalle?id=${unUser.uid}">${unUser.nombre}</a> --%>
				<%-- 			<a href="./detalle?id=${unUser.uid}">${unUser.apellido}</a> --%>

				<!-- 			</li> -->




				<div class="tbg">
					<p>
						<a href="./logout"> Logout </a>
					</p>
					<div class="theader">
						<i class="fa fa-cog" aria-hidden="true"></i> <i
							class="fa fa-comments" aria-hidden="true"></i>
						<div class="tlogo">
							<img src="./assets/imgs/logo.jpg" alt="Tinder Logo" title="Tinder Logo" />
						</div>
					</div>
					<div class="tbgwrap">
						<div class="tphoto">
							<img src="${unUser.imagen}" title="tphoto" alt="Tindog Photo" />
							<div class="tname">
								${unUser.nombre}, <span class="age">${unUser.edad},</span> <i
									class="fa fa-users" aria-hidden="true">${unUser.sobreMi}</i>
							</div>
							<div class="tinfo">
								<i class="fa fa-book" aria-hidden="true">teste
									${unUser.intereses}</i> <i class="fa fa-users" aria-hidden="true">teste2
									${unUser.sobreMi}</i>
							</div>
						</div>


						<div class="tcontrols">
							<div class="tno">
								<i class="fa fa-times" aria-hidden="true">No</i>
							</div>
							<div class="ti">
								<i class="fa fa-info" aria-hidden="true">x</i>
							</div>
							<div class="tyes">
								<i class="fa fa-heart" aria-hidden="true">Si</i>
							</div>
						</div>
					</div>

				</div>
			</c:forEach>
		</ul>
	</section>
</body>
</html>