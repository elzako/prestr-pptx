package com.aspose.slides;

import com.aspose.slides.exceptions.FormatException;

class r5p {
   private final int n5;
   private final String l6;

   private r5p(com.aspose.slides.internal.z0k.n5 var1) {
      this.n5 = var1.m3();
      if (this.n5 == 0) {
         this.l6 = "";
      } else {
         this.l6 = com.aspose.slides.internal.n8e.v4.n5(var1);
         if (this.l6.length() + 1 != this.n5) {
            throw new FormatException();
         }
      }
   }

   public final String n5() {
      return this.l6;
   }

   public static r5p n5(com.aspose.slides.internal.z0k.n5 var0) {
      return new r5p(var0);
   }
}
