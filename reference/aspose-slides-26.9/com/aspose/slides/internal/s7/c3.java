package com.aspose.slides.internal.s7;

import com.aspose.slides.Collections.Generic.IGenericList;

public class c3 extends com.aspose.slides.internal.n3.e2 {
   @Override
   public String n5() {
      return "cue";
   }

   @Override
   public int l6() {
      return 87;
   }

   @Override
   public boolean k5() {
      return false;
   }

   @Override
   public void n5(com.aspose.slides.internal.h0.h0 var1, com.aspose.slides.internal.z8.t4 var2, com.aspose.slides.internal.z8.y4 var3, boolean var4) {
      IGenericList var5 = com.aspose.slides.internal.z8.n5.n5(var3);
      if (var5.size() > 2) {
         throw com.aspose.slides.internal.z8.u9.k5(((com.aspose.slides.internal.z8.y4)var5.get_Item(2)).toString());
      }

      if (var5.size() == 1) {
         var5.addItem(var5.get_Item(0));
      }

      var2.n5("cue-before", (com.aspose.slides.internal.z8.y4)var5.get_Item(0), var4);
      var2.n5("cue-after", (com.aspose.slides.internal.z8.y4)var5.get_Item(1), var4);
   }
}
