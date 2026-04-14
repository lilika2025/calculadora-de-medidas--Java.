import java.util.Scanner;

public class CalculadoraMedias {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("--- SISTEMA DE MÉDIAS ACADÊMICAS ---");

        System.out.print("Digite o nome da disciplina: ");
        String materia = leitor.nextLine();

        System.out.print("Digite a nota 1: ");
        double n1 = leitor.nextDouble();

        System.out.print("Digite a nota 2: ");
        double n2 = leitor.nextDouble();

        System.out.print("Digite a nota 3: ");
        double n3 = leitor.nextDouble();

        System.out.print("Digite a nota 4: ");
        double n4 = leitor.nextDouble();

        double media = (n1 + n2 + n3 + n4) / 4;

        System.out.println("\n--- RESULTADO FINAL ---");
        System.out.println("Disciplina: " + materia);
        System.out.printf("Sua média final foi: %.2f\n", media);

        if (media >= 7.0) {
            System.out.println("Status: PARABÉNS! Você foi aprovada!");
        } else {
            System.out.println("Status: Atenção, você ficou de recuperação.");
        }

        leitor.close();
    }
}
