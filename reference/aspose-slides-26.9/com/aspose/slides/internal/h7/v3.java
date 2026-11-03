package com.aspose.slides.internal.h7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;

public class v3 implements t9 {
   private Dictionary<String, t9> n5;

   public v3(Dictionary<String, t9> var1) {
      this.n5 = var1;
   }

   @Override
   public void n5(m1 var1, List<com.aspose.slides.internal.v2.s7> var2) {
      if (var2.size() >= 3) {
         List var3 = var2.getRange(0, 1);
         if (this.n5.containsKey("Tw")) {
            m1 var4 = new m1("Tw");
            t9 var5 = this.n5.get_Item("Tw");
            var5.n5(var4, var3);
         }

         List var8 = var2.getRange(1, 1);
         if (this.n5.containsKey("Tc")) {
            m1 var9 = new m1("Tc");
            t9 var6 = this.n5.get_Item("Tc");
            var6.n5(var9, var8);
         }

         List var10 = var2.getRange(2, 1);
         if (this.n5.containsKey("'")) {
            m1 var11 = new m1("'");
            t9 var7 = this.n5.get_Item("'");
            var7.n5(var11, var10);
         }
      }
   }
}
