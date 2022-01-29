
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.gdiscs.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class GdiscsModTabs {
	public static CreativeModeTab TAB_GDISCS;

	public static void load() {
		TAB_GDISCS = new CreativeModeTab("tabgdiscs") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(GdiscsModItems.GDISC);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
