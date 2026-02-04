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
            default: IO.println("Valor invalido");
        }
    }
}
