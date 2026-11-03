package com.aspose.slides.internal.h7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;

public class g7 implements t9 {
   private Dictionary<String, t9> n5;

   public g7(Dictionary<String, t9> var1) {
      this.n5 = var1;
   }

   @Override
   public void n5(m1 var1, List<com.aspose.slides.internal.v2.s7> var2) {
      if (this.n5.containsKey("T*")) {
         m1 var3 = new m1("T*");
         t9 var4 = this.n5.get_Item("T*");
         var4.n5(var3, null);
      }

      if (this.n5.containsKey("Tj")) {
         m1 var5 = new m1("Tj");
         t9 var6 = this.n5.get_Item("Tj");
         var6.n5(var5, var2);
      }
   }
}
