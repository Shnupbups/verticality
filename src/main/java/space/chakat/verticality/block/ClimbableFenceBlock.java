package space.chakat.verticality.block;

import net.minecraft.block.Block;
import net.minecraft.block.FenceBlock;
import space.chakat.verticality.Climbable;

public class ClimbableFenceBlock extends FenceBlock implements Climbable {
  public ClimbableFenceBlock(Settings settings) {
    super(settings);
  }

  public ClimbableFenceBlock(Block type) {
    this(Settings.copy(type));
  }
}
