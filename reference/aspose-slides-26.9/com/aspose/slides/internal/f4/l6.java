package com.aspose.slides.internal.f4;

import com.aspose.slides.internal.j3.z3;
import com.aspose.slides.internal.o9b.y1;

public final class l6 {
   private z3 n5;
   private n5 l6;
   private l6 k5;
   private y1 u3 = new y1();

   public l6(z3 var1, y1 var2, n5 var3) {
      this.n5 = var1;
      this.l6 = var3;
      var2.a6(this.u3);
   }

   public final l6 n5() {
      if (this.k5 == null) {
         z3 var1 = this.n5;

         while (var1.a5() != null && var1.a5().n3() == 1) {
            var1 = (com.aspose.slides.internal.h6.n5)var1.a5();
            y1 var2 = y1.n5.y4();
            y1[] var3 = new y1[]{var2};
            boolean var4 = this.l6.n5(var1, 0, var3);
            var3[0].a6(var2);
            if (var4) {
               this.k5 = new l6(var1, var2.y4(), this.l6);
               break;
            }
         }
      }

      return this.k5;
   }

   public final z3 l6() {
      return this.n5;
   }

   public final y1 k5() {
      return this.u3;
   }
}
