package com.aspose.slides.internal.u0b;

import com.aspose.slides.ms.System.d1;

public class d5 {
   private final com.aspose.slides.internal.f4l.b3 n5;
   private final int l6;
   private final int k5;

   public d5(com.aspose.slides.internal.f4l.b3 var1, int var2, int var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   public final com.aspose.slides.internal.f4l.b3 n5(com.aspose.slides.internal.z0k.n5 var1) {
      com.aspose.slides.internal.f4l.b3 var2;
      com.aspose.slides.internal.f4l.k5 var3;
      int var4;
      int var5;
      if (this.n5 == null) {
         var2 = new com.aspose.slides.internal.f4l.b3();
         var2.n5(y2.n5(var1));
         var2.n5(var1.m3());
         var3 = null;
         var4 = this.l6 - 8;
         var5 = this.k5 - 8;
      } else {
         var2 = this.n5;
         var3 = this.n5.n5();
         var4 = this.l6;
         var5 = this.l6;
      }

      com.aspose.slides.internal.f4l.k5 var6;
      switch (var2.l6()) {
         case 0:
            var6 = null;
            var1.x8().seek(var4, 1);
            break;
         case 1:
            var6 = new k5((com.aspose.slides.internal.f4l.a6)var3, var4, var5).n5(var1);
            break;
         case 2:
            var6 = new e5((com.aspose.slides.internal.f4l.h2)var3, var4, var5).n5(var1);
            break;
         default:
            throw new com.aspose.slides.internal.e2o.n5(
               d1.n5(new String[]{"Unknown image data type: ", com.aspose.slides.ms.System.d5.getName(com.aspose.slides.internal.j3z.a6.class, var2.l6())})
            );
      }

      var2.n5(var6);
      return var2;
   }
}
