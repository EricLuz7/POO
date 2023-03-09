public class Main {
    public static void main(String[] args) {

        Pessoa p1 = new Pessoa();
        p1.idPessoa = 1;
        p1.nomePessoa = "Grongos";
        System.out.println(p1);
        meuMetodo(p1);
        System.out.println(p1);
    }
    public static void meuMetodo (Pessoa x){
        x.idPessoa = 10;
        x.nomePessoa = "Gragas";
        System.out.println(x);
    }
}