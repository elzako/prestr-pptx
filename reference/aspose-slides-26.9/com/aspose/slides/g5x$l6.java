package com.aspose.slides;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

class g5x$l6 {
   String n5 = "";
   int l6 = 0;
   short k5 = 0;
   com.aspose.slides.internal.k0r.o5k u3 = null;
   com.aspose.slides.internal.k0r.n9q a6 = null;
   com.aspose.slides.internal.k0r.l8r u9 = null;
   com.aspose.slides.internal.k0r.u7f h0 = null;
   com.aspose.slides.internal.k0r.x4a c8 = null;
   Hyperlink t2 = null;
   Hyperlink s7 = null;
   int x8 = -1;
   private final s3f n3;

   g5x$l6(s3f var1) {
      this.n3 = var1;
   }

   g5x$l6(g5x$l6 var1, int var2, s3f var3) {
      if (var2 < 1) {
         throw new ArgumentOutOfRangeException("textSplitIndex", "Start index for split the text too small!");
      }

      if (var2 + 1 > var1.n5.length()) {
         throw new ArgumentOutOfRangeException(
            "textSplitIndex",
            com.aspose.slides.ms.System.d1.n5(
               "Invalid start index for split the text (",
               com.aspose.slides.ms.System.a3.l6(var1.n5.length()),
               " by ",
               com.aspose.slides.ms.System.a3.l6(var2),
               ")!"
            )
         );
      }

      this.n3 = var3;
      this.n5 = com.aspose.slides.ms.System.d1.k5(var1.n5, var2);
      var1.n5 = com.aspose.slides.ms.System.d1.l6(var1.n5, 0, var2);
      this.l6 = var1.l6;
      this.k5 = var1.k5;
      this.u3 = var1.u3;
      this.a6 = var1.a6;
      this.u9 = var1.u9;
      this.h0 = var1.h0;
      this.c8 = var1.c8;
      this.t2 = var1.t2;
      this.s7 = var1.s7;
   }

   public final s3f n5() {
      return this.n3;
   }
}
