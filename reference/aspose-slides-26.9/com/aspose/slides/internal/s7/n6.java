package com.aspose.slides.internal.s7;

import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.internal.k5.l6$n5;

public class n6 extends com.aspose.slides.internal.n3.e2 {
   @Override
   public String n5() {
      return "pause";
   }

   @Override
   public int l6() {
      return 207;
   }

   @Override
   public boolean k5() {
      return false;
   }

   @Override
   public com.aspose.slides.internal.k5.u9 u3() {
      return l6$n5.l6;
   }

   @Override
   public void n5(com.aspose.slides.internal.h0.h0 var1, com.aspose.slides.internal.z8.t4 var2, com.aspose.slides.internal.z8.y4 var3, boolean var4) {
      IGenericList var5 = com.aspose.slides.internal.z8.n5.n5(var3);
      if (var5.size() > 2) {
         throw this.n5((com.aspose.slides.internal.z8.y4)var5.get_Item(2));
      }

      if (var5.size() == 1) {
         var5.addItem(var5.get_Item(0));
      }

      this.n5(var2, "pause-before", (com.aspose.slides.internal.z8.y4)var5.get_Item(0), var4);
      this.n5(var2, "pause-after", (com.aspose.slides.internal.z8.y4)var5.get_Item(1), var4);
   }
}
