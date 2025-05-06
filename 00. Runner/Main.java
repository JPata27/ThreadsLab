import java.util.ArrayList;

class Main{
    public static void main(String args[]) {
        System.out.println("\nPronti, Partenza... VIA\n\n");
        
        ArrayList<Corsa> threads = new ArrayList<>();

        for(String runner: new ArrayList<String>(){{
            add("Michele");
            add("Apolito");
            add("Betti");
            add("Abbbbati");
            add("Mestofante");
        }}){
            Corsa tRunner = new Corsa(runner);
            tRunner.start();
            threads.add(tRunner);
        }

        for(Corsa th: threads){
            try{
                th.join();
            }catch(InterruptedException e){}
        }

        System.out.println("\n\nGARA TERMINATA\n\n");
    }
}