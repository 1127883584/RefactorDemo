package gildedRose;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class GildedRoseTest {
    @Test
    public void should_return_sellIn_is_9_quality_is_19_when_given_a_common_item_sellIn_is_10_quality_is_20(){
        //given
        GildedRose gildedRose = new GildedRose(new Item[]{
                new Item("Eric", 10, 20)
        });

        //when
        gildedRose.updateQuality();
        String actualResult = gildedRose.items[0].toString();

        //then
        Assert.assertEquals("Eric, 9, 19", actualResult);
    }

    @Test
    public void should_return_sellIn_is_9_quality_is_49_when_given_a_common_item_sellIn_is_10_quality_is_50(){
        //given
        GildedRose gildedRose = new GildedRose(new Item[]{
                new Item("Eric", 10, 50)
        });

        //when
        gildedRose.updateQuality();
        String actualResult = gildedRose.items[0].toString();

        //then
        Assert.assertEquals("Eric, 9, 49", actualResult);
    }

    @Test
    public void should_return_sellIn_is_9_quality_is_0_when_given_a_common_item_sellIn_is_10_quality_is_0(){
        //given
        GildedRose gildedRose = new GildedRose(new Item[]{
                new Item("Eric", 10, 0)
        });

        //when
        gildedRose.updateQuality();
        String actualResult = gildedRose.items[0].toString();

        //then
        Assert.assertEquals("Eric, 9, 0", actualResult);
    }

    @Test
    public void should_return_sellIn_is_negative_1_quality_is_18_when_given_a_common_item_sellIn_is_0_quality_is_20(){
        //given
        GildedRose gildedRose = new GildedRose(new Item[]{
                new Item("Eric", 0, 20)
        });

        //when
        gildedRose.updateQuality();
        String actualResult = gildedRose.items[0].toString();

        //then
        Assert.assertEquals("Eric, -1, 18", actualResult);
    }

    @Test
    public void should_return_sellIn_is_1_quality_is_1_when_given_a_Aged_Brie_item_sellIn_is_2_quality_is_0(){
        //given
        GildedRose gildedRose = new GildedRose(new Item[]{
                new Item("Aged Brie", 2, 0)
        });

        //when
        gildedRose.updateQuality();
        String actualResult = gildedRose.items[0].toString();

        //then
        Assert.assertEquals("Aged Brie, 1, 1", actualResult);
    }

    @Test
    public void should_return_sellIn_is_1_quality_is_1_when_given_a_Aged_Brie_item_sellIn_is_2_quality_is_50(){
        //given
        GildedRose gildedRose = new GildedRose(new Item[]{
                new Item("Aged Brie", 2, 50)
        });

        //when
        gildedRose.updateQuality();
        String actualResult = gildedRose.items[0].toString();

        //then
        Assert.assertEquals("Aged Brie, 1, 50", actualResult);
    }

    @Test
    public void should_return_sellIn_is_0_quality_is_80_when_given_a_Sulfuras_item_sellIn_is_0_quality_is_80(){
        //given
        GildedRose gildedRose = new GildedRose(new Item[]{
                new Item("Sulfuras, Hand of Ragnaros", 0, 80)
        });

        //when
        gildedRose.updateQuality();
        String actualResult = gildedRose.items[0].toString();

        //then
        Assert.assertEquals("Sulfuras, Hand of Ragnaros, 0, 80", actualResult);
    }

    @Test
    public void should_return_sellIn_is_14_quality_is_21_when_given_a_Backstage_Passes_item_sellIn_is_15_quality_is_20(){
        //given
        GildedRose gildedRose = new GildedRose(new Item[]{
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20)
        });

        //when
        gildedRose.updateQuality();
        String actualResult = gildedRose.items[0].toString();

        //then
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, 14, 21", actualResult);
    }

    @Test
    public void should_return_sellIn_is_14_quality_is_50_when_given_a_Backstage_Passes_item_sellIn_is_15_quality_is_50(){
        //given
        GildedRose gildedRose = new GildedRose(new Item[]{
                new Item("Backstage passes to a TAFKAL80ETC concert", 15, 50)
        });

        //when
        gildedRose.updateQuality();
        String actualResult = gildedRose.items[0].toString();

        //then
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, 14, 50", actualResult);
    }

    @Test
    public void should_return_sellIn_is_1_quality_is_50_when_given_a_Backstage_Passes_item_sellIn_is_2_quality_is_49(){
        //given
        GildedRose gildedRose = new GildedRose(new Item[]{
                new Item("Backstage passes to a TAFKAL80ETC concert", 2, 49)
        });

        //when
        gildedRose.updateQuality();
        String actualResult = gildedRose.items[0].toString();

        //then
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, 1, 50", actualResult);
    }

    @Test
    public void should_return_sellIn_is_9_quality_is_22_when_given_a_Backstage_Passes_item_sellIn_is_10_quality_is_20(){
        //given
        GildedRose gildedRose = new GildedRose(new Item[]{
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 20)
        });

        //when
        gildedRose.updateQuality();
        String actualResult = gildedRose.items[0].toString();

        //then
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, 9, 22", actualResult);
    }

    @Test
    public void should_return_sellIn_is_negative_1_quality_is_0_when_given_a_Backstage_Passes_item_sellIn_is_0_quality_is_20(){
        //given
        GildedRose gildedRose = new GildedRose(new Item[]{
                new Item("Backstage passes to a TAFKAL80ETC concert", 0, 20)
        });

        //when
        gildedRose.updateQuality();
        String actualResult = gildedRose.items[0].toString();

        //then
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, -1, 0", actualResult);
    }

    @Test
    public void should_return_sellIn_is_negative_1_quality_is_0_when_given_a_Backstage_Passes_item_sellIn_is_2_quality_is_60(){
        //given
        GildedRose gildedRose = new GildedRose(new Item[]{
                new Item("Backstage passes to a TAFKAL80ETC concert", 2, 60)
        });

        //when
        gildedRose.updateQuality();
        String actualResult = gildedRose.items[0].toString();

        //then
        Assert.assertEquals("Backstage passes to a TAFKAL80ETC concert, 1, 60", actualResult);
    }

    @Test
    public void should_return_sellIn_is_2_quality_is_5_when_given_a_Conjured_item_sellIn_is_3_quality_is_6(){
        //given
        GildedRose gildedRose = new GildedRose(new Item[]{
                new Item("Conjured Mana Cake", 3, 6)
        });

        //when
        gildedRose.updateQuality();
        String actualResult = gildedRose.items[0].toString();

        //then
        Assert.assertEquals("Conjured Mana Cake, 2, 5", actualResult);
    }

    @Test
    public void should_return_sellIn_is_negative_1_quality_is_4_when_given_a_Conjured_item_sellIn_is_0_quality_is_6(){
        //given
        GildedRose gildedRose = new GildedRose(new Item[]{
                new Item("Conjured Mana Cake", 0, 6)
        });

        //when
        gildedRose.updateQuality();
        String actualResult = gildedRose.items[0].toString();

        //then
        Assert.assertEquals("Conjured Mana Cake, -1, 4", actualResult);
    }
}