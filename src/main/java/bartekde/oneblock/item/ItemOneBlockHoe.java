package bartekde.oneblock.item;

import bartekde.oneblock.OneBlock;
import net.minecraft.item.ItemHoe;

public class ItemOneBlockHoe extends ItemHoe {

    public ItemOneBlockHoe(ToolMaterial material, String unlocalizedName, String registryName) {
        super(material);

        setUnlocalizedName(OneBlock.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(OneBlock.ONEBLOCK_TAB);
    }

}
