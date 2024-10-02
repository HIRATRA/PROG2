import java.util.ArrayList;
import java.util.List;

// Classe pour représenter un Appartement
class Appartement {
    private String id;
    private String titre;
    private String description;
    private double loyerMensuel;
    private String statut; // libre, occupé, en cours de libération
    private Endroit endroit;

    public Appartement(String id, String titre, String description, double loyerMensuel, String statut, Endroit endroit) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.loyerMensuel = loyerMensuel;
        this.statut = statut;
        this.endroit = endroit;
    }

    public String getId() {
        return id;
    }

    public Endroit getEndroit() {
        return endroit;
    }
}

// Classe abstraite pour représenter un Endroit
abstract class Endroit {
    protected String id;
    protected String nom;

    public Endroit(String id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public abstract int compterAppartements();
}


