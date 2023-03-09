public class Main {
    public static void main(String[] args) {
        int valor = 10;
        funcao(valor);
        System.out.println("Valor: " + valor);
    }

    public static void  funcao (int valor){
        valor += 15;
        System.out.println(valor);
    }
}