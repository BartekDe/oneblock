package bartekde.oneblock.item;

import bartekde.oneblock.OneBlock;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBasic extends Item {

    public ItemBasic(String unlocalizedName, String registryName) {
        setUnlocalizedName(OneBlock.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(CreativeTabs.MISC);
    }

}
