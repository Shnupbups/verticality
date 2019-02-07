package space.chakat.verticality;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.Item.Settings;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.block.BlockItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class VItems {
  public final Item climbableBars;
  public final Item climbableOakFence;
  public final Item climbableSpruceFence;
  public final Item climbableBirchFence;
  public final Item climbableJungleFence;
  public final Item climbableAcaciaFence;
  public final Item climbableDarkOakFence;
  public final Item climbableNetherBrickFence;

  VItems(Verticality mod) {
    // Assumes mod.blocks is already initialized.
    this.climbableBars =
        register(
            "climbable_bars",
            mod.blocks.climbableBars,
            new Settings().itemGroup(ItemGroup.DECORATIONS));
    this.climbableOakFence =
        register(
            "climbable_oak_fence",
            mod.blocks.climbableOakFence,
            new Settings().itemGroup(ItemGroup.DECORATIONS));
    this.climbableSpruceFence =
        register(
            "climbable_spruce_fence",
            mod.blocks.climbableSpruceFence,
            new Settings().itemGroup(ItemGroup.DECORATIONS));
    this.climbableBirchFence =
        register(
            "climbable_birch_fence",
            mod.blocks.climbableBirchFence,
            new Settings().itemGroup(ItemGroup.DECORATIONS));
    this.climbableJungleFence =
        register(
            "climbable_jungle_fence",
            mod.blocks.climbableJungleFence,
            new Settings().itemGroup(ItemGroup.DECORATIONS));
    this.climbableAcaciaFence =
        register(
            "climbable_acacia_fence",
            mod.blocks.climbableAcaciaFence,
            new Settings().itemGroup(ItemGroup.DECORATIONS));
    this.climbableDarkOakFence =
        register(
            "climbable_dark_oak_fence",
            mod.blocks.climbableDarkOakFence,
            new Settings().itemGroup(ItemGroup.DECORATIONS));
    this.climbableNetherBrickFence =
        register(
            "climbable_nether_brick_fence",
            mod.blocks.climbableNetherBrickFence,
            new Settings().itemGroup(ItemGroup.DECORATIONS));
  }

  private static Item register(String id, Block block, Settings settings) {
    return Registry.ITEM.register(
        new Identifier(Verticality.ID, id), new BlockItem(block, settings));
  }
}
