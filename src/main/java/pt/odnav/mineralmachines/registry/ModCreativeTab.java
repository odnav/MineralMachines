package pt.odnav.mineralmachines.registry;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import pt.odnav.mineralmachines.MineralMachines;

@Mod.EventBusSubscriber(modid = MineralMachines.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModCreativeTab {
    public static CreativeModeTab MAIN_TAB;

    @SubscribeEvent
    public static void registerCreativeTabs(CreativeModeTabEvent.Register event) {
        MAIN_TAB = event.registerCreativeModeTab(
            new ResourceLocation(MineralMachines.MODID, "main_tab"),
            builder -> builder
                .title(Component.literal("Mineral Machines"))
                .icon(() -> new ItemStack(ModItems.SILICATIC_QUARTZ.get()))
                .displayItems((params, output) -> {
                    output.accept(ModItems.SILICATIC_QUARTZ.get());
                    // output.accept(mais itens à medida que adicionares)
                })
        );
    }
}
