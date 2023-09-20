import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {

        try{
        
            Scanner scanner = new Scanner(System.in);
            System.out.println("Digite o primeiro parâmetro .");
            int parametroUm = scanner.nextInt();
            System.out.println("Digite o segundo parâmetro .");
            int parametroDois = scanner.nextInt();
            scanner.close();

            try{
                //chama o metodo que contem a logica de contagem
                contar(parametroUm, parametroDois);
            }catch( ParametrosInvalidosException exception) {
                //System imprime a menssagem : o segundo parametro deve ser maior que o primeiro
                System.out.println(exception.getMessage());
            }
        }
        //validando os campos int para receber comente numeros//
        catch (InputMismatchException e) {
                System.out.println(" Digite um número inteiro válido :");
            }
    }//fim do main//
    
    //metodo contar //
    public static void contar (int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        //valida se o parametroUm é maior que o parametroDois e lança uma exeção
        if (parametroUm >= parametroDois){
            throw new ParametrosInvalidosException();
        }
        
        int contagem = parametroDois - parametroUm ;
        //for 
        for (int i = 1; i <= contagem; i++){
                System.out.println("Imprimindo o numero : " + i);
        }
   
    }
}
   

