public class Produto {
    private int codigo;
    private String nome;
    private double precoVenda;
    private double precoCusto;
    private int estoque;

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoVenda() {
        return precoVenda;
    }

    public void setPrecoVenda(double precoVenda) {
        this.precoVenda = precoVenda;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "codigo=" + codigo +
                ", nome='" + nome + '\'' +
                ", precoVenda=" + precoVenda +
                ", precoCusto=" + precoCusto +
                ", estoque=" + estoque +
                '}';
    }

    public void preco(double porcentagemPrecoCusto){
        precoVenda = precoCusto * (porcentagemPrecoCusto/100);
    }
    public void darEntrada(int quantidade){
        estoque += quantidade;
    }

    public boolean darSaida(int quantidade){
        if(quantidade<=estoque){
            estoque -= quantidade;
            return true;
        }
        return false;
    }
}
