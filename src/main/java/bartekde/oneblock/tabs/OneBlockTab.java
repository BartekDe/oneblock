package bartekde.oneblock.tabs;

import bartekde.oneblock.OneBlock;
import bartekde.oneblock.init.MyItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class OneBlockTab extends CreativeTabs {

    public OneBlockTab(String name) {
        super(OneBlock.MODID + "." + name);
    }

    @SideOnly(Side.CLIENT)
    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(MyItems.BASIC_ITEM);
    }
}
