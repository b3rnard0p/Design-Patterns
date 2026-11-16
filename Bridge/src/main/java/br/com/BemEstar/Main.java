package br.com.BemEstar;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CanalNotificacao email = new EmailNotificacao();
        CanalNotificacao sms = new SmsNotificacao();
        CanalNotificacao app = new AppNotificacao();
        CanalNotificacao wpp = new WhatsAppNotificacao();

        Notificacao n1 = new NotificacaoComum(email);
        Notificacao n2 = new NotificacaoUrgente(sms);
        Notificacao n3 = new NotificacaoPromocional(app);
        Notificacao n4 = new NotificacaoUrgente(email);
        Notificacao n5 = new NotificacaoPromocional(wpp); // Testando o novo canal

        n1.enviar("Bem-vindo ao sistema.");
        n2.enviar("Servidor fora do ar!");
        n3.enviar("Desconto de 50% hoje.");
        n4.enviar("Falha no banco de dados.");
        n5.enviar("Compre 1 Leve 2.");
    }
}