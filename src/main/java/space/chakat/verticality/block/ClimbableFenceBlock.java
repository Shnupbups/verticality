package space.chakat.verticality.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.FenceBlock;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import space.chakat.verticality.Climbable;

public class ClimbableFenceBlock extends FenceBlock implements Climbable {
  public ClimbableFenceBlock(Settings settings) {
    super(settings);
  }

  @Override
  public boolean canClimb(LivingEntity entity, BlockState state, BlockPos position) {
    return true;
  }
}
