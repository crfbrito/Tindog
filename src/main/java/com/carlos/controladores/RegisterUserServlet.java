package com.carlos.controladores;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.carlos.modelos.Usuario;
import com.carlos.persistence.UserEM;

@WebServlet("/register")
public class RegisterUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Usuario> unUsuario = null;
		try {
			unUsuario = UserEM.getInstance().getLista();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		request.setAttribute("usuario", unUsuario);
		request.getRequestDispatcher("registro.jsp").forward(request, response);
	}

	/*
	 * String result = "No Ok";
	 * 
	 * try {
	 * 
	 * Usuario nuevoUser = new Usuario();
	 * 
	 * nuevoUser.setImagen(
	 * "https://www.recreoviral.com/wp-content/uploads/2015/05/selfies-de-perros-18.jpg"
	 * ); nuevoUser.setNombre("Manolo"); nuevoUser.setApellido("Cherry");
	 * nuevoUser.setCorreo("crfbrito@es.es"); nuevoUser.setContrasena("123");
	 * nuevoUser.setEdad(1); nuevoUser.setIntereses("Yo quiero un perro guapo");
	 * nuevoUser.setSexo("Femenino"); nuevoUser.setSobreMi("Yo soy un perro guapo");
	 * 
	 * UserEM.getInstance().save(nuevoUser);
	 * 
	 * result =
	 * "OK OK OK OK OK OK OK OK OK OK OK OK OK OK OK OK OK OK OK OK OK OK OK OK"; }
	 * catch (Exception e) { e.printStackTrace(); }
	 * response.getWriter().append("Add: ").append(result);
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	



			String imagen = request.getParameter("imagen");
			String nombre = request.getParameter("nombre");
			String apellido = request.getParameter("apellido");
			String correo = request.getParameter("correo");
			String contrasena = request.getParameter("contrasena");
			int edad = request.getParameter("edad") != null ? Integer.parseInt(request.getParameter("edad")) : 0;
			String intereses = request.getParameter("intereses");
			String sexo = request.getParameter("sexo");
			String sobreMi = request.getParameter("sobreMi");
			
			
			System.out.println("imagen:" + imagen);
			System.out.println("nombre:" + nombre);
			System.out.println("apellido:" + apellido);
			System.out.println("correo:" + correo);
			System.out.println("contrasena:" + contrasena);
			System.out.println("edad:" + edad);
			System.out.println("intereses:" + intereses);
			System.out.println("sexo:" + sexo);
			System.out.println("sobreMi:" + sobreMi);
			
			
			
			Usuario usuarioToUpdate = new Usuario(imagen,nombre,apellido,correo,contrasena,edad,intereses,sexo,sobreMi);
			
			try {
				@SuppressWarnings("unused")
				boolean newUsuario = UserEM.getInstance().save(usuarioToUpdate);
				@SuppressWarnings("unused")
				boolean isOk=false;
			} catch (Exception e) {
				e.printStackTrace();					
			}
			
			//Verifico si hay error o no
			
			boolean isOk = true;
			if(isOk) {
				response.sendRedirect("usuario");
			}else {
				request.setAttribute("error", "Verifica los campos");
				request.setAttribute("usuario", usuarioToUpdate);			
				doGet(request, response);
			}
			
	
	}
}

	

			
			/*int uid = 0;
			if (uid > 0) {	
				Usuario usuarioToUpdate = new Usuario(imagen,nombre,apellido,correo,contrasena,edad,intereses,sexo,sobreMi);
				boolean isOk = UserEM.getInstance().save(usuarioToUpdate);
			}

		}catch(

	Exception e)
	{
		System.out.println("Error:" + e.getMessage());
		e.printStackTrace();
	}

	doGet(request, response);
			
	}

}*/