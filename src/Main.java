public class Main {

    public static void main(String[] args) {
        int i = 10;
        int i1 = (int) 4326743243243243243L;
        System.out.println("i1 = " + i1);

        long l = i; // автоматическое расширение int до long
        float f = 3.1465478976987654654654645645f;
        double d = f; // автоматическое расширение float до double
        float f1 = (float) d;
        System.out.println("f1 = " + f1);
        double y = 3.14;
        int k = (int) d; // явное сужение double до int
        System.out.println("результат = " + k);
    }
}
