public class ConejitosClass {
    public int orejillas(int conejillos){

        if(conejillos==0){
            return 0;
        }
        if(conejillos % 2==0) {

            return 3 +orejillas(conejillos-1);
        }else{
            return 2 + orejillas(conejillos-1);
        }
    }
}
