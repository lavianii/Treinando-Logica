public class CalculadoraSimples {
    public static void main(String[] args) throws Exception {
        float n1;
        float n2;
        float soma=0;
        short sair = (short)0;

        do{
        System.out.println("------- CALCULADORA -------");
        System.out.println("Para sair digite '0' ");
        System.out.println("Para continuar digite '1'");
        System.out.println("-----------------------------");
        sair = Teclado.getUmShort();
        System.out.println("-----------------------------");
        System.out.print("Digite valor numero 1: ");
        n1 = Teclado.getUmFloat();
        System.out.print("Digite valor numero 2: ");
        n2 = Teclado.getUmFloat();

        System.out.println("Qual operador: ");
        System.out.println("-----------------------------");
        System.out.println("     +");
        System.out.println("     -");
        System.out.println("     *");
        System.out.println("     /");
        System.out.println("-----------------------------");
        char operador = Teclado.getUmChar();

        if(operador == '+'){
            soma = n1+n2;
         }
        else 
            if(operador == '-'){
            soma = n1-n2;
            }
            else 
               if(operador=='*'){
                soma = n1*n2;
                }            
                else 
                  if(operador == '/'){
                   soma = n1/n2;
                }
            
        System.out.println("-----------------------------");
        System.out.println("Resultado é: " + soma);

        
            }while(sair != '0');

    }
}
