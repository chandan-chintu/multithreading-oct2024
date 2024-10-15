package aftermultithreading;

public class NewThread extends Thread{
    NewThread(){
        start();// start running the thread
    }

    public void run(){
        try{
            System.out.println("part 2");
            for(int j=10;j>0;j--){
                System.out.println("j is : "+j);
                Thread.sleep(500);
            }
        } catch (Exception e1){
            System.out.println("exception occured : "+e1.getMessage());
        }
    }
}
