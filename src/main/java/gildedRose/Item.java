package gildedRose;

import gildedRose.ItemStrategyFactory;

public class Item{

    public String name;

    public int sellIn;

    public int quality;

    private ItemStrategy itemStrategy;

    public Item(String name, int sellIn, int quality) {
        this.name = name;
        this.sellIn = sellIn;
        this.quality = quality;
        createItemStrategy(name);
    }



   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }

    public void createItemStrategy(String itemName){
        this.itemStrategy = ItemStrategyFactory.createItem(itemName);
    }

    public void updateItem(){
        itemStrategy.updateItem(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        this.quality = quality;
    }
   
}
