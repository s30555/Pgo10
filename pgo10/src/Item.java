import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;


    class Item {
        private int id;
        private String name;
        public Item(int id, String name) {
            this.id = id;
            this.name = name;
        }
        public int getId() {
            return id;
        }
        public String getName() {
            return name;
        }
        public void show() {
            System.out.println("Item name: " + name);
        }

        public static void main(String[] args) {
            ArrayList<Item> items = new ArrayList<>();
            items.add(new Item(1, "Laptop"));
            items.add(new Item(2, "Monitor"));
            items.add(new Item(3, "Telefon"));
            items.add(new Item(4, "Klawiatura"));
            items.add(new Item(5, "Tablet"));
            for (int i = 0; i < items.size(); i++) {
                items.get(i).show();
            }
            HashMap<Integer, String> itemMap = new HashMap<>();
            for (Item item : items) {
                itemMap.put(item.getId(), item.getName());
            }
            for (HashMap.Entry<Integer, String> entry : itemMap.entrySet()) {
                System.out.println("id: " + entry.getKey() + " name: " + entry.getValue());
            }


            items.add(new Item(6, "Samochód"));
            items.add(new Item(7, "Ołówek"));
            items.add(new Item(8, "Zeszyt"));
            items.add(new Item(9, "Plecak"));
            items.add(new Item(10, "Piórnik"));
            items.add(new Item(11, "Myszka"));
            items.add(new Item(12, "Podręcznik"));
            items.add(new Item(13, "Kamera"));
            items.add(new Item(14, "Aparat"));
            items.add(new Item(15, "Głośnik"));
            List<Item> sublist = items.subList(0, 5);
            HashSet<Item> itemSet = new HashSet<>(sublist);
            for (Item item : itemSet) {
                System.out.println("Item id: " + item.getId() + ", Item name: " + item.getName());
            }
        }
    }
