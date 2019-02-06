package space.chakat.verticality;

import net.fabricmc.fabric.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.MaterialColor;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import space.chakat.verticality.blocks.BlockClimbableBars;

public class VBlocks {
  public final Block climbableBars;

  VBlocks(Verticality mod) {
    this.climbableBars =
        register(
            "climbable_bars",
            new BlockClimbableBars(
                FabricBlockSettings.of(Material.METAL, MaterialColor.AIR)
                    .sounds(BlockSoundGroup.METAL)
                    .strength(5.5f, 6.0f) // Slightly harder than vanilla bars.
                    .build()));
  }

  private static Block register(String id, Block block) {
    return Registry.BLOCK.register(new Identifier(Verticality.ID, id), block);
  }
}
