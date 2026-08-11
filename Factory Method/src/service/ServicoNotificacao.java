package service;
import notificacoes.Notificacao;

public abstract class ServicoNotificacao {

    protected abstract Notificacao criarNotificacao();

    public void notificar(String destinatario, String mensagem) {
        Notificacao notificacao = criarNotificacao();
        notificacao.enviar(destinatario, mensagem);
    }
}