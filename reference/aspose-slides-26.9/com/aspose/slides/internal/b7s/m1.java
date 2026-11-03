package com.aspose.slides.internal.b7s;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class m1 implements com.aspose.slides.internal.b8u.t9 {
   private final y0 n5;
   private final com.aspose.slides.internal.r1x.v4 l6;
   private com.aspose.slides.internal.l3e.a6 k5;

   public m1(y0 var1, com.aspose.slides.internal.r1x.v4 var2, com.aspose.slides.internal.l3e.a6 var3) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
   }

   @Override
   public final void n5(com.aspose.slides.internal.o9b.y2 var1, byte[] var2, com.aspose.slides.internal.o9b.j5 var3, com.aspose.slides.internal.o9b.j5 var4) {
      if (var2.length == var1.t2() * var1.l6() * this.l6.z3()) {
         var1 = new com.aspose.slides.internal.o9b.y2(0, 0, var1.t2(), var1.l6());
      }

      boolean var5 = this.l6.z3() > 1;
      int var6 = var5 ? com.aspose.slides.internal.n5p.h0.k5(this.k5.n5().a6().c8() & 65535, this.k5.n5().a6().u3()) : this.k5.n5().a6().c8() & 65535;
      int var7 = var5 ? com.aspose.slides.internal.n5p.h0.k5(this.k5.n5().a6().t2() & 65535, this.k5.n5().a6().h0()) : this.k5.n5().a6().t2() & 65535;
      int var8 = var1.c8() * var6;
      int var9 = 0;
      int var10 = this.k5.n5().u9().c4();

      for (int var11 = var1.c8(); var11 < var1.n5(); var11++) {
         for (int var12 = var1.u3(); var12 < var1.u9(); var12++) {
            for (int var13 = 0; var13 < this.l6.z3(); var13++) {
               int var14 = this.l6.m1()[var13];
               short[] var15 = this.k5.l6()[var13];
               byte var16 = var2[var9];
               if (var14 < 8) {
                  switch (var10) {
                     case 0:
                        var16 = (byte)((var16 & 255) >> 8 - var14);
                        break;
                     case 1:
                        var16 = (byte)(var16 & 0xFF & (1 << var14) - 1);
                        break;
                     default:
                        throw new ArgumentOutOfRangeException();
                  }
               }

               var15[var8 + var12] = (short)(var16 & 0xFF);
               var9++;
            }
         }

         int var18 = var8 + (var1.u9() - 1);

         for (int var20 = var1.u9(); var20 < var1.u3() + var6; var20++) {
            for (int var22 = 0; var22 < this.l6.z3(); var22++) {
               short[] var24 = this.k5.l6()[var22];
               var24[var8 + var20] = var24[var18];
            }
         }

         var8 += var6;
      }

      int var17 = (var1.n5() - 1) * var6;
      int var19 = var1.n5() * var6;

      for (int var21 = var1.n5(); var21 < var1.c8() + var7; var21++) {
         for (int var23 = 0; var23 < this.l6.z3(); var23++) {
            short[] var25 = this.k5.l6()[var23];
            System.arraycopy(var25, var17, var25, var19, var6);
         }

         var19 += var6;
      }

      this.n5();
   }

   private void n5() {
      com.aspose.slides.internal.g7e.l6 var1 = this.k5.n5().u9();
      if (var1.a0() == 0 || var1.a0() == 1) {
         t4.n5(this.n5, this.k5.n5().a6());
      }

      this.k5.n5(this.n5);
   }
}
