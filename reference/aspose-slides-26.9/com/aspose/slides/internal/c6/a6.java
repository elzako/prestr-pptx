package com.aspose.slides.internal.c6;

import com.aspose.slides.IComment;

class a6 extends c4 {
   private final IComment n5;

   public a6(IComment var1) {
      this.n5 = var1;
   }

   @Override
   protected String n5() {
      return this.n5.getText();
   }

   @Override
   protected void n5(String var1) {
      this.n5.setText(var1);
   }
}
