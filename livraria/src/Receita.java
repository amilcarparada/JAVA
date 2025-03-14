import java.sql.SQLOutput;

public class Receita {
    String nomeReceita;
    String autorReceita;
    String dificuldade;
    int tempoPreparo;
    int porcoes;
    String descricao;
    String ingredientes;
    String modoDePreparo;
    String foto;
    //no String foto depois colocamos a URL da imagem na parte do texto

// método sem retorno = void
    public void exibirReceita(){
        System.out.println("Receita de " + nomeReceita);
        System.out.println("=====================");
        System.out.println("Publicado por: " + autorReceita);
        System.out.println("Dificuldade: " + dificuldade + "\t" + "Tempo de Preparo (minutos): " + tempoPreparo + "\t" + "Rendimento: " + porcoes + "\n");
        System.out.println("Resumo: \n" + descricao + "\n");
        System.out.println("Ingredientes:\n" + ingredientes + "\n");
        System.out.println("Modo de Preparo:\n" + modoDePreparo);
    }
//método do retorno
    public String exibirReceita2(){
        String mensagem = "Receita de " + nomeReceita +
                "\n===================" +
                "\nPublicado por: " + autorReceita +
                "\nDificuldade: " + dificuldade + "\t" + "Tempo de Preparo (minutos): " + tempoPreparo + "\t" + "Rendimento: " + porcoes;
        return mensagem;

    }
}
