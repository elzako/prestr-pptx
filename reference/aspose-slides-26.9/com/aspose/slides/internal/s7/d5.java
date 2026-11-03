package com.aspose.slides.internal.s7;

import com.aspose.slides.Collections.Generic.IGenericList;

public class d5 extends com.aspose.slides.internal.n3.e2 {
   @Override
   public String n5() {
      return "border";
   }

   @Override
   public int l6() {
      return 32;
   }

   @Override
   public boolean k5() {
      return false;
   }

   @Override
   public void n5(com.aspose.slides.internal.h0.h0 var1, com.aspose.slides.internal.z8.t4 var2, com.aspose.slides.internal.z8.y4 var3, boolean var4) {
      IGenericList var5 = com.aspose.slides.internal.z8.n5.n5(var3);
      this.n5(var2, "border-top", var5, var4);
      this.n5(var2, "border-right", var5, var4);
      this.n5(var2, "border-bottom", var5, var4);
      this.n5(var2, "border-left", var5, var4);
   }
}
