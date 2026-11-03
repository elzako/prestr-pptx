package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentNullException;

public final class SvgTSpan implements ISvgTSpan {
   private String n5;

   SvgTSpan() {
   }

   @Override
   public final String getId() {
      return this.n5;
   }

   @Override
   public final void setId(String value) {
      if (com.aspose.slides.ms.System.d1.n5(value)) {
         throw new ArgumentNullException("value");
      }

      this.n5 = value;
   }
}
