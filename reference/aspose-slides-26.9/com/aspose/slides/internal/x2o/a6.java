package com.aspose.slides.internal.x2o;

import com.aspose.slides.internal.e3j.a6$n5;
import com.aspose.slides.internal.z3o.u9;

public class a6 implements n5 {
   @Override
   public void n5(com.aspose.slides.internal.t9z.k5 var1, u9 var2, a6$n5 var3) {
      this.n5(var1, var2.l6.l6(), var2.l6.k5(), -var2.k5.n5, -var2.k5.l6, -var2.k5.k5, -var2.k5.u3);
   }

   @Override
   public void l6(com.aspose.slides.internal.t9z.k5 var1, u9 var2, a6$n5 var3) {
      this.n5(var1, var2.l6.l6(), var2.l6.k5(), var2.k5.n5, var2.k5.l6, var2.k5.k5, var2.k5.u3);
   }

   @Override
   public void n5(com.aspose.slides.internal.k3w.u3 var1, u9 var2, a6$n5 var3) {
      this.n5(var1, var2.l6.l6(), var2.l6.k5(), -var2.k5.n5, -var2.k5.l6, true);
   }

   @Override
   public void l6(com.aspose.slides.internal.k3w.u3 var1, u9 var2, a6$n5 var3) {
      this.n5(var1, var2.l6.l6(), var2.l6.k5(), var2.k5.n5, var2.k5.l6, false);
   }

   private void n5(com.aspose.slides.internal.t9z.k5 var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      var1.n5(var2 + var4, var3 + var5);
      var1.l6(var2 - var5, var3 + var4);
      var1.l6(var2 + var6, var3 + var7);
      var1.n5();
   }

   private void n5(com.aspose.slides.internal.k3w.u3 var1, float var2, float var3, float var4, float var5, boolean var6) {
      if (var6) {
         var1.u3(var2 - var5, var3 + var4);
      } else {
         var1.k5(var2 - var5, var3 + var4);
      }
   }
}
