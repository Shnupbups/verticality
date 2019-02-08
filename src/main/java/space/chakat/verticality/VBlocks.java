package space.chakat.verticality;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import space.chakat.verticality.block.ClimbableBarsBlock;
import space.chakat.verticality.block.ClimbableFenceBlock;

public final class VBlocks {
  public static final Block CLIMBABLE_BARS = new ClimbableBarsBlock(Blocks.IRON_BARS, 5.5F, 6.0F);
  public static final Block CLIMBABLE_OAK_FENCE = new ClimbableFenceBlock(Blocks.OAK_FENCE, 2.5F, 3.0F);
  public static final Block CLIMBABLE_SPRUCE_FENCE = new ClimbableFenceBlock(Blocks.SPRUCE_FENCE, 2.5F, 3.0F);
  public static final Block CLIMBABLE_BIRCH_FENCE = new ClimbableFenceBlock(Blocks.BIRCH_FENCE, 2.5F, 3.0F);
  public static final Block CLIMBABLE_JUNGLE_FENCE = new ClimbableFenceBlock(Blocks.JUNGLE_FENCE, 2.5F, 3.0F);
  public static final Block CLIMBABLE_ACACIA_FENCE = new ClimbableFenceBlock(Blocks.ACACIA_FENCE, 2.5F, 3.0F);
  public static final Block CLIMBABLE_DARK_OAK_FENCE = new ClimbableFenceBlock(Blocks.DARK_OAK_FENCE, 2.5F, 3.0F);
  public static final Block CLIMBABLE_NETHER_BRICK_FENCE = new ClimbableFenceBlock(Blocks.NETHER_BRICK_FENCE, 2.5F, 6.0F);

  private VBlocks() {
    throw new UnsupportedOperationException();
  }

  static void registerAll() {
    register("climbable_bars", CLIMBABLE_BARS);
    register("climbable_oak_fence", CLIMBABLE_OAK_FENCE);
    register("climbable_spruce_fence", CLIMBABLE_SPRUCE_FENCE);
    register("climbable_birch_fence", CLIMBABLE_BIRCH_FENCE);
    register("climbable_jungle_fence", CLIMBABLE_JUNGLE_FENCE);
    register("climbable_acacia_fence", CLIMBABLE_ACACIA_FENCE);
    register("climbable_dark_oak_fence", CLIMBABLE_DARK_OAK_FENCE);
    register("climbable_nether_brick_fence", CLIMBABLE_NETHER_BRICK_FENCE);
  }

  private static Block register(String id, Block block) {
    return Registry.BLOCK.register(new Identifier(Verticality.ID, id), block);
  }
}
