package cx.rain.mc.forgemod.culturecraft.item.automatic;

import cx.rain.mc.forgemod.culturecraft.api.annotation.ModItem;
import cx.rain.mc.forgemod.culturecraft.group.Groups;
import net.minecraft.item.Food;
import net.minecraft.item.Item;

@ModItem(name = "scallion")
public class ItemScallion extends Item {
    private static Food food = new Food.Builder()
            .hunger(1)
            .saturation(1)
            .build();
    public ItemScallion() {
        super(new Properties()
        .group(Groups.FOODS)
        .food(food));
    }
}
