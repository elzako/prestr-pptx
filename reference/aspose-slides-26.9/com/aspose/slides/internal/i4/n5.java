package com.aspose.slides.internal.i4;

import com.aspose.slides.exceptions.ArgumentException;

public class n5 extends u6 {
   @Override
   public g7 n5(w2 var1, y1 var2, g7[] var3) {
      u6 var4 = com.aspose.slides.internal.v6g.k5.n5(var2, u6.class);
      if (var4 == null) {
         throw new ArgumentException("the target of call() must be a function");
      }

      y1 var5;
      if (var3.length >= 1 && var3[0] != l5.n5 && var3[0] != y5.n5) {
         var5 = com.aspose.slides.internal.v6g.k5.n5(var3[0], y1.class);
      } else {
         var5 = com.aspose.slides.internal.v6g.k5.n5(var1.u3(), y1.class);
      }

      g7[] var7;
      if (var3.length >= 2 && var3[1] != y5.n5) {
         j4 var6 = com.aspose.slides.internal.v6g.k5.n5(var3[1], j4.class);
         if (var6 == null) {
            throw new n1(var1.u3().m3().u9("second argument must be an array"));
         }

         var7 = new g7[var6.k5()];

         for (int var8 = 0; var8 < var6.k5(); var8++) {
            var7[var8] = var6.n5(com.aspose.slides.ms.System.a3.l6(var8));
         }
      } else {
         var7 = g7.k5;
      }

      var1.n5(var4, var5, var7);
      return var1.t2();
   }

   public n5(t1 var1) {
      super(var1.z1());
      this.n5("length", var1.x8().w1().n5(2.0), 1);
   }
}
