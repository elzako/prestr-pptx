package com.aspose.slides.internal.q4o;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.o2b.m3;
import com.aspose.slides.internal.o2b.q0;
import com.aspose.slides.internal.o2b.t9;
import com.aspose.slides.internal.o2b.y4;
import com.aspose.slides.internal.o2b.z8;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.f0;

public class n5 {
   public static z8 n5(com.aspose.slides.internal.f2i.n5 var0, f0 var1, y2 var2) {
      if (var0 == null) {
         throw new ArgumentNullException("options");
      }

      z8 var3 = new m3(var1, var0, var2.n3());
      if (var0.x8() == 0) {
         int var4 = com.aspose.slides.internal.k7m.n5.n5(var0);
         switch (var4) {
            case 1:
               var3 = new com.aspose.slides.internal.o2b.n5(var1, var0, var2.n3());
               break;
            case 2:
               var3 = new y4(var1, var0, var2.n3());
               break;
            case 3:
               var3 = new t9(var1, var0, var2.n3());
               break;
            case 4:
               var3 = new q0(var1, var0, var2.n3());
         }
      }

      return var3;
   }
}
