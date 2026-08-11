package service;
import notificacoes.Notificacao;
import notificacoes.NotificacaoSMS;

public class ServicoSMS extends ServicoNotificacao {
    @Override
    protected Notificacao criarNotificacao() {
        return new NotificacaoSMS();
    }
}