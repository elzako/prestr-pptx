package com.aspose.slides.internal.u0b;

import com.aspose.slides.ms.System.d1;

public class s7 {
   private final int n5;

   public s7(int var1) {
      this.n5 = var1;
   }

   public final com.aspose.slides.internal.f4l.t9 n5(com.aspose.slides.internal.z0k.n5 var1) {
      com.aspose.slides.internal.f4l.t9 var2 = new com.aspose.slides.internal.f4l.t9();
      var2.n5(y2.n5(var1));
      var2.n5(var1.m3());
      int var3 = this.n5 - 8;
      com.aspose.slides.internal.f4l.l6 var4;
      switch (var2.l6()) {
         case 0:
            var4 = j8.n5(var1);
            break;
         case 1:
            var4 = y1.n5(var1);
            break;
         case 2:
            var4 = new v8(var3).n5(var1);
            break;
         case 3:
            var4 = o0.n5(var1);
            break;
         case 4:
            var4 = f2.n5(var1);
            break;
         default:
            throw new com.aspose.slides.internal.e2o.n5(
               d1.n5(new String[]{"Unknown brush type: ", com.aspose.slides.ms.System.d5.getName(com.aspose.slides.internal.j3z.k5.class, var2.l6())})
            );
      }

      var2.n5(var4);
      return var2;
   }
}
