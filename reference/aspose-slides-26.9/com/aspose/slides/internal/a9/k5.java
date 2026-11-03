package com.aspose.slides.internal.a9;

import com.aspose.slides.exceptions.IndexOutOfRangeException;
import com.aspose.slides.internal.q4.a6;
import com.aspose.slides.internal.w0.t4;
import com.aspose.slides.internal.w0.z1;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;

public class k5 implements IDisposable {
   private final l6 n5;

   public k5(l6 var1) {
      this.n5 = var1;
   }

   @Override
   public final void dispose() {
      this.n5.n5(this);
   }

   public final void n5(n5 var1) {
      com.aspose.slides.internal.u0.n5 var2 = var1.n5.n5();
      t4 var3 = t4.l6((t4)var2.l6, (t4)var2.n5).n5();
      com.aspose.slides.internal.q4.k5 var4 = new com.aspose.slides.internal.q4.k5();
      var4.n5 = ((t4)var2.n5).k5 & 65535;
      var4.l6 = ((t4)var2.n5).u3 & 65535;
      var4.k5 = var3.k5 & 65535;
      var4.u3 = var3.u3 & 65535;
      if (var1.k5 != null && var1.k5.size() > 0) {
         var4.h0 = var1.k5.size();
         int[] var5 = new int[]{var4.h0};
         l6.n5(var5);
         var4.h0 = var5[0];
      }

      com.aspose.slides.internal.z0k.t4 var9 = this.n5.n5;
      var9.writeByte((byte)44);
      var4.n5(var9);
      int var6 = var3.k5 * var3.u3;
      if (var4.h0 > 0) {
         com.aspose.slides.internal.q4.n5.n5(var9, var4.h0, var1.k5, new z1());
         int var7 = var1.k5.size();

         for (int var8 = 0; var8 < var6; var8++) {
            if ((var1.l6[var8] & 255) >= var7) {
               throw new IndexOutOfRangeException(d1.n5("args.Pixels[{0}] out of range", new Object[]{var8}));
            }
         }
      }

      a6 var10 = new a6(8);
      var10.n5(var9, new com.aspose.slides.internal.d8.k5<>(com.aspose.slides.internal.n2d.t4.l6(var1.l6), 0, var6));
   }
}
