package com.aspose.slides;

final class n7p$2 extends com.aspose.slides.ms.System.z1<IShape> {
   public int n5(IShape var1, IShape var2) {
      float var3 = var1.getY() + var1.getHeight() / 2.0F;
      float var4 = var2.getY() + var2.getHeight() / 2.0F;
      if (var3 < var4) {
         return -1;
      } else {
         return var3 > var4 ? 1 : 0;
      }
   }
}
