package generic;
import java.util.List;

public class WildcardExample {
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj+" ");
        }
    }
}
