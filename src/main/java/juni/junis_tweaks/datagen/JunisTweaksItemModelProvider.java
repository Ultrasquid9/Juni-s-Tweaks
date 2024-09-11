package juni.junis_tweaks.datagen;

import juni.junis_tweaks.JunisTweaks;
import juni.junis_tweaks.items.JunisTweaksItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.ItemModelProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class JunisTweaksItemModelProvider extends ItemModelProvider {
	public JunisTweaksItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, JunisTweaks.MODID, existingFileHelper);
    }

	@Override
    protected void registerModels() {
		basicItem(JunisTweaksItems.COPPER_NUGGET.get());
	}
}
