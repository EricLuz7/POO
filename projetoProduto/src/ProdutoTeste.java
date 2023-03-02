import java.util.Scanner;
public class ProdutoTeste {

    public Produto pt = new Produto();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProdutoTeste teste = new ProdutoTeste();
        int opcao = 0;
        do{
            System.out.println("MENU");
            System.out.println("1. Cadastrar");
            System.out.println("2. Consultar");
            System.out.println("3. Registrar entrada");
            System.out.println("4. Registrar saida");
            System.out.println("5. Valor em reais do produto");
            System.out.println("9. FIM");
            System.out.println("Escolha sua opcao");
            opcao = Integer.parseInt(sc.nextLine());
            switch (opcao){
                case 1:
                    teste.execCadastrar();
                    break;
                case 2:
                    teste.execConsultar();
                    break;
                case 3:
                    teste.execRegistrarEntrada();
                    break;
                case 4:
                    teste.execRegistrarSaida();
                    break;
                case 5:
                    teste.execValorEmReais();
                    break;
                case 9:
                    System.out.println("Fim do programa");
                    break;
                default:
                    System.out.println("Opcao invalida!");
            }
        }while (opcao!=9);
    }

    public void execCadastrar(){
        if(pt.getQuantidadeEstoque()>0){
            System.out.println("Conta ja foi cadastrada");
            return;
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o codigo do produto");
        pt.setCodigo(Integer.parseInt(sc.nextLine()));
        System.out.println("Digite a descricao do produto");
        pt.setDescricao(sc.nextLine());
        System.out.println("Digite o preco do produto");
        pt.setValorUnit(Double.parseDouble(sc.nextLine()));
        System.out.println("Produto cadastrado com sucesso");
    }
    public void execConsultar(){
        pt.imprimir();
    }
    public void execRegistrarSaida(){
        Scanner sc = new Scanner(System.in);
        int valorSaida;
        System.out.println("Digite o valor a ser retirado");
        valorSaida = Integer.parseInt(sc.nextLine());
        boolean saiu = pt.darSaida(valorSaida);
        if(saiu){
            System.out.println("Produto retirado com sucesso");
        }else{
            System.out.println("Nao possui estoque o sucificiente para saida");
        }
    }
    public void execRegistrarEntrada(){
        Scanner sc = new Scanner(System.in);
        int valorEntrada;
        System.out.println("Digite o valor da entrada");
        valorEntrada = Integer.parseInt(sc.nextLine());
        pt.darEntrada(valorEntrada);
        System.out.println("Entrada realizada com sucesso");
    }
    public void execValorEmReais(){
        int valorEmReais = (int) (pt.getQuantidadeEstoque()* pt.getValorUnit());
        System.out.println("Valor em reais = " + valorEmReais);
    }
}