package Problem;
import java.util.*;

public class Problem {
    private int numOfItems;
    private long seed;
    private int gornaGranica;
    private int dolnaGranica;
    private List<Item> itemList;

    public Problem(int n, long seed, int gornaGranica, int dolnaGranica) {
        this.numOfItems = n;
        this.seed = seed;
        this.gornaGranica = gornaGranica;
        this.dolnaGranica = dolnaGranica;
        this.itemList = generateItems();
    }

    private List<Item> generateItems(){
        Random rand = new Random(seed);
        List<Item> items = new ArrayList<>();
        for (int i = 0; i < numOfItems; i++) {
            int weight = rand.nextInt(gornaGranica - dolnaGranica + 1) + dolnaGranica;
            int value = rand.nextInt(gornaGranica -dolnaGranica + 1) + dolnaGranica;
            items.add(new Item(i + 1, weight, value));
        }
        return items;
    }
    public int getNum_of_items() {
        return numOfItems;
    }

    public long getSeed() {
        return seed;
    }

    public int getDolnaGranica() {
        return dolnaGranica;
    }

    public int getGornaGranica() {
        return gornaGranica;
    }

    public List<Item> getItemList() {
        return itemList;
    }



    public Wynik Solve(int capacity){
        Collections.sort(itemList, Comparator.comparingDouble(Item::getValueToWeightRatio).reversed());
        int totalValue = 0;
        int totalWeight = 0;
        List<Integer> selectedItems = new ArrayList<>();

        for(Item item : itemList){
            while (totalWeight + item.getWeight() <= capacity) {
                totalValue += item.getValue();
                totalWeight += item.getWeight();
                selectedItems.add(item.getNumber());
            }
        }
        return new Wynik(selectedItems, selectedItems.size(), totalValue, totalWeight);
    }
}




