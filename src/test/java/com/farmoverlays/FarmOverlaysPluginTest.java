package com.farmoverlays;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class FarmOverlaysPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(FarmOverlaysPlugin.class);
		RuneLite.main(args);
	}
}