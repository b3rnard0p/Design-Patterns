package service;

import notificacoes.Notificacao;
import notificacoes.NotificacaoWhatsapp;

public class ServicoWhatsApp extends ServicoNotificacao {
    @Override
    protected Notificacao criarNotificacao() {
        return new NotificacaoWhatsapp();
    }
}