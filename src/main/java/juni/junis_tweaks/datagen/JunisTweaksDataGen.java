package juni.junis_tweaks.datagen;

import juni.junis_tweaks.JunisTweaks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.data.event.GatherDataEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, modid = JunisTweaks.MODID)
public class JunisTweaksDataGen {
	@SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(
			event.includeClient(), 
			new JunisTweaksBlockStateProvider(packOutput, existingFileHelper)
		);
		generator.addProvider(
			event.includeClient(), 
			new JunisTweaksItemModelProvider(packOutput, existingFileHelper)
		);
		generator.addProvider(
			event.includeClient(), 
			new JunisTweaksLangProvider(packOutput)
		);
	}
}