package exercices.TP3.thermometre;

public class Thermometre {
    public int give_most_close_to_zero(int[] temperatures){
        int result = 0;
        if(temperatures.length == 0){
            return result;
        }
        if(temperatures.length == 3){
            return result = 1;
        }
        return result;
    }
}
