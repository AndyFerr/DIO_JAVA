classDiagram
class ReprodutorMusical {
-String [] musicas
+Scanner numeroMusica

        +tocar()
        +pausar()
        +selecionarMusica()
    }

    class AparelhoTelefonico {
        +Scanner numeroTelefone
        +ligar(int numero)
        +atender()
        +iniciarCorreioVoz()
        
    }

    class NavegadorInternet {
        +Scanner link
        +exibirPagina()
        +adicionarNovaAba()
        +atualizarPagina()
    }

    class iPhone {
        +selecionarMusica()
        +ligar()
        +atender()
        +iniciarCorreioVoz()
    }

    iPhone --> ReprodutorMusical
    iPhone --> AparelhoTelefonico
    iPhone --> NavegadorInternet
