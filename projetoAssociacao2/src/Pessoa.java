import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private int idPessoa;
    private String nome;
    private String email;
    private List<Carro> carros = new ArrayList<>();

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Carro> getCarros() {
        return carros;
    }

    public void setCarros(List<Carro> carros) {
        this.carros = carros;
    }

    @Override
    public String toString() {
        return "Id da pessoa: " + idPessoa + "\n" +
         "Nome: " + nome + "\n" +
         "Email: " + email + "\n" +
         "CARROS: \n " + carros;
    }

    // Regra - adicionar um carro a pessoa
    public void adicionarCarro(Carro carro){
        carros.add(carro);
    }

}
