package Model;

import java.util.HashMap;
import java.util.Map;

public class HopitalModel {

    private static Map<String, BesoinTraitement> besoinsTraitement = new HashMap<>();

    static {
        // Initialiser les besoins de traitement pour différents problèmes de santé
        besoinsTraitement.put("Crise Cardiaque", new BesoinTraitement(1, 1, 2, 2, 1, 1));
        besoinsTraitement.put("Jambe Cassée", new BesoinTraitement(1, 0, 0, 1, 0, 1));
        // Ajouter plus de besoins de traitement au besoin
    }

    public static boolean verifierTraitementDisponible(String probleme) {
        BesoinTraitement besoin = besoinsTraitement.getOrDefault(probleme, null);
        if (besoin != null) {
            // Vérifier si l'hôpital dispose de suffisamment de ressources pour traiter le problème
            return RessourcesHopital.aSuffisammentDeRessources(besoin);
        } else {
            return false; // Si les besoins de traitement ne sont pas définis pour le problème
        }
    }
}

