package com.aspose.slides.internal.n9;

import com.aspose.slides.internal.b9.s9;
import com.aspose.slides.internal.b9.v4;
import com.aspose.slides.internal.o9b.a0;
import com.aspose.slides.internal.x4g.m1;

public class l6 extends com.aspose.slides.internal.r6.u3 {
   @Override
   protected void u3(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      u9(var1, var2);
   }

   public static void u9(s9 var0, com.aspose.slides.internal.r6.u9 var1) {
      v4 var2 = (v4)var0;
      if (var2.k5() != null) {
         a0 var3 = var2.k5().k5();
         m1 var4 = var1.l6();
         var3.l6(var4);
         switch ((int)var2.l6()) {
            case 1:
               var1.v0().k5(var3);
               break;
            case 2:
               var1.v0().u3(var3);
               break;
            case 3:
               var1.v0().a6(var3);
               break;
            case 4:
               var1.v0().l6(var3);
               break;
            case 5:
               var1.k5(var3);
         }
      } else if (var2.l6() == 5L) {
         var1.j9();
      }
   }
}
