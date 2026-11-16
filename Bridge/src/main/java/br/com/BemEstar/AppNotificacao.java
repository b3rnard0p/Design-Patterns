package br.com.BemEstar;

public class AppNotificacao implements CanalNotificacao {
    @Override
    public void enviar(String titulo, String mensagem) {
        System.out.println("Notificação no App -> " + titulo + ": " + mensagem);
    }
}