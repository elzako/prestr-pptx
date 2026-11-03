package com.aspose.slides.internal.u0b;

import com.aspose.slides.internal.f4l.d1;

class v3 {
   private final int n5;
   private final int l6;

   public v3(int var1, int var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   public final d1 n5(com.aspose.slides.internal.z0k.n5 var1) {
      long var2 = var1.x8().getPosition();
      d1 var4 = new d1();
      if ((this.n5 & 2) > 0) {
         var4.n5(j4.n5(var1));
      }

      int var5 = this.l6 - (int)(var1.x8().getPosition() - var2);
      if (var5 > 24) {
         var4.n5(new d5(null, var5, var5).n5(var1));
      }

      return var4;
   }
}
