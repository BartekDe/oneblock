package bartekde.oneblock.item;

import bartekde.oneblock.OneBlock;
import net.minecraft.item.ItemSpade;

public class ItemOneBlockShovel extends ItemSpade {

    public ItemOneBlockShovel(ToolMaterial material, String unlocalizedName, String registryName) {
        super(material);

        setUnlocalizedName(OneBlock.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(OneBlock.ONEBLOCK_TAB);
    }

}
