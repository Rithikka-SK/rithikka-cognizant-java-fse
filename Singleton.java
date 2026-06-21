public class Singleton{

    public static void main(String[] args) {

        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("Application Started");
        logger2.log("User Logged In");

        // Verify both references point to the same object
        System.out.println(logger1 == logger2);
    }
}
