package demo.hero;


import java.util.ArrayList;
import java.util.List;

    public class Hero {
        private Identity identity;

        private List<Power> powers = new ArrayList<>();

        public Hero(Identity identity, List<Power> powers) {
            this.identity = identity;
            this.powers = powers;
        }

        /**
         * Le héros reprend son identité civile
         * @return une petite phrase :)
         */
        public String removeCostume() {
            return "Le héros retire son costume et redevient : " + identity.getIdentity();
        }

        /**
         * Le héros utilise aléatoirement un de ses pouvoirs pour se taper !
         * @return une petite phrase :)
         */
        public String fight() {
            return "le hero utilise son pouvoir : " + this.getRandomPower();
        }

        /**
         * Retourne un pouvoir aléatoire.
         * @return un pouvoir
         */
        private Power getRandomPower() {
            int index = (int) Math.floor(Math.random() * powers.toArray().length);
            return this.powers.get(index);
        }

        public void setPowers(List<Power> powers) {
            this.powers = powers;
        }
    }

