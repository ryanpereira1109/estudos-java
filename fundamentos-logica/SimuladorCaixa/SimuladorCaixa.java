import java.util.Scanner;

public class SimuladorCaixa {
    public static void main(String[] args) {
     Scanner l = new Scanner(System.in);

     Double totalCompras = 0.0;
     int opcao = 0;

     System.out.println("=== SIMULADOR DE CAIXA ====");

     while (opcao != 3 && opcao != 4) {

         System.out.println("MENU");
         System.out.println("1 - Adicionar produto");
         System.out.println("2 - Ver total acumulado");
         System.out.println("3 - Finalizar compra");
         System.out.println("4 - Cancelar e Sair");
         System.out.print("Escolha uma opção: ");
         opcao = l.nextInt();

         switch(opcao) {
             case 1:
                 System.out.println("Adicione o preço do produto: ");
                 double valorProduto = l.nextDouble();
                 totalCompras += valorProduto;
                 System.out.println("Produto de RS" + valorProduto + " adicionado!");
                 break;

             case 2:
                 System.out.println("Preço total do carrinho: " + totalCompras);
                 break;

             case 3:
                 if (totalCompras > 100.0) {
                     System.out.println("--- FECHAMENTO DE CAIXA ---");
                     System.out.println("Preço total do carrinho: " + totalCompras);
                     double valorFinal = totalCompras * 0.9;
                     System.out.println("Preço final com desconto adicionado: " + valorFinal);
                 } else {
                     System.out.println("Preço a pagar:" + totalCompras);
                 }
                 System.out.println("Obrigado pela compra!");
                 break;

             case 4:
                 System.out.println("Operação Cancelada");
                 break;

             default:
                 System.out.println("Opção inválida! Tente novamente.");
                 break;






         }

     }
        l.close();
    }
}
