package gildedrose;

public class NormalItemUpdater implements ItemUpdater {

    @Override
    public void update(Item item) {
        decreaseSellIn(item);
        decreaseQuality(item, item.sellIn < 0 ? 2 : 1);
    }

    protected void decreaseSellIn(Item item) {
        item.sellIn--;
    }

    protected void decreaseQuality(Item item, int amount) {
        item.quality = Math.max(0, item.quality - amount);
    }
}
