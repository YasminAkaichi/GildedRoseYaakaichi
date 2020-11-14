package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items; }

    public void updateQuality() {
    for (Item item : items)
     {
         switch (item.getName()) {
             case "Aged Brie": updateQualityForAgedBrie(item);
                 break;
             case "Backstage passes to a TAFKAL80ETC concert": updateQualityForBackstage(item);
                 break;
             case "Conjured Mana Cake": updateQualityForConjured(item);
                 break;
             case "Sulfuras, Hand of Ragnaros": updateQualityForSulfuras(item);
                 break;
             default: updateQualityForothers(item);
                 break;
         }
     }
    }
    public void updateQualityForAgedBrie(Item item) {
        if (item.getSellIn()>= 0 && item.getSellIn() <11)
            updarteQSellInbetween6and11(item);
        else
            {item.setQuality(IncreaseQualitybyone(item));}
        item.setSellIn(DecreaseSellIn(item));
    }

    public void updateQualityForBackstage(Item item) {

        if (item.getSellIn()> 0 && item.getSellIn() <11)
            updarteQSellInbetween6and11(item);
        else if (item.getSellIn()<= 0)
            updarteQaftersellIndate(item);
        else
            {item.setQuality(IncreaseQualitybyone(item));}
        item.setSellIn(DecreaseSellIn(item));
    }

    public void updateQualityForSulfuras(Item item) {
        //Do nothing, sulfuras doesnt change in quality
    }
    public void updateQualityForConjured(Item item) {
        item.setQuality(DecreaseQualitybyTwo(item));
        item.setSellIn(DecreaseSellIn(item));
    }

    public void updateQualityForothers(Item item) {
        if (item.getSellIn() <= 0)
            item.setQuality(DecreaseQualitybyTwo(item));
        else {
            item.setQuality(DecreaseQuality(item));
        }
        item.setSellIn(DecreaseSellIn(item));
    }

    public void updarteQSellInbetween6and11(Item item)
    {
        if (item.sellIn > 5 && item.sellIn <= 10)
        {
            item.setQuality(IncreaseQualitybytwo(item));
        }
        else if (item.sellIn < 6)
        {
            item.setQuality(IncreaseQualitybythree(item));
        }
    }

    public void updarteQaftersellIndate(Item item)
    {
       item.setQuality(0);
    }

    //Les methodes increase et decrease
    public int IncreaseQualitybyone(Item item) {
        int quality = item.getQuality();
        if (quality < 50) {
            quality += 1;
        }
        if (quality >50)
        {
            quality=50;
        }
        return quality;
    }
    public int IncreaseQualitybytwo(Item item) {
        int quality = item.getQuality();
        if (quality < 50) {
            quality += 2;
        }
        if (quality >50)
        {
            quality=50;
        }
            return quality;
    }
    public int IncreaseQualitybythree(Item item) {
        int quality = item.getQuality();
        if (quality < 50) {
            quality += 3;
        }
        if (quality >50)
        {
            quality=50;
        }
        return quality;
    }
    public int DecreaseQuality(Item item) {
        int quality = item.getQuality();
        if (quality < 50 && quality > 0) {
            quality -= 1;
        }
        if (quality < 0)
            quality = 0;
        return quality;
    }
    public int DecreaseQualitybyTwo(Item item) {
        int quality = item.getQuality();
        if (quality < 50 && quality > 0) {
            quality -= 2;
        }
        if (quality < 0)
            quality = 0;
        return quality;
    }
    public int DecreaseSellIn(Item item) {
        int sellin = item.getSellIn() - 1;
        return sellin;
    }


}
