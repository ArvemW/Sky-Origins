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
	public static final Identifier CRAB_SHOUT = new Identifier("sky:player.crab");
    public static SoundEvent CRABSHOUT = new SoundEvent(CRAB_SHOUT);
	public static final Identifier GHOST_SHOUT = new Identifier("sky:player.ghost");
    public static SoundEvent GHOSTSHOUT = new SoundEvent(GHOST_SHOUT);
	public static final Identifier WHALE_SHOUT = new Identifier("sky:player.whale");
    public static SoundEvent WHALESHOUT = new SoundEvent(WHALE_SHOUT);
	public static final Identifier JELLY_SHOUT = new Identifier("sky:player.jelly");
    public static SoundEvent JELLYSHOUT = new SoundEvent(JELLY_SHOUT);
	public static final Identifier MANTA_SHOUT = new Identifier("sky:player.manta");
    public static SoundEvent MANTASHOUT = new SoundEvent(MANTA_SHOUT);
	public static final Identifier BEAT_SLOW = new Identifier("sky:player.beatslow");
    public static SoundEvent BEATSLOW = new SoundEvent(BEAT_SLOW);
	public static final Identifier BEAT_MID = new Identifier("sky:player.beatmid");
    public static SoundEvent BEATMID = new SoundEvent(BEAT_MID);
	public static final Identifier BEAT_FAST = new Identifier("sky:player.beatfast");
    public static SoundEvent BEATFAST = new SoundEvent(BEAT_FAST);

	static SoundEvent registerflap() {
		return Registry.register(Registry.SOUND_EVENT, CAPE_FLAP, CAPEFLAP);
	}
	static SoundEvent registerboost() {
		return Registry.register(Registry.SOUND_EVENT, CAPE_BOOST, CAPEBOOST);
	}
	static SoundEvent registerwhoosh() {
		return Registry.register(Registry.SOUND_EVENT, CAPE_WHOOSH, CAPEWHOOSH);
	}
	static SoundEvent registerbeatslow() {
		return Registry.register(Registry.SOUND_EVENT, BEAT_SLOW, BEATSLOW);
	}
	static SoundEvent registerbeatmid() {
		return Registry.register(Registry.SOUND_EVENT, BEAT_MID, BEATMID);
	}
	static SoundEvent registerbeatfast() {
		return Registry.register(Registry.SOUND_EVENT, BEAT_FAST, BEATFAST);
	}
	static SoundEvent registerdefaultshout() {
		return Registry.register(Registry.SOUND_EVENT, DEFAULT_SHOUT, DEFAULTSHOUT);
	}
	static SoundEvent registerbirdshout() {
		return Registry.register(Registry.SOUND_EVENT, BIRD_SHOUT, BIRDSHOUT);
	}
	static SoundEvent registercrabshout() {
		return Registry.register(Registry.SOUND_EVENT, CRAB_SHOUT, CRABSHOUT);
	}
	static SoundEvent registerghostshout() {
		return Registry.register(Registry.SOUND_EVENT, GHOST_SHOUT, GHOSTSHOUT);
	}
	static SoundEvent registerwhaleshout() {
		return Registry.register(Registry.SOUND_EVENT, WHALE_SHOUT, WHALESHOUT);
	}
	static SoundEvent registerjellyshout() {
		return Registry.register(Registry.SOUND_EVENT, JELLY_SHOUT, JELLYSHOUT);
	}
	static SoundEvent registermantashout() {
		return Registry.register(Registry.SOUND_EVENT, MANTA_SHOUT, MANTASHOUT);
	}
}