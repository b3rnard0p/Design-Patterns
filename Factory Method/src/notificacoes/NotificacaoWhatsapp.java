package notificacoes;

public class NotificacaoWhatsapp implements Notificacao {
    @Override
    public void enviar(String destinatario, String mensagem) {
        System.out.println("Enviando WhatsApp para " + destinatario + ":\n" + mensagem);
    }
}
