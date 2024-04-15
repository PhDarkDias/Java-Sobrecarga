import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        System.out.println(Operacao.mensagemEstatica());

        int tipo = 0;        
        
        System.out.println("Digite a operação:\n"
                            +"1 - Adição de dois valores inteiros\n"
                            +"2 - Subtração\n"
                            +"3 - Multiplicação\n"
                            +"4 - Divisão\n"
                            +"5 - Exponenciação\n"
                            +"6 - Fatorial\n"
                            +"7 - Adição três valores\n"
                            +"8 - Adição dois valores texto\n"
                            +"9 - Encerrar a calculadora\n");
        tipo = teclado.nextInt();
        while (tipo != 9) {
            System.out.println("Digite o valor 1: ");
            int valor1 = teclado.nextInt();
            int valor2 = 0;
            if (tipo != 6) {
                System.out.println("Digite o valor 2: ");
                valor2 = teclado.nextInt();            
            }
            
            
            Operacao operacao = new Operacao();

            switch (tipo) {
                case 1: 
                    System.out.println("Adição 2 valores inteiros= "+operacao.soma(valor1, valor2)+"\n");
                    System.out.println("=============================================================\n");
                    break;
                case 2:
                    operacao.setMinuendo(valor1);
                    operacao.setSubtraendo(valor2);
                    System.out.println("Subtração = "+operacao.subtracao()+"\n");
                    System.out.println("=============================================================\n");
                    break;
                case 3: 
                    operacao.setNumeroGenerico1(valor1);
                    operacao.setNumeroGenerico1(valor2);
                    System.out.println("Multiplicação = " + (valor1*valor2)+"\n");
                    System.out.println("=============================================================\n");
                    break;
                case 4:
                    operacao.setNumeroGenerico1(valor1);
                    operacao.setNumeroGenerico1(valor2);
                    System.out.println("Divisão = " + (valor1/valor2)+"\n");
                    System.out.println("=============================================================\n");
                    break;
                case 5:
                    System.out.println("Exponenciação = " + operacao.exponenciacao(valor1, valor2)+"\n");
                    System.out.println("=============================================================\n");
                    break;
                case 6:
                    operacao.setFatorial(valor1);
                    System.out.println("Fatorial = " + operacao.getFatorial()+"\n");
                    System.out.println("=============================================================\n");
                    break;
                case 7:
                    System.out.println("Adição de 3 valores = " + operacao.soma(valor1, valor2, 78)+"\n");
                    System.out.println("=============================================================\n");
                    break;
                case 8:
                    System.out.println("Adição 2 valores textos = " + operacao.soma(Integer.toString(valor1), Integer.toString(valor2)) +"\n");
                    System.out.println("=============================================================\n");
                    break;
                default:   
                    System.out.println("Operação Inválida\n");
                    System.out.println("=============================================================\n");
                }
                System.out.println("Digite a operação:\n"
                                    +"1 - Adição de dois valores inteiros\n"
                                    +"2 - Subtração\n"
                                    +"3 - Multiplicação\n"
                                    +"4 - Divisão\n"
                                    +"5 - Exponenciação\n"
                                    +"6 - Fatorial\n"
                                    +"7 - Adição três valores\n"
                                    +"8 - Adição dois valores texto\n"
                                    +"9 - Encerrar a calculadora\n");
                tipo = teclado.nextInt();
        }
        teclado.close();
    }

}
