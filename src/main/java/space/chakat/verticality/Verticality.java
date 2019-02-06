package space.chakat.verticality;

import net.fabricmc.api.ModInitializer;

public class Verticality implements ModInitializer {

  public VBlocks blocks;
  public VItems items;

  public static final String ID = "verticality";
  public static final String NAME = "Verticality";

  @Override
  public void onInitialize() {
    // This code runs as soon as Minecraft is in a mod-load-ready state.
    // However, some things (like resources) may still be uninitialized.
    // Proceed with mild caution.

    System.out.println("Hello Fabric world!");

    this.blocks = new VBlocks(this);
    this.items = new VItems(this);
  }
}
