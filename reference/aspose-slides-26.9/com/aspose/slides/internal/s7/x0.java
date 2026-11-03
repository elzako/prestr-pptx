package com.aspose.slides.internal.s7;

import com.aspose.slides.Collections.Generic.IGenericList;

public class x0 extends com.aspose.slides.internal.n3.e2 {
   @Override
   public String n5() {
      return "margin";
   }

   @Override
   public int l6() {
      return 162;
   }

   @Override
   public boolean k5() {
      return false;
   }

   @Override
   public void n5(com.aspose.slides.internal.h0.h0 var1, com.aspose.slides.internal.z8.t4 var2, com.aspose.slides.internal.z8.y4 var3, boolean var4) {
      IGenericList var5 = com.aspose.slides.internal.z8.n5.n5(var3);
      switch (var5.size()) {
         case 1:
            var5.addItem(var5.get_Item(0));
            var5.addItem(var5.get_Item(0));
            var5.addItem(var5.get_Item(0));
            break;
         case 2:
            var5.addItem(var5.get_Item(0));
            var5.addItem(var5.get_Item(1));
            break;
         case 3:
            var5.addItem(var5.get_Item(1));
      }

      if (var5.size() > 4) {
         throw this.n5((com.aspose.slides.internal.z8.y4)var5.get_Item(4));
      }

      var2.n5("margin-top", (com.aspose.slides.internal.z8.y4)var5.get_Item(0), var4);
      var2.n5("margin-right", (com.aspose.slides.internal.z8.y4)var5.get_Item(1), var4);
      var2.n5("margin-bottom", (com.aspose.slides.internal.z8.y4)var5.get_Item(2), var4);
      var2.n5("margin-left", (com.aspose.slides.internal.z8.y4)var5.get_Item(3), var4);
   }
}
