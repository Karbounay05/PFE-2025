/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import DAO.ProfesseurDAO;
import entite.Classe;
import entite.Filiere;
import entite.Professeur;
import java.util.*;
import java.sql.Date;
public class ProfesseurCtrl {

    private ProfesseurDAO professeurDAO= new ProfesseurDAO();

    public boolean ajouterProfesseur(String nom, String prenom, String pseudo, String email, String motDePasse, Filiere filiere,Classe classe, String codeMassar, Date dateNaissance) {
        Professeur professeur = new Professeur(nom, prenom, pseudo, email, motDePasse, filiere, classe, codeMassar, dateNaissance);
        return professeurDAO.addProfesseur(professeur);
    }

    public ArrayList<Professeur> getAll() {
        return professeurDAO.listingProf();
    }
       public void delOne(int id) {
     professeurDAO.delProf(id);
}
        public ArrayList<Professeur> search(String n){
        return professeurDAO.search(n);
    }
       public int update(Professeur p) {
        return professeurDAO.updateProf(p);
}
           public ArrayList<Professeur> getProfessorsByFiliereAndClasse(int filiereId, int classeId) {
        return professeurDAO.getProfessorsByFiliereAndClasse(filiereId, classeId);
    }
     public boolean updateIdentifiant(Professeur professeur) {
    return professeurDAO.updateIdentifiant(professeur);
}
    public Professeur getProfesseurBySoutenance(int soutenanceId) {
        return professeurDAO.getProfesseurBySoutenance(soutenanceId);
    }
}


