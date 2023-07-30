package source.gcdemo;

public class GCDemo {

    int objId;


    public GCDemo(int objId){
        this.objId = objId;
        System.out.println(this.objId + " created");
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 5000000; i++) {
            new GCDemo(i);
        }

// Uncomment the following line to force garbage collection
//        System.gc();

    }

    @Override
    protected void finalize(){
        System.out.println(this.objId + " finalized");
    }
}
