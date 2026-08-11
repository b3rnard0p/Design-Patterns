import service.ServicoEmail;
import service.ServicoNotificacao;
import service.ServicoSMS;
import service.ServicoWhatsApp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ServicoNotificacao servico = null;

        System.out.println("Enviar por onde:");
        System.out.println("1 - email");
        System.out.println("2 - SMS");
        System.out.println("3 - zap");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Manda para quem: ");
        String destinatario = scanner.nextLine();

        System.out.print("Mensagem: ");
        String mensagem = scanner.nextLine();

        switch (opcao) {
            case 1:
                servico = new ServicoEmail();
                break;
            case 2:
                servico = new ServicoSMS();
                break;
            case 3:
                servico = new ServicoWhatsApp();
                break;
            default:
                System.out.println("Tem os numeros ai po.");
                System.exit(0);
        }

        System.out.println("\n Tua Mensagem");
        servico.notificar(destinatario, mensagem);

        scanner.close();
    }
}