import java.util.concurrent.Semaphore;

class Stampa extends Thread {
    private String user;
    private int pages;

    private String printerName;
    private Semaphore semaphore;
    
    Stampa(String user, int pages, String printerName, Semaphore semaphore){
        this.user = user;
        //this.pages = getRandomNumber(3);
        this.pages = pages;

        this.printerName = printerName;
        this.semaphore = semaphore;
    }


    @Override
    public void run(){
        try{
            System.out.printf("%s inizia a lavorare al documento\n\n", this.user);
            Thread.sleep((int)((Math.random()*5)+1)*1000);
            
            semaphore.acquire();
            
            System.out.printf("%s ha %d pagin%s da stampare da `%s`\n\n", this.user, this.pages, this.pages > 1 ? "e" : "a", this.printerName);
            
            System.out.printf("%s: STAMPA IN CORSO...\n\n", this.user);
            
            for(int i=0;i<this.pages;i++){
                System.out.printf("""
                    __________________________________________
                    |                                         
                    |           Printed by %s                 
                    |                                         
                    |                            Foglio %d/%d                 
                    |_________________________________________

                \n\n""", this.user, i+1, this.pages);

                Thread.sleep(i*1000);
            }

            
            System.out.printf("%s: FINITO\n\n\n\n", this.user);
        }
        catch(InterruptedException e){}

        finally{
            semaphore.release();
        }
    }
}


