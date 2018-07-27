package bartekde.oneblock.item;

import bartekde.oneblock.OneBlock;
import net.minecraft.item.ItemPickaxe;

public class ItemOneBlockPickaxe extends ItemPickaxe {

    public ItemOneBlockPickaxe(ToolMaterial material, String unlocalizedName, String registryName) {
        super(material);

        setUnlocalizedName(OneBlock.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(OneBlock.ONEBLOCK_TAB);
    }

}
