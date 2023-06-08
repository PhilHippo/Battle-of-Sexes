import java.util.Random;

public class Female extends Individual{

    public Female (int type) {
        super(type);
    }

    @Override
    public synchronized void run() {
        while(Main.untilEquilibriumReached) {
            while(Time.day) {
                Population.club.push(this);
                try {
                    wait();
                    // start check points
                    if (this.points < 0) {
                        synchronized (Population.numberIndividuals) {
                            Population.numberIndividuals[this.type]--;
                        }
                        this.interrupt();
                        return;
                    }
                } catch (InterruptedException dying) {
                   // System.out.println("I died in yo arms tonight. Type " + this.type + ", controllare cosa significa questo messaggio in female 23");
                }
            }
            this.points-= Population.d;
        }
    }

    public synchronized void giveBirth(Male gentleman) throws InterruptedException{}

    public synchronized void mutation(Male gentleman) throws InterruptedException{
        Random random = new Random();
        if(random.nextBoolean()){
            Coy pers = new Coy();
            pers.start();
        }else{
            Faithful pers = new Faithful();
            pers.start();
        }
        this.notify();
    }
}
