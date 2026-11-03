package com.aspose.slides.internal.c6;

import com.aspose.slides.IPortion;
import com.aspose.slides.ms.System.d1;

class q0 extends c4 {
   private final IPortion n5;
   private final String l6;
   private final String k5;

   public q0(IPortion var1, String var2, String var3) {
      super("span");
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   @Override
   protected String n5() {
      return this.n5.getText();
   }

   @Override
   protected void n5(String var1) {
      this.n5.setText(var1);
      if (d1.a6(this.n5.getPortionFormat().getLanguageId(), this.l6)) {
         this.n5.getPortionFormat().setLanguageId(this.k5);
      }
   }
}
