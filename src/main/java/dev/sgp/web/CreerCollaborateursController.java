package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

public class CreerCollaborateursController extends HttpServlet {
	// récupération du service
	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.getRequestDispatcher("/WEB-INF/views/collab/creerCollaborateurs.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String matricule = Long.toHexString(Double.doubleToLongBits(Math.random()));
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		LocalDate dateNaissance = LocalDate.parse(req.getParameter("dateNaissance"));
		String adresse = req.getParameter("adresse");
		String numeroSecu = req.getParameter("numeroSecu");
		String emailPro = "";
		ZonedDateTime dateCreation = ZonedDateTime.now();
		Boolean actif = true;

		Collaborateur collaborateur = new Collaborateur(null, emailPro, emailPro, null, emailPro, emailPro, emailPro,
				dateCreation, actif);
		// erreur
		if (req.getParameter("numSecu").length() != 15) {
			req.setAttribute("collaborateur", collaborateur);
			req.getRequestDispatcher("/WEB-INF/views/collab/creerCollaborateurs.jsp").forward(req, resp);
			resp.setStatus(400);
		} else {

			// Ajout du collaborateur
			collabService.sauvegarderCollaborateur(collaborateur);
			resp.sendRedirect(req.getContextPath() + "/collaborateurs/lister");

		}

	}

}