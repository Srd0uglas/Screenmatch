public class Principal {
    public static void main(String[] args) {
//nome da classe
        Filme meuFilme = new Filme();
        meuFilme.Nome = "As Bem Armadas";
        meuFilme.anoDeLancamento = 2009;
        meuFilme.duracaoEmMinutos = 180;


        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(meuFilme.totalDeAvaliacoes);


//        Se eu quiser imprimir o nome eu coloco o .Nome
//        instanciar os objetos
//        System.out.println("Nome do Filme: " + Nome);
//        System.out.println("Ano de Lançamento: " + anoDeLancamento);

    }
}
