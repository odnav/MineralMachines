package pt.odnav.mineralmachines.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import pt.odnav.mineralmachines.MineralMachines;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MineralMachines.MODID);

    public static final RegistryObject<Item> SILICATIC_QUARTZ = ITEMS.register("silicatic_quartz",
            () -> new Item(new Properties()));

    public static void register(net.minecraftforge.eventbus.api.IEventBus modEventBus) {
        ITEMS.register(modEventBus);
    }
}
