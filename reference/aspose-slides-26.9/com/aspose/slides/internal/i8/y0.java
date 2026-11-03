package com.aspose.slides.internal.i8;

import com.aspose.slides.internal.i0.f5;
import com.aspose.slides.internal.i0.g7;
import com.aspose.slides.internal.i0.j3;
import com.aspose.slides.internal.i0.n1;
import com.aspose.slides.internal.i0.y8;

public class y0 extends e5 {
   public com.aspose.slides.internal.i0.f0 n5(com.aspose.slides.internal.z0k.n5 var1) {
      f5 var2 = new f5();
      var2.n5(var1.c4() & 4294967295L);
      y8 var3 = null;
      switch ((int)var2.l6()) {
         case 1:
            var3 = (j3)new p3(0).n5(var1);
            break;
         case 2:
            var3 = (j3)new p3(1).n5(var1);
            break;
         case 3:
            var3 = (j3)new p3(2).n5(var1);
            break;
         case 4:
            var3 = (j3)new p3(3).n5(var1);
            break;
         case 5:
            var3 = (j3)new p3(4).n5(var1);
            break;
         case 268435456:
            var3 = (g7)new v0().n5(var1);
            break;
         case 268435457:
            var3 = (n1)new x9().n5(var1);
         case 268435458:
         case 268435459:
      }

      var2.n5(var3);
      return var2;
   }
}
