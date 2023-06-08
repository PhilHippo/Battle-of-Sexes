import java.util.ArrayList;
import java.util.Random;

public class MyList extends ArrayList<Female> {

    public synchronized void push(Female female) {
        this.add(female);
        //System.out.println("I'm in the club");j
        notifyAll();
    }

    public synchronized Female pop(int type) throws InterruptedException{
        while (this.isEmpty()) {
            if (!Main.untilEquilibriumReached) throw new InterruptedException(); // the club has been closed
            //
            if ((type == 0 && Population.numberIndividuals[3] == 0) || (Population.numberIndividuals[3] == 0 && Population.numberIndividuals[2] == 0)){
                return null;
                //Population.numberIndividuals[this.type];
            }
            wait();
        }
        Random r = new Random();
        return this.remove(r.nextInt(0, this.size()));
    }
}
