package com.aspose.slides.internal.d3c;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.r1x.d2;
import com.aspose.slides.internal.r1x.i9;
import com.aspose.slides.internal.r1x.k7;
import com.aspose.slides.internal.r1x.v3;
import com.aspose.slides.internal.r1x.v4;
import com.aspose.slides.internal.y4u.s7;
import com.aspose.slides.internal.y4u.x8;
import com.aspose.slides.internal.y4u.y1;
import com.aspose.slides.internal.z0k.t4;

abstract class n5 implements com.aspose.slides.internal.h9s.k5 {
   @Override
   public final void n5(int[] var1, y2 var2, t4 var3, d2 var4) {
      if (var3 != null && this.n5(var3)) {
         if (var1 == null) {
            throw new ArgumentNullException("imageBitmap");
         }

         t4 var5 = k7.l6().n5();
         byte[] var6 = this.n5(var1);
         byte[] var7 = new byte[var1.length * v4.u3().z3()];
         y1 var8 = new y1();
         Object var9 = null;
         if (var4 != null) {
            var9 = var4.u3();
         }

         var8.n5(var2.t2(), var2.l6(), var2.t2() * this.n5().z3(), null, this.n5(), var2.n3(), null, v4.u3(), var2.t2() * v4.u3().z3(), 0, null, null, 0, var9);
         v3 var10 = null;
         v3 var11 = null;

         try {
            var10 = new v3(var3);
            var11 = new v3(var5);
            boolean var12 = v4.n5(this.n5(), v4.l6());
            var8.n5(var10, var11, var12, true);
            var8.n5(var2.n3(), var6, 0, var7, 0);
         } finally {
            i9 var14 = (i9)i9.n5();
            var14.n5(var10);
            var14.n5(var11);
         }

         s7 var18 = x8.n5(
            var2.t2(), var2.l6(), var2.t2() * v4.u3().z3(), null, v4.u3(), var2.n3(), null, v4.n5(), v4.n5().z3() * var2.t2(), 0, null, null, 0, var9
         );
         int var13 = v4.n5().z3();
         byte[] var19 = new byte[var1.length * var13];
         var18.n5(var2.n3(), var7, 0, var19, 0);

         for (int var15 = 0; var15 < var1.length; var15++) {
            var1[var15] = (var19[var15 * var13 + 3] & 255) << 24
               | (var19[var15 * var13 + 0] & 255) << 16
               | (var19[var15 * var13 + 1] & 255) << 8
               | var19[var15 * var13 + 2] & 255;
         }
      }
   }

   protected abstract byte[] n5(int[] var1);

   protected abstract boolean n5(t4 var1);

   protected abstract v4 n5();
}
