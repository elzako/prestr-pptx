package com.aspose.slides.internal.b3z;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.n1;

public class l6 {
   private int n5;
   private float l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("grad", "rad", "deg", "");

   public final int n5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final float l6() {
      return this.l6;
   }

   public final void n5(float var1) {
      this.l6 = var1;
   }

   public static l6 n5(String var0, l6 var1) {
      try {
         return n5(var0);
      } catch (RuntimeException var3) {
         if (!d1.n5(var0) && !com.aspose.slides.internal.n1n.n5.n5) {
            throw var3;
         } else {
            return var1;
         }
      }
   }

   public static l6 n5(String var0) {
      l6 var1 = new l6();
      var1.n5(0.0F);
      var1.n5(0);
      int var2 = d1.l6(var0, new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'});
      if (var2 == -1) {
         return var1;
      }

      var1.n5((float)a3.n5(d1.l6(var0, 0, var2 + 1), com.aspose.slides.internal.x7n.l6.k5()));
      switch (k5.n5(d1.k5(var0, var2 + 1))) {
         case 0:
            var1.n5(4);
            break;
         case 1:
            var1.n5(3);
            break;
         case 2:
            var1.n5(2);
            break;
         case 3:
            var1.n5(1);
            break;
         default:
            throw new com.aspose.slides.internal.d0e.h0(1, "Invalid SvgAngle", var0);
      }

      return var1;
   }

   public final float k5() {
      switch (this.n5()) {
         case 0:
         case 1:
         case 2:
            return this.l6();
         case 3:
            return (float)(this.l6() * 180.0F / Math.PI);
         case 4:
            return (float)(this.l6() * 0.9);
         default:
            throw new ArgumentOutOfRangeException();
      }
   }

   @Override
   public String toString() {
      String var1 = n1.n5(this.l6(), "F", com.aspose.slides.internal.x7n.l6.k5());
      switch (this.n5()) {
         case 1:
            var1 = d1.n5(var1, "deg");
         case 2:
         default:
            break;
         case 3:
            var1 = d1.n5(var1, "rad");
            break;
         case 4:
            var1 = d1.n5(var1, "grad");
      }

      return var1;
   }
}
