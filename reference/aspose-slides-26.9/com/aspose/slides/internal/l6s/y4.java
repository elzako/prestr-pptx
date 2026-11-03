package com.aspose.slides.internal.l6s;

import com.aspose.slides.internal.e3j.a6$n5;
import com.aspose.slides.internal.o9b.w1;
import java.awt.geom.AffineTransform;

public class y4 extends k5 {
   public y4(float var1, AffineTransform var2) {
      super(var1, var2);
   }

   @Override
   protected void n5(
      com.aspose.slides.internal.t9z.k5 var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, boolean var10
   ) {
      w1 var11 = this.n5(var8, var9, var10);
      var1.n5(var2 + var4, var3 + var5);
      var1.l6(var2 + var11.l6(), var3 + var11.k5());
      var1.l6(var2 + var6, var3 + var7);
      var1.n5();
   }

   public void n5(com.aspose.slides.internal.k3w.u3 var1, com.aspose.slides.internal.z3o.u9 var2, a6$n5 var3) {
      this.n5(var1, var2.l6.l6(), var2.l6.k5(), var2.u3.l6(), var2.u3.k5(), false, true);
   }

   public void l6(com.aspose.slides.internal.k3w.u3 var1, com.aspose.slides.internal.z3o.u9 var2, a6$n5 var3) {
      this.n5(var1, var2.l6.l6(), var2.l6.k5(), var2.u3.l6(), var2.u3.k5(), true, false);
   }

   private void n5(com.aspose.slides.internal.k3w.u3 var1, float var2, float var3, float var4, float var5, boolean var6, boolean var7) {
      w1 var8 = this.n5(var4, var5, var6);
      if (var7) {
         var1.u3(var2 + var8.l6(), var3 + var8.k5());
      } else {
         var1.k5(var2 + var8.l6(), var3 + var8.k5());
      }
   }
}
