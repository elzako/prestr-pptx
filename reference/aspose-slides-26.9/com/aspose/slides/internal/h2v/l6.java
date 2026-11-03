package com.aspose.slides.internal.h2v;

import com.aspose.slides.internal.c9b.u3;
import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.internal.r5w.x8;
import com.aspose.slides.internal.x4g.m1;
import java.awt.RenderingHints;
import java.awt.Shape;

public class l6 extends k5 {
   public l6(z1 var1) {
      super(var1);
   }

   @Override
   public void n5() {
      this.n5.z8().setRenderingHint(RenderingHints.KEY_STROKE_CONTROL, RenderingHints.VALUE_STROKE_PURE);
   }

   @Override
   public Shape n5(m1 var1, Shape var2) {
      var2 = u3.n5(var1, var2);
      var2 = this.n5(var2);
      x8 var3 = (x8)this.n5;
      if (var3.c4()) {
         var2 = com.aspose.slides.internal.d1z.u3.n5(var2);
      } else {
         var2 = com.aspose.slides.internal.d1z.u3.l6(var2);
      }

      return var2;
   }
}
