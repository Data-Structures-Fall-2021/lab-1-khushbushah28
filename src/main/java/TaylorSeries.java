// YOUR CODE GOES HERE
    public class Battle {

        private String monster1Name;
        float monster1Attack;
        float monster1HP;
        float monster1Defence;

        private String monster2Name;
        float monster2Attack;
        float monster2HP;
        float monster2Defence;


        public Battle(String monster1Name, float monster1Attack, float monster1HP, float monster1Defence, String monster2Name, float monster2Attack, float monster2HP, float monster2Defence) {
            this.monster1Name = monster1Name;
            this.monster1Attack = monster1Attack;
            this.monster1Defence = monster1Defence;
            this.monster1HP = monster1HP;
            this.monster2Name = monster2Name;
            this.monster2Attack = monster2Attack;
            this.monster2Defence = monster2Defence;
            this.monster2HP = monster2HP;
        }

        public String getMonster1Name(){
            return monster1Name;
        }

        public float getMonster1Attack() {
            return monster1Attack;
        }

        public float getMonster1HP() {
            return monster1HP;
        }

        public float getMonster1Defence() {
            return monster1Defence;
        }

        public String getMonster2Name() {
            return monster2Name;
        }

        public float getMonster2HP() {
            return monster2HP;
        }

        public float getMonster2Attack() {
            return monster2Attack;
        }

        public float getMonster2Defence() {
            return monster2Defence;
        }

        public boolean isMonster1Dead(){
            if(getMonster1HP() <- 0) {
                return true;
            }
            return false;
        }
        public boolean isMonster2Dead() {
            if (getMonster2HP() <- 0) {
                return true;
            }
            return false;
        }

        public void simulateRound(){
            int round = 1;
            while (!isMonster1Dead() && !isMonster2Dead()){
                System.out.println("Round " + round);

                float monster1Damage = monster1Attack - monster2Defence;
                float monster2Damage = monster2Attack - monster1Defence;

                System.out.println(monster1Name + " does " + monster1Damage + " points of damage to " + monster2Name);
                System.out.println(monster2Name + " does " + monster2Damage + " points of damage to " + monster1Name);

                System.out.println(monster1Name + ": " + (monster1HP -= monster2Damage));
                System.out.println(monster2Name + ": " + (monster2HP -= monster1Damage));

                round ++;
            }
        }


    }
