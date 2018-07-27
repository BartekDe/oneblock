package bartekde.oneblock.item;

import bartekde.oneblock.OneBlock;
import net.minecraft.item.ItemSword;

public class ItemOneBlockSword extends ItemSword {

    public ItemOneBlockSword(ToolMaterial material, String unlocalizedName, String registryName) {
        super(material);

        setUnlocalizedName(OneBlock.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(OneBlock.ONEBLOCK_TAB);
    }

}
