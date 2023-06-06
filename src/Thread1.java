public class Thread1 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Proceso 1 pasada " + i);
        }
        System.out.println("----- Fin del proceso 1 -----");
    }
}
