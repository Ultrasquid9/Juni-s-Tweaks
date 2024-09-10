package juni.junis_tweaks.blocks;

import juni.junis_tweaks.JunisTweaks;
import juni.junis_tweaks.items.JunisTweaksItems;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;
import java.util.function.Supplier;

public class JunisTweaksBlocks {
	public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(JunisTweaks.MODID);

	// Polished Stone Blocks
	public static final DeferredBlock<Block> POLISHED_END_STONE = registerBlockAndItem("polished_end_stone", () -> new Block(
		BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE)
	));

	public static final DeferredBlock<Block> POLISHED_NETHERRACK = registerBlockAndItem("polished_netherrack", () -> new Block(
		BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE)
		.sound(SoundType.NETHER_BRICKS)
	));

	public static final DeferredBlock<Block> POLISHED_CALCITE = registerBlockAndItem("polished_calcite", () -> new Block(
		BlockBehaviour.Properties.ofFullCopy(Blocks.POLISHED_ANDESITE)
	));


	// Stone Brick Blocks
	public static final DeferredBlock<Block> NETHERRACK_BRICKS = registerBlockAndItem("netherrack_bricks", () -> new Block(
		BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)
		.sound(SoundType.NETHER_BRICKS)
	));

	public static final DeferredBlock<Block> CALCITE_BRICKS = registerBlockAndItem("calcite_bricks", () -> new Block(
		BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)
	));

	public static final DeferredBlock<Block> GRANITE_BRICKS = registerBlockAndItem("granite_bricks", () -> new Block(
		BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)
	));

	public static final DeferredBlock<Block> DIORITE_BRICKS = registerBlockAndItem("calcite_bricks", () -> new Block(
		BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)
	));

	public static final DeferredBlock<Block> ANDESITE_BRICKS = registerBlockAndItem("calcite_bricks", () -> new Block(
		BlockBehaviour.Properties.ofFullCopy(Blocks.STONE_BRICKS)
	));


	// Registation stuff
	private static <T extends Block> DeferredBlock<T> registerBlockAndItem(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
		JunisTweaksItems.ITEMS.registerSimpleBlockItem(name, toReturn);
        return toReturn;
    }

	public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
		JunisTweaksItems.ITEMS.register(eventBus);
    }
}
