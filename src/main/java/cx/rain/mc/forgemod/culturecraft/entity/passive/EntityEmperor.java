package cx.rain.mc.forgemod.culturecraft.entity.passive;

import cx.rain.mc.forgemod.culturecraft.item.automatic.ItemCrown;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.MobEntity;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.UUID;

/**
 * Emperor entity, who have a crown
 * 皇帝类，有冠冕就是皇帝，兵马俑保护皇帝,主要是作为兵马俑的追踪目标
 * @author jirufengyu
 */
public class EntityEmperor extends MobEntity {
    public EntityEmperor(EntityType<? extends MobEntity> type, World worldIn) {
        super(type, worldIn);
    }
    EquipmentSlotType slot;
    @Nullable
    public LivingEntity getOwner() {
        try {
            UUID uuid = this.getOwnerId();
            return uuid == null ? null : this.world.getPlayerByUuid(uuid);
        } catch (IllegalArgumentException var2) {
            return null;
        }
    }

    private UUID getOwnerId() {
        ItemStack head=this.getItemStackFromSlot(EquipmentSlotType.HEAD);
        Item crown=head.getItem();
        if(crown instanceof ItemCrown){

        }
    }
}