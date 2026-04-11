package Threading.CompletableFuture;

import java.util.concurrent.CompletableFuture;

/*
Introduce in Java 8 to handle Synchronization programming
 */
public class CF {

    public static void main(String[] args) {


        CompletableFuture<String> stringCompletableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(5000);
                System.out.println("Worker");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
            return "Ok";
        });

        System.out.println("ATM");
    }
}
