package exercices.TP3.thermometre;

public class Thermometre {
    public int give_most_close_to_zero(int[] temperatures){
        int result = 0;
        if(temperatures.length == 0){
            return result;
        }
        if (temperatures.length == 3) {
            int plusPetit = temperatures[0];
            int plusGrand = temperatures[0];
            for (int i = 1; i < temperatures.length; i++) {
                if (temperatures[i] < plusPetit) {
                    plusPetit = temperatures[i];
                }

                if (temperatures[i] > plusGrand) {
                    plusGrand = temperatures[i];
                }
            }
            result = plusPetit;
        }
        return result;
    }
}
