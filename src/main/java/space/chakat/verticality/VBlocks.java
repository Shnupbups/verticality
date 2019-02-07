package space.chakat.verticality;

import net.fabricmc.fabric.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import space.chakat.verticality.blocks.BlockClimbableBars;
import space.chakat.verticality.blocks.BlockClimbableFence;

public class VBlocks {
  public final Block climbableBars;
  public final Block climbableOakFence;
  public final Block climbableSpruceFence;
  public final Block climbableBirchFence;
  public final Block climbableJungleFence;
  public final Block climbableAcaciaFence;
  public final Block climbableDarkOakFence;
  public final Block climbableNetherBrickFence;

  VBlocks(Verticality mod) {
    this.climbableBars =
        register(
            "climbable_bars",
            new BlockClimbableBars(
                FabricBlockSettings.of(Material.METAL, MaterialColor.AIR)
                    .sounds(BlockSoundGroup.METAL)
                    .strength(5.5f, 6.0f) // Slightly harder than vanilla bars.
                    .build()));
    this.climbableOakFence =
        register(
            "climbable_oak_fence",
            new BlockClimbableFence(
                FabricBlockSettings.of(Material.WOOD, MaterialColor.WOOD)
                    .strength(2.5f, 3.0f)
                    .sounds(BlockSoundGroup.WOOD)
                    .build()));
    this.climbableSpruceFence =
        register(
            "climbable_spruce_fence",
            new BlockClimbableFence(
                FabricBlockSettings.of(Material.WOOD, MaterialColor.SPRUCE)
                    .strength(2.5f, 3.0f)
                    .sounds(BlockSoundGroup.WOOD)
                    .build()));
    this.climbableBirchFence =
        register(
            "climbable_birch_fence",
            new BlockClimbableFence(
                FabricBlockSettings.of(Material.WOOD, MaterialColor.SAND)
                    .strength(2.5f, 3.0f)
                    .sounds(BlockSoundGroup.WOOD)
                    .build()));
    this.climbableJungleFence =
        register(
            "climbable_jungle_fence",
            new BlockClimbableFence(
                FabricBlockSettings.of(Material.WOOD, MaterialColor.DIRT)
                    .strength(2.5f, 3.0f)
                    .sounds(BlockSoundGroup.WOOD)
                    .build()));
    this.climbableAcaciaFence =
        register(
            "climbable_acacia_fence",
            new BlockClimbableFence(
                FabricBlockSettings.of(Material.WOOD, MaterialColor.ORANGE)
                    .strength(2.5f, 3.0f)
                    .sounds(BlockSoundGroup.WOOD)
                    .build()));
    this.climbableDarkOakFence =
        register(
            "climbable_dark_oak_fence",
            new BlockClimbableFence(
                FabricBlockSettings.of(Material.WOOD, MaterialColor.BROWN)
                    .strength(2.5f, 3.0f)
                    .sounds(BlockSoundGroup.WOOD)
                    .build()));
    this.climbableNetherBrickFence =
        register(
            "climbable_nether_brick_fence",
            new BlockClimbableFence(
                FabricBlockSettings.of(Material.STONE, MaterialColor.NETHER)
                    .strength(2.5f, 6.0f)
                    .build()));
  }

  private static Block register(String id, Block block) {
    return Registry.BLOCK.register(new Identifier(Verticality.ID, id), block);
  }
}
