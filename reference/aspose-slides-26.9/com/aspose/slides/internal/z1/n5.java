package com.aspose.slides.internal.z1;

import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.t9.n5$n5;
import com.aspose.slides.ms.System.a3;

public class n5 extends k5 {
   public n5(com.aspose.slides.internal.t9.n5 var1) {
      super(var1);
   }

   @Override
   public String n5(int var1) {
      if (var1 < 0) {
         return this.n5().h0().n5(var1);
      }

      this.n5().a6().sort(new n5$1(this));
      if (var1 == 0) {
         return this.n5().a6().get_Item(this.n5().a6().size() - 1).n5() == 0
            ? this.n5().a6().get_Item(this.n5().a6().size() - 1).l6()
            : this.n5().h0().n5(var1);
      }

      a5 var2 = new a5();
      List$Enumerator var3 = this.n5().a6().iterator();
      int var4 = var1;

      while (var4 > 0 && var3.hasNext()) {
         int var5 = var4 / ((n5$n5)var3.next()).n5();
         if (var5 > 3) {
            return this.n5().h0().n5(var1);
         }

         while (var5 > 0) {
            var2.n5(((n5$n5)var3.next()).l6());
            var4 -= ((n5$n5)var3.next()).n5();
            var5--;
         }
      }

      return var2.toString();
   }

   private static int l6(n5$n5 var0, n5$n5 var1) {
      return a3.n5(var0.n5(), var1.n5()) * -1;
   }

   // $VF: synthetic method
   static int n5(n5$n5 var0, n5$n5 var1) {
      return l6(var0, var1);
   }
}
