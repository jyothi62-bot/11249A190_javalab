class  Run implements Runnable {

    public void run() {
        System.out.println("Runnable interface is implemented.");
    }

    public static void main(String[] args) {
        Run obj = new Run();
        obj.run();
    }
}