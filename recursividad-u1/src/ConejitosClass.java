public class ConejitosClass {
    public void conejitos(int numero){
        int orejas = numero*3;
        if (numero==3){
            orejas = orejas-3;
            IO.println("Ya fueron todos los conejitos");
            IO.println("Orejas de conejos radioactivos (de tres orejas): "+orejas);
            return;
        }

        int resultado;
        resultado = (2*numero);
        IO.println("Conejito "+resultado +" suma "+orejas+" orejas a la cuenta");
        conejitos(numero+1);

    }

}
