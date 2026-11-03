package com.aspose.slides.internal.n9;

import com.aspose.slides.internal.b9.i4;
import com.aspose.slides.internal.b9.s9;
import com.aspose.slides.internal.n2d.y4;
import com.aspose.slides.internal.o9b.a0;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.internal.x4g.m1;

public class a6 extends com.aspose.slides.internal.r6.u3 {
   @Override
   protected void u3(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      u9(var1, var2);
   }

   public static void u9(s9 var0, com.aspose.slides.internal.r6.u9 var1) {
      i4 var2 = (i4)var0;
      if (var1.t9() != null) {
         m1 var3 = var1.l6();
         var3.l6(var1.x9());
         y1 var4 = var1.t9().s7().y4();
         if (var4.s7() >= 2.1474836E9F || var4.k5() >= 2.1474836E9F) {
            return;
         }

         a0 var5 = y4.n5(var1.t9(), var3);
         switch ((int)var2.n5()) {
            case 1:
               z1 var6 = z1.n5(var1.z7());
               a0 var7 = y4.n5(var6, var1.v0(), var5);
               var1.k5(var7);
               break;
            case 2:
               var1.v0().u3(var5);
               break;
            case 3:
               var1.v0().a6(var5);
               break;
            case 4:
               var1.v0().l6(var5);
               break;
            case 5:
               var1.k5(var5);
         }
      }
   }
}
