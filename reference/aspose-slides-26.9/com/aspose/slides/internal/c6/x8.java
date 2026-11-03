package com.aspose.slides.internal.c6;

import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.d1;

abstract class x8 implements e2 {
   private String n5 = "<div>";
   private String l6 = "</div>";

   protected x8() {
      this("div");
   }

   protected x8(String var1) {
      this.n5 = d1.n5(new String[]{"<", var1, ">"});
      this.l6 = d1.n5(new String[]{"</", var1, ">"});
   }

   @Override
   public final void l6(a5 var1) {
      var1.n5(this.n5);
      this.n5(var1);
      var1.n5(this.l6);
   }

   @Override
   public final int l6(String var1, int var2) {
      int var3 = d1.n5(var1, this.n5, var2);
      int var4;
      int var5;
      if (var3 >= 0 && (var2 <= 0 || var3 <= var2 || d1.l6(d1.l6(var1, var2, var3 - var2)).length() <= 0)) {
         var3 += this.n5.length();
         var4 = this.n5(var1, var3);
         var4 = d1.n5(var1, this.l6, var4);
         if (var4 < 0) {
            return var1.length();
         }

         var5 = var4 + this.l6.length();
      } else {
         var3 = var2;
         var4 = var2;
         var5 = var2;
      }

      this.n5(var1, var3, var4);
      this.l6();
      return var5;
   }

   protected abstract void n5(a5 var1);

   protected int n5(String var1, int var2) {
      return var2;
   }

   protected void n5(String var1, int var2, int var3) {
   }

   protected void l6() {
   }
}
