package Model;

public class BesoinTraitement {
    private int lits;
    private int respirateurs;
    private int medicaments;
    private int medecins;
    private int infirmiers;
    private int chirurgiens;

    public BesoinTraitement(int lits, int respirateurs, int medicaments, int medecins, int infirmiers, int chirurgiens) {
        this.lits = lits;
        this.respirateurs = respirateurs;
        this.medicaments = medicaments;
        this.medecins = medecins;
        this.infirmiers = infirmiers;
        this.chirurgiens = chirurgiens;
    }

 
    public int getLits()
    {
        return lits;
    }
    
    public void setLits(int lits)
    {
        this.lits = lits;
    }

   
    public int getRespirateurs()
    {
        return respirateurs;
    }

    public void setRespirateurs(int respirateurs)
    {
        this.respirateurs = respirateurs;
    }

    public int getMedicaments()
    {
        return medicaments;
    }

    public void setMedicaments(int medicaments)
    {
        this.medicaments = medicaments;
    }

    public int getMedecins()
    {
        return medecins;
    }

    public void setMedecins(int medecins)
    {
        this.medecins = medecins;
    }

    public int getInfirmiers()
    {
        return infirmiers;
    }

    public void setInfirmiers(int infirmiers)
    {
        this.infirmiers = infirmiers;
    }


    public int getChirurgiens()
    {
        return chirurgiens;
    }

    public void setChirurgiens(int chirurgiens)
    {
        this.chirurgiens = chirurgiens;
    }
}

