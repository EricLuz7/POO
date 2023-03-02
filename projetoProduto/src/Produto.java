public class Produto {
    private int codigo;
    private String descricao;
    private double valorUnit;
    private int quantidadeEstoque;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValorUnit() {
        return valorUnit;
    }

    public void setValorUnit(double valorUnit) {
        this.valorUnit = valorUnit;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void imprimir(){
        System.out.println("codigo = " + codigo);
        System.out.println("descricao  = " + descricao);
        System.out.println("valor unitario = " + valorUnit);
        System.out.println("quantidade em estoque = " + quantidadeEstoque);
    }
    public void darEntrada(int quantidade){
        quantidadeEstoque += quantidade;
    }

    public boolean darSaida(int quantidade){
        if(quantidade<=quantidadeEstoque){
            quantidadeEstoque -= quantidade;
            return true;
        }
        return false;
    }


}
