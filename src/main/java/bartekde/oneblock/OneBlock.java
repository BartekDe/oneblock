package bartekde.oneblock;

import bartekde.oneblock.proxy.IProxy;
import bartekde.oneblock.tabs.OneBlockTab;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(
        modid = OneBlock.MODID,
        name = OneBlock.NAME,
        version = OneBlock.VERSION)
public class OneBlock {

    public static final String MODID = "oneblock";
    public static final String NAME = "One Block";
    public static final String VERSION = "0.1";

    public static final String CLIENT = "bartekde.oneblock.proxy.ClientProxy";
    public static final String SERVER = "bartekde.oneblock.proxy.ServerProxy";

    @SidedProxy(clientSide = OneBlock.CLIENT, serverSide = OneBlock.SERVER)
    public static IProxy proxy;

    public static Logger logger;

    public static final CreativeTabs ONEBLOCK_TAB = new OneBlockTab("tabOneBlock");

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        logger = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        logger.info(OneBlock.NAME + " says HI!!!");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

}