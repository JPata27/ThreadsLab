class Corsa extends Thread{
    private final int METERS = 100;
    private String runner;
    
    Corsa(String runner){
        this.runner = runner;
    }

    public String getRunner(){
        return this.runner;
    }

    public void setRunner(String runner){
        this.runner = runner;
    }

    @Override
    public void run(){
        for(int i=1;i<=METERS;i++){
            System.out.printf("[%s] => %d metr%s\n\n", this.runner, i, i == 1 ? "o" : "i");
        }

        System.out.printf("\n[%s] => COMPLETATO la GARA\n\n", this.runner);
    }
}
