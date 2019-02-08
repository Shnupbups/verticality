package space.chakat.verticality;

import net.minecraft.block.Block;
import net.minecraft.block.Block.Settings;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import space.chakat.verticality.block.ClimbableBarsBlock;
import space.chakat.verticality.block.ClimbableFenceBlock;

public final class VBlocks {
  public static final Block climbableBars =
      new ClimbableBarsBlock(Settings.copy(Blocks.IRON_BARS).strength(5.5f, 6.0f));
  public static final Block climbableOakFence =
      new ClimbableFenceBlock(Settings.copy(Blocks.OAK_FENCE).strength(2.5f, 3.0f));
  public static final Block climbableSpruceFence =
      new ClimbableFenceBlock(Settings.copy(Blocks.SPRUCE_FENCE).strength(2.5f, 3.0f));
  public static final Block climbableBirchFence =
      new ClimbableFenceBlock(Settings.copy(Blocks.BIRCH_FENCE).strength(2.5f, 3.0f));
  public static final Block climbableJungleFence =
      new ClimbableFenceBlock(Settings.copy(Blocks.JUNGLE_FENCE).strength(2.5f, 3.0f));
  public static final Block climbableAcaciaFence =
      new ClimbableFenceBlock(Settings.copy(Blocks.ACACIA_FENCE).strength(2.5f, 3.0f));
  public static final Block climbableDarkOakFence =
      new ClimbableFenceBlock(Settings.copy(Blocks.DARK_OAK_FENCE).strength(2.5f, 3.0f));
  public static final Block climbableNetherBrickFence =
      new ClimbableFenceBlock(Settings.copy(Blocks.NETHER_BRICK_FENCE).strength(2.5f, 6.0f));

  private VBlocks() {
    throw new UnsupportedOperationException();
  }

  static void registerAll() {
    register("climbable_bars", climbableBars);
    register("climbable_oak_fence", climbableOakFence);
    register("climbable_spruce_fence", climbableSpruceFence);
    register("climbable_birch_fence", climbableBirchFence);
    register("climbable_jungle_fence", climbableJungleFence);
    register("climbable_acacia_fence", climbableAcaciaFence);
    register("climbable_dark_oak_fence", climbableDarkOakFence);
    register("climbable_nether_brick_fence", climbableNetherBrickFence);
  }

  private static Block register(String id, Block block) {
    return Registry.BLOCK.register(new Identifier(Verticality.ID, id), block);
  }
}
