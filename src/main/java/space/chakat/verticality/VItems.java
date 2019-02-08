package space.chakat.verticality;

import net.minecraft.item.Item;
import net.minecraft.item.Item.Settings;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.block.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public final class VItems {
  private static final Settings set = new Settings().itemGroup(ItemGroup.DECORATIONS);
  public static final Item climbableBars = new BlockItem(VBlocks.climbableBars, set);
  public static final Item climbableOakFence = new BlockItem(VBlocks.climbableOakFence, set);
  public static final Item climbableSpruceFence = new BlockItem(VBlocks.climbableSpruceFence, set);
  public static final Item climbableBirchFence = new BlockItem(VBlocks.climbableBirchFence, set);
  public static final Item climbableJungleFence = new BlockItem(VBlocks.climbableJungleFence, set);
  public static final Item climbableAcaciaFence = new BlockItem(VBlocks.climbableAcaciaFence, set);
  public static final Item climbableDarkOakFence =
      new BlockItem(VBlocks.climbableDarkOakFence, set);
  public static final Item climbableNetherBrickFence =
      new BlockItem(VBlocks.climbableNetherBrickFence, set);

  private VItems() {
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

  private static Item register(String id, Item item) {
    return Registry.ITEM.register(new Identifier(Verticality.ID, id), item);
  }
}
