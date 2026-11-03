package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.exceptions.ArgumentNullException;

class l4h {
   private final h6j n5;

   public l4h(h6j var1) {
      if (var1 == null) {
         throw new ArgumentNullException("stylesContext");
      }

      this.n5 = var1;
   }

   public final h6j n5() {
      return this.n5;
   }

   public final Dictionary<String, Shape> l6() {
      return this.n5.h0();
   }

   public final Dictionary<String, Paragraph> k5() {
      return this.n5.c8();
   }
}
