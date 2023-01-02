import static java.lang.System.out;

public class tester {
    public static void main(String[] args) {
        String userDir = System.getProperty("user.home");
        out.println(userDir);
        String[] formatter = userDir.split("\\");
        for(String x: formatter){
            out.println(x);
        }
    }
}
