package gildedrose;

public class ConjuredItemUpdater implements ItemUpdater {

    @Override
    public void update(Item item) {
        item.sellIn--;
        int decrease = item.sellIn < 0 ? 4 : 2;
        item.quality = Math.max(0, item.quality - decrease);
    }
}
