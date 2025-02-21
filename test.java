// Test.java
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculatrice calc = new Calculatrice();
        
        while (true) {
            try {
                // Affichage du menu
                System.out.println("\n=== Calculatrice ===");
                System.out.println("1. Addition (+)");
                System.out.println("2. Soustraction (-)");
                System.out.println("3. Multiplication (*)");
                System.out.println("4. Division (/)");
                System.out.println("5. Quitter");
                System.out.print("Choisissez une opération (1-5) : ");
                
                int choix = scanner.nextInt();
                
                // Vérification pour quitter
                if (choix == 5) {
                    System.out.println("Au revoir!");
                    break;
                }
                
                // Vérification de la validité du choix
                if (choix < 1 || choix > 5) {
                    System.out.println("Choix invalide. Veuillez choisir entre 1 et 5.");
                    continue;
                }
                
                // Demande des nombres
                System.out.print("Entrez le premier nombre : ");
                double nombre1 = scanner.nextDouble();
                
                System.out.print("Entrez le deuxième nombre : ");
                double nombre2 = scanner.nextDouble();
                
                // Exécution de l'opération choisie
                double resultat;
                switch (choix) {
                    case 1:
                        resultat = calc.addition(nombre1, nombre2);
                        System.out.printf("%.2f + %.2f = %.2f%n", nombre1, nombre2, resultat);
                        break;
                    case 2:
                        resultat = calc.soustraction(nombre1, nombre2);
                        System.out.printf("%.2f - %.2f = %.2f%n", nombre1, nombre2, resultat);
                        break;
                    case 3:
                        resultat = calc.multiplication(nombre1, nombre2);
                        System.out.printf("%.2f * %.2f = %.2f%n", nombre1, nombre2, resultat);
                        break;
                    case 4:
                        resultat = calc.division(nombre1, nombre2);
                        System.out.printf("%.2f / %.2f = %.2f%n", nombre1, nombre2, resultat);
                        break;
                }
                
            } catch (ArithmeticException e) {
                System.out.println("Erreur : " + e.getMessage());
            } catch (Exception e) {
                System.out.println("Erreur : Entrée invalide. Veuillez entrer des nombres valides.");
                scanner.nextLine(); // Nettoie le buffer
            }
        }
        
        scanner.close();
    }
}