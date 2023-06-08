public class Philanderer extends Male {

    public Philanderer() {
        super(0);
    }

    @Override
    public void run() {
        try {
            sleep(10); // troppo irrequieti
            super.run();

        } catch (InterruptedException e) {
            //System.out.println("Interrupted philanderer");
        }
    }
}
