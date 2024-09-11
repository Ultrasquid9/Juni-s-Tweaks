package juni.junis_tweaks.items;

import juni.junis_tweaks.JunisTweaks;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

public class JunisTweaksItems {
	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(JunisTweaks.MODID);

	public static final DeferredItem<Item> COPPER_NUGGET = ITEMS.registerSimpleItem("copper_nugget", new Item.Properties());

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
    }
}
