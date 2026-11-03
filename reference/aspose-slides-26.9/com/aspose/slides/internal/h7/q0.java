package com.aspose.slides.internal.h7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;

public class q0 implements t9 {
   private Dictionary<String, t9> n5;

   public q0(Dictionary<String, t9> var1) {
      this.n5 = var1;
   }

   @Override
   public void n5(m1 var1, List<com.aspose.slides.internal.v2.s7> var2) {
      if (var2 != null && var2.size() >= 2) {
         com.aspose.slides.internal.v2.t2 var3 = (com.aspose.slides.internal.v2.t2)var2.get_Item(1);
         List var4 = new List();
         com.aspose.slides.internal.v2.a6 var5 = new com.aspose.slides.internal.v2.a6(-1.0F * var3.u3());
         var4.addItem(var5);
         if (this.n5.containsKey("TL")) {
            m1 var6 = new m1("TL");
            t9 var7 = this.n5.get_Item("TL");
            var7.n5(var6, var4);
         }

         if (this.n5.containsKey("Td")) {
            m1 var8 = new m1("Td");
            t9 var9 = this.n5.get_Item("Td");
            var9.n5(var8, var2);
         }
      }
   }
}
