package com.aspose.slides.internal.d8v;

import com.aspose.slides.internal.b5j.n3;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.internal.o9b.y1;

public class l6 extends com.aspose.slides.internal.d0e.a6 implements com.aspose.slides.internal.d0e.n5 {
   public l6() {
      this.u9 = "g";
   }

   @Override
   public final y1 n5(n3 var1, f2 var2) {
      y1 var3 = new y1();

      for (int var4 = 0; var4 < this.j5().n5(); var4++) {
         com.aspose.slides.internal.d0e.n5 var5 = com.aspose.slides.internal.v6g.k5.n5(this.j5().l6(var4), com.aspose.slides.internal.d0e.n5.class);
         if (var5 != null) {
            y1 var6 = var5.n5(var1, var2.a6()).y4();
            if (!var3.u3() || !var6.u3()) {
               if (var3.u3()) {
                  var6.a6(var3);
               } else if (!var6.u3()) {
                  y1.l6(var3.y4(), var6.y4()).a6(var3);
               }
            }
         }
      }

      return var3;
   }
}
