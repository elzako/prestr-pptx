package com.aspose.slides.internal.o7p;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.a3p.y4;
import com.aspose.slides.ms.System.d1;

public class c8 {
   protected final int n5;
   protected final int l6;
   protected final int k5;
   protected final int u3;
   protected final int a6;
   protected final int u9;
   protected final int h0;

   public c8(com.aspose.slides.internal.f2i.n5 var1) {
      this(var1, (int)var1.v4(), (int)var1.z7());
   }

   public c8(com.aspose.slides.internal.f2i.n5 var1, int var2, int var3) {
      if (var1 == null) {
         throw new ArgumentNullException("options");
      }

      if (var1.y2() != 6 && var1.y2() != 8) {
         throw new com.aspose.slides.internal.h6t.u3("Invalid photometric. The subsampling are supported only for YCbCr and CEI L*a*b color spaces.");
      }

      this.k5 = var2;
      this.u3 = var3;
      this.n5 = var1.t9()[0] & 65535;
      this.l6 = var1.t9()[1] & 65535;
      if (this.k5 % this.n5 != 0) {
         throw new com.aspose.slides.internal.h6t.u3(
            d1.n5("Invalid image width={0}. The image width must be integer multiples of YCbCrSubsampleHoriz={1} factor.",new Object[]{ this.k5, this.n5})
         );
      }

      if (this.u3 % this.l6 != 0) {
         throw new com.aspose.slides.internal.h6t.u3(
            d1.n5("Invalid image height={0}. The image height must be integer multiples of YCbCrSubsampleVert={1} factor.",new Object[]{ this.u3, this.l6})
         );
      }

      this.h0 = n5(var1);
      this.a6 = (this.k5 + this.n5 - 1) / this.n5;
      this.u9 = (this.u3 + this.l6 - 1) / this.l6;
   }

   public final byte[] l6(byte[] var1) {
      int var2 = 0;
      int var3 = this.k5 * this.u3;
      byte[] var4 = new byte[var3];

      for (int var5 = 0; var5 < this.u9; var5++) {
         for (int var6 = 0; var6 < this.a6; var6++) {
            byte var7 = var1[var2];

            for (int var8 = 0; var8 < this.l6; var8++) {
               for (int var9 = 0; var9 < this.n5; var9++) {
                  int var10 = this.n5 * var6 + var9;
                  int var11 = this.l6 * var5 + var8;
                  int var12 = var10 + this.k5 * var11;
                  var4[var12] = var7;
               }
            }

            var2++;
         }
      }

      return var4;
   }

   public final byte[] k5(byte[] var1) {
      int var2 = this.k5 * this.u3;
      if (var1 == null) {
         throw new ArgumentNullException("data");
      }

      if (var1.length < var2) {
         throw new com.aspose.slides.internal.h6t.u3(d1.n5("Invalid data buffer lenght {0}. Must be at least {1}",new Object[]{ var1.length, var2}));
      }

      int var3 = 0;
      int var4 = this.a6 * this.u9;
      byte[] var5 = new byte[var4];

      for (int var6 = 0; var6 < this.u9; var6++) {
         for (int var7 = 0; var7 < this.a6; var7++) {
            short var8 = 0;
            short var9 = 0;

            for (int var10 = 0; var10 < this.l6; var10++) {
               for (int var11 = 0; var11 < this.n5; var11++) {
                  int var12 = this.n5 * var7 + var11;
                  int var13 = this.l6 * var6 + var10;
                  int var14 = var12 + this.k5 * var13;
                  var8 = (short)(var8 + (var1[var14] & 255));
                  var9++;
               }
            }

            var5[var3++] = (byte)(var8 / var9);
         }
      }

      return var5;
   }

   public final int k5() {
      return this.a6 * this.u9;
   }

   public static n5 n5(com.aspose.slides.internal.f2i.n5 var0, int var1, int var2) {
      if (var0.y2() != 6 || var0.m3() == 7 || var0.m3() == 6) {
         return new u9(var0);
      } else {
         return n5(var0) > 0 ? new u3(var0, var1, var2) : new k5(var0, var1, var2);
      }
   }

   public static l6 l6(com.aspose.slides.internal.f2i.n5 var0, int var1, int var2) {
      if (var0.y2() == 6 && var0.m3() != 7 && var0.m3() != 6) {
         return n5(var0) > 0 ? new a6(var0, var1, var2) : new t2(var0, var1, var2);
      } else {
         return new h0(var0);
      }
   }

   public static int n5(com.aspose.slides.internal.f2i.n5 var0) {
      y4 var1 = com.aspose.slides.internal.v6g.k5.n5(var0.s7(338), y4.class);
      return var1 != null && var1.y4() != null && var1.y4().length > 0 ? var1.y4().length : 0;
   }
}
