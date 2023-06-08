public class Faithful extends Male {

    public Faithful () {
        super(1);
    }

    @Override
    public void run() {
        try {
            sleep(15); // troppo irrequieti
            super.run();

        } catch (InterruptedException e) {
            //System.out.println("Interrupted faithful");
        }
    }
}
