

import java.util.*; 
public class App {
    public static void main(final String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        Alimento alimento = new Alimento();
        Roupa roupa = new Roupa();
        Eletros eltro = new Eletros();

        System.out.println("MENU");
        System.out.println("1. Ver Alimentos Cadastrados");
        System.out.println("2. Adicionar Alimento");
        System.out.println("3. Remover Alimento");
        System.out.println("4. Ver Roupas Cadastradas");
        System.out.println("5. Adicionar Roupa");
        System.out.println("6. Remover Roupa");
        System.out.println("7. Ver Eletrônicos Cadastrados");
        System.out.println("8. Adicionar Eletronico");
        System.out.println("9. Remover Eletrônico");
        System.out.println("0. Sair");

        int valor = entrada.nextInt();
        entrada.nextLine();
        while(valor != 0){
            switch(valor){
                case 1:
                    alimento.mostraAlimentos();
                break;
                case 2:
                    System.out.print("Produto: ");
                    alimento.adicionarAlimento(entrada.nextLine());
                break;
                case 3:
                    System.out.print("Código do produto: ");
                    alimento.removeAlimento(entrada.nextInt());
                break;
                case 4:
                    roupa.mostraRoupa();
                break;
                case 5:
                    System.out.print("Produto: ");
                    roupa.adicionarRoupa(entrada.nextLine());
                break;
                case 6:
                    System.out.print("Código do produto: ");
                    roupa.removeRoupa(entrada.nextInt());
                break;
                case 7:
                    eltro.mostraEletro();
                break;
                case 8:
                    System.out.print("Produto: ");
                    eltro.adicionarEletro(entrada.nextLine());
                break;
                case 9:
                    System.out.print("Código do produto: ");
                    eltro.removeEletro(entrada.nextInt());
                break;
                case 0:
                    System.out.println("Saindo...");
                break;
                default:
                    System.out.println("Código Inválido! Digite outro: ");
            }

        valor = entrada.nextInt();
        entrada.nextLine();
        }
        entrada.close();
    }
}

