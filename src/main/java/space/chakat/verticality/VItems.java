package space.chakat.verticality;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Settings;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public final class VItems {
  public static final Item CLIMBABLE_BARS = newBlockItem(VBlocks.CLIMBABLE_BARS);
  public static final Item CLIMBABLE_OAK_FENCE = newBlockItem(VBlocks.CLIMBABLE_OAK_FENCE);
  public static final Item CLIMBABLE_SPRUCE_FENCE = newBlockItem(VBlocks.CLIMBABLE_SPRUCE_FENCE);
  public static final Item CLIMBABLE_BIRCH_FENCE = newBlockItem(VBlocks.CLIMBABLE_BIRCH_FENCE);
  public static final Item CLIMBABLE_JUNGLE_FENCE = newBlockItem(VBlocks.CLIMBABLE_JUNGLE_FENCE);
  public static final Item CLIMBABLE_ACACIA_FENCE = newBlockItem(VBlocks.CLIMBABLE_ACACIA_FENCE);
  public static final Item CLIMBABLE_DARK_OAK_FENCE = newBlockItem(VBlocks.CLIMBABLE_DARK_OAK_FENCE);
  public static final Item CLIMBABLE_NETHER_BRICK_FENCE = newBlockItem(VBlocks.CLIMBABLE_NETHER_BRICK_FENCE);

  private VItems() {
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

  private static Item register(String id, Item item) {
    return Registry.register(Registry.ITEM, new Identifier(Verticality.ID, id), item);
  }

  private static Item newBlockItem(Block block) {
    return new BlockItem(block, new Settings().group(ItemGroup.DECORATIONS));
  }
}
