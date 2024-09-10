package juni.junis_tweaks.items;

import juni.junis_tweaks.JunisTweaks;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

public class JunisTweaksItems {
	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(JunisTweaks.MODID);

	public static final DeferredItem<Item> EXAMPLE_ITEM = ITEMS.registerSimpleItem("example_item", new Item.Properties().food(new FoodProperties.Builder()
	.alwaysEdible().nutrition(1).saturationModifier(2f).build()));

	public static void register(IEventBus eventBus) {
		ITEMS.register(eventBus);
    }
}
