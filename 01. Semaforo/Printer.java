import java.util.concurrent.Semaphore;

class Printer{
    private String name;
    private Semaphore semaphore;

    Printer(String name){
        this.name = name;
        this.semaphore = new Semaphore(1);
    }

    public void stampa(String user, int pages){
        new Stampa(user, pages, this.name, semaphore).start();
    }
}