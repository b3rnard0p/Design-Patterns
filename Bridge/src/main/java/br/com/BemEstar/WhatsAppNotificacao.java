package br.com.BemEstar;

public class WhatsAppNotificacao implements CanalNotificacao {
    @Override
    public void enviar(String titulo, String mensagem) {
        System.out.println("Mensagem no WhatsApp -> " + titulo + ": " + mensagem);
    }
}
