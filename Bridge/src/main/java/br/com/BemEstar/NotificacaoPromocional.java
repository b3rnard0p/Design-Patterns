package br.com.BemEstar;

public class NotificacaoPromocional extends Notificacao {
    public NotificacaoPromocional(CanalNotificacao canal) { super(canal); }

    @Override
    public void enviar(String mensagem) {
        canal.enviar("[PROMOÇÃO] Oferta Especial", mensagem);
    }
}