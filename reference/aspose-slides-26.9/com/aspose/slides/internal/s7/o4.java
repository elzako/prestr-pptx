package com.aspose.slides.internal.s7;

import com.aspose.slides.Collections.Generic.IGenericList;

public class o4 extends com.aspose.slides.internal.n3.e2 {
   @Override
   public String n5() {
      return "rest";
   }

   @Override
   public int l6() {
      return 218;
   }

   @Override
   public boolean k5() {
      return false;
   }

   @Override
   public void n5(com.aspose.slides.internal.h0.h0 var1, com.aspose.slides.internal.z8.t4 var2, com.aspose.slides.internal.z8.y4 var3, boolean var4) {
      if (var3.k5() != null) {
         IGenericList var5 = com.aspose.slides.internal.z8.n5.n5(var3);
         this.n5(var2, "rest-before", (com.aspose.slides.internal.z8.y4)var5.get_Item(0), var4);
         this.n5(var2, "rest-after", (com.aspose.slides.internal.z8.y4)var5.get_Item(1), var4);
      } else {
         this.n5(var2, "rest-before", var3, var4);
         this.n5(var2, "rest-after", var3, var4);
      }
   }
}
