package com.aspose.slides.internal.j5;

import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.v6g.k5;
import com.aspose.slides.internal.w1.l6;
import com.aspose.slides.ms.System.a3;

public class n5 {
   private boolean n5;
   private boolean l6;
   private boolean k5;
   private int u3;
   private int a6;

   public static n5 n5(String var0) {
      n5 var1 = new n5();
      l6 var2 = new l6(var0);

      try {
         int var3 = 0;
         boolean var4 = false;
         int var5 = 1;
         switch (var3 = var2.u3()) {
            case 1:
               var4 = true;
               var5 = 1;
               var3 = var2.u3();
               break;
            case 2:
               var4 = true;
               var5 = -1;
               var3 = var2.u3();
            case 3:
            case 4:
            default:
               break;
            case 5:
               return n5("2n+1");
            case 6:
               return n5("2n");
         }

         if (var3 == 3) {
            var4 = true;
            var5 *= a3.n5(var2.k5());
            var3 = var2.u3();
         }

         if (var3 == -1) {
            var1.a6 = var5;
            var1.k5 = true;
            return var1;
         }

         if (var3 == 4) {
            if (var4) {
               var1.u3 = var5;
               var1.n5 = true;
            }

            var1.l6 = true;
            var3 = var2.u3();
         }

         if (var3 == -1) {
            return var1;
         }

         switch (var3) {
            case 1:
               var1.k5 = true;
               var2.u3();
               var1.a6 = a3.n5(var2.k5());
               break;
            case 2:
               var1.k5 = true;
               var2.u3();
               var1.a6 = -a3.n5(var2.k5());
         }

         return var1;
      } finally {
         if (var2 != null) {
            var2.dispose();
         }
      }
   }

   public final String n5() {
      a5 var1 = new a5();
      if (this.n5) {
         var1.k5(this.u3);
      }

      if (this.l6) {
         var1.n5('N');
      }

      if (this.k5) {
         if (this.a6 >= 0) {
            var1.n5("+");
         }

         var1.k5(this.a6);
      }

      return var1.toString();
   }

   public final boolean n5(int var1) {
      if (!this.l6) {
         return var1 == this.a6;
      }

      if (!this.n5 || this.u3 != 0) {
         float var2 = var1;
         if (this.k5) {
            var2 -= this.a6;
         }

         if (this.n5) {
            var2 /= this.u3;
         }

         return var2 < 0.0F ? false : var2 - com.aspose.slides.internal.v6g.k5.u3(var2, 13) == 0.0F;
      } else {
         return this.k5 ? var1 == this.a6 : false;
      }
   }
}
