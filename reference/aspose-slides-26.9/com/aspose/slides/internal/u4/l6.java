package com.aspose.slides.internal.u4;

import com.aspose.slides.exceptions.KeyNotFoundException;
import com.aspose.slides.internal.t9.u3;
import com.aspose.slides.ms.System.d1;

public class l6 {
   private final u3 n5;
   private final com.aspose.slides.internal.w5.k5 l6;

   public l6(com.aspose.slides.internal.w5.k5 var1) {
      this.l6 = var1;
      this.n5 = var1.a3();
   }

   public final u3 n5() {
      return this.n5;
   }

   private static float n5(int var0) {
      switch (var0) {
         case 0:
         case 1:
            return 7.5F;
         case 2:
            return 10.0F;
         case 3:
            return 14.0F;
         case 4:
            return 16.0F;
         case 5:
            return 18.0F;
         case 6:
            return 24.0F;
         case 7:
            return 36.0F;
         default:
            throw new KeyNotFoundException();
      }
   }

   public final int l6() {
      byte var1;
      if (this.n5().r4().u3() != 1 && this.n5().r4().u3() != 2) {
         var1 = 0;
      } else {
         var1 = 2;
      }

      if (this.n5().e9().n5() == 1) {
         var1 |= 4;
      }

      if (this.n5().e9().n5() == 4) {
         var1 |= 8;
      }

      if (this.n5().r4().u9().h0() >= 700) {
         var1 |= 1;
      }

      return var1;
   }

   public final float k5() {
      if (this.n5().r4().l6().c8()) {
         return n5(this.n5().r4().l6().h0());
      }

      float var1 = 16.0F;
      float[] var2 = new float[]{16.0F};
      boolean var3 = com.aspose.slides.internal.w3.u3.n5(this.n5().r4().l6().toString(), var2, 16.0F, this.l6);
      var1 = var2[0];
      return var3 ? var1 : 14.0F;
   }

   public final String u3() {
      if (this.n5.r4().n5().size() == 0) {
         return "Times New Roman";
      }

      String[] var1 = new String[this.n5().r4().n5().size()];
      this.n5().r4().n5().copyToTArray(var1, 0);
      return d1.u9(d1.n5(",", var1));
   }
}
