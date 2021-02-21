import java.util.Random;

class X implements Runnable {
    static int random;
    Random rand = new Random();

    public void run() {
        random = rand.nextInt(25);
        System.out.println(random);
    }
}

class Y implements Runnable {
    public void run() {
        if (X.random % 2 == 0)
            System.out.println((int) Math.pow(X.random, 2) + "\n");
    }
}

class Z implements Runnable {
    public void run() {
        if (X.random % 2 != 0)
            System.out.println((int) Math.pow(X.random, 3) + "\n");
    }
}

class Multithread {
    public static void main(String args[]) {
        for (int i = 0; i < 10; i++) {
            Thread objX = new Thread(new X());
            Thread objY = new Thread(new Y());
            Thread objZ = new Thread(new Z());
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            objX.start();
            objY.start();
            objZ.start();
        }
    }
}