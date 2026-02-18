public class InversionClass {
    public static String Invertida(String palabra){
        if(palabra.length()<=1) {
            return palabra;
        }
        // H O L A
        // 0 1 2 3 INDICES
        // 1 2 3 4 el length
        char ultimaLetra = palabra.charAt(palabra.length()-1);
        String palabraa = palabra.substring(0,palabra.length()-1);
        return ultimaLetra+Invertida(palabraa);
    }
}
