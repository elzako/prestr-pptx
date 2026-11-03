package com.aspose.slides.internal.u6;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.e5.t2$n5;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;

public class a0 {
   private int n5;
   private com.aspose.slides.internal.r4.y4<List<List<c8>>> l6;
   private int k5 = 0;

   public a0(z1 var1, int var2) {
      this.n5 = var2;
      switch (var2) {
         case 0:
            List var3 = new List();
            t2$n5 var4 = var1.x8();

            while (var4.l6()) {
               com.aspose.slides.internal.e5.t2 var5 = var4.c8();
               if (com.aspose.slides.internal.v6g.k5.l6(var5, q0.class)) {
                  var3.addRange(((q0)var5).z7());
               }
            }

            this.l6 = new com.aspose.slides.internal.r4.u3<>(var3);
            break;
         case 1:
            this.l6 = new com.aspose.slides.internal.r4.u3<>(var1.a5().z7());
            break;
         case 2:
            this.l6 = new com.aspose.slides.internal.r4.u3<>(var1.h2().z7());
            break;
         default:
            throw new ArgumentException(d1.n5(new String[]{"Unrecognised TablePart: ", a3.l6(var2)}));
      }
   }

   public final a6[] n5() {
      if (!this.l6.l6()) {
         return null;
      }

      List var1 = this.l6.k5();
      a6[] var2 = new a6[var1.size()];
      int var3 = 0;
      com.aspose.slides.internal.r4.u3 var4 = new com.aspose.slides.internal.r4.u3(var1);

      while (var4.l6()) {
         List var5 = (List)var4.k5();
         var2[var3++] = new a6(this.k5++, this.n5, var5);
      }

      return var2;
   }
}
