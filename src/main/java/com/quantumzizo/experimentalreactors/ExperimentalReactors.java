package com.quantumzizo.experimentalreactors;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

@Mod("experimentalreactors")
public class ExperimentalReactors {
	public ExperimentalReactors() {
		MinecraftForge.EVENT_BUS.register(this);
	}
}
