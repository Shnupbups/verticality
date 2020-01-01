package space.chakat.verticality;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.impl.blockrenderlayer.BlockRenderLayerMapImpl;

import net.minecraft.client.render.RenderLayer;

public class VerticalityClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		BlockRenderLayerMapImpl.INSTANCE.putBlocks(RenderLayer.getCutoutMipped(), VBlocks.CLIMBABLE_BARS);
	}
}
