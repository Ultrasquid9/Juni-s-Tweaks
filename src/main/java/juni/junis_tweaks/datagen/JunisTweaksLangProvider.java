package juni.junis_tweaks.datagen;

import juni.junis_tweaks.JunisTweaks;
import juni.junis_tweaks.blocks.JunisTweaksBlocks;
import juni.junis_tweaks.items.JunisTweaksItems;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.LanguageProvider;

public class JunisTweaksLangProvider extends LanguageProvider {
    public JunisTweaksLangProvider(PackOutput output) {
        super(
            output,
            JunisTweaks.MODID,
            "en_us"
        );
    }

	@Override
    protected void addTranslations() {
		add("translation.key.1", "Translation 1");

		// Polished Stone BLocks
		add(JunisTweaksBlocks.POLISHED_NETHERRACK.get(), "Polished Netherrack");
		add(JunisTweaksBlocks.POLISHED_END_STONE.get(), "Polished End Stone");
		add(JunisTweaksBlocks.POLISHED_CALCITE.get(), "Polished Calcite");

		// Stone Brick Blocks
		add(JunisTweaksBlocks.NETHERRACK_BRICKS.get(), "Netherrack Bricks");
		add(JunisTweaksBlocks.CALCITE_BRICKS.get(), "Calcite Bricks");
		add(JunisTweaksBlocks.GRANITE_BRICKS.get(), "Granite Bricks");
		add(JunisTweaksBlocks.DIORITE_BRICKS.get(), "Diorite Bricks");
		add(JunisTweaksBlocks.ANDESITE_BRICKS.get(), "Andesite Bricks");

		// Items
		add(JunisTweaksItems.COPPER_NUGGET.get(), "Copper Nugget");
	}
}
