package space.chakat.verticality.block;

import net.fabricmc.fabric.api.block.FabricBlockSettings;

import net.minecraft.block.Block;
import net.minecraft.block.FenceBlock;
import space.chakat.verticality.Climbable;

public class ClimbableFenceBlock extends FenceBlock implements Climbable {
  public ClimbableFenceBlock(Settings settings) {
    super(settings);
  }

  public ClimbableFenceBlock(Block type, float hardness, float resistance) {
    this(FabricBlockSettings.copy(type).strength(hardness, resistance).build());
  }
}
