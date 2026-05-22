public class concatenation {
    public static void main(String[] args) {
        String first = "Java";
        String second = "Programming";

        String result1 = first + " " + second;
        String result2 = first.concat(" ").concat(second);

        System.out.println(result1);
        System.out.println(result2);
    }

}
