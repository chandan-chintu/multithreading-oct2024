package aftermultithreading;

public class MainThread {
    public static void main(String[] args) {

        NewThread newThread = new NewThread();

        try{
            System.out.println("part 1");
            for(int i=0;i<10;i++){
                System.out.println("i is : "+i);
                Thread.sleep(1000);
            }
        } catch (Exception e1){
            System.out.println("exception occured : "+e1.getMessage());
        }
    }
}
