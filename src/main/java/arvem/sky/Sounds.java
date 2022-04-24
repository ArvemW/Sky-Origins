package arvem.sky;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Sounds {
	public static final Identifier CAPE_FLAP = new Identifier("sky:player.flap");
    public static SoundEvent CAPEFLAP = new SoundEvent(CAPE_FLAP);

	static SoundEvent register() {
		return Registry.register(Registry.SOUND_EVENT, CAPE_FLAP, CAPEFLAP);
	}
}