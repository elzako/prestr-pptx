package com.aspose.slides.internal.b3z;

import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.d1;

public class k5 {
   private boolean n5;
   private int l6;
   private boolean k5;

   public final boolean n5() {
      return this.n5;
   }

   private void n5(boolean var1) {
      this.n5 = var1;
   }

   public final int l6() {
      return this.l6;
   }

   private void n5(int var1) {
      this.l6 = var1;
   }

   public final boolean k5() {
      return this.k5;
   }

   private void l6(boolean var1) {
      this.k5 = var1;
   }

   public k5() {
      this.n5(false);
      this.n5(5);
      this.l6(false);
   }

   public k5(int var1) {
      this.n5(var1);
   }

   public static k5 n5(String var0) {
      k5 var1 = new k5();

      try {
         if (var0 == null || d1.n5(d1.l6(var0))) {
            return var1;
         }

         String var2 = d1.u9(d1.l6(var0));
         String var3 = d1.l6(d1.n5(d1.n5(d1.n5(var2, "defer", ""), "meet", ""), "slice", ""));
         var1.n5(d1.l6(var2, "defer"));
         var1.l6(d1.k5(var2, "slice"));
         var1.n5(com.aspose.slides.internal.b3z.n5.n5(var3));
      } catch (RuntimeException var4) {
         if (!com.aspose.slides.internal.n1n.n5.n5) {
            throw var4;
         }
      }

      return var1;
   }

   @Override
   public String toString() {
      if (this.l6() == 0) {
         return "none";
      }

      a5 var1 = new a5();
      if (this.n5()) {
         var1.n5("defer ");
      }

      var1.n5(com.aspose.slides.internal.b3z.n5.n5(this.l6()));
      var1.n5(d1.n5(new String[]{" ", this.k5() ? "slice" : "meet"}));
      return var1.toString();
   }
}
