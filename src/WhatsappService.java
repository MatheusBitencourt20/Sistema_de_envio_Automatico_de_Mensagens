public class WhatsappService implements ServicoMensagem{
    @Override
    public void enviar(String mensagem) {
        System.out.printf("[WhatsApp] - Enviando via WhatsApp Business API: %s", mensagem);
    }
}
