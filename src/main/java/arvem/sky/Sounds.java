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
	public static final Identifier DEFAULT_SHOUT = new Identifier("sky:player.default");
    public static SoundEvent DEFAULTSHOUT = new SoundEvent(DEFAULT_SHOUT);
	public static final Identifier BIRD_SHOUT = new Identifier("sky:player.bird");
    public static SoundEvent BIRDSHOUT = new SoundEvent(BIRD_SHOUT);

	static SoundEvent registerflap() {
		return Registry.register(Registry.SOUND_EVENT, CAPE_FLAP, CAPEFLAP);
	}
	static SoundEvent registerboost() {
		return Registry.register(Registry.SOUND_EVENT, CAPE_BOOST, CAPEBOOST);
	}
	static SoundEvent registerwhoosh() {
		return Registry.register(Registry.SOUND_EVENT, CAPE_WHOOSH, CAPEWHOOSH);
	}
	static SoundEvent registerdefaultshout() {
		return Registry.register(Registry.SOUND_EVENT, DEFAULT_SHOUT, DEFAULTSHOUT);
	}
	static SoundEvent registerbirdshout() {
		return Registry.register(Registry.SOUND_EVENT, BIRD_SHOUT, BIRDSHOUT);
	}
}