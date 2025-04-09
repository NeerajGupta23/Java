public class question10 {
    public static void main(String[] args) {
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.append(" World");
        System.out.println(sbf); // Hello World

        StringBuilder sbl = new StringBuilder("Hi");
        sbl.append(" Java");
        System.out.println(sbl); // Hi Java        
    }
}
