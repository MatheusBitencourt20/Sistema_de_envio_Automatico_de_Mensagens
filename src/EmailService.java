public class EmailService implements ServicoMensagem{
    @Override
    public void enviar(String mensagem) {
        System.out.printf("[E-MAIL] - Enviando via servidor SMTP: %s", mensagem);
    }
}
