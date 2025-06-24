package pt.odnav.mineralmachines.registry;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Item.Properties;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import pt.odnav.mineralmachines.MineralMachines;

public class ModBlockItems {
    public static final DeferredRegister<Item> BLOCK_ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MineralMachines.MODID);

    public static final RegistryObject<Item> SILICATIC_QUARTZ_ORE = BLOCK_ITEMS.register("silicatic_quartz_ore",
            () -> new BlockItem(ModBlocks.SILICATIC_QUARTZ_ORE.get(), new Properties()));

    public static void register(net.minecraftforge.eventbus.api.IEventBus modEventBus) {
        BLOCK_ITEMS.register(modEventBus);
    }
}
