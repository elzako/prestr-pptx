package com.aspose.slides.internal.a0;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public class e2 {
   private double n5;
   private double l6;
   private double k5;
   private double u3;
   private double a6;
   private double u9;
   private static final e2 h0 = new e2(1.0, 0.0, 0.0, 1.0, 0.0, 0.0);
   private static final e2 c8 = new e2(1.0, 0.0, 0.0, 1.0, 0.0, 0.0);
   private static final e2 t2 = new e2(0.0, 1.0, -1.0, 0.0, 0.0, 0.0);

   public final void n5(double var1) {
      this.u9 = var1;
   }

   public e2() {
      this.n5 = 1.0;
      this.l6 = 0.0;
      this.k5 = 0.0;
      this.u3 = 1.0;
      this.a6 = 0.0;
      this.u9 = 0.0;
   }

   public e2(double var1, double var3, double var5, double var7, double var9, double var11) {
      this.n5 = var1;
      this.l6 = var3;
      this.k5 = var5;
      this.u3 = var7;
      this.a6 = var9;
      this.u9 = var11;
   }

   public e2(double var1, double var3) {
      this.n5 = 1.0;
      this.l6 = 0.0;
      this.k5 = 0.0;
      this.u3 = 1.0;
      this.a6 = var1;
      this.u9 = var3;
   }

   protected e2(e2 var1) {
      this.n5 = var1.n5;
      this.l6 = var1.l6;
      this.k5 = var1.k5;
      this.u3 = var1.u3;
      this.a6 = var1.a6;
      this.u9 = var1.u9;
   }

   public static e2 n5(com.aspose.slides.internal.v8.n3 var0, int var1, int var2) {
      switch (var0.l6()) {
         case 79:
            return new e2(h0);
         case 121:
            return new e2(c8);
         case 140:
         case 205:
            e2 var3 = new e2(t2);
            var3.a6 = var2;
            return var3;
         default:
            return null;
      }
   }

   public final e2 n5(e2 var1) {
      return new e2(
         var1.n5 * this.n5 + var1.l6 * this.k5,
         var1.n5 * this.l6 + var1.l6 * this.u3,
         var1.k5 * this.n5 + var1.u3 * this.k5,
         var1.k5 * this.l6 + var1.u3 * this.u3,
         var1.a6 * this.n5 + var1.u9 * this.k5 + this.a6,
         var1.a6 * this.l6 + var1.u9 * this.u3 + this.u9
      );
   }

   public final e2 l6(double var1) {
      double var3;
      double var5;
      if (var1 == 90.0 || var1 == -270.0) {
         var3 = 0.0;
         var5 = 1.0;
      } else if (var1 == 270.0 || var1 == -90.0) {
         var3 = 0.0;
         var5 = -1.0;
      } else if (var1 != 180.0 && var1 != -180.0) {
         double var7 = var1 * 0.017444;
         var3 = q1.c8(var7);
         var5 = q1.h0(var7);
      } else {
         var3 = -1.0;
         var5 = 0.0;
      }

      e2 var9 = new e2(var3, -var5, var5, var3, 0.0, 0.0);
      return this.n5(var9);
   }

   public final e2 n5(double var1, double var3) {
      e2 var5 = new e2(1.0, 0.0, 0.0, 1.0, var1, var3);
      return this.n5(var5);
   }

   public final com.aspose.slides.internal.o9b.y1 n5(com.aspose.slides.internal.o9b.y1 var1) {
      int var2 = com.aspose.slides.internal.v6g.k5.u3(var1.x8() * this.n5 + var1.n3() * this.k5 + this.a6, 14);
      int var3 = com.aspose.slides.internal.v6g.k5.u3(var1.x8() * this.l6 + var1.n3() * this.u3 + this.u9, 14);
      int var4 = com.aspose.slides.internal.v6g.k5.u3((var1.x8() + var1.s7()) * this.n5 + (var1.n3() + var1.k5()) * this.k5 + this.a6, 14);
      int var5 = com.aspose.slides.internal.v6g.k5.u3((var1.x8() + var1.s7()) * this.l6 + (var1.n3() + var1.k5()) * this.u3 + this.u9, 14);
      if (var2 > var4) {
         int var6 = var4;
         var4 = var2;
         var2 = var6;
      }

      if (var3 > var5) {
         int var7 = var5;
         var5 = var3;
         var3 = var7;
      }

      return com.aspose.slides.internal.o9b.y1.n5(new com.aspose.slides.internal.o9b.y2(var2, var3, var4 - var2, var5 - var3));
   }

   @Override
   public String toString() {
      return d1.n5(
         "[",
         com.aspose.slides.ms.System.d2.u9(this.n5),
         " ",
         com.aspose.slides.ms.System.d2.u9(this.l6),
         " ",
         com.aspose.slides.ms.System.d2.u9(this.k5),
         " ",
         com.aspose.slides.ms.System.d2.u9(this.u3),
         " ",
         com.aspose.slides.ms.System.d2.u9(this.a6),
         " ",
         com.aspose.slides.ms.System.d2.u9(this.u9),
         "]"
      );
   }

   public final double[] n5() {
      return new double[]{this.n5, this.l6, this.k5, this.u3, this.a6, this.u9};
   }

   public final com.aspose.slides.internal.x4g.m1 l6() {
      double[] var1 = this.n5();
      return new com.aspose.slides.internal.x4g.m1((float)var1[0], (float)var1[1], (float)var1[2], (float)var1[3], (float)var1[4], (float)var1[5]);
   }

   public static e2 n5(int var0, com.aspose.slides.internal.v8.n3 var1, com.aspose.slides.internal.o9b.y1 var2, com.aspose.slides.internal.f2.n5 var3) {
      int var4;
      int var5;
      if (var0 % 180 == 0) {
         var4 = com.aspose.slides.internal.v6g.k5.u3(var2.s7(), 13);
         var5 = com.aspose.slides.internal.v6g.k5.u3(var2.k5(), 13);
      } else {
         var5 = com.aspose.slides.internal.v6g.k5.u3(var2.s7(), 13);
         var4 = com.aspose.slides.internal.v6g.k5.u3(var2.k5(), 13);
      }

      e2 var6 = new e2(var2.x8(), var2.n3());
      if (var0 != 0) {
         switch (var0) {
            case -270:
            case 90:
               var6 = var6.n5(0.0, var4);
               break;
            case -180:
            case 180:
               var6 = var6.n5(var4, var5);
               break;
            case -90:
            case 270:
               var6 = var6.n5(var5, 0.0);
               break;
            default:
               throw new Exception();
         }

         var6 = var6.l6(var0);
      }

      switch (var1.l6()) {
         case 79:
         case 121:
         default:
            var3.n5 = var4;
            var3.l6 = var5;
            break;
         case 140:
         case 205:
            var3.n5 = var5;
            var3.l6 = var4;
      }

      return var6.n5(n5(var1, var3.n5, var3.l6));
   }
}
