
package net.mcreator.gdiscs.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.gdiscs.init.GdiscsModTabs;
import net.mcreator.gdiscs.init.GdiscsModSounds;

public class WeirdRealmItem extends RecordItem {
	public WeirdRealmItem() {
		super(0, GdiscsModSounds.REGISTRY.get(new ResourceLocation("gdiscs:weirdrealm_gdiscs")),
				new Item.Properties().tab(GdiscsModTabs.TAB_GDISCS).stacksTo(1).rarity(Rarity.RARE));
		setRegistryName("weird_realm");
	}
}
