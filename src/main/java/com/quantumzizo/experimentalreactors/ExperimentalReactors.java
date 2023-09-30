package com.quantumzizo.experimentalreactors;

import com.quantumzizo.experimentalreactors.init.ItemInit;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("experimentalreactors")
public class ExperimentalReactors {
	public static final String MOD_ID = "experimentalreactors";
	
	public static final CreativeModeTab EXPERIMENTAL_REACTORS = new CreativeModeTab(MOD_ID) {
		
		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack makeIcon() {
			return new ItemStack(ItemInit.DIAGNOSTIC_TOOL.get());
		}
	};
	
	public ExperimentalReactors() {
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		
		ItemInit.ITEMS.register(bus);
		
		MinecraftForge.EVENT_BUS.register(this);
	}
}
