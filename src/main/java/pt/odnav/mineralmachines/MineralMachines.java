package pt.odnav.mineralmachines;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(MineralMachines.MODID)
public class MineralMachines {
    public static final String MODID = "mineralmachines";
    public static final Logger LOGGER = LogManager.getLogger();

    public MineralMachines() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItems.register(modEventBus);
        // TODO: Registar blocos, itens, creative tabs, etc.
        LOGGER.info("Mineral Machines iniciado!");
    }
}
