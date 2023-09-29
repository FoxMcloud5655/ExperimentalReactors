package com.quantumzizo.experimentalreactors;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("experimentalreactors")
public class ExperimentalReactors {
	public static final String MOD_ID = "experimentalreactors";
	
	
	public ExperimentalReactors() {
		MinecraftForge.EVENT_BUS.register(this);
	}
}
