package beforemultothreading;

public class Demo {
    public static void main(String[] args) {

        System.out.println("part 1");
        for(int i=0;i<10;i++){
            System.out.println("i is : "+i);
        }

        System.out.println("part 2");
        for(int j=10;j>0;j--){
            System.out.println("j is : "+j);
        }
    }
}
