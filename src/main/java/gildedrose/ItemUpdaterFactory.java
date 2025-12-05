package gildedrose;

public class ItemUpdaterFactory {

    public static ItemUpdater create(Item item) {

        if (item.name.equalsIgnoreCase("Sulfuras, Hand of Ragnaros"))
            return new SulfurasUpdater();

        if (item.name.equalsIgnoreCase("Aged Brie"))
            return new AgedBrieUpdater();

        if (item.name.contains("Backstage"))
            return new BackstagePassUpdater();

        if (item.name.contains("Conjured"))
            return new ConjuredItemUpdater();

        return new NormalItemUpdater();
    }
}
