package bartekde.oneblock.item;

import bartekde.oneblock.OneBlock;
import net.minecraft.item.ItemAxe;

public class ItemOneBlockAxe extends ItemAxe {

    public ItemOneBlockAxe(ToolMaterial material, float damage, float speed, String unlocalizedName, String registryName) {
        super(material, damage, speed);

        setUnlocalizedName(OneBlock.MODID + "." + unlocalizedName);
        setRegistryName(registryName);
        setCreativeTab(OneBlock.ONEBLOCK_TAB);
    }

    public ItemOneBlockAxe(ToolMaterial material, String unlocalizedName, String registryName) {
        this(material, 8.0f, -3.1f, unlocalizedName, registryName);
    }

}
