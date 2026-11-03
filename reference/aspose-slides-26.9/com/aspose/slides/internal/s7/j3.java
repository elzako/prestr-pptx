package com.aspose.slides.internal.s7;

import com.aspose.slides.Collections.Generic.IGenericList;

public class j3 extends com.aspose.slides.internal.n3.e2 {
   @Override
   public String n5() {
      return "columns";
   }

   @Override
   public int l6() {
      return 80;
   }

   @Override
   public boolean k5() {
      return false;
   }

   @Override
   public void n5(com.aspose.slides.internal.h0.h0 var1, com.aspose.slides.internal.z8.t4 var2, com.aspose.slides.internal.z8.y4 var3, boolean var4) {
      if (var3.k5() == null) {
         this.n5(var2, "column-width", var3, var4);
      } else {
         IGenericList var5 = com.aspose.slides.internal.z8.n5.n5(var3);
         this.n5(var2, "column-width", (com.aspose.slides.internal.z8.y4)var5.get_Item(0), var4);
         this.n5(var2, "column-count", (com.aspose.slides.internal.z8.y4)var5.get_Item(1), var4);
      }
   }
}
