package service;
import notificacoes.Notificacao;
import notificacoes.NotificacaoEmail;

public class ServicoEmail extends ServicoNotificacao {
    @Override
    protected Notificacao criarNotificacao() {
        return new NotificacaoEmail();
    }
}