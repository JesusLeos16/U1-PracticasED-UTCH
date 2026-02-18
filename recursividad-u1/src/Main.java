//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    //ejercicio de los conejitos
    ConejitosClass conejos = new ConejitosClass();
    int orejasTotales = conejos.orejillas(3);
    IO.println("Orejillas totales: "+orejasTotales);

    //ejercicio de loa asteriscos entre palabras
    AsteriscosClass asteriscos = new AsteriscosClass();

    for (int i = 0; i < 3 ; i++) {
        switch (i){
            case 0:
                String palabra = AsteriscosClass.palabra("hello");
                IO.println(palabra);
                break;
            case 1:
                 palabra = AsteriscosClass.palabra("xxyy");
                IO.println(palabra);
                break;

            case 2:
                 palabra = AsteriscosClass.palabra("aaaa");
                IO.println(palabra);
                break;
            case 3:

                break;
            default: IO.println("Valor invalido");
        }
    }
    //Ejercicio de los binarios
    Binarios bbb = new Binarios();
    String binarioCien = bbb.numBin(100);
    String binarioDosMil = bbb.numBin(2000);
    IO.println(binarioCien);
    IO.println(binarioDosMil);

    InversionClass inv = new InversionClass();
    String palabraInvertida = inv.Invertida("Hola");
    String pDos = inv.Invertida("Milton");
    String pTres = inv.Invertida("iguana");
    IO.println(palabraInvertida);
    IO.println(pDos);
    IO.println(pTres);
}
