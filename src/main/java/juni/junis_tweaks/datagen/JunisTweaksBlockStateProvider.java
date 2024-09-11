package juni.junis_tweaks.datagen;

import juni.junis_tweaks.JunisTweaks;
import juni.junis_tweaks.blocks.JunisTweaksBlocks;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;

public class JunisTweaksBlockStateProvider extends BlockStateProvider {
	public JunisTweaksBlockStateProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, JunisTweaks.MODID, existingFileHelper);
    }

	@Override
    protected void registerStatesAndModels() {
		// Polished Stone BLocks
		simpleBlockWithItem(JunisTweaksBlocks.POLISHED_END_STONE.get(), models().cubeAll("polished_end_stone", modLoc("block/polished_end_stone")));
		simpleBlockWithItem(JunisTweaksBlocks.POLISHED_NETHERRACK.get(), models().cubeAll("polished_netherrack", modLoc("block/polished_netherrack")));
		simpleBlockWithItem(JunisTweaksBlocks.POLISHED_CALCITE.get(), models().cubeAll("polished_calcite", modLoc("block/polished_calcite")));

		// Stone Brick Blocks
		simpleBlockWithItem(JunisTweaksBlocks.NETHERRACK_BRICKS.get(), models().cubeAll("netherrack_bricks", modLoc("block/netherrack_bricks")));
		simpleBlockWithItem(JunisTweaksBlocks.CALCITE_BRICKS.get(), models().cubeAll("calcite_bricks", modLoc("block/calcite_bricks")));
		simpleBlockWithItem(JunisTweaksBlocks.GRANITE_BRICKS.get(), models().cubeAll("granite_bricks", modLoc("block/granite_bricks")));
		simpleBlockWithItem(JunisTweaksBlocks.DIORITE_BRICKS.get(), models().cubeAll("diorite_bricks", modLoc("block/diorite_bricks")));
		simpleBlockWithItem(JunisTweaksBlocks.ANDESITE_BRICKS.get(), models().cubeAll("andesite_bricks", modLoc("block/andesite_bricks")));
	}
}
