class Demo {
    public synchronized void display(int n, int t) {
        for (int i = n; i <= t; i++) {
            System.out.println(i * 5);
            try {
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}

class X extends Thread {
    Demo obj;

    X(Demo obj) {
        this.obj = obj;
    }

    public void run() {
        obj.display(1, 5);
    }
}

class Y extends Thread {
    Demo obj;

    Y(Demo obj) {
        this.obj = obj;
    }

    public void run() {
        obj.display(6, 10);
    }
}

class MultithreadSyn {
    public static void main(String args[]) {
        Demo obj = new Demo();
        X objX = new X(obj);
        Y objY = new Y(obj);
        objX.start();
        objY.start();
    }
}