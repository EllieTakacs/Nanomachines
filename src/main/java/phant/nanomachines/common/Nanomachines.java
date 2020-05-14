package phant.nanomachines.common;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import phant.nanomachines.common.lib.LibMisc;

@Mod(LibMisc.MOD_ID)
public class Nanomachines {
  public static Nanomachines instance;

  public Nanomachines() {
    instance = this;

    // Register ourselves for server and other game events we are
    // interested in
    MinecraftForge.EVENT_BUS.register(this);
  }
}
