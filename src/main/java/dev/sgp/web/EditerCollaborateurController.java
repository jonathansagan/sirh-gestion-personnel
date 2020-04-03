package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditerCollaborateurController extends HttpServlet {
	// Point GET
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// recupere la valeur des parametres
		String avecMatriculeParam = req.getParameter("Matricule");

		// Cas où le matricule est manquant :
		if (avecMatriculeParam == null) {
			resp.setStatus(400);
			resp.getWriter().write("Un matricule est attendu");

			// Cas où le matricule est correctement saisi :
		} else {
			resp.setStatus(200);
			resp.getWriter().write("<html><body>");
			resp.getWriter().write(("<h1>Edition de collaborateurs</h1>" + "Matricule : M" + avecMatriculeParam));
			resp.getWriter().write("</body></html>");

		}
	}

	// Point POST
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String avecMatriculeParam = req.getParameter("Matricule");
		String avecTitreParam = req.getParameter("Titre");
		String avecNomParam = req.getParameter("Nom");
		String avecPrenomParam = req.getParameter("Prénom");

		if ( avecMatriculeParam == null) {
			resp.sendError(400, "Les paramètres suivants sont incorrects : matricule");
		} else if (avecTitreParam == null) {
			resp.sendError(400, "Les paramètres suivants sont incorrects : titre");
		} else if (avecNomParam == null) {
			resp.sendError(400, "Les paramètres suivants sont incorrects : nom");
		} else if (avecPrenomParam == null) {
			resp.sendError(400, "Les paramètres suivants sont incorrects : prenom");
		} else {
			resp.setStatus(201);
			resp.getWriter().write("Creation d’un collaborateur avec les informations suivantes :");
			resp.getWriter().write("matricule="+avecMatriculeParam+", titre="+avecTitreParam+", nom="+avecNomParam+", prenom="+avecPrenomParam);

		}
	}
}