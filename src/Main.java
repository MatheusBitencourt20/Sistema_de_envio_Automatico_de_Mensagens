import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        ServicoMensagem sms = new SmsService();
        ServicoMensagem email = new EmailService();
        ServicoMensagem redeSocial = new RedesocialService();
        ServicoMensagem whatsapp = new WhatsappService();

        ServicoMensagem[] TodosOsCanais = {sms, email, redeSocial, whatsapp};

        while (true){
            System.out.println("\n=====Serviço de Marketing Digital====");
            System.out.println("1 - Enviar por SMS");
            System.out.println("2 - Enviar por E-mail");
            System.out.println("3 - Enviar por Rede Social");
            System.out.println("4 - Enviar por WhatsApp");
            System.out.println("5 - Enviar em todos os serviços");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            var opcao = scanner.nextInt();

            if (opcao == 0){
                System.out.println("Até Logo!");
                break;
            }
            if (opcao >= 1 && opcao <=5){
                System.out.print("Digite a mensagem a ser enviada: ");
                var mensagem = scanner.next();

                System.out.print("Processando...");
                switch (opcao){
                    case 1:
                        sms.enviar(mensagem);
                        break;
                    case 2:
                        email.enviar(mensagem);
                        break;
                    case 3:
                        redeSocial.enviar(mensagem);
                        break;
                    case 4:
                        whatsapp.enviar(mensagem);
                        break;
                    case 5:
                        System.out.println("Enviando para todos os canais:");
                        for (ServicoMensagem canal: TodosOsCanais){
                            canal.enviar(mensagem);
                        }break;
                }
            }else {
                System.out.println("Opção invalida");
            }

        }

        scanner.close();

    }
}