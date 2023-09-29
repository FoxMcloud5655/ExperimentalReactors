package com.quantumzizo.experimentalreactors.init;

import com.google.common.base.Supplier;
import com.quantumzizo.experimentalreactors.ExperimentalReactors;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ExperimentalReactors.MOD_ID);
	
	public static final RegistryObject<Item> DIAGNOSTIC_TOOL = register("diagnostic_tool",
			() -> new Item(new Item.Properties().tab(ExperimentalReactors.EXPERIMENTAL_REACTORS)));
	
	private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) {
		return ITEMS.register(name, item);
	}
}
