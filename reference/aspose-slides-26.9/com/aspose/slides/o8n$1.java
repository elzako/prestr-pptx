package com.aspose.slides;

final class o8n$1 extends com.aspose.slides.ms.System.z1<IGradientStopEffectiveData> {
   public int n5(IGradientStopEffectiveData var1, IGradientStopEffectiveData var2) {
      return var1.getPosition() - var2.getPosition() < 0.0F ? -1 : (var1.getPosition() - var2.getPosition() > 0.0F ? 1 : 0);
   }
}
