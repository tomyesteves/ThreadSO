public class Thread2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Proceso 2 pasada " + i);
        }
        System.out.println("----- Fin del proceso 2 -----");
    }
}
