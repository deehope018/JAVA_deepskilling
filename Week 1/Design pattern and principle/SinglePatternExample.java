class logger{
    private static logger instance;
    private logger(){
        System.out.println("logger instance created");
    }
        public static logger getInstance(){
            if(instance==null){
                instance = new logger();
            }return instance;
        }
        public void log(String message){
            System.out.println("log"+message);
        }
    }
public class SinglePatternExample {
    public static void main(String[] args) {
        logger log1 = logger.getInstance();
        log1.log("application started");
        logger log2 = logger.getInstance();
        log1.log("user logged in");
        if(log1==log2){
            System.out.println("Only one logger instance exists");
        }else{
            System.out.println("Multiple logger instance created");
        }
        System.out.println("Logger 1 hashcode:"+log1.hashCode());
        System.out.println("Logger 2 hashcode:"+log2.hashCode());
    }}
