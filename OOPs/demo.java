import java.util.*;
class Order{
 private List<String> itemNames;
 public List<String> getItemNames() {
 return itemNames;
 }
 private int orderId;
 private boolean cashOnDelivary;
 public Order(int orderId,List<String> itemNames,boolean cashOnDelivary) {
 super();
 this.itemNames = itemNames;
 this.orderId = orderId;
 this.cashOnDelivary = cashOnDelivary;
 }
}
public class demo {
 public static List<String> getItems(List<Order> orders) {
 //Implement your logic here and change the return statement accordingly
 List<String> items = new ArrayList<String>();
 for(Order order:orders) {
 items.addAll(order.getItemNames());
 }
 System.out.println(items);
 return items;
 }
 public static void main(String[] args) {
 List<Order> orders = new ArrayList<Order>();
 //List<String> itemNames = null;
 List<String> items1 = new ArrayList<String>();
 items1.add("Jeans");
 items1.add("Shirt");
 items1.add("Belt");
 orders.add(new Order(101, items1, true));
 List<String> items2 = new ArrayList<String>();
 items2.add("Tie");
 items2.add("Shirt");
 orders.add(new Order(102, items2, true));
 List<String> items3 = new ArrayList<String>();
 items3.add("Tshirt");
 items3.add("Socks");
 items3.add("Tie");
 orders.add(new Order(103, items3, true));
 List<String> items = getItems(orders);
 System.out.println("List of Items:");
 for (String item : items) {
 System.out.println(item);
 }
}
}