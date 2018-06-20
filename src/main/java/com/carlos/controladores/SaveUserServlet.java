package com.carlos.controladores;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register2")
public class SaveUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.getRequestDispatcher("").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
/*
		String image = request.getParameter("image");
		String firstName = request.getParameter("firstname");
		String secondName = request.getParameter("secondname");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		int age = Integer.parseInt(request.getParameter("age"));
		String interests = request.getParameter("interests");
		String gender = request.getParameter("gender");
		String aboutMe = request.getParameter("aboutme");

		Usuario user = new Usuario();
		user.setUid(0);
		user.setImagen(image);
		user.setNombre(firstName);
		user.setApellido(secondName);
		user.setCorreo(email);
		user.setContrasena(password);
		user.setEdad(age);
		user.setIntereses(interests);
		user.setSexo(gender);
		user.setSobreMi(aboutMe);
*/
		try {
		} catch (java.lang.Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
