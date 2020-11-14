package com.gildedrose;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class GildedRoseTest {
    @Test
    public void AgedBrie(){
        Item[] items = new Item[] {new Item ("Aged Brie",20,10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality,is(11));
        assertThat(app.items[0].sellIn,is(19));
    }
    @Test
    public void AgedBrie2(){
        Item[] items = new Item[] {new Item ("Aged Brie",20,50)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality,is(50));
        assertThat(app.items[0].sellIn,is(19));
    }
    @Test
    public void AgedBrie3(){
        Item[] items = new Item[] {new Item ("Aged Brie",0,48)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality,is(50));
        assertThat(app.items[0].sellIn,is(-1));
    }
    @Test
    public void AgedBriesellin5(){
        Item[] items = new Item[] {new Item ("Aged Brie",5,40)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality,is(43));
        assertThat(app.items[0].sellIn,is(4));
    }
    @Test
    public void AgedBriesellininf10() {
        Item[] items = new Item[]{new Item("Aged Brie", 7, 30)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality, is(32));
        assertThat(app.items[0].sellIn, is(6));
    }

    @Test
    public void Dexterity(){
        Item[] items = new Item[] {new Item ("+5 Dexterity Vest",10,10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality,is(9));
        assertThat(app.items[0].sellIn,is(9));
    }
    @Test
    public void Dexterity1(){
        Item[] items = new Item[] {new Item ("+5 Dexterity Vest",-1,10)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality,is(8));
        assertThat(app.items[0].sellIn,is(-2));
    }
    @Test
    public void Dexterity2(){
        Item[] items = new Item[] {new Item ("+5 Dexterity Vest",10,0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality,is(0));
        assertThat(app.items[0].sellIn,is(9));
    }
    @Test
    public void Dexterity3(){
        Item[] items = new Item[] {new Item ("+5 Dexterity Vest",-1,1)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality,is(0));
        assertThat(app.items[0].sellIn,is(-2));
    }

    @Test
    public void Backstage_passes(){
        Item[] items = new Item[] {new Item ("Backstage passes to a TAFKAL80ETC concert",10,20)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality,is(22));
        assertThat(app.items[0].sellIn,is(9));
    }
    @Test
    public void Backstage_passes2(){
        Item[] items = new Item[] {new Item ("Backstage passes to a TAFKAL80ETC concert",5,20)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality,is(23));
        assertThat(app.items[0].sellIn,is(4));
    }

    @Test
    public void Backstage_passes3(){
        Item[] items = new Item[] {new Item ("Backstage passes to a TAFKAL80ETC concert",5,49)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality,is(50));
        assertThat(app.items[0].sellIn,is(4));
    }
    @Test
    public void Backstage_passes4(){
        Item[] items = new Item[] {new Item ("Backstage passes to a TAFKAL80ETC concert",0,20)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality,is(0));
        assertThat(app.items[0].sellIn,is(-1));
    }


    @Test
    public void Sulfuras(){
        Item[] items = new Item[] {new Item ("Sulfuras, Hand of Ragnaros",10,20)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality,is(20));
        assertThat(app.items[0].sellIn,is(10));

    }

    @Test
    public void Conjured(){
        Item[] items = new Item[] {new Item ("Conjured Mana Cake",10,20)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality,is(18));
        assertThat(app.items[0].sellIn,is(9));
    }

    @Test
    public void Conjured2(){
        Item[] items = new Item[] {new Item ("Conjured Mana Cake",10,1)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality,is(0));
        assertThat(app.items[0].sellIn,is(9));
    }

    @Test
    public void others(){
        Item[] items = new Item[] {new Item ("Name",0,48)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertThat(app.items[0].quality,is(46));
        assertThat(app.items[0].sellIn,is(-1));
    }

}
