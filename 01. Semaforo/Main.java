import java.util.ArrayList;


class Main{
    public static void main(String[] args) {
        ArrayList<String> users = new ArrayList<>(){{
            add("JBudro");
            add("Beluga");
            add("Gnomo");
        }};

        Printer printer = new Printer("Samsung M2070FW");

        for(String user: users){
            printer.stampa(user, (int) (Math.random()*3)+1);
        }
    }
}