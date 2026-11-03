package com.aspose.slides.internal.h9;

import com.aspose.slides.internal.b9.s4;
import com.aspose.slides.internal.b9.s9;
import com.aspose.slides.internal.o9b.j5;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.o9b.z1;
import com.aspose.slides.ms.System.q1;
import com.aspose.slides.ms.System.x9;

public abstract class a6 extends com.aspose.slides.internal.r5.n5 {
   protected a6(n5 var1) {
      super(var1);
   }

   @Override
   public void u9(s9 var1, com.aspose.slides.internal.r6.u9 var2) {
      s4 var3 = (s4)var1;
      this.n5(var3, var2);
   }

   protected abstract void n5(s4 var1, com.aspose.slides.internal.r6.u9 var2);

   public static com.aspose.slides.internal.o9b.l6 n5(com.aspose.slides.internal.o9b.l6 var0, com.aspose.slides.internal.o9b.l6 var1, j5 var2) {
      com.aspose.slides.internal.o9b.l6 var3 = var0;
      if (var3.s7() != 2498570) {
         var3 = new com.aspose.slides.internal.o9b.l6(var0.e2(), var0.h0(), 2498570);
         z1 var4 = z1.n5(var3);

         try {
            com.aspose.slides.internal.j9e.t2 var5 = new com.aspose.slides.internal.j9e.t2();

            try {
               var5.l6(3);
               var4.a6(2);
               var4.k5(7);
               var4.n5(var0, new y2(0, 0, var3.e2(), var3.h0()), 0, 0, var0.e2(), var0.h0(), 2, var5);
            } finally {
               if (var5 != null) {
                  var5.dispose();
               }
            }
         } finally {
            if (var4 != null) {
               var4.dispose();
            }
         }
      }

      com.aspose.slides.internal.j9e.n5 var23 = var0.n5(new y2(0, 0, var0.e2(), var0.h0()), 3, var0.s7());
      com.aspose.slides.internal.j9e.n5 var24 = var1.n5(new y2(0, 0, var1.e2(), var1.h0()), 3, 196865);
      x9 var6 = var23.u3();
      x9 var7 = var24.u3();
      int[] var8 = new int[var23.l6() * var23.n5()];
      byte[] var9 = new byte[q1.n5(var24.a6()) * var24.n5()];
      com.aspose.slides.internal.e3m.n5.n5(var6, var8, 0, var8.length);
      com.aspose.slides.internal.e3m.n5.n5(var7, var9, 0, var9.length);

      for (int var10 = 0; var10 < var23.n5(); var10++) {
         for (int var11 = 0; var11 < var23.l6(); var11++) {
            int var12 = var10 * var23.l6() + var11;
            int var13 = (var11 + var2.n5()) % var1.e2();
            int var14 = (var10 + var2.l6()) % var1.h0();
            int var15 = var14 * var24.a6() + (var13 >> 3);
            byte var16 = (byte)(128 >> (var13 & 7));
            if ((var9[var15] & 255 & var16 & 255) != (var16 & 255)) {
               var8[var12] = 0;
            }
         }
      }

      com.aspose.slides.internal.e3m.n5.n5(var8, 0, var6, var8.length);
      var0.n5(var23);
      var1.n5(var24);
      return var3;
   }
}
