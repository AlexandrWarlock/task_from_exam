
import java.util.Arrays;

class Main
{
    // Метод разделения массива на две части в Java
    public static void main(String[] args)
    {
        String example = new String("1  111sfyjryr11wqp22");
        char[] result = example.toCharArray();
        System.out.println(result);
        int numbers = result.length;
        char[] a = new char[(numbers) / 2];
        char[] b = new char[(numbers - a.length)];
        for (int i = 0; i < numbers; i++) {
            if (i < a.length) {
                a[i] = result[i];
            } else {
                b[i - a.length] = result[i];
            }
        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
    }
}