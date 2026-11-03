package com.aspose.slides.internal.h9q;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.internal.e3j.u9;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.o9b.y1;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.internal.x4g.m3;
import com.aspose.slides.internal.x4g.s7;
import java.awt.geom.Rectangle2D;

public class u3 {
   private y1 n5;
   private m1 l6;
   private m1 k5;
   private k5 u3;

   public u3(m3 var1, m1 var2) {
      s7 var3 = var1.h0();
      Rectangle2D var4 = var3.getBounds2D();
      this.n5 = new y1((float)var4.getX(), (float)var4.getY(), (float)var4.getWidth(), (float)var4.getHeight());
      this.l6 = var2;
      this.k5 = var2.u9();
      this.k5.h0();
      this.u3 = this.n5(var1);
   }

   public w1 n5(w1 var1) {
      if (this.u3 == null) {
         return var1;
      }

      w1 var2 = u9.n5(var1, this.k5);
      w1 var3 = new w1();
      this.u3.l6(var2, var3);
      return u9.n5(var3, this.l6);
   }

   private k5 n5(m3 var1) {
      switch (var1.t9()) {
         case 0:
            return new l6(this.n5);
         case 1:
            return new n5(this.n5, true, false);
         case 2:
            return new n5(this.n5, false, true);
         case 3:
            return new n5(this.n5, true, true);
         case 4:
            return null;
         default:
            throw new ArgumentOutOfRangeException("brush.WrapMode");
      }
   }
}
