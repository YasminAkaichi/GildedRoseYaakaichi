package com.gildedrose;

public class TexttestFixture {
    public static void main(String[] args) {
        System.out.println("OMGHAI!");

        Item[] items = new Item[] {
                new Item("+5 Dexterity Vest", 10, 10),
                new Item("+5 Dexterity Vest", -1, 10),
                new Item("+5 Dexterity Vest", 10, 0),
                new Item("+5 Dexterity Vest", -1, 1),
                new Item("Aged Brie", 20,10),
                new Item("Aged Brie", 20,50),
                new Item("Aged Brie", 20,20),
                new Item("Sulfuras, Hand of Ragnaros", 10, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49),
                new Item("Backstage passes to a TAFKAL80ETC concert", 0, 20),
                new Item("Conjured Mana Cake", 10, 20),
                new Item("Conjured Mana Cake", 10, 1)};
        GildedRose app = new GildedRose(items);

        int days = 2;
        if (args.length > 0) {
            days = Integer.parseInt(args[0]) + 1;
        }

        for (int i = 0; i < days; i++) {
            System.out.println("-------- day " + i + " --------");
            System.out.println("name, sellIn, quality");
            for (Item item : items) {
                System.out.println(item);
            }
            System.out.println();
            app.updateQuality();
        }
    }

}
