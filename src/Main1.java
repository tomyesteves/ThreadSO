public class Main1 {
    public static void main(String[] args) {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Este es el proceso 1, pasada " + i);
        }
        System.out.println("------ Fin del proceso 1 ------");
        for (int i = 0; i <= 5; i++) {
            System.out.println("Este es el proceso 2, pasada " + i);
        }
        System.out.println("------ Fin del proceso 2 ------");
    }
}
