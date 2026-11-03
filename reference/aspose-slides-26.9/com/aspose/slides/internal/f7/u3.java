package com.aspose.slides.internal.f7;

import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.internal.w0.z1;

public class u3<TPixels extends IGenericList<z1>> {
   protected int n5;
   protected int l6;
   protected int k5;
   protected final a6[] u3;
   protected int[] a6 = new int[256];
   protected int[] u9 = new int[256];
   protected int[] h0 = new int[256];
   protected int[] c8 = new int[32];

   public u3(int var1) {
      this(var1, 10);
   }

   public u3(int var1, int var2) {
      this.l6 = var1 * 3;
      this.k5 = var2;
      this.u3 = (a6[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(a6.class), 256));

      for (int var3 = 0; var3 < 256; var3++) {
         int var4 = (var3 << 12) / 256;
         this.u3[var3] = new a6();
         this.u3[var3].n5 = var4;
         this.u3[var3].l6 = var4;
         this.u3[var3].k5 = var4;
         this.h0[var3] = 256;
         this.u9[var3] = 0;
      }
   }

   public final z1[] n5() {
      z1[] var1 = (z1[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(z1.class), 256));
      int[] var2 = new int[256];
      int var3 = 0;

      while (var3 < 256) {
         var2[this.u3[var3].u3] = var3++;
      }

      for (int var4 = 0; var4 < 256; var4++) {
         this.u3[var2[var4]].n5().n5(var1[var4]);
      }

      return var1;
   }

   public final void l6() {
      int var1 = 0;
      int var2 = 0;

      for (int var3 = 0; var3 < 256; var3++) {
         a6 var4 = this.u3[var3].l6();
         int var5 = var3;
         int var6 = var4.l6;

         for (int var7 = var3 + 1; var7 < 256; var7++) {
            a6 var8 = this.u3[var7].l6();
            if (var8.l6 < var6) {
               var5 = var7;
               var6 = var8.l6;
            }
         }

         a6 var11 = this.u3[var5].l6();
         if (var3 != var5) {
            a6 var12 = var11.l6();
            var4.n5(var11);
            var12.n5(var4);
         }

         var4.n5(this.u3[var3]);
         var11.n5(this.u3[var5]);
         if (var6 != var1) {
            this.a6[var1] = var2 + var3 >> 1;

            for (int var10 = var1 + 1; var10 < var6; var10++) {
               this.a6[var10] = var3;
            }

            var1 = var6;
            var2 = var3;
         }
      }

      this.a6[var1] = var2 + 255 >> 1;

      for (int var9 = var1 + 1; var9 < 256; var9++) {
         this.a6[var9] = 255;
      }
   }

   public final void n5(TPixels var1) {
      if (this.l6 < 1509) {
         this.k5 = 1;
      }

      this.n5 = 30 + (this.k5 - 1) / 3;
      int var2 = 0;
      int var3 = this.l6;
      int var4 = this.l6 / (3 * this.k5);
      int var5 = var4 / 100;
      int var6 = 1024;
      int var7 = 2048;
      int var8 = var7 >> 6;
      if (var8 <= 1) {
         var8 = 0;
      }

      for (int var9 = 0; var9 < var8; var9++) {
         this.c8[var9] = var6 * ((var8 * var8 - var9 * var9) * 256 / (var8 * var8));
      }

      short var10;
      if (this.l6 < 1509) {
         var10 = 3;
      } else if (this.l6 % 499 != 0) {
         var10 = 1497;
      } else if (this.l6 % 491 != 0) {
         var10 = 1473;
      } else if (this.l6 % 487 != 0) {
         var10 = 1461;
      } else {
         var10 = 1509;
      }

      int var17 = 0;

      while (var17 < var4) {
         z1 var11 = ((z1)var1.get_Item(var2 / 3)).n5();
         int var12 = (var11.k5 & 255) << 4;
         int var13 = (var11.l6 & 255) << 4;
         int var14 = (var11.n5 & 255) << 4;
         int var15 = this.n5(var12, var13, var14);
         a6[] var16 = new a6[]{this.u3[var15]};
         n5(var6, var12, var13, var14, var16);
         var16[0].n5(this.u3[var15]);
         if (var8 != 0) {
            this.n5(var8, var15, var12, var13, var14);
         }

         var2 += var10;
         if (var2 >= var3) {
            var2 -= this.l6;
         }

         var17++;
         if (var5 == 0) {
            var5 = 1;
         }

         if (var17 % var5 == 0) {
            var6 -= var6 / this.n5;
            var7 -= var7 / 30;
            var8 = var7 >> 6;
            if (var8 <= 1) {
               var8 = 0;
            }

            for (int var18 = 0; var18 < var8; var18++) {
               this.c8[var18] = var6 * ((var8 * var8 - var18 * var18) * 256 / (var8 * var8));
            }
         }
      }
   }

   public final int n5(z1 var1) {
      int var2 = 1000;
      int var3 = -1;
      int var4 = this.a6[var1.l6 & 0xFF];
      int var5 = var4 - 1;

      while (var4 < 256 || var5 >= 0) {
         if (var4 < 256) {
            a6 var6 = this.u3[var4].l6();
            int var7 = var6.l6 - (var1.l6 & 255);
            if (var7 >= var2) {
               break;
            }

            if (var7 < 0) {
               var7 = -var7;
            }

            int var8 = var6.n5 - (var1.k5 & 255);
            if (var8 < 0) {
               var8 = -var8;
            }

            var7 += var8;
            if (var7 < var2) {
               var8 = var6.k5 - (var1.n5 & 255);
               if (var8 < 0) {
                  var8 = -var8;
               }

               var7 += var8;
               if (var7 < var2) {
                  var2 = var7;
                  var3 = var6.u3;
               }
            }

            var4++;
         }

         if (var5 >= 0) {
            a6 var9 = this.u3[var5].l6();
            int var12 = (var1.l6 & 255) - var9.l6;
            if (var12 >= var2) {
               break;
            }

            if (var12 < 0) {
               var12 = -var12;
            }

            int var16 = var9.n5 - (var1.k5 & 255);
            if (var16 < 0) {
               var16 = -var16;
            }

            var12 += var16;
            if (var12 < var2) {
               var16 = var9.k5 - (var1.n5 & 255);
               if (var16 < 0) {
                  var16 = -var16;
               }

               var12 += var16;
               if (var12 < var2) {
                  var2 = var12;
                  var3 = var9.u3;
               }
            }

            var5--;
         }
      }

      return var3;
   }

   public final z1[] l6(TPixels var1) {
      this.n5((TPixels)var1);
      this.k5();
      this.l6();
      return this.n5();
   }

   public final void k5() {
      for (int var1 = 0; var1 < 256; var1++) {
         a6 var2 = this.u3[var1].l6();
         var2.n5 >>= 4;
         var2.l6 >>= 4;
         var2.k5 >>= 4;
         var2.u3 = var1;
         var2.n5(this.u3[var1]);
      }
   }

   protected final void n5(int var1, int var2, int var3, int var4, int var5) {
      int var6 = var2 - var1;
      if (var6 < -1) {
         var6 = -1;
      }

      int var7 = var2 + var1;
      if (var7 > 256) {
         var7 = 256;
      }

      int var8 = var2 + 1;
      int var9 = var2 - 1;
      int var10 = 1;

      while (var8 < var7 || var9 > var6) {
         int var11 = this.c8[var10++];
         if (var8 < var7) {
            a6 var12 = this.u3[var8].l6();

            try {
               var12.n5 = var12.n5 - var11 * (var12.n5 - var3) / 262144;
               var12.l6 = var12.l6 - var11 * (var12.l6 - var4) / 262144;
               var12.k5 = var12.k5 - var11 * (var12.k5 - var5) / 262144;
            } catch (RuntimeException var14) {
            }

            var12.n5(this.u3[var8++]);
         }

         if (var9 > var6) {
            a6 var16 = this.u3[var9].l6();

            try {
               var16.n5 = var16.n5 - var11 * (var16.n5 - var3) / 262144;
               var16.l6 = var16.l6 - var11 * (var16.l6 - var4) / 262144;
               var16.k5 = var16.k5 - var11 * (var16.k5 - var5) / 262144;
            } catch (RuntimeException var15) {
            }

            var16.n5(this.u3[var9--]);
         }
      }
   }

   protected static void n5(int var0, int var1, int var2, int var3, a6[] var4) {
      var4[0].n5 = var4[0].n5 - var0 * (var4[0].n5 - var1) / 1024;
      var4[0].l6 = var4[0].l6 - var0 * (var4[0].l6 - var2) / 1024;
      var4[0].k5 = var4[0].k5 - var0 * (var4[0].k5 - var3) / 1024;
   }

   protected final int n5(int var1, int var2, int var3) {
      int var4 = Integer.MAX_VALUE;
      int var5 = var4;
      int var6 = -1;
      int var7 = var6;

      for (int var8 = 0; var8 < 256; var8++) {
         a6 var9 = this.u3[var8].l6();
         int var10 = var9.n5 - var1;
         if (var10 < 0) {
            var10 = -var10;
         }

         int var11 = var9.l6 - var2;
         if (var11 < 0) {
            var11 = -var11;
         }

         var10 += var11;
         var11 = var9.k5 - var3;
         if (var11 < 0) {
            var11 = -var11;
         }

         var10 += var11;
         if (var10 < var4) {
            var4 = var10;
            var6 = var8;
         }

         int var12 = var10 - (this.u9[var8] >> 12);
         if (var12 < var5) {
            var5 = var12;
            var7 = var8;
         }

         int var13 = this.h0[var8] >> 10;
         this.h0[var8] = this.h0[var8] - var13;
         this.u9[var8] = this.u9[var8] + (var13 << 10);
      }

      this.h0[var6] = this.h0[var6] + 64;
      this.u9[var6] = this.u9[var6] - 65536;
      return var7;
   }
}
