package modules.utils;

public class IdGenerator {

    public static long getNextId() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
        }
        return System.currentTimeMillis() - 1557429970258L;
    }
}
