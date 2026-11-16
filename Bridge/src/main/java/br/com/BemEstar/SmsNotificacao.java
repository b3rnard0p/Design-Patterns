package br.com.BemEstar;

public class SmsNotificacao implements CanalNotificacao {
    @Override
    public void enviar(String titulo, String mensagem) {
        System.out.println("Enviando SMS -> " + titulo + ": " + mensagem);
    }
}