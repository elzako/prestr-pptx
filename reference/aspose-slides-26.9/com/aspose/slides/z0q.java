package com.aspose.slides;

class z0q implements com.aspose.slides.internal.g3.l6 {
   private final ISaveOptions n5;

   public z0q(ISaveOptions var1) {
      this.n5 = var1;
   }

   @Override
   public final boolean n5(com.aspose.slides.internal.g3.u3 var1) {
      if (this.n5 != null && this.n5.getWarningCallback() != null) {
         if (com.aspose.slides.internal.v6g.k5.l6(var1, com.aspose.slides.internal.g3.k5.class)) {
            com.aspose.slides.internal.n8e.u6 var2 = new com.aspose.slides.internal.n8e.u6("Brush data cannot be rendered", 1);
            var2.sendWarning(this.n5.getWarningCallback());
         } else {
            com.aspose.slides.internal.n8e.u6 var3 = new com.aspose.slides.internal.n8e.u6(var1.getMessage(), 99);
            var3.sendWarning(this.n5.getWarningCallback());
         }
      }

      return true;
   }
}
