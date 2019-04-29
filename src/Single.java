public class Single {

    private Single(){}

    private static volatile Single s = null;

    public static Single getInstance(){
        if (s == null){
            synchronized (Single.class){
                if (s == null){
                    s = new Single();
                }
            }
        }
        return s;
    }

}
