class DemoThread extends Thread{
    DemoThread(){}

    @Override
    public void run(){
        System.out.println("running" + Thread.currentThread().getName());
    }
}


class Main{
    public static void main(String args[]) {
        for(int i=0;i<5;i++){
            new DemoThread().start();
        }
    }
}