import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        int countOfTrees = 20;

        int balanced = 0;
        for (int i = 0; i < countOfTrees; i++) {
            MyTreeMap<Integer, Integer> map = new MyTreeMap<>();
            fillTreeMap(map);
            if (map.isBalanced()) {
                balanced++;
            }
        }
        System.out.println("Из " + countOfTrees + " MyTreeMap сбалансированы " + balanced + "\r\nнесбалансированы " + (countOfTrees - balanced) + " деревьев");
        System.out.println("Несбалансированы " + ((((float) (countOfTrees - balanced)) * 100) / (float) countOfTrees) + " %");
    }

    private static void fillTreeMap(MyTreeMap<Integer, Integer> _MyTreeMap) {
        while (_MyTreeMap.height() < 4) {
            _MyTreeMap.put(ThreadLocalRandom.current().nextInt(-20, 20), 0);
        }
    }
}