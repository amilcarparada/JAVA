public class TesteReceita {
    public static void main(String[] args) {
        //Instanciar um objeto = criar o objeto, primeira linha aqui abaixo
        Receita boloFuba = new Receita();
        boloFuba.nomeReceita = "Bolo de Fubá";
        boloFuba.dificuldade = "Fácil";
        boloFuba.porcoes = 8;
        boloFuba.tempoPreparo = 35;
        boloFuba.autorReceita = "Eliane";
        boloFuba.descricao = "Receita boa";
        boloFuba.ingredientes = "Açúcar e fubá";
        boloFuba.modoDePreparo = "Misturar tudo e colocar no forno por 25 minutos";
        //nome da classe, atributos, método
        boloFuba.exibirReceita();
        System.out.println(boloFuba.exibirReceita2());
    }
}
