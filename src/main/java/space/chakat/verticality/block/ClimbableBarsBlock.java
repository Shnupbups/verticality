package space.chakat.verticality.block;

import net.minecraft.block.Block;
import net.minecraft.block.PaneBlock;
import space.chakat.verticality.Climbable;

public class ClimbableBarsBlock extends PaneBlock implements Climbable {
  public ClimbableBarsBlock(Settings settings) {
    super(settings);
  }

  public ClimbableBarsBlock(Block type) {
    this(Settings.copy(type));
  }
}
