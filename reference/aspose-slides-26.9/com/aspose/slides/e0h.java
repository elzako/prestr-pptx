package com.aspose.slides;

class e0h {
   private IWarningCallback n5;

   public IWarningCallback n5() {
      return this.n5;
   }

   void l6() {
      if (this.n5() != null) {
         com.aspose.slides.internal.n8e.c2 var1 = new com.aspose.slides.internal.n8e.c2();
         var1.sendWarning(this.n5());
      }
   }

   void n5(String var1, int var2) {
      if (this.n5() != null) {
         com.aspose.slides.internal.n8e.u6 var3 = new com.aspose.slides.internal.n8e.u6(var1, var2);
         var3.sendWarning(this.n5());
      }
   }
}
