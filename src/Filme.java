public class Filme {
    String Nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;


//    método de pegar as avaliações e mostrar para alguém (não deixar ninguém alterar, só acessar)
    int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }


//  *** Isso abaixo é método = vai imprimir a ficha técnica do filme ***

//    quando eu chamar o método exibeFichaTecnica ele retorna o que eu determinei para o filme
    void exibeFichaTecnica(){
//        o meu método vai mostrar o nome e o ano de lançamento
        System.out.println("Nome do Filme: " + Nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }

//    Método para somar as avaliações
    void avalia (double nota){
        somaDasAvaliacoes = somaDasAvaliacoes + nota;
//      totalDeAvaliacoes vai receber +1
        totalDeAvaliacoes++;
    }

    double pegaMedia(){
//        vai retornar a soma de avaliações e dividir pela quantidade de avaliações
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}