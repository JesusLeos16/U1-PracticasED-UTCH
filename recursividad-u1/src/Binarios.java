public class Binarios {
    public  String numBin(int numero){
        //El tope
        if(numero==0){
            return "";
        }
        return numBin(numero/2)+ (numero%2);

    }

}
