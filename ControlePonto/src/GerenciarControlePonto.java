import java.time.LocalDateTime;
import java.util.Scanner;

public class GerenciarControlePonto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDateTime hora = LocalDateTime.now();
        Funcionario gerente = new Gerente(1, "Joao", "jao@email", "cpf123", "login", "senha");
        Funcionario secretaria = new Secretaria(2, "Maria", "maria@email", "cpf321", "celular123", "1000");
        Funcionario operador = new Operador(7, "Eric", "ericfoda123@email", "cpfdaora", 10.0);
        RegistroPonto registroGerente = new RegistroPonto();
        RegistroPonto registroSecretaria = new RegistroPonto();
        RegistroPonto registroOperador = new RegistroPonto();
        registroGerente.setFunc(gerente);
        registroSecretaria.setFunc(secretaria);
        registroOperador.setFunc(operador);

        int opcao;
        do {
            opcao = 0;
            System.out.println("---------------------------------");
            System.out.println("1. Registrar entrada gerente     ");
            System.out.println("2. Registrar entrada secretaria  ");
            System.out.println("3. Registrar entrada operador    ");
            System.out.println("4. Registrar saida gerente       ");
            System.out.println("5. Registrar saida secretaria    ");
            System.out.println("6. Registrar saida operador      ");
            System.out.println("9. Sair                          ");
            System.out.println("---------------------------------");
            System.out.println("Digite sua opcao: ");
            opcao = Integer.parseInt(sc.nextLine());
            switch (opcao){
                case 1:
                    registroGerente.setHoraEntrada(hora);
                    System.out.println(registroGerente.apresentarRegistroPonto());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 2:
                    registroSecretaria.setHoraEntrada(hora);
                    System.out.println(registroSecretaria.apresentarRegistroPonto());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 3:
                    registroOperador.setHoraEntrada(hora);
                    System.out.println(registroOperador.apresentarRegistroPonto());
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case 4:
                    if(registroGerente.getHoraEntrada() == null){
                        System.out.println("Registre a entrada primeiro");
                    }else{
                        registroGerente.setHoraSaida(hora);
                        System.out.println(registroGerente.apresentarRegistroPonto());
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
                case 5:
                    if(registroSecretaria.getHoraEntrada() == null){
                        System.out.println("Registre a entrada primeiro");
                    }else{
                        registroSecretaria.setHoraSaida(hora);
                        System.out.println(registroSecretaria.apresentarRegistroPonto());
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
                case 6:
                    if(registroOperador.getHoraEntrada() == null){
                        System.out.println("Registre a entrada primeiro");
                    }else{
                        registroOperador.setHoraSaida(hora);
                        System.out.println(registroOperador.apresentarRegistroPonto());
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }
                    }
                    break;
                case 9:
                    System.out.println("Fim do programa");
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        } while (opcao != 9);
    }
}