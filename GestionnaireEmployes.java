import java.util.ArrayList;
import java.util.List;

public class GestionnaireEmployes {
    private final List<Employe> listeEmployes;

    public GestionnaireEmployes() {
        listeEmployes = new ArrayList<>();
    }
    public void ajouterEmploye(Employe employe) {
        listeEmployes.add(employe);
    }

    public void supprimerEmploye(Employe employe) {
        listeEmployes.remove(employe);
    }

    public void afficherListeEmployes() {
        System.out.println("Liste des employés de l'entreprise :");
        for (Employe employe : listeEmployes) {
            System.out.println();
        }
    }
    public List<Employe> getListeEmployes() {
        return listeEmployes;
    }
}
