public class RedesocialService implements ServicoMensagem{
    @Override
    public void enviar(String mensagem) {
        System.out.printf("[Redes Sociais] - Publicando no Feed: %s", mensagem);
    }
}
