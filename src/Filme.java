public class Filme {
    String Nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalDeAvaliacoes;
    int duracaoEmMinutos;


//    método = vai imprimir a ficha técnica do filme
//    quando eu chamar o método exibeFichaTecnica ele retorna o que eu determinei para o filme
    void exibeFichaTecnica(){
        System.out.println("Nome do Filme: " + Nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
    }

    void avalia (double nota){
        somaDasAvaliacoes = somaDasAvaliacoes + nota;
//      totalDeAvaliacoes vai receber +1
        totalDeAvaliacoes++;
    }
}
