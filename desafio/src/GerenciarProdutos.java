import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class GerenciarProdutos {
    public List<Produto> produtos = new ArrayList<>();
    public Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GerenciarProdutos gp = new GerenciarProdutos();
        int opcao = 0;
        do{
            System.out.println(" Gerenciamento de produtos");
            System.out.println(" ====================================");
            System.out.println(" [ 1. Cadastrar produto             ]");
            System.out.println(" [ 2. Consultar produtos            ]");
            System.out.println(" [ 3. Registrar entrada             ]");
            System.out.println(" [ 4. Registrar saida               ]");
            System.out.println(" [ 5. Consultar valor em estoque    ]");
            System.out.println(" [ 9. Sair                          ]");
            opcao = parseInt(sc.nextLine());
            switch (opcao){
                case 1:
                    gp.execCadastrar();
                    break;
                case 2:
                    gp.execConsultar();
                    break;
                case 3:
                    gp.execDarEntrada();
                    break;
                case 4:
                    gp.execDarSaida();
                    break;
                case 5:
                    gp.execConsultarValorEstoque();
                    break;
                case 9:
                    System.out.println("Fim do programa");
                    break;
                default:
                    System.out.println("Opcao invalida");
            }
        }while(opcao != 9);
    }
    public void execCadastrar(){
        Produto produto = new Produto();
        double porcentagemPrecoCusto;
        System.out.println("Cadastrando produto....");
        System.out.println("Digite o codigo do produto: ");
        produto.setCodigo(parseInt(sc.nextLine()));
        System.out.println("Digite o nome do produto: ");
        produto.setNome(sc.nextLine());
        System.out.println("Digite o preco de custo do produto: ");
        produto.setPrecoCusto(Double.parseDouble(sc.nextLine()));
        System.out.println("O preco de venda sera quantos % do preco de custo?");
        porcentagemPrecoCusto = (Double.parseDouble(sc.nextLine()));
        produto.preco(porcentagemPrecoCusto);
        produtos.add(produto);
        System.out.println("Produto cadastrado");
    }
    public void execConsultar(){
        System.out.println("Exibindo todos os produtos cadastrados");
        for(Produto p : produtos){
                System.out.println(p.toString());
                System.out.println();
        }
    }
    public void execDarEntrada(){
        int cod;
        int quantidade;
        System.out.println("Digite o codigo do produto: ");
        cod = Integer.parseInt(sc.nextLine());
        for(Produto p: produtos){
            if(p.getCodigo()== cod){
                System.out.println("Deseja adicionar quantas unidades?");
                quantidade = Integer.parseInt(sc.nextLine());
                p.darEntrada(quantidade);
                System.out.println("Adicionado com sucesso");
                return;
            }
        }
        System.out.println("Produto não cadastrado");
    }
    public void execDarSaida(){
        int cod;
        int quantidade;
        System.out.println("Digite o codigo do produto: ");
        cod = Integer.parseInt(sc.nextLine());
        for(Produto p: produtos){
            if(p.getCodigo()== cod){
                System.out.println("Deseja retirar quantas unidades?");
                quantidade = Integer.parseInt(sc.nextLine());
                if(quantidade > 0){
                    p.darSaida(quantidade);
                    System.out.println("Retirado com sucesso");
                    return;
                }
            }
        System.out.println("Produto não cadastrado");
        }
    }
    public void execConsultarValorEstoque(){
        double valorTotal = 0;
        double soma = 0;
        for(Produto p: produtos){
             valorTotal += p.getEstoque() * p.getPrecoVenda();
        }
        System.out.println(valorTotal);
    }
}

