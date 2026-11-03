package com.aspose.slides.internal.p6x;

import com.aspose.slides.internal.t9z.h0;
import com.aspose.slides.internal.x4g.u9;
import java.awt.geom.AffineTransform;

public class n5 {
   private l6 n5;
   private final AffineTransform l6;
   private final h0 k5;

   public n5(AffineTransform var1, h0 var2) {
      this.l6 = var1;
      this.k5 = var2;
   }

   public float n5(u9 var1) {
      if (var1.x8()) {
         return this.l6(var1);
      }

      if (this.n5 == null) {
         this.n5 = new l6(this.l6, this.k5, true);
      }

      return this.n5.n5(var1.t2());
   }

   private float l6(u9 var1) {
      float var2 = this.k5.l6() * var1.t2();
      float var3 = var1.t2();
      if (var3 <= 0.0F) {
         var3 = 1.0F;
      }

      if (var2 >= this.k5.u3()) {
         var3 = 2.0F * var3;
      }

      return var3;
   }
}
