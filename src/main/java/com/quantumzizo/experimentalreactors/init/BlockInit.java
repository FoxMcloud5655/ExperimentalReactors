package com.quantumzizo.experimentalreactors.init;

import java.util.function.Function;

import com.google.common.base.Supplier;
import com.quantumzizo.experimentalreactors.ExperimentalReactors;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, ExperimentalReactors.MOD_ID);
	public static final DeferredRegister<Item> ITEMS = ItemInit.ITEMS;
	
	public static final RegistryObject<Block> DRACONIC_UNLOCKER = register("draconic_unlocker", 
			() -> new Block(BlockBehaviour.Properties.of(Material.METAL, MaterialColor.COLOR_GRAY).strength(-1).sound(SoundType.METAL)),
			object -> () -> new BlockItem(object.get(),new Item.Properties().tab(ExperimentalReactors.EXPERIMENTAL_REACTORS)));
	
	private static <T extends Block> RegistryObject<T> registerBlock(final String name, final Supplier<? extends T> block) {
		return BLOCKS.register(name, block);
	}
	
	private static <T extends Block> RegistryObject<T> register(final String name, final Supplier<? extends T> block,
			Function<RegistryObject<T>, Supplier<? extends Item>> item) {
		RegistryObject<T> obj = registerBlock(name, block);
		ITEMS.register(name, item.apply(obj));
		return obj;
	}
}