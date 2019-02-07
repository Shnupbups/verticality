package space.chakat.verticality.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.math.BlockPos;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;
import space.chakat.verticality.IClimbable;
import space.chakat.verticality.blocks.BlockClimbableFence;

@Mixin(LivingEntity.class)
public class MixinLivingEntity {
  @Inject(
      method = "canClimb",
      at =
          @At(
              value = "INVOKE_ASSIGN",
              target = "Lnet/minecraft/block/BlockState;getBlock()Lnet/minecraft/block/Block;"),
      locals = LocalCapture.CAPTURE_FAILHARD,
      cancellable = true)
  public void onCanClimb(CallbackInfoReturnable<Boolean> cir, BlockState state, Block block) {
    LivingEntity thisEntity = (LivingEntity) (Object) this;
    BlockPos pos = new BlockPos(thisEntity);
    if (block instanceof IClimbable) {
      IClimbable climbable = (IClimbable) block;
      cir.setReturnValue(climbable.canClimb(thisEntity, state, thisEntity.getPos()));
    } else if ((thisEntity.world.getBlockState(pos.down()).getBlock()
            instanceof BlockClimbableFence)
        && (thisEntity.y - (long) thisEntity.y < 0.5)) {
      // I really don't like this elseif to make the fences work, and it feels abusable, still, and
      // makes this code feel uglier and more hacked-together. _sigh_
      cir.setReturnValue(true);
    }
  }
}
