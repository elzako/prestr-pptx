package com.aspose.slides.internal.a0p;

import com.aspose.slides.internal.o9b.c8;
import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.x4g.a6;
import com.aspose.slides.internal.x4g.m1;
import com.aspose.slides.internal.x4g.u3;
import com.aspose.slides.internal.x4g.z3;
import java.awt.PaintContext;
import java.awt.geom.AffineTransform;

public class l6 {
   private final z3 n5;

   public l6(z3 var1) {
      this.n5 = var1;
   }

   public k5 n5() {
      float[] var1 = new float[]{0.0F, 1.0F};
      c8[] var2 = this.n5.s7();
      c8 var3 = var2[0];
      c8 var4 = var2[1];
      u3 var5 = this.n5.h0();
      a6 var6 = this.n5.e2() ? this.n5.t2() : null;
      if (var6 != null && var6.n5() != null && var6.n5().length > 0) {
         var1 = new float[var6.l6().length];
         var2 = new c8[var6.n5().length];
         System.arraycopy(var6.l6(), 0, var1, 0, var6.l6().length);

         for (int var16 = 0; var16 < var6.n5().length; var16++) {
            c8 var18;
            if (this.n5.c8()) {
               var18 = c8.n5(com.aspose.slides.internal.r5w.n5.l6(var6.n5()[var16].h0()));
            } else {
               var18 = var6.n5()[var16];
            }

            var2[var16] = var18;
         }
      } else if (this.n5.t9() && var5 != null) {
         var1 = new float[var5.k5().length];
         var2 = new c8[var5.l6().length];
         System.arraycopy(var5.k5(), 0, var1, 0, var5.k5().length);
         boolean var7 = true;
         float var8 = (var4.s7() & 255) - (var3.s7() & 255);
         float var9 = (var4.x8() & 255) - (var3.x8() & 255);
         float var10 = (var4.n3() & 255) - (var3.n3() & 255);
         float var11 = (var4.y4() & 255) - (var3.y4() & 255);

         for (int var12 = 0; var12 < var5.l6().length; var12++) {
            float var13 = var5.l6()[var12];

            try {
               c8 var14 = !var7
                  ? c8.n5(
                     (int)((var3.s7() & 0xFF) + var8 * var13),
                     (int)((var3.x8() & 0xFF) + var9 * var13),
                     (int)((var3.n3() & 0xFF) + var10 * var13),
                     (int)((var3.y4() & 0xFF) + var11 * var13)
                  )
                  : c8.n5(
                     (int)((var4.s7() & 0xFF) - var8 * (1.0F - var13)),
                     (int)((var4.x8() & 0xFF) - var9 * (1.0F - var13)),
                     (int)((var4.n3() & 0xFF) - var10 * (1.0F - var13)),
                     (int)((var4.y4() & 0xFF) - var11 * (1.0F - var13))
                  );
               var2[var12] = var14;
            } catch (Exception var15) {
            }

            var7 = !var7;
         }
      }

      w1 var17 = this.n5.z1();
      w1 var19 = this.n5.t4();
      return new k5(var17, var19, var1, var2, this.n5.y4(), this.n5.c8());
   }

   public PaintContext n5(AffineTransform var1) {
      m1 var2 = m1.n5(new AffineTransform(var1));
      var2.l6(this.n5.n3());
      return new n5(var2, this.n5());
   }
}
