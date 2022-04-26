package arvem.sky;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Sounds {
	public static final Identifier CAPE_FLAP = new Identifier("sky:player.flap");
    public static SoundEvent CAPEFLAP = new SoundEvent(CAPE_FLAP);
	public static final Identifier CAPE_BOOST = new Identifier("sky:player.boost");
    public static SoundEvent CAPEBOOST = new SoundEvent(CAPE_BOOST);
	public static final Identifier CAPE_WHOOSH = new Identifier("sky:player.whoosh");
    public static SoundEvent CAPEWHOOSH = new SoundEvent(CAPE_WHOOSH);

	static SoundEvent registerflap() {
		return Registry.register(Registry.SOUND_EVENT, CAPE_FLAP, CAPEFLAP);
	}
	static SoundEvent registerboost() {
		return Registry.register(Registry.SOUND_EVENT, CAPE_BOOST, CAPEBOOST);
	}
	static SoundEvent registerwhoosh() {
		return Registry.register(Registry.SOUND_EVENT, CAPE_WHOOSH, CAPEWHOOSH);
	}
}