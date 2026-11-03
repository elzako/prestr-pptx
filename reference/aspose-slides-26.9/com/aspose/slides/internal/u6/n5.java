package com.aspose.slides.internal.u6;

import com.aspose.slides.internal.h2.t2$n5;
import com.aspose.slides.ms.System.d1;

public class n5 {
   private static n5 n5;
   private t2$n5 l6;
   private int k5;

   public n5(t2$n5 var1, int var2) {
      this.l6 = var1;
      this.k5 = var2;
   }

   public static n5 n5() {
      if (n5 == null) {
         n5 = new n5(com.aspose.slides.internal.h2.t2.k5(), 75);
      }

      return n5;
   }

   public final t2$n5 l6() {
      return this.l6;
   }

   public final int k5() {
      return this.k5;
   }

   @Override
   public String toString() {
      String var1 = d1.n5;
      switch (this.k5) {
         case 71:
            var1 = "table";
         case 72:
         case 74:
         default:
            break;
         case 73:
            var1 = "table-body";
            break;
         case 75:
            var1 = "table-cell";
            break;
         case 76:
            var1 = "table-column";
            break;
         case 77:
            var1 = "table-footer";
            break;
         case 78:
            var1 = "table-header";
            break;
         case 79:
            var1 = "table-row";
      }

      return d1.n5(new Object[]{"{", this.l6, ", ", var1, "}"});
   }
}
