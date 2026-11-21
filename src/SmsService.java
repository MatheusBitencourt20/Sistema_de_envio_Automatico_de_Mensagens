public class SmsService implements ServicoMensagem{
    @Override
    public void enviar(String mensagem) {
        System.out.printf("\n[SMS] - Disparado via operadora: %S", mensagem);
    }
}
