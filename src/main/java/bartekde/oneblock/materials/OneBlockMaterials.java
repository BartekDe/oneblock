package bartekde.oneblock.materials;

import bartekde.oneblock.OneBlock;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class OneBlockMaterials {

    public static final Item.ToolMaterial ONE_BLOCK_TOOL = EnumHelper.addToolMaterial(OneBlock.MODID + ":" + "one_block_tool", 2, 125, 7.0f, 2.5f, 10);

}
