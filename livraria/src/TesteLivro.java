public class TesteLivro {
    public static void main(String[] args) {
        //Criando um objeto do tipo Editora chamado novatec
        Editora novatec = new Editora();
        novatec.nome = "Novatec";
        novatec.site = "www.novatec.com";
        novatec.telefone = "11568958995";

        //Criar um objeto -> Instanciar um objeto
    //  Tipo  nomeObjeto = new Tipo();
        Livro meuLivro = new Livro();
        meuLivro.titulo = "UML 2";
        meuLivro.autor = "Gilleanes Guedes";
        meuLivro.editora = novatec;
        meuLivro.preco = 50;
        meuLivro.paginas = 484;
        meuLivro.tipoCapa = TipoCapaEnum.DURA;
        meuLivro.resumo = "UML abordagem prática....";
        meuLivro.exibirLivro();

        Livro livroDaGiovanna = new Livro();
        livroDaGiovanna.titulo = "Harry Potter e a pedra filosofal";
        livroDaGiovanna.autor = "J K ";

    }
}
