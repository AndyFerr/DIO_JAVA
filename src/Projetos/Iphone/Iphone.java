package Projetos.Iphone;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    public void selecionarMusica(){
        System.out.println("Lista de músicas: \n");
        for (String musica :musicas){
            System.out.println(musica + "\n");
        }
        System.out.println("Escolha o número da música que quer tocar: ");
        int nm = numeroMusica.nextInt();

        System.out.println("Tocando "+musicas[nm-1]);
        numeroMusica.close();
    }

    public void ligar(){
        System.out.println("Qual o número que você quer ligar?");
        String numero = numeroTelefone.nextLine();
        System.out.println("Ligando para "+numero);

        numeroTelefone.close();
    }

    public void atender(){
        System.out.println("Atendendo ligação");
    }

    public void iniciarCorreioVoz(){
        System.out.println("Deixe uma mensagem após o bip");
    }

    public void atualzarPag(){}
    public void adicionarNovaAba(){}
    public void exibirPag(){}
}
