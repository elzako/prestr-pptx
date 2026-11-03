package com.aspose.slides.internal.e6s;

import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.p8;

public class l6 {
   private boolean n5 = true;
   private boolean l6 = true;
   private k5 k5;
   private a5 u3 = new a5();

   public final boolean n5() {
      return this.n5;
   }

   public final String l6() {
      if (this.u3.l6() == 0) {
         if (this.n5()) {
            this.u3.n5("Identical");
         } else {
            this.u3.n5("Equal");
         }
      }

      return this.u3.toString();
   }

   public final void n5(a6 var1, k5 var2) {
      this.n5 = false;
      if (var2.n5()) {
         this.l6 = false;
      }

      this.k5 = var2;
      if (this.u3.l6() == 0) {
         this.u3.n5(var1.l6());
      }

      this.u3.n5(p8.k5()).n5(var2);
   }
}
