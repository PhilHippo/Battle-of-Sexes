public class Male extends Individual{

    public Male (int type) {
        super(type);
    }

    @Override
    public void run() {
        while(Main.untilEquilibriumReached) {
            while(Time.day) {
                try {
                    Female myGirl = Population.club.pop(this.type);
                    if (myGirl != null) {
                        myGirl.giveBirth(this);
                    }
                    // start check points
                    if (this.points < 0) {
                        synchronized (Population.numberIndividuals) {
                            Population.numberIndividuals[this.type]--;
                        }
                        this.interrupt();
                        return;
                    }
                } catch (InterruptedException dying) {
                    //System.out.println("You died in my arms tonight. Type " + this.type + ", controllare cosa significa questo messaggio in male 25");
                }
            }
            this.points-= Population.d;
        }
    }
}
