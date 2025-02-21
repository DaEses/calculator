package calculatrice;

import java.util.Scanner;

public class test {

    public static void main(String[] args) {
        calc calcul = new calc();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenue dans la calculatrice !");
        System.out.print("Entrez le premier nombre : ");
        double num1 = scanner.nextDouble();
        System.out.print("Entrez l'opération (+, -, *, /) : ");
        char operation = scanner.next().charAt(0);

        System.out.print("Entrez le deuxième nombre : ");
        double num2 = scanner.nextDouble();

        double resultat = 0;
        try {
            switch (operation) {
                case '+' ->
                    resultat = calcul.addition(num1, num2);
                case '-' ->
                    resultat = calcul.soustraction(num1, num2);
                case '*' ->
                    resultat = calcul.mutiplication(num1, num2);
                case '/' ->
                    resultat = calcul.division(num1, num2);
                default -> {
                    System.out.println("Opération non valide !");
                    return;
                }
            }
            System.out.println("Le résultat est : " + resultat);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }
}
