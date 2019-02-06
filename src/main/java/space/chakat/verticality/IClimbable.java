package space.chakat.verticality;

import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;

public interface IClimbable {

  /** If the block is climbable.
   * @param entity The entity to check for climbing.
   * @param state The state of the block.
   * @param position The position of the block.
   * @return If the entity can climb.
   */
  boolean canClimb(LivingEntity entity, BlockState state, BlockPos position);
}
