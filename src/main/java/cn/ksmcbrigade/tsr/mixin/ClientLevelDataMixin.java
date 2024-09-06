package cn.ksmcbrigade.tsr.mixin;

import cn.ksmcbrigade.tsr.TimeUtil;
import net.minecraft.client.multiplayer.ClientLevel;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ClientLevel.ClientLevelData.class)
public class ClientLevelDataMixin {
    @Inject(method = "getDayTime",at = @At("HEAD"),cancellable = true)
    public void time(CallbackInfoReturnable<Long> cir){
        cir.setReturnValue(TimeUtil.getMinecraftTime());
    }
}
