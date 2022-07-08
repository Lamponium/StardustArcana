package stardustarcana.object.items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import stardustarcana.init.ItemInit;
import stardustarcana.main;
import stardustarcana.proxy.ClientProxy;
import stardustarcana.utils.IHasModel;

public class ItemBase extends Item implements IHasModel
{
    public ItemBase(String name)
    {
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);

        ItemInit.ITEMS.add(this);
    }

    @Override
    public void registerModels()
    {
        main.proxy.registerItemRenderer(this, 0, "inventory");
    }
}
