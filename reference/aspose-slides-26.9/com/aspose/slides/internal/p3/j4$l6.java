package com.aspose.slides.internal.p3;

import com.aspose.slides.exceptions.InvalidOperationException;

public class j4$l6 extends j8 {
   private j4 n5;

   public j4$l6(j4 var1) {
      super(null);
      this.n5 = var1;
   }

   public final void n5() {
      if (j4.h0(this.n5) != null) {
         throw new InvalidOperationException("Only applicable to no-break situations");
      }

      for (int var1 = 0; var1 < j4.n5(this.n5).length; var1++) {
         j4.n5(this.n5)[var1].n5(j4.l6(this.n5)[var1]);
      }
   }
}
