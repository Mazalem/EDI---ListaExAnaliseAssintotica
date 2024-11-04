public class Ex3 {
    public static void main(String[] args) {
        int[] vetor = { 10, 14, 23, 32, 45, 56, 67, 78, 89, 91 };
        try {
            System.out.println(existeValor(vetor, 23, 0, vetor.length - 1));
        } catch(Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    //considerar vetores com valores diferentes e em ordem crescente
    public static boolean existeValor(int[] vetor, int valor, int primeiro, int ultimo) throws Exception {
        if(vetor == null || vetor.length == 0) {
            throw new Exception("O vetor não pode ser vazio/nulo");
        }

        if (primeiro > ultimo) {
            return false;
        }

        if (vetor[(primeiro + ultimo)/2] == valor) {
            return true;
        } else if (vetor[(primeiro + ultimo)/2] < valor) {
            return existeValor(vetor, valor, (primeiro + ultimo)/2 + 1, ultimo);
        } else {
            return existeValor(vetor, valor, primeiro, (primeiro + ultimo)/2 - 1);
        }
    }
}
