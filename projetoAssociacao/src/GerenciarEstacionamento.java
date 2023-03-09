public class GerenciarEstacionamento {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setIdPessoa(1);
        p.setNome("Jao");
        p.setEmail("jao@gmail.com");

        Carro c = new Carro();
        c.setIdCarro(1);
        c.setMarca("Honda");
        c.setModelo("Civic");

        p.setCarro(c);
    }
}