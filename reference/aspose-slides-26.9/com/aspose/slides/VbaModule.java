package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

public final class VbaModule implements IVbaModule {
   private final String n5;
   private final com.aspose.slides.internal.l6z.w1 l6;

   VbaModule(String name, com.aspose.slides.internal.l6z.w1 moduleStream) {
      this.n5 = name;
      this.l6 = moduleStream;
   }

   @Override
   public final String getName() {
      return this.n5;
   }

   @Override
   public final String getSourceCode() {
      return this.l6.n5();
   }

   @Override
   public final void setSourceCode(String value) {
      this.l6.n5(value);
   }

   final boolean n5(VbaModule var1) {
      if (var1 == null) {
         throw new ArgumentNullException("module");
      } else {
         return !com.aspose.slides.ms.System.d1.a6(this.getName(), var1.getName())
            ? false
            : com.aspose.slides.ms.System.d1.a6(this.getSourceCode(), var1.getSourceCode());
      }
   }

   final VbaModule n5() {
      VbaModule var1 = new VbaModule(this.getName(), new com.aspose.slides.internal.l6z.w1(this.l6.l6(), this.l6.k5()));
      var1.setSourceCode(this.getSourceCode());
      return var1;
   }
}
