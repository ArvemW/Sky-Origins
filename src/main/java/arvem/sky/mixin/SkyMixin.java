package arvem.sky.mixin;

import net.minecraft.client.gui.screen.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import arvem.sky.Sky;

@Mixin(TitleScreen.class)
public class SkyMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		Sky.LOGGER.info("I'm not afraid of the dark, I'm afraid of not being alone in the dark.");
	}
}
