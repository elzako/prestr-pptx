package com.aspose.slides.internal.d0c;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.u2w.a6;

class u3$n5 {
   private int n5;
   private a6 l6;

   private u3$n5() {
   }

   public final int n5() {
      return this.n5;
   }

   private void n5(int var1) {
      this.n5 = var1;
   }

   public final a6 l6() {
      return this.l6;
   }

   private void n5(a6 var1) {
      this.l6 = var1;
   }

   public final Object k5() {
      Object var1 = null;
      if (this.l6() != null) {
         var1 = this.l6().h0();
      }

      return var1;
   }

   public static void n5(Dictionary<Integer, u3$n5> var0, a6 var1, int var2) {
      if (var1 == null) {
         throw new ArgumentNullException("value");
      }

      int var3 = var1.l6();
      if (var2 == -1) {
         if (var0.containsKey(var3)) {
            var2 = ((u3$n5)var0.get_Item(var3)).n5();
         } else if (k5.n5().containsKey(var3)) {
            var2 = k5.n5().get_Item(var3);
         } else {
            var2 = 0;
         }
      }

      u3$n5 var4 = new u3$n5();
      var4.n5(var1);
      var4.n5(var2);
      var0.set_Item(var1.l6(), var4);
   }

   @Override
   public String toString() {
      return com.aspose.slides.internal.v6g.k5.n5(this.k5(), String.class);
   }
}
