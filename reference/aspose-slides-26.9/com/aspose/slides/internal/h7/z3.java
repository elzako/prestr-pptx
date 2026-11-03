package com.aspose.slides.internal.h7;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;

public class z3 implements t9 {
   private Dictionary<String, t9> n5;
   private final com.aspose.slides.internal.t8.l6 l6;

   public z3(Dictionary<String, t9> var1, com.aspose.slides.internal.t8.l6 var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public void n5(m1 var1, List<com.aspose.slides.internal.v2.s7> var2) {
      List var3 = new List();
      var3.addItem(new com.aspose.slides.internal.v2.a6(0.0F));
      com.aspose.slides.internal.t8.c8 var4 = this.l6.n5().t2().t2();
      com.aspose.slides.internal.v2.a6 var5 = new com.aspose.slides.internal.v2.a6(-1.0F * var4.h0());
      var3.addItem(var5);
      if (this.n5.containsKey("Td")) {
         m1 var6 = new m1("Td");
         t9 var7 = this.n5.get_Item("Td");
         var7.n5(var6, var3);
      }
   }
}
