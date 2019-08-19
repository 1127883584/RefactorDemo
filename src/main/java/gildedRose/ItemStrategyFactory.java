package gildedRose;

public class ItemStrategyFactory {
    static ItemStrategy createItem(String itemName){
        switch (itemName){
            case "Aged Brie":
                return new AgedBrieItem();
            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackstageItem();
            case "Sulfuras, Hand of Ragnaros":
                return new SulfurasItem();
            default:
                return new CommonItem();
        }
    }
}
