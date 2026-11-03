package com.aspose.slides.internal.w3k;

import com.aspose.slides.internal.j3b.c8;
import com.aspose.slides.internal.y5s.j5;
import com.aspose.slides.internal.y5s.y2;
import com.aspose.slides.internal.y5s.z3;

class n5 implements c8 {
   private final com.aspose.slides.internal.x5e.n5 n5;
   private final com.aspose.slides.internal.l4o.n5 l6;

   public n5(com.aspose.slides.internal.x5e.n5 var1, com.aspose.slides.internal.l4o.n5 var2) {
      this.n5 = var1;
      this.l6 = var2;
   }

   @Override
   public void n5(j5 var1, byte[] var2, z3 var3, z3 var4) {
      for (int var5 = 0; var5 < 7; var5++) {
         int var6 = n5((int)(this.l6.y4() & 4294967295L), var5);
         int var7 = l6((int)(this.l6.u9() & 4294967295L), var5);
         int var8 = k5(var5);
         int var9 = n5(var5);
         byte[] var10 = new byte[var7 * this.l6.u3() * var6];
         int var11 = 0;

         for (int var12 = u9(var5); var12 < (this.l6.u9() & 4294967295L); var12 += var8) {
            for (int var13 = a6(var5); var13 < (this.l6.y4() & 4294967295L); var13 += var9) {
               System.arraycopy(var2, var12 * this.l6.u3() + var13 * this.l6.u3() * var6, var10, var11, this.l6.u3());
               var11 += this.l6.u3();
            }
         }

         com.aspose.slides.internal.y2o.l6 var14 = new com.aspose.slides.internal.y2o.l6(this.n5, this.l6.u3(var6), var7, this.l6.t4(), this.l6.z1());
         if ((this.l6.l6() & 255) < 8) {
            k5 var15 = new k5(this.l6, var14);
            var15.n5(new j5(new z3(), new y2(var6, var7)), var10, new z3(), new z3(var6, var7));
         } else {
            var14.n5(new j5(new z3(), new y2(var6, var7)), var10, new z3(), new z3(var6, var7));
         }
      }
   }

   private static int n5(int var0) {
      return 1 << (7 - var0 >> 1);
   }

   private static int l6(int var0) {
      return var0 > 1 ? 7 - var0 >> 1 : 3;
   }

   private static int n5(int var0, int var1) {
      return var0 + ((1 << l6(var1)) - 1 - a6(var1)) >> l6(var1);
   }

   private static int k5(int var0) {
      return var0 > 2 ? 8 >> (var0 - 1 >> 1) : 8;
   }

   private static int u3(int var0) {
      return var0 > 2 ? 8 - var0 >> 1 : 3;
   }

   private static int l6(int var0, int var1) {
      return var0 + ((1 << u3(var1)) - 1 - u9(var1)) >> u3(var1);
   }

   private static int a6(int var0) {
      return (1 & var0) << 3 - (var0 + 1 >> 1) & 7;
   }

   private static int u9(int var0) {
      return (1 & ~var0) << 3 - (var0 >> 1) & 7;
   }
}
