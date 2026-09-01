interface Notificador {
    void enviar(String destinatario, String mensagem);
}

class EmailNotificador implements Notificador {
    public void enviar(String destinatario, String mensagem) {
        System.out.println("Enviando email para " + destinatario + ": " + mensagem);
    }
}

class SmsAntigo {
    void enviarSms(String numero, String texto) {
        System.out.println("Enviando SMS para " + numero + ": " + texto);
    }
}

class WhatsAppExterno {
    void mandarMensagem(String telefone, String conteudo) {
        System.out.println("Enviando WhatsApp para " + telefone + ": " + conteudo);
    }
}

class TelegramExterno {
    void enviarParaUsuario(String usuario, String texto) {
        System.out.println("Enviando Telegram para " + usuario + ": " + texto);
    }
}

class SmsAdapter implements Notificador {
    private SmsAntigo smsAntigo;
    public SmsAdapter(SmsAntigo smsAntigo) { this.smsAntigo = smsAntigo; }
    public void enviar(String destinatario, String mensagem) {
        smsAntigo.enviarSms(destinatario, mensagem);
    }
}

class WhatsAppAdapter implements Notificador {
    private WhatsAppExterno whatsappExterno;
    public WhatsAppAdapter(WhatsAppExterno whatsappExterno) { this.whatsappExterno = whatsappExterno; }
    public void enviar(String destinatario, String mensagem) {
        whatsappExterno.mandarMensagem(destinatario, mensagem);
    }
}

class TelegramAdapter implements Notificador {
    private TelegramExterno telegramExterno;
    public TelegramAdapter(TelegramExterno telegramExterno) { this.telegramExterno = telegramExterno; }
    public void enviar(String destinatario, String mensagem) {
        telegramExterno.enviarParaUsuario(destinatario, mensagem);
    }
}

class AplicacaoNotificacao {
    private Notificador notificador;
    public AplicacaoNotificacao(Notificador notificador) {
        this.notificador = notificador;
    }
    public void notificarUsuario(String destinatario, String mensagem) {
        notificador.enviar(destinatario, mensagem);
    }
}

public class Main {
    public static void main(String[] args) {
        Notificador email = new EmailNotificador();
        AplicacaoNotificacao appEmail = new AplicacaoNotificacao(email);
        appEmail.notificarUsuario("joao@email.com", "Sua compra foi aprovada.");

        SmsAntigo smsAntigo = new SmsAntigo();
        Notificador sms = new SmsAdapter(smsAntigo);
        AplicacaoNotificacao appSms = new AplicacaoNotificacao(sms);
        appSms.notificarUsuario("55999999999", "Sua compra foi aprovada.");

        WhatsAppExterno whatsappExterno = new WhatsAppExterno();
        Notificador whatsapp = new WhatsAppAdapter(whatsappExterno);
        AplicacaoNotificacao appWhatsApp = new AplicacaoNotificacao(whatsapp);
        appWhatsApp.notificarUsuario("55999999999", "Sua compra foi aprovada.");

        TelegramExterno telegramExterno = new TelegramExterno();
        Notificador telegram = new TelegramAdapter(telegramExterno);
        AplicacaoNotificacao appTelegram = new AplicacaoNotificacao(telegram);
        appTelegram.notificarUsuario("55999999999", "Sua compra foi aprovada.");
    }
}