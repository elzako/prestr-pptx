package com.aspose.slides.internal.j0;

import com.aspose.slides.exceptions.IOException;
import com.aspose.slides.internal.v2.c8;
import com.aspose.slides.internal.v2.h0;
import com.aspose.slides.internal.v2.s7;
import com.aspose.slides.internal.v2.x8;
import com.aspose.slides.internal.z0k.t4;
import com.aspose.slides.ms.System.q1;

public class u3 extends l6 {
   private com.aspose.slides.internal.v2.n5 n5;
   private com.aspose.slides.internal.v2.n5 l6;
   private com.aspose.slides.internal.v2.n5 k5;
   private int[][] u3;
   private int a6;

   public final com.aspose.slides.internal.v2.n5 n5() {
      if (this.k5 == null) {
         com.aspose.slides.internal.v2.k5 var1 = this.h0();
         this.k5 = (com.aspose.slides.internal.v2.n5)var1.u9(c8.x7i);
      }

      return this.k5;
   }

   public u3(s7 var1) {
      super(var1);
   }

   public final int l6() {
      com.aspose.slides.internal.v2.k5 var1 = this.h0();
      return var1.t2(c8.b3);
   }

   private com.aspose.slides.internal.v2.n5 u3() {
      if (this.n5 == null) {
         com.aspose.slides.internal.v2.k5 var1 = this.h0();
         this.n5 = (com.aspose.slides.internal.v2.n5)var1.u9(c8.x0);
         if (this.n5 == null) {
            this.n5 = new com.aspose.slides.internal.v2.n5();
            com.aspose.slides.internal.v2.n5 var2 = this.n5();
            int var3 = var2.n5();

            for (int var4 = 0; var4 < var3; var4++) {
               this.n5.n5(h0.n5());
               this.n5.n5(h0.n5(var2.u3(var4) - 1));
            }
         }
      }

      return this.n5;
   }

   private com.aspose.slides.internal.v2.n5 a6() {
      if (this.l6 == null) {
         com.aspose.slides.internal.v2.k5 var1 = this.h0();
         this.l6 = (com.aspose.slides.internal.v2.n5)var1.u9(c8.c2);
         if (this.l6 == null) {
            this.l6 = this.n3();
         }
      }

      return this.l6;
   }

   public final com.aspose.slides.internal.e6.l6 k5(int var1) {
      com.aspose.slides.internal.e6.l6 var2 = null;
      com.aspose.slides.internal.v2.n5 var3 = this.u3();
      if (var3 != null && var3.n5() >= var1 * 2 + 1) {
         var2 = new com.aspose.slides.internal.e6.l6(var3, var1);
      }

      return var2;
   }

   public final com.aspose.slides.internal.e6.l6 u3(int var1) {
      com.aspose.slides.internal.e6.l6 var2 = null;
      com.aspose.slides.internal.v2.n5 var3 = this.a6();
      if (var3 != null && var3.n5() >= var1 * 2 + 1) {
         var2 = new com.aspose.slides.internal.e6.l6(var3, var1);
      }

      return var2;
   }

   public final int[][] k5() {
      if (this.u3 == null) {
         int var1 = 1;
         int var2 = this.s7();
         int var3 = this.x8();
         com.aspose.slides.internal.v2.n5 var4 = this.n5();

         for (int var5 = 0; var5 < var2; var5++) {
            var1 *= var4.u3(var5);
         }

         this.u3 = new int[var1][];

         for (int var13 = 0; var13 < this.u3.length; var13++) {
            this.u3[var13] = new int[var3];
         }

         int var14 = this.l6();
         int var6 = 0;

         try {
            com.aspose.slides.internal.e7.s7 var7 = this.c8();
            x8 var8 = var7.l6();
            t4 var9 = var8.u3();
            var9.seek(0L, 0);
            this.a6 = 0;

            for (int var10 = 0; var10 < var1; var10++) {
               for (int var11 = 0; var11 < var3; var11++) {
                  this.u3[var6][var11] = (int)this.n5(var9, var14);
               }

               var6++;
            }
         } catch (IOException var12) {
         }
      }

      return this.u3;
   }

   public final long n5(t4 var1, int var2) {
      if (!var1.canRead()) {
         return -1L;
      }

      if (var2 >= 0 && var2 <= 64) {
         if (var2 == 0) {
            return 0L;
         }

         int var3 = var2 + this.a6;
         int var4 = this.a6 + var2 & 7;
         long var5 = 0L;

         while (var3 > 0) {
            int var7 = var1.readByte();
            if (var7 == -1) {
               return -1L;
            }

            var5 <<= 8;
            var5 |= var7;
            var3 -= 8;
         }

         if (var4 != 0) {
            var1.seek(var1.getPosition() - 1L, 0);
         }

         this.a6 = var4;
         var5 = com.aspose.slides.internal.v6g.k5.h0(var5, 11) >> -var3;
         return var5 & -1L >> 64 - var2;
      } else {
         return -1L;
      }
   }

   @Override
   public float[] n5(float[] var1) {
      float[] var2 = this.n5().l6();
      int var3 = this.l6();
      float var4 = (float)(q1.a6(2.0, var3) - 1.0);
      int var5 = var1.length;
      int var6 = this.x8();
      int[] var7 = new int[var5];
      int[] var8 = new int[var5];

      for (int var9 = 0; var9 < var5; var9++) {
         com.aspose.slides.internal.e6.l6 var10 = this.l6(var9);
         com.aspose.slides.internal.e6.l6 var11 = this.k5(var9);
         var1[var9] = this.n5(var1[var9], var10.n5(), var10.l6());
         var1[var9] = this.n5(var1[var9], var10.n5(), var10.l6(), var11.n5(), var11.l6());
         var1[var9] = this.n5(var1[var9], 0.0F, var2[var9] - 1.0F);
         var7[var9] = com.aspose.slides.internal.v6g.k5.u3(q1.k5(var1[var9]), 14);
         var8[var9] = com.aspose.slides.internal.v6g.k5.u3(q1.l6((double)var1[var9]), 14);
      }

      int[][] var15 = this.k5();
      com.aspose.slides.internal.e6.k5 var16 = new com.aspose.slides.internal.e6.k5(var1, var7, var8, var6, this.n5(), var15);
      float[] var17 = var16.n5();

      for (int var12 = 0; var12 < var6; var12++) {
         com.aspose.slides.internal.e6.l6 var13 = this.n5(var12);
         com.aspose.slides.internal.e6.l6 var14 = this.u3(var12);
         var17[var12] = this.n5(var17[var12], 0.0F, var4, var14.n5(), var14.l6());
         var17[var12] = this.n5(var17[var12], var13.n5(), var13.l6());
      }

      return var17;
   }
}
