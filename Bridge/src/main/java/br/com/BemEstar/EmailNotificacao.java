package br.com.BemEstar;

public class EmailNotificacao implements CanalNotificacao {
    @Override
    public void enviar(String titulo, String mensagem) {
        System.out.println("Enviando E-mail -> " + titulo + ": " + mensagem);
    }
}
