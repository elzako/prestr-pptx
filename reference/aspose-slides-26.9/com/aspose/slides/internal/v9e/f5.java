package com.aspose.slides.internal.v9e;

import com.aspose.slides.exceptions.ArgumentNullException;

public class f5 implements y0 {
   private p3 n5;
   private com.aspose.slides.internal.z0k.a0 l6;

   public final com.aspose.slides.internal.z0k.a0 n5() {
      return this.l6;
   }

   public f5(p3 var1, com.aspose.slides.internal.z0k.a0 var2) {
      if (var2 == null) {
         throw new ArgumentNullException("writer");
      }

      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public final int n5(x9 var1) {
      s7 var2 = var1.u3();
      switch (var2.a6()) {
         case 3:
         case 13:
         case 14:
            this.l6.n5(var2.u3());
         default:
            var1.h0();
            return 0;
      }
   }

   @Override
   public final void l6() {
      this.l6.k5();
   }
}
