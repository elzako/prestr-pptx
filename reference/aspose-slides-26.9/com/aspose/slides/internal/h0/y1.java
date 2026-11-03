package com.aspose.slides.internal.h0;

public class y1 extends l6 {
   private com.aspose.slides.internal.y4.z1 n5;

   public y1(com.aspose.slides.internal.y4.z1 var1, h0 var2) {
      super(var2);
      this.n5 = var1;
      int var3 = var2.a6();

      for (int var4 = 0; var4 < var3; var4++) {
         com.aspose.slides.internal.k5.u9 var5 = var1.n5(var4);
         if (var5 != null) {
            boolean var6 = var1.l6(var4);
            this.n5(var4, var5, var6);
         }
      }
   }

   @Override
   public void n5(int var1, com.aspose.slides.internal.k5.u9 var2, boolean var3) {
      super.n5(var1, var2, var3);
      this.n5.l6(var1, false);
   }
}
