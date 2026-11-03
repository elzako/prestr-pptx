package com.aspose.slides.internal.k6r;

import com.aspose.slides.internal.o9b.i1;
import com.aspose.slides.internal.o9b.u6;
import com.aspose.slides.internal.r5w.x8;
import com.aspose.slides.internal.x4g.m3;
import com.aspose.slides.internal.x4g.z3;
import java.awt.Rectangle;

public class a6 {
   public static u3 n5(k5 var0) {
      x8 var1 = var0.n5;
      com.aspose.slides.internal.o9b.u3 var2 = var0.u3;
      if (var2 instanceof i1) {
         return new h0();
      }

      if (var2 instanceof m3) {
         return new u9();
      }

      if (var1.c4()) {
         return new l6();
      }

      if (var2 instanceof u6) {
         u6 var3 = (u6)var2;
         if (var3.t2() == 4) {
            return new c8();
         }
      }

      if (var2 instanceof z3) {
         Rectangle var4 = var0.h0.getBounds();
         if (var4.getWidth() * var4.getHeight() > 1048576.0) {
            return new l6();
         }
      }

      return new n5();
   }
}
