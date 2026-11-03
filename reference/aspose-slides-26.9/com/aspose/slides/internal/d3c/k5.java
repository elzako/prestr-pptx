package com.aspose.slides.internal.d3c;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.d3v.l6$q0;
import com.aspose.slides.internal.o9b.c8;
import com.aspose.slides.internal.r1x.v4;
import com.aspose.slides.internal.r1x.z6;
import com.aspose.slides.ms.System.q1;

public class k5 extends l6$q0 {
   private final byte[] n5;
   private final z6 l6;

   public k5(com.aspose.slides.internal.f2i.n5 var1, int var2, int var3, int var4, z6 var5) {
      super(var1, var2, var3, var4, var5 != null ? var5.n5().q0() : 4);
      this.l6 = var5;
      this.n5 = this.n5(var1.e2().o8());
   }

   @Override
   protected void n5(byte[] var1, int var2, int var3) {
      if (v4.n5(this.l6.n5(), v4.l6())) {
         this.h0 = var1;
      } else if (v4.n5(this.l6.n5(), v4.k5())) {
         this.h0 = new byte[var1.length / 5 * 4];
         n5(var1, this.h0, this.n5);
      }

      this.c8 = this.h0.length;
   }

   @Override
   protected void n5(int[] var1, int var2, int var3) {
      throw new NotImplementedException();
   }

   private static void n5(byte[] var0, byte[] var1, byte[] var2) {
      int var3 = 0;

      for (int var4 = 0; var4 < var0.length; var4 += 5) {
         byte var5 = var0[var4 + 4];
         byte var6 = var0[var4];
         byte var7 = var0[var4 + 1];
         byte var8 = var0[var4 + 2];
         byte var9 = var0[var4 + 3];
         switch (var5) {
            case -1:
               var1[var3++] = var6;
               var1[var3++] = var7;
               var1[var3++] = var8;
               var1[var3++] = var9;
               break;
            case 0:
               var1[var3++] = var2[0];
               var1[var3++] = var2[1];
               var1[var3++] = var2[2];
               var1[var3++] = var2[3];
               break;
            default:
               double var10 = (var5 & 0xFF) / 255.0;
               double var12 = ~(var5 & 255) / 255.0;
               var1[var3++] = com.aspose.slides.internal.v6g.k5.n5((Object)((var6 & 0xFF) * var10 + (var2[0] & 0xFF) * var12), 14);
               var1[var3++] = com.aspose.slides.internal.v6g.k5.n5((Object)((var7 & 0xFF) * var10 + (var2[1] & 0xFF) * var12), 14);
               var1[var3++] = com.aspose.slides.internal.v6g.k5.n5((Object)((var8 & 0xFF) * var10 + (var2[2] & 0xFF) * var12), 14);
               var1[var3++] = com.aspose.slides.internal.v6g.k5.n5((Object)((var9 & 0xFF) * var10 + (var2[3] & 0xFF) * var12), 14);
         }
      }
   }

   private byte[] n5(c8 var1) {
      double var2 = 1.0 - (var1.x8() & 0xFF) / 255.0;
      double var4 = 1.0 - (var1.n3() & 0xFF) / 255.0;
      double var6 = 1.0 - (var1.y4() & 0xFF) / 255.0;
      double var8 = q1.k5(q1.k5(var2, var4), var6);
      if (q1.n5(var8 - 1.0) < 0.001) {
         var6 = 0.0;
         var4 = 0.0;
         var2 = 0.0;
      } else {
         var2 = (var2 - var8) / (1.0 - var8);
         var4 = (var4 - var8) / (1.0 - var8);
         var6 = (var6 - var8) / (1.0 - var8);
      }

      return new byte[]{
         com.aspose.slides.internal.v6g.k5.n5((Object)(q1.l6(0.0, q1.k5(255.0, 255.0 * var2))), 14),
         com.aspose.slides.internal.v6g.k5.n5((Object)(q1.l6(0.0, q1.k5(255.0, 255.0 * var4))), 14),
         com.aspose.slides.internal.v6g.k5.n5((Object)(q1.l6(0.0, q1.k5(255.0, 255.0 * var6))), 14),
         com.aspose.slides.internal.v6g.k5.n5((Object)(q1.l6(0.0, q1.k5(255.0, 255.0 * var8))), 14)
      };
   }
}
