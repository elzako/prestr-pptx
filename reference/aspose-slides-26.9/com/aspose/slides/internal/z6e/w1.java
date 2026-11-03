package com.aspose.slides.internal.z6e;

import java.awt.Point;
import java.awt.Rectangle;
import java.awt.geom.GeneralPath;

public abstract class w1 extends com.aspose.slides.internal.n2z.k5 {
   Rectangle n5;
   byte[] l6;
   Point[] k5;

   public GeneralPath l6() {
      GeneralPath var1 = new GeneralPath();
      int var2 = 0;

      while (var2 < this.l6.length) {
         switch (this.l6[var2] & 6) {
            case 2:
               var1.lineTo(this.k5[var2].x, this.k5[var2].y);
               var2++;
            case 3:
            case 5:
            default:
               break;
            case 4:
               var1.curveTo(this.k5[var2].x, this.k5[var2].y, this.k5[var2 + 1].x, this.k5[var2 + 1].y, this.k5[var2 + 2].x, this.k5[var2 + 2].y);
               var2 += 3;
               break;
            case 6:
               var1.moveTo(this.k5[var2].x, this.k5[var2].y);
               var2++;
         }

         if ((this.l6[var2 - 1] & 1) != 0) {
            var1.closePath();
         }
      }

      return var1;
   }

   @Override
   protected void n5(com.aspose.slides.internal.o6t.l6 var1, com.aspose.slides.internal.m5l.k5 var2, int var3) throws com.aspose.slides.internal.p7x.l6 {
      var1.u3(this.l6());
   }
}
