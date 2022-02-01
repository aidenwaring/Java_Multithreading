public class App {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            MyMultithreader myThing = new MyMultithreader(i);
            Thread myThread = new Thread(myThing);
            myThread.start();
//            myThread.alive();

        }

    }

}
