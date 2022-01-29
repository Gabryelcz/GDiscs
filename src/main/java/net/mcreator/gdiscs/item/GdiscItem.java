
package net.mcreator.gdiscs.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class GdiscItem extends RecordItem {
	public GdiscItem() {
		super(0, ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("entity.ender_dragon.death")),
				new Item.Properties().tab(null).stacksTo(1).rarity(Rarity.RARE));
		setRegistryName("gdisc");
	}
}
