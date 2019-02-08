package space.chakat.verticality.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.PaneBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import space.chakat.verticality.Climbable;

public class ClimbableBarsBlock extends PaneBlock implements Climbable {
  public ClimbableBarsBlock(Settings settings) {
    super(settings);
  }

  @Override
  public boolean canClimb(LivingEntity entity, BlockState state, BlockPos position) {
    return true;
  }
}
