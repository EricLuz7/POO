public class GerenciarEstacionamento {
    public static void main(String[] args) {
        Carro c1, c2;
        c1 = new Carro();
        c1.setIdCarro(2);
        c1.setModelo("Skyline r32");
        c1.setMarca("Nissan");
        c2 = new Carro();
        c2.setIdCarro(77);
        c2.setModelo("FD rx7");
        c2.setMarca("Mazda");
        Pessoa p = new Pessoa();
        p.setIdPessoa(7);
        p.setNome("Eric");
        p.setEmail("eric123@gmail.com");
        p.adicionarCarro(c1);
        p.adicionarCarro(c2);
    }
}