package com.aspose.slides.internal.a1;

import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.t9;

public class u3 extends h0 {
   public u3(com.aspose.slides.internal.w5.k5 var1) {
      super(var1);
   }

   public String n5() {
      a5 var1 = new a5();
      IGenericList var2 = this.k5().r4().n5();
      if (var2.size() == 0) {
         return d1.n5;
      }

      String var3 = (String)var2.get_Item(0);
      if (!n5(var3)) {
         var1.n5(var3);
      } else {
         var1.n5('\'').n5(var3).n5('\'');
      }

      for (int var4 = 1; var4 < var2.size(); var4++) {
         var1.n5(", ");
         var3 = (String)var2.get_Item(var4);
         if (!n5(var3)) {
            var1.n5(var3);
         } else {
            var1.n5('\'').n5(var3).n5('\'');
         }
      }

      return var1.toString();
   }

   private static boolean n5(String var0) {
      for (int var1 = 0; var1 < var0.length(); var1++) {
         char var2 = var0.charAt(var1);
         if (t9.t9(var2)) {
            return true;
         }
      }

      return false;
   }
}
