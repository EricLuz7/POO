public class Pessoa {
    public int idPessoa;
    public String nomePessoa;

    @Override
    public String toString() {
        return "Pessoa{" + "\n" +
                "idPessoa=" + idPessoa + "\n" +
                ", nomePessoa='" + nomePessoa + "\n" +
                 "Hashcode= " + hashCode();
    }
}
