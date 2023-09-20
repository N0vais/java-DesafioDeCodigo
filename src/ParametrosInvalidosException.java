public class ParametrosInvalidosException extends Exception{

    public ParametrosInvalidosException(){
        //menssagem que aparecerá na tela se a primeira variavel for maor que a primeira//
        super ("O segundo parâmetro deve ser maior que o primeiro");
    }
}
