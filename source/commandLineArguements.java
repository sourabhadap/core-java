package source;

public class commandLineArguements {
    public static void main(String[] args) {
        int length = args.length;
        if (length==0){
            System.out.println("No arguements passed");
        } else {
            System.out.println("Arguements passed are: ");
            for (String arg : args) {
                System.out.println(arg);
            }
        }
    }
}
