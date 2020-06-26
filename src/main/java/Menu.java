import java.util.List;

public class Menu {
    List<MenuItem> items;
    List<Writer> writers;

    public void addItem(MenuItem menuitem){
        this.items.add(menuitem);
    }

    public void show(){
        for(MenuItem item : items){
            System.out.println(item.title);
        }
    }

    public void addWriter(Writer writer){
        this.writers.add(writer);
    }
}
