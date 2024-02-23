public class Employe {
    private String nom;
    private double tauxHoraire;

    public Employe(String nom, double tauxHoraire) {
        this.nom = nom;
        this.tauxHoraire = tauxHoraire;
    }
    public String getNom() {
        return nom;
    }

    public double getTauxHoraire() {
        return tauxHoraire;
    }

    public void setNom(String nom){
        this.nom = nom;
    }

    public void setTauxHoraire(double tauxHoraire) {
        this.tauxHoraire = tauxHoraire;
    }

    public double calculerSalaire(int heuresTravaillees) {
      return tauxHoraire*heuresTravaillees;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "nom='" + nom + '\'' +
                ", tauxHoraire=" + tauxHoraire +
                '}';
    }

}
