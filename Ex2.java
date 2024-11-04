public class Ex2 {
    public static void main(String[] args) {
        int[] vetor = {23, 67, 14, 89, 45, 32, 56, 78, 91, 10};
        try {
            vetor = retornaMaior(vetor);
            System.out.println("Maiores números:");
            for(int i = 0; i < vetor.length; i++) {
                System.out.print(vetor[i] + " "); 
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
    //considerar vetores com valores diferentes
    public static int[] retornaMaior(int[] vetor) throws Exception {
        if(vetor == null || vetor.length < 3) {
            throw new Exception("O vetor deve ter pelo menos 3 números inteiros.");
        }
        int maior1 = vetor[0];
        int maior2 = vetor[0];
        int maior3 = vetor[0];

        for(int i = 1; i < vetor.length; i++) {
            if(vetor[i] > maior1) {
                maior3 = maior2;
                maior2 = maior1;
                maior1 = vetor[i];
            }
            else if(vetor[i] > maior2) {
                maior3 = maior2;
                maior2 = vetor[i];
            }
            else if(vetor[i] > maior3) {
                maior3 = vetor[i];
            }
        }
        int[] vetorResposta = {maior1, maior2, maior3};
        return vetorResposta;
    }
    //RESPOSTA: ALGORITMO LINEAR = QUANTO MAIOR O VETOR, MAIOR O TAMANHO DE EXECUÇÃO
}
