public class Ex1 {
    public static void main(String[] args) {
        int[] vetor = {2,3,9,8,5,6,4};
        try {
            System.out.println("Menor: " + maiorMenor(vetor)[0] + "\nMaior: " + maiorMenor(vetor)[1]);
        } catch(Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
    
    public static int[] maiorMenor(int[] vetor) throws Exception {
        if(vetor == null || vetor.length == 0) {
            throw new Exception("O vetor não pode ser vazio/nulo");
        }
        int menor = vetor[0];
        int maior = vetor[0];
        
        for(int i = 1; i < vetor.length; i++) {
            if(menor > vetor[i]) {
                menor = vetor[i];
            }
            if(maior < vetor[i]) {
                maior = vetor[i];
            }
        }
        int[] v = {menor, maior};
        return v;
    }
    //RESPOSTA: ALGORITMO LINEAR = QUANTO MAIOR O VETOR, MAIOR O TAMANHO DE EXECUÇÃO
}
