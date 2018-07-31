package bartekde.oneblock.recipes;

import bartekde.oneblock.init.MyItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class OneBlockRecipes {

    public static void initSmelting() {
        GameRegistry.addSmelting(Items.CARROT, new ItemStack(MyItems.BASIC_ITEM), 4);
    }

}
