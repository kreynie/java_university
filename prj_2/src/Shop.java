import java.util.ArrayList;

public class Shop {
    private ArrayList<String> shopList;

    public Shop() {
        this.shopList = new ArrayList<>(1);
    }

    public void addComputer(String computer) {
        this.shopList.add(computer);
    }

    public void removeComputer(String computer) {
        this.shopList.remove(computer);
    }

    public String findComputer(String computer) {
        int index = this.shopList.indexOf(computer);
        if (index == -1) {
            return "Computer has not found";
        }
        return String.format("\"%s\": index = %d", this.shopList.get(index), index);
    }
    
    public String listAvailableComputers() {
        StringBuilder list = new StringBuilder("Available computers:\n");
        for (String computer :
                this.shopList) {
            list.append(computer).append("\n");
        }
        return list.toString();
    }

    public static void main(String[] args) {
        Shop shop = new Shop();
        shop.addComputer("Example");
        shop.addComputer("Office");
        System.out.println(shop.listAvailableComputers());
        System.out.println(shop.findComputer("Office"));
    }
}
