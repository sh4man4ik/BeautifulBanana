package com.sh4man.beautifulbanana;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Objects;

@Mod.EventBusSubscriber
@Mod(modid = BeautifulBanana.MODID, name = BeautifulBanana.NAME, version = BeautifulBanana.VERSION)
public class BeautifulBanana
{
    public static final String MODID = "beautifulbanana";
    public static final String NAME = "Beautiful Banana";
    public static final String VERSION = "1.0";

    public static final Item banana = new ItemFood(2, 0.4F, false).setUnlocalizedName("banana").setRegistryName(MODID, "banana").setCreativeTab(CreativeTabs.FOOD);

    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        event.getRegistry().registerAll(banana);
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void registerModels(ModelRegistryEvent event) {
        ModelLoader.setCustomModelResourceLocation(banana, 0, new ModelResourceLocation(Objects.requireNonNull(banana.getRegistryName()), "inventory"));
    }
}
