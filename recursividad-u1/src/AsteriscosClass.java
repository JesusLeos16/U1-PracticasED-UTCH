public class AsteriscosClass {
    public static String palabra(String palabraRecibida){
        //esto es para que el programa no truene si ponen de string una a nomas
        if(palabraRecibida.length()<=1){
            return palabraRecibida;
        }

        //charat nos ayuda a localizar la posicion de alguna letra en un string.
        //el substring sirve para eliminar la letra que esta a la izquierda, si pones un 2 va a
        //eliminar las dos que estan a la izquierda.
        if(palabraRecibida.charAt(0)==palabraRecibida.charAt(1)) {
            return palabraRecibida.charAt(0) + "*" + palabra(palabraRecibida.substring(1));
        }else{
            return palabraRecibida.charAt(0)+palabra(palabraRecibida.substring(1));
        }
    }
}
