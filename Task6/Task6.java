public class Task6 {
    public static void main(String[] args) {
        new Main().run();
    }

    private List<Item> items;;
    private Backpack bag;
    private final int MAX_WEIGHT = 80;

    private Item[] goods = {
            new Item("", 15, 30),
            new Item("", 30, 90),
            new Item("", 50, 100)
    };

    public Main() {
        items = new ArrayList<>();
        bag = new Backpack(80);
    }

    public void run() {
        items.add(new Item("Bed", 7, 8));
        items.add(new Item("Chair", 4, 3));
        items.add(new Item("Clock", 2, 9));

        //  12 (4, 2)
        System.out.println(combine(items.size() - 1, bag.getMaxW()));
    }

    private double combine(int len, double weight){
        if (len < 0)
            return 0;
        if (items.get(len).getWeight() > weight)
            return combine(len-1, weight);
        else
            return Math.max(combine(len-1, weight), combine(len - 1, weight - items.get(len).getWeight()) + items.get(len).getValue());
    }
}