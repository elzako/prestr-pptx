package com.aspose.slides.internal.d3v;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.b8u.m1;
import com.aspose.slides.internal.o7p.c8;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;
import com.aspose.slides.ms.System.s3;

public abstract class l6$q0 {
   protected int a6;
   private int n5;
   private int l6;
   protected long u9;
   private int k5;
   protected byte[] h0;
   protected int c8;
   protected int t2;
   protected com.aspose.slides.internal.f2i.n5 s7;
   private boolean u3;

   protected l6$q0(com.aspose.slides.internal.f2i.n5 var1, int var2, int var3, int var4, int var5) {
      this.s7 = var1;
      this.u3 = this.s7.y2() == 6 && this.s7.m3() != 7 && this.s7.m3() != 6;
      this.n5(var2, var3, var4, var5);
   }

   public final void n5(int[] var1, com.aspose.slides.internal.b8u.n5 var2) {
      switch (this.s7.y1()) {
         case 1:
            this.n5((Object)var1, var2);
            break;
         case 2:
            this.l6(var1, var2);
      }
   }

   public final void n5(byte[] var1, com.aspose.slides.internal.b8u.n5 var2) {
      switch (this.s7.y1()) {
         case 1:
            this.n5((Object)var1, var2);
            break;
         case 2:
            this.l6(var1, var2);
      }
   }

   protected static int l6(int var0) {
      int var1 = 0;

      byte var2;
      for (var2 = 1; var2 < var0; var1++) {
         var2 <<= 1;
      }

      return var2 == var0 ? var1 : var1 + 1;
   }

   protected abstract void n5(int[] var1, int var2, int var3);

   protected void n5(byte[] var1, int var2, int var3) {
      throw new NotImplementedException();
   }

   private long n5(long var1) {
      long var3 = this.h0.length;
      long var5 = ((var3 - this.c8) * 8L - (7 - this.t2)) / this.l6;
      long var7 = q1.k5(var1, var5);
      return q1.k5(var7, this.u9);
   }

   private void n5(int var1, int var2, int var3, int var4) {
      this.t2 = 7;
      this.l6 = var4;
      this.a6 = var1;
      this.k5 = var3;
      this.n5 = var2;
      boolean var5 = var1 * var4 % 8 != 0;
      if (var5) {
         this.k5 = 1;
      }

      this.u9 = (long)this.k5 * var1;
      if (this.u9 >= 4294967295L) {
         throw new com.aspose.slides.internal.h6t.u3(d1.n5("The total count of pixels can't exceed {0}", new Object[]{4294967295L}));
      }

      long var6 = 4294967295L;
      long var8 = (var1 * var4 + 7) / 8 * this.k5;
      if (var8 > 4294967295L) {
         throw new com.aspose.slides.internal.h6t.u3(d1.n5("The total buffer lenght {0} exceeds {1} bytes.", var8, 4294967295L));
      }

      this.h0 = com.aspose.slides.internal.d9r.u9.n5(0).n5((int)var8);
      if (this.h0.length * 8 / var4 == 0) {
         throw new com.aspose.slides.internal.h6t.u3("The buffer allocated is too small. Cannot continue execution.");
      }
   }

   private void n5(Object var1, com.aspose.slides.internal.b8u.n5 var2) {
      long var3 = 0L;
      int[] var5 = com.aspose.slides.internal.v6g.k5.n5(var1, int[].class);
      byte[] var6 = com.aspose.slides.internal.v6g.k5.n5(var1, byte[].class);
      if (var6 == null && var5 == null) {
         throw new ArgumentNullException("ConvertChunkyData - Input pixels is null");
      }

      long var7 = var5 == null ? var6.length : var5.length;
      long var9 = this.h0.length;
      int var11 = this.s7.k7()[0] & 65535;
      int var12 = this.s7.q0();

      for (long var13 = this.n5(var7 - var3); var13 > 0L; var13 = this.n5(var7 - var3)) {
         if (var5 != null) {
            this.n5(var5, (int)var3, (int)var13);
         } else {
            this.n5(var6, (int)var3, (int)var13);
         }

         var3 += var13;
         this.u9 -= var13;
         long var15 = ((var9 - this.c8) * 8L - (7 - this.t2)) / this.l6;
         if (this.u9 == 0L || var15 == 0L) {
            if (this.u9 == 0L && this.t2 != 7) {
               this.c8++;
            }

            byte[] var17 = this.h0;
            int var18 = this.c8;
            if (this.u3) {
               int var19 = (int)(var13 / this.a6);
               com.aspose.slides.internal.o7p.n5 var20 = com.aspose.slides.internal.o7p.c8.n5(this.s7, this.a6, var19);
               var17 = var20.n5(this.h0);
               var18 = var17.length;
            }

            if (var11 == 16 && var12 == 18761) {
               for (int var23 = 0; var23 < var18; var23 += 2) {
                  byte var21 = var17[var23];
                  var17[var23] = var17[var23 + 1];
                  var17[var23 + 1] = var21;
               }
            }

            var2.n5(var17, var18);
            if (this.u9 == 0L) {
               int var22 = q1.l6(this.n5, this.k5);
               var2.n5(var22);
               this.n5 -= var22;
               this.u9 = this.a6 * q1.l6(this.n5, this.k5);
               this.t2 = 7;
            } else if (this.c8 > 0 && this.c8 < var9 && this.t2 < 7) {
               this.h0[0] = this.h0[this.c8];
            }

            this.c8 = 0;
         }
      }
   }

   private void l6(Object var1, com.aspose.slides.internal.b8u.n5 var2) {
      if (var2 == null) {
         throw new ArgumentNullException("partialDataWriter");
      }

      int[] var3 = com.aspose.slides.internal.v6g.k5.n5(var1, int[].class);
      byte[] var4 = com.aspose.slides.internal.v6g.k5.n5(var1, byte[].class);
      if (var4 == null && var3 == null) {
         throw new ArgumentNullException("ConvertPlanarData - Input pixels is null");
      }

      m1 var5 = com.aspose.slides.internal.v6g.k5.n5(var2, m1.class);
      if (var5 == null) {
         throw new com.aspose.slides.internal.h6t.u3(
            d1.n5(
               "Processing of image data with planar configuration isn't supported for compression={0}",
               new Object[]{s3.n5(com.aspose.slides.internal.w2a.a6.class, this.s7.m3())}
            )
         );
      }

      int var6 = this.t2;
      int var7 = this.l6;
      int var8 = this.a6;
      int var9 = this.k5;
      int var10 = this.n5;
      int var11 = this.s7.k7().length;
      int var12 = this.s7.t1();
      int var13 = this.s7.q0();
      long var14 = this.h0.length / var11;
      byte[] var16 = new byte[(int)var14];
      int var17 = 0;

      for (int var18 = 0; var18 < var11; var18++) {
         int var19 = this.s7.k7()[var18] & 65535;
         this.n5(var8, var10, var9, var7);
         var5.n5();
         long var20 = 0L;
         long var22 = var3 == null ? var4.length : var3.length;
         long var24 = this.h0.length;

         for (long var26 = this.n5(var22 - var20); var26 > 0L; var26 = this.n5(var22 - var20)) {
            if (var3 != null) {
               this.n5(var3, (int)var20, (int)var26);
            } else {
               this.n5(var4, (int)var20, (int)var26);
            }

            var20 += var26;
            this.u9 -= var26;
            long var28 = ((var24 - this.c8) * 8L - (7 - this.t2)) / this.l6;
            if (this.u9 == 0L || var28 == 0L) {
               if (this.u9 == 0L && this.t2 != 7) {
                  this.c8++;
               }

               int var30 = var17;
               int var31 = 0;

               for (int var32 = 0; var32 < var26; var32++) {
                  com.aspose.slides.internal.r1x.u3.n5(this.h0, var30, var16, var31, var19);
                  var30 += var12;
                  var31 += var19;
               }

               var17 += var19;
               byte[] var36 = var16;
               int var33 = (int)((var26 * var19 + 7L) / 8L);
               if (this.u3 && (var18 == 1 || var18 == 2)) {
                  int var34 = (int)(var26 / this.a6);
                  c8 var35 = new c8(this.s7, this.a6, var34);
                  var36 = var35.k5(var16);
                  var33 = var36.length;
               }

               if (var19 == 16 && var13 == 18761) {
                  for (int var39 = 0; var39 < var33; var39 += 2) {
                     byte var37 = var36[var39];
                     var36[var39] = var36[var39 + 1];
                     var36[var39 + 1] = var37;
                  }
               }

               var2.n5(var36, var33);
               if (this.u9 == 0L) {
                  int var38 = q1.l6(this.n5, this.k5);
                  var2.n5(var38);
                  this.n5 -= var38;
                  this.u9 = this.a6 * q1.l6(this.n5, this.k5);
                  this.t2 = 7;
               } else if (this.c8 > 0 && this.c8 < var24 && this.t2 < 7) {
                  this.h0[0] = this.h0[this.c8];
               }

               this.c8 = 0;
            }
         }
      }
   }
}
