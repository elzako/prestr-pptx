package com.aspose.slides.internal.x7u;

import com.aspose.slides.internal.e3j.a6$n5;
import com.aspose.slides.internal.o9b.w1;

public class y4 extends n5 {
   private final boolean l6;
   private final com.aspose.slides.internal.e3j.h0 k5;

   public y4(boolean var1, com.aspose.slides.internal.e3j.h0 var2) {
      this.l6 = var1;
      this.k5 = var2;
   }

   @Override
   public boolean k5() {
      return true;
   }

   @Override
   public com.aspose.slides.internal.z3o.a6 l6(float var1, float var2) {
      com.aspose.slides.internal.z3o.a6 var3 = new com.aspose.slides.internal.z3o.a6();
      float var4 = var1 * var1 + var2 * var2;
      var3.n5 = 0.0F;
      var3.l6 = 0.0F;
      if (var4 == 0.0F) {
         var3.k5 = 0.0F;
         var3.u3 = 0.0F;
      } else {
         float[] var5 = this.k5.n5(var1, var2);
         float var6 = -var5[0];
         float var7 = -var5[1];
         a6$n5 var8 = com.aspose.slides.internal.e3j.a6.n5(new w1(0.0F, 0.0F), new w1(var1, var2), new w1(var6, var7));
         if (!this.l6) {
            if (var8 != a6$n5.n5) {
               var6 = -var6;
               var7 = -var7;
            }
         } else if (var8 != a6$n5.l6) {
            var6 = -var6;
            var7 = -var7;
         }

         var3.k5 = 2.0F * var6;
         var3.u3 = 2.0F * var7;
      }

      return var3;
   }
}
