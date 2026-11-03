package com.aspose.slides.internal.i8;

import com.aspose.slides.internal.i0.c3;
import com.aspose.slides.internal.i0.d1;

public class s7 extends e5 {
   private final int n5;

   public s7(int var1) {
      this.n5 = var1;
   }

   public com.aspose.slides.internal.i0.f0 n5(com.aspose.slides.internal.z0k.n5 var1) {
      com.aspose.slides.internal.i0.z1 var2 = new com.aspose.slides.internal.i0.z1();
      var2.n5(com.aspose.slides.internal.b4.k5.n5(var1));
      var2.n5(var1.c4() & 4294967295L);
      int var3 = this.n5 - 8;
      com.aspose.slides.internal.i0.k5 var4;
      switch ((int)var2.l6()) {
         case 0:
            var4 = (d1)new e9().n5(var1);
            break;
         case 1:
            var4 = (com.aspose.slides.internal.i0.e5)new y2().n5(var1);
            break;
         case 2:
            var4 = (c3)new w2(var3).n5(var1);
            break;
         case 3:
            var4 = (com.aspose.slides.internal.i0.x9)new o0().n5(var1);
            break;
         case 4:
            var4 = (com.aspose.slides.internal.i0.a5)new p8().n5(var1);
            break;
         default:
            throw new com.aspose.slides.internal.p5.n5(
               com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown brush type: ", com.aspose.slides.ms.System.s3.n5(com.aspose.slides.internal.g8.k5.class, var2.l6())})
            );
      }

      var2.n5(var4);
      return var2;
   }
}
