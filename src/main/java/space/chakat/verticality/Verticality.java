package space.chakat.verticality;

import net.fabricmc.api.ModInitializer;

public class Verticality implements ModInitializer {

  public static final String ID = "verticality";
  public static final String NAME = "Verticality";

  @Override
  public void onInitialize() {
    VBlocks.registerAll();
    VItems.registerAll();
  }
}
