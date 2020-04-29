import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Aquarium {
    private List<Fish> listOfFishes = new ArrayList();
    public void addFish(Fish fish)
    {
        listOfFishes.add(fish);
    }
    public void deleteFish(Fish fish)
    {
        listOfFishes.remove(fish);
    }
    public void changeFish(Fish fish,String name,int price)
    {
        fish.setName(name);
        fish.setPrice(price);
    }
    public void printAllFishes()
    {
        Iterator var1 = this.listOfFishes.iterator();

        while(var1.hasNext()) {
            Fish fish = (Fish)var1.next();
            System.out.println(fish);
        }
    }
}
