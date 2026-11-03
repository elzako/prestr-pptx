package com.aspose.slides.internal.l6s;

import com.aspose.slides.internal.e3j.a6$n5;

abstract class n5 implements com.aspose.slides.internal.w9n.n5 {
   @Override
   public void n5(com.aspose.slides.internal.t9z.k5 var1, com.aspose.slides.internal.z3o.u9 var2, a6$n5 var3) {
      if (var2.n5()) {
         for (com.aspose.slides.internal.z3o.u9 var6 : var2.l6()) {
            this.n5(var1, var2, var6);
         }
      } else {
         this.n5(var1, var2, var2);
      }
   }

   @Override
   public void l6(com.aspose.slides.internal.t9z.k5 var1, com.aspose.slides.internal.z3o.u9 var2, a6$n5 var3) {
      if (var2.n5()) {
         for (com.aspose.slides.internal.z3o.u9 var6 : var2.l6()) {
            this.l6(var1, var2, var6);
         }
      } else {
         this.l6(var1, var2, var2);
      }
   }

   private void n5(com.aspose.slides.internal.t9z.k5 var1, com.aspose.slides.internal.z3o.u9 var2, com.aspose.slides.internal.z3o.u9 var3) {
      this.n5(var1, var2.k5.k5, var2.k5.u3, var3.l6.l6(), var3.l6.k5(), var3.k5.k5, var3.k5.u3, var3.k5.n5, var3.k5.l6);
   }

   private void l6(com.aspose.slides.internal.t9z.k5 var1, com.aspose.slides.internal.z3o.u9 var2, com.aspose.slides.internal.z3o.u9 var3) {
      this.n5(var1, var2.k5.n5, var2.k5.l6, var3.l6.l6(), var3.l6.k5(), var3.k5.n5, var3.k5.l6, var3.k5.k5, var3.k5.u3);
   }

   protected abstract void n5(
      com.aspose.slides.internal.t9z.k5 var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9
   );
}
