public class Main {
    public static void main(String[] args) {

        Employe employe = new Employe ("Jean Dupont",20 );

        int heuresTravaillees = 40;
        double salaire = employe.calculerSalaire(heuresTravaillees);
        System.out.println("Salaire de l'employé " + employe.getNom() + " : " + salaire+"€");

        GestionnaireEmployes gestionnaire = new GestionnaireEmployes();

        gestionnaire.ajouterEmploye(new Employe("Jean", 20));
        gestionnaire.ajouterEmploye(new Employe("Alice", 20));
        gestionnaire.ajouterEmploye(new Employe("Pauline", 20));

        gestionnaire.afficherListeEmployes();

        Employe employeASupprimer = gestionnaire.getListeEmployes().getFirst();

        gestionnaire.supprimerEmploye(employeASupprimer);

        gestionnaire.afficherListeEmployes();
    }
}