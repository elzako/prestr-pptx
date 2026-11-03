package com.aspose.slides.internal.l3e;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.b7s.h2;
import com.aspose.slides.internal.b7s.n3;
import com.aspose.slides.internal.b7s.p3;
import com.aspose.slides.internal.b7s.t4;
import com.aspose.slides.internal.o9b.y2;
import com.aspose.slides.internal.t7p.s7;
import com.aspose.slides.internal.t7p.t9;
import com.aspose.slides.ms.System.d1;

public final class u3 extends l6 {
   private com.aspose.slides.internal.j8o.u3 u3;
   private short[][] a6;
   private byte[][] u9;

   public final byte[][] n5() {
      return this.u9;
   }

   public final void n5(h2 var1, y2 var2) {
      if (this.k5.a6() != null && this.k5.a6().u9() != null) {
         for (com.aspose.slides.internal.b7s.u3 var6 : this.k5.a6().u9()) {
            this.k5.n5().set_Item(var6.n5 & 255, var6);
         }
      }

      boolean var10 = false;

      while (!var10) {
         byte var11 = this.k5.n3().u9();
         switch (var11) {
            case -61:
               this.k5.n5(t4.n5(this.k5.n3(), (byte)-61));
               this.k5.l6(false);
               this.u9();
               break;
            case -60:
               com.aspose.slides.internal.b7s.u3[] var12 = com.aspose.slides.internal.b7s.u3.n5(this.k5.n3());

               for (com.aspose.slides.internal.b7s.u3 var9 : var12) {
                  this.k5.n5().set_Item(var9.n5 & 255, var9);
               }
            case -40:
            case 1:
               break;
            case -39:
               var10 = true;
               this.n5(new t9(this.k5));
               this.n5(var2.n3());
               break;
            case -38:
               this.k5.n5(p3.n5(this.k5.n3(), this.k5.u3()));
               this.s7();
               this.l6();
               this.a6();
               break;
            case -36:
               throw new NotSupportedException("This feature is not supported yet.");
            case -35:
               throw new NotSupportedException("Restart intervals are not supported yet.");
            default:
               this.x8();
         }
      }
   }

   private void n5(t9 var1) {
      int var2 = com.aspose.slides.internal.n5p.h0.k5(this.k5.u3().t2() & 65535, this.k5.u3().h0());
      int var3 = com.aspose.slides.internal.n5p.h0.k5(this.k5.u3().c8() & 65535, this.k5.u3().u3());
      p3 var4 = this.k5.u9();

      for (int var5 = 0; var5 < var4.l6.length; var5++) {
         int var6 = var4.l6[var5];
         int var7 = this.n5(var6);
         short[] var8 = this.a6[var7];
         s7 var9 = var1.n5(var6);

         for (int var10 = 0; var10 < var2; var10 += this.k5.u3().h0()) {
            for (int var11 = 0; var11 < var3; var11 += this.k5.u3().u3()) {
               var9.n5(var8, var11, var10);
            }
         }
      }
   }

   private void n5(y2 var1) {
      int var2 = com.aspose.slides.internal.n5p.h0.k5(this.k5.u3().c8() & 65535, this.k5.u3().u3());
      int var3 = com.aspose.slides.internal.n5p.h0.k5(this.k5.u3().t2() & 65535, this.k5.u3().h0());
      int var4 = this.k5.u3().n5() & 255;
      int var5 = (1 << var4) - 1;
      short var6 = 255;

      for (int var7 = 0; var7 < this.k5.u3().l6().length; var7++) {
         short[] var8 = this.a6[var7];
         byte[] var9 = new byte[var1.t2() * var1.l6()];
         int var10 = var1.x8() * var2 + var1.s7();
         int var11 = 0;
         if (var4 == 8) {
            for (int var15 = 0; var15 < var1.l6(); var15++) {
               for (int var16 = 0; var16 < var1.t2(); var16++) {
                  short var17 = var8[var10 + var16];
                  var9[var11++] = (byte)var17;
               }

               var10 += var2;
            }
         } else {
            for (int var12 = 0; var12 < var1.l6(); var12++) {
               for (int var13 = 0; var13 < var1.t2(); var13++) {
                  short var14 = var8[var10 + var13];
                  var9[var11++] = (byte)(var14 * var6 / var5);
               }

               var10 += var2;
            }
         }

         this.u9[var7] = var9;
      }
   }

   private void l6() {
      if (this.k5.u9().l6.length == 1) {
         this.k5();
      } else {
         this.u3();
      }
   }

   private void k5() {
      int var1 = this.k5.u3().t2() & 65535;
      int var2 = this.k5.u3().c8() & 65535;
      int var3 = var1 * var2;
      short[] var4 = new short[var3];

      for (int var5 = 0; var5 < var3; var5++) {
         short var6 = 0;
         short[] var7 = new short[]{0};
         boolean var8 = this.u3.n5(var7);
         var6 = var7[0];
         if (!var8) {
            break;
         }

         var4[var5] = var6;
      }

      this.a6[0] = var4;
   }

   private void u3() {
      int var1 = com.aspose.slides.internal.n5p.h0.k5(this.k5.u3().t2() & 65535, this.k5.u3().h0());
      int var2 = com.aspose.slides.internal.n5p.h0.k5(this.k5.u3().c8() & 65535, this.k5.u3().u3());
      p3 var3 = this.k5.u9();

      for (int var4 = 0; var4 < var3.l6.length; var4++) {
         int var5 = var3.l6[var4];
         int var6 = this.n5(var5);
         this.a6[var6] = new short[var1 * var2];
      }

      int var17 = com.aspose.slides.internal.n5p.h0.n5(this.k5.u3().t2() & 65535, this.k5.u3().h0());
      int var18 = 0;
      int var19 = 0;

      for (int var7 = 0; var7 < var17; var7++) {
         var19 = var18;

         for (int var8 = 0; var8 < this.k5.t2(); var8++) {
            short[] var9 = new short[var3.u9()];
            if (!this.u3.l6(var9)) {
               return;
            }

            int var10 = 0;

            while (var10 < var3.u9()) {
               int var11 = var3.k5()[var10];
               n3 var12 = this.k5.u3().l6()[var11];
               short[] var13 = this.a6[var11];
               int var14 = var19;

               for (int var15 = 0; var15 < var12.t2(); var15++) {
                  for (int var16 = 0; var16 < var12.s7(); var16++) {
                     var13[var14 + var16] = var9[var10++];
                  }

                  var14 += var2;
               }
            }

            var19 += this.k5.u3().u3();
         }

         var18 += this.k5.u3().h0() * var2;
      }
   }

   private void a6() {
      p3 var1 = this.k5.u9();
      int var2 = com.aspose.slides.internal.n5p.h0.k5(this.k5.u3().c8() & 65535, this.k5.u3().u3());
      int var3 = com.aspose.slides.internal.n5p.h0.k5(this.k5.u3().t2() & 65535, this.k5.u3().h0());

      for (int var4 = 0; var4 < var1.l6.length; var4++) {
         int var5 = var1.l6[var4];
         int var6 = this.n5(var5);
         n3 var7 = this.k5.u3().l6()[var6];
         int var8 = this.k5.u3().u3() / (var7.u3() & 255);
         int var9 = this.k5.u3().h0() / (var7.n3() & 255);
         short[] var10 = this.a6[var6];

         for (int var11 = 0; var11 < var3; var11 += var9) {
            int var12 = var11 * var2;
            int var13 = var12 - var9 * var2;

            for (int var14 = 0; var14 < var2; var14 += var8) {
               short var15 = var10[var12 + var14];
               if (var14 == 0 && var11 == 0) {
                  short var21 = (short)(1 << (this.k5.u3().n5() & 255) - 1);
                  var10[0] = (short)(var15 + var21);
               } else {
                  int var17;
                  if (var14 > 0 && var11 == 0) {
                     var17 = 1;
                  } else if (var14 == 0 && var11 > 0) {
                     var17 = 2;
                  } else {
                     var17 = var1.u3 & 255;
                  }

                  short var16;
                  switch (var17) {
                     case 1:
                        short var25 = var10[var12 + (var14 - var8)];
                        var16 = var25;
                        break;
                     case 2:
                        short var29 = var10[var13 + var14];
                        var16 = var29;
                        break;
                     case 3:
                        short var32 = var10[var13 + (var14 - var8)];
                        var16 = var32;
                        break;
                     case 4:
                        short var24 = var10[var12 + (var14 - var8)];
                        short var28 = var10[var13 + var14];
                        short var31 = var10[var13 + (var14 - var8)];
                        var16 = (short)(var24 + var28 - var31);
                        break;
                     case 5:
                        short var23 = var10[var12 + (var14 - var8)];
                        short var27 = var10[var13 + var14];
                        short var30 = var10[var13 + (var14 - var8)];
                        var16 = (short)(var23 + (var27 - var30) / 2);
                        break;
                     case 6:
                        short var22 = var10[var12 + (var14 - var8)];
                        short var26 = var10[var13 + var14];
                        short var20 = var10[var13 + (var14 - var8)];
                        var16 = (short)(var26 + (var22 - var20) / 2);
                        break;
                     case 7:
                        short var18 = var10[var12 + (var14 - var8)];
                        short var19 = var10[var13 + var14];
                        var16 = (short)((var18 + var19) / 2);
                        break;
                     default:
                        throw new NotSupportedException("predictor");
                  }

                  var10[var12 + var14] = (short)(var15 + var16);
               }
            }
         }
      }
   }

   private void u9() {
      this.u3 = new com.aspose.slides.internal.j8o.u3(this.k5);

      for (n3 var4 : this.k5.u3().l6()) {
         if (this.k5.u3().u3() < (var4.u3() & 255)) {
            this.k5.u3().n5(var4.u3() & 255);
         }

         if (this.k5.u3().h0() < (var4.n3() & 255)) {
            this.k5.u3().k5(var4.n3() & 255);
         }
      }

      for (n3 var8 : this.k5.u3().l6()) {
         var8.n5 = com.aspose.slides.internal.n5p.h0.n5((this.k5.u3().c8() & 65535) * (var8.u3() & 255), this.k5.u3().u3());
         var8.l6(com.aspose.slides.internal.n5p.h0.n5((this.k5.u3().t2() & 65535) * (var8.n3() & 255), this.k5.u3().h0()));
      }

      this.a6 = new short[10][];
      this.u9 = new byte[10][];
   }

   private void s7() {
      if (this.k5.u9().l6.length == 1) {
         n3 var1 = this.k5.u3().l6()[0];
         var1.h0(1);
         var1.u9(1);
         var1.a6(1);
         this.k5.l6(var1.n5);
         this.k5.u9().n5(new int[]{0});
         this.k5.u9().a6(1);
      } else {
         this.k5.l6(com.aspose.slides.internal.n5p.h0.n5(this.k5.u3().c8() & 65535, this.k5.u3().u3()));
         this.k5.u9().a6(0);

         for (int var7 = 0; var7 < this.k5.u9().l6.length; var7++) {
            int var2 = this.k5.u9().l6[var7];
            int var3 = this.n5(var2);
            n3 var4 = this.k5.u3().l6()[var3];
            var4.a6((var4.u3() & 255) * (var4.n3() & 255));
            var4.h0(var4.u3() & 255);
            var4.u9(var4.n3() & 255);
            int var5 = var4.c8();

            while (var5-- > 0) {
               int var6 = this.k5.u9().u9();
               this.k5.u9().a6(var6 + 1);
               this.k5.u9().k5()[var6] = var3;
            }
         }
      }

      this.u3.l6();
   }

   private int n5(int var1) {
      int var2 = -1;

      for (int var3 = 0; var3 < this.k5.u3().l6().length; var3++) {
         if ((this.k5.u3().l6()[var3].u9() & 255) == var1) {
            var2 = var3;
            break;
         }
      }

      if (var2 < 0) {
         throw new com.aspose.slides.internal.z3b.k5(
            d1.n5, new com.aspose.slides.internal.z3b.a6("Corrupted Jpeg scan component id definition. Cannot load image.")
         );
      } else {
         return var2;
      }
   }

   private void x8() {
      int var1 = 0;
      int[] var2 = new int[]{0};
      this.k5.n3().n5(var2);
      var1 = var2[0];
      this.k5.n3().l6(var1 - 2);
   }
}
