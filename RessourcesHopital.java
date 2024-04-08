package Model;

public class RessourcesHopital {
    private static int litsDisponibles = 10;
    private static int respirateursDisponibles = 5;
    private static int medicamentsDisponibles = 50;
    private static int medecinsDisponibles = 3;
    private static int infirmiersDisponibles = 10;
    private static int chirurgiensDisponibles = 2;

    public static boolean aSuffisammentDeRessources(BesoinTraitement besoin) {
        return litsDisponibles >= besoin.getLits() &&
                respirateursDisponibles >= besoin.getRespirateurs() &&
                medicamentsDisponibles >= besoin.getMedicaments() &&
                medecinsDisponibles >= besoin.getMedecins() &&
                infirmiersDisponibles >= besoin.getInfirmiers() &&
                chirurgiensDisponibles >= besoin.getChirurgiens();
    }
}

