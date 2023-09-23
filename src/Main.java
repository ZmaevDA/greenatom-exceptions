import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        final int MAX_SIZE = 10;

        try {
            ArrayList<Integer> list = new ArrayList<>(MAX_SIZE);

            for (int i = 0; i < MAX_SIZE + 1; i++) {
                if (list.size() >= MAX_SIZE) {
                    throw new ArrayListSizeLimitException("List size limit exceeded");
                }
                list.add(i);
            }
        } catch (ArrayListSizeLimitException e) {
            e.printStackTrace();
        }
    }
}