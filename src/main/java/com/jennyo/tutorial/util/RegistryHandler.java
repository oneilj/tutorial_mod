package com.jennyo.tutorial.util;

import com.jennyo.tutorial.Tutorial;
import com.jennyo.tutorial.armor.ModArmorMaterial;
import com.jennyo.tutorial.blocks.SapphireBlock;
import com.jennyo.tutorial.blocks.SapphireOre;
import com.jennyo.tutorial.blocks.BlockItemBase;
import com.jennyo.tutorial.items.ItemBase;
import com.jennyo.tutorial.tools.ModItemTier;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.block.Block;

import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(
            ForgeRegistries.ITEMS, Tutorial.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = new DeferredRegister<>(
            ForgeRegistries.BLOCKS, Tutorial.MOD_ID);

    public static void init(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    //Items
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", ItemBase::new);

    // Tools
    public static final RegistryObject<SwordItem> SAPPHIRE_SWORD = ITEMS.register("sapphire_sword", () ->
            new SwordItem(ModItemTier.SAPPHIRE, 2, -2,
                    new Item.Properties().group(ItemGroup.COMBAT)));

    public static final RegistryObject<PickaxeItem> SAPPHIRE_PICKAXE = ITEMS.register("sapphire_pickaxe", () ->
            new PickaxeItem(ModItemTier.SAPPHIRE, 0, -2.5f,
                    new Item.Properties().group(ItemGroup.TOOLS)));

    public static final RegistryObject<AxeItem> SAPPHIRE_AXE = ITEMS.register("sapphire_axe", () ->
            new AxeItem(ModItemTier.SAPPHIRE, 5, -4.5f,
                    new Item.Properties().group(ItemGroup.TOOLS)));

    public static final RegistryObject<ShovelItem> SAPPHIRE_SHOVEL = ITEMS.register("sapphire_shovel", () ->
            new ShovelItem(ModItemTier.SAPPHIRE, 0.5f, -2.5f,
                    new Item.Properties().group(ItemGroup.TOOLS)));

    public static final RegistryObject<HoeItem> SAPPHIRE_HOE = ITEMS.register("sapphire_hoe", () ->
            new HoeItem(ModItemTier.SAPPHIRE, 0, new Item.Properties().group(ItemGroup.TOOLS)));

    // Armor
    public static final RegistryObject<ArmorItem> SAPPHIRE_HELMET = ITEMS.register(("sapphire_helmet"), () ->
            new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.HEAD,
                    new Item.Properties().group(ItemGroup.COMBAT)));

    public static final RegistryObject<ArmorItem> SAPPHIRE_CHESTPLATE = ITEMS.register(("sapphire_chestplate"), () ->
            new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.CHEST,
                    new Item.Properties().group(ItemGroup.COMBAT)));

    public static final RegistryObject<ArmorItem> SAPPHIRE_LEGGINGS = ITEMS.register(("sapphire_leggings"), () ->
            new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.LEGS,
                    new Item.Properties().group(ItemGroup.COMBAT)));

    public static final RegistryObject<ArmorItem> SAPPHIRE_BOOTS = ITEMS.register(("sapphire_boots"), () ->
            new ArmorItem(ModArmorMaterial.SAPPHIRE, EquipmentSlotType.FEET,
                    new Item.Properties().group(ItemGroup.COMBAT)));

    // Blocks
    public static final RegistryObject<Block> SAPPHIRE_ORE = BLOCKS.register("sapphire_ore", SapphireOre::new);
    public static final RegistryObject<Block> SAPPHIRE_BLOCK = BLOCKS.register("sapphire_block", SapphireBlock::new);

    // Block Items
    public static final RegistryObject<Item> SAPPHIRE_ORE_ITEM = ITEMS.register(
            "sapphire_ore", () -> new BlockItemBase(SAPPHIRE_ORE.get()));
    public static final RegistryObject<Item> SAPPHIRE_BLOCK_ITEM = ITEMS.register(
            "sapphire_block", () -> new BlockItemBase(SAPPHIRE_BLOCK.get()));
}
