package tp1;
/**
 * L3 Miage TP1
 * 
 * Normalisation des donnée
 * 
 * @author mohamed fountir
 */

public class FeatureScaling {
    private double  min;  // Valeur minimale des données
    private double max;  // Valeur maximale des données
    private double somme;  // Somme des valeurs lues
    private double nombre;  // Nombre de valeurs lues

    // Constructeur
    public FeatureScaling() {
        this.min = Double.MAX_VALUE;
        this.max = Double.MIN_VALUE;
        this.somme = 0;
        this.nombre = 0;
    }

    // Retourne la valeur maximale lue
    public double getMax() {
        return this.max;
    }

    // Retourne la valeur minimale lue
    public double getMin() {
        return this.min;
    }

    // Méthode pour lire une nouvelle valeur
    public void lire(double valeur) {
        somme += valeur;
        nombre+=1;

        if (valeur > max) 
            max = valeur;
        if (valeur < min) 
            min = valeur;
    }

    // Calcul de la moyenne des valeurs lues
    public double moyenne() {
    	return somme / nombre;
        
    }

    // Méthode pour normaliser une valeur
    public double normalize(double valeur) {
    		
    	double moyenne = moyenne();
        return (valeur - moyenne) / (max - min);
    }

}
