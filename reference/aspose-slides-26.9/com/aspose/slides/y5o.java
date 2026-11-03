package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;

class y5o implements i8f {
   private final t4t l6;
   public final Paragraph n5;

   public y5o(Paragraph var1) {
      this.n5 = var1;
      this.l6 = new l3l((ParagraphFormat)this.n5.getParagraphFormat());
   }

   @Override
   public final boolean n5() {
      return this.n5.a6();
   }

   @Override
   public final t4t l6() {
      return this.l6;
   }

   @Override
   public final IGenericEnumerable<f1b> k5() {
      return ((PortionCollection)this.n5.getPortions()).k5();
   }
}
