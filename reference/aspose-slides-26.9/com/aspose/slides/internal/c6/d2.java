package com.aspose.slides.internal.c6;

import com.aspose.slides.ITable;
import com.aspose.slides.Collections.Generic.IGenericList;

class d2 extends u9 {
   private final ITable n5;
   private final float l6;

   public d2(ITable var1, IGenericList<e2> var2) {
      super(var2, "table");
      this.l6 = var1.getHeight();
      this.n5 = var1;
   }

   @Override
   protected void l6() {
      this.n5.setHeight(this.l6);
   }
}
