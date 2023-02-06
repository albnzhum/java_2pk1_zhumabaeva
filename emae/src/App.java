import java.util.*;


public class App {
    static int randomInt;
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> source = new ArrayList<Integer>();
        ArrayList<Integer> positive = new ArrayList<Integer>();
        ArrayList<Integer> negative = new ArrayList<Integer>();
        splitList(source, positive, negative);
    }

    public static void splitList(ArrayList<Integer> source, ArrayList positive, ArrayList negative)
    {
        source = new ArrayList<Integer>();
        Random rand = new Random(); //заполнение случайными числа
        for (int i = 0; i < 10; i++)
        {
            randomInt = (int)(Math.random()*(200+1)) - 100;
            source.add(randomInt);
        }

        positive = new ArrayList<>();
        negative = new ArrayList<>();
        final ArrayList<Integer> negativeFinal = negative;//ошибку выдавало без final
        final ArrayList<Integer> positiveFinal = positive;

        source.stream().forEach(i -> (i < 0 ? negativeFinal : positiveFinal).add(i));
        Collections.sort(positive);//сортировка
        Collections.sort(negative);

        System.out.println("Source as-is: " + source);
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);

    }
}
