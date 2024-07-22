public class Principal {
    public static void main(String[] args) {
//nome da classe
        Filme meuFilme = new Filme();
        meuFilme.Nome = "As Bem Armadas";
        meuFilme.anoDeLancamento = 2009;
        meuFilme.duracaoEmMinutos = 180;


//        exibe o nome e o ano de lançamento do filme do jeito que foi configurado
        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de Avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());



//        Se eu quiser imprimir o nome eu coloco o .Nome
//        instanciar os objetos
//        System.out.println("Nome do Filme: " + Nome);
//        System.out.println("Ano de Lançamento: " + anoDeLancamento);

    }
}
