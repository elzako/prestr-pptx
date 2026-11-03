package com.aspose.slides.internal.p2n;

import com.aspose.slides.internal.o9b.w1;
import java.awt.geom.Path2D.Double;

class n5 extends Double {
   public n5(w1 var1, w1[] var2, int var3, int var4) {
      this.moveTo(var1.l6(), var1.k5());
      this.lineTo(var2[var3].l6(), var2[var3].k5());
      if (var4 != 0 && var4 - var3 != 1) {
         this.curveTo(var2[var3 + 1].l6(), var2[var3 + 1].k5(), var2[var3 + 2].l6(), var2[var3 + 2].k5(), var2[var3 + 3].l6(), var2[var3 + 3].k5());
      } else {
         this.lineTo(var2[var4].l6(), var2[var4].k5());
      }

      this.closePath();
   }
}
