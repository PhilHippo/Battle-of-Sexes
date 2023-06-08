public class Individual extends Thread {

    /*  TYPES
    PHILANDERER 0
    FAITHFUL 1
    COY 2
    FAST 3
     */

    protected int type;
    protected int points = 8;   //initial points

    public Individual (int type) {
        this.type = type;
        synchronized (Population.numberIndividuals) {
            Population.numberIndividuals[type]++;
        }
    }

    public Individual (int type, int points) {
        this(type);
        this.points = points;
    }

    public boolean isPhilanderer(int tag){
        return tag == 0;
    }

    public boolean isFaithful(int tag){
        return tag == 1;
    }

    public boolean isCoy(int tag){
        return tag == 2;
    }

    public boolean isFast(int tag){
        return tag == 3;
    }

    @Override
    public void run () {
    }
}
