
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gdiscs.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.item.Item;

import net.mcreator.gdiscs.item.WeirdRealmItem;
import net.mcreator.gdiscs.item.GdiscItem;
import net.mcreator.gdiscs.item.FortstressItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class GdiscsModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item GDISC = register(new GdiscItem());
	public static final Item FORTSTRESS = register(new FortstressItem());
	public static final Item WEIRD_REALM = register(new WeirdRealmItem());

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
