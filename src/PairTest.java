public class PairTest {
    public static void main(String[] args) {

        Pair<String,Integer> p1 = new Pair<>("Kasia", 1991);
            Pair<Character, Double> p2 = new Pair<>('A', 25.25);

        printPair(p1);
        printPair(p2);

    }

    private static<T,V> void printPair(Pair <T,V> pair){
        System.out.println("< " + pair.getT() + " ; " + pair.getV() + " >");
    }
}
