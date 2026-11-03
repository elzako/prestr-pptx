package com.aspose.slides.internal.e5;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.o0.k5$n5;
import com.aspose.slides.ms.System.d1;

public class u9 {
   protected Dictionary<String, Dictionary<String, a6$n5>> n5 = new Dictionary<>();
   protected Dictionary<String, a6> l6 = new Dictionary<>();

   public u9(com.aspose.slides.internal.y1.u9 var1) {
      n5();
   }

   private static void n5() {
   }

   public final void n5(a6 var1) {
      this.n5.addItem(var1.l6(), var1.n5());
      this.l6.addItem(var1.l6(), var1);
   }

   public final a6$n5 n5(String var1, String var2, com.aspose.slides.internal.w2.u9 var3) {
      a6$n5 var4 = null;
      Dictionary var5 = null;
      Dictionary[] var6 = new Dictionary[]{var5};
      boolean var7 = this.n5.tryGetValue(var1, var6);
      var5 = var6[0];
      if (var7) {
         var4 = var5.containsKey(var2) ? (a6$n5)var5.get_Item(var2) : (a6$n5)var5.get_Item("<default>");
      }

      if (var4 == null) {
         if (this.l6.containsKey(var1)) {
            throw new com.aspose.slides.internal.y1.l6(d1.n5(new String[]{t2.l6(var3), "No element mapping definition found for ", t2.n5(var1, var2)}), var3);
         }

         var4 = new k5$n5(var1);
      }

      return var4;
   }

   public final a6 n5(String var1) {
      return this.l6.get_Item(var1);
   }
}
