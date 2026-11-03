package com.aspose.slides.internal.k4d;

import com.aspose.slides.internal.n2d.t2;

public class u3 {
   private final int n5;
   private final int l6;
   private final int k5;
   private final int u3;
   private double a6;
   private double u9;
   private boolean h0;

   public static u3 n5(int var0, int var1, double var2, double var4) {
      return new u3(0, 0, var0, var1, var2, var4);
   }

   public static u3 n5(int var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var2 - var0;
      int var7 = var3 - var1;
      double var8 = var4 != 0 ? var6 / t2.n5(var4) : 0.0;
      double var10 = var5 != 0 ? var7 / t2.n5(var5) : 0.0;
      return new u3(var0, var1, var6, var7, var8, var10);
   }

   private u3(int var1, int var2, int var3, int var4, double var5, double var7) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
      this.a6 = var5;
      this.u9 = var7;
      if (var5 == 0.0 || var7 == 0.0) {
         this.h0 = true;
         this.a6 = 96.0;
         this.u9 = 96.0;
      }
   }

   public final int n5() {
      return this.k5;
   }

   public final int l6() {
      return this.u3;
   }

   public final double k5() {
      return this.u9;
   }

   public final boolean u3() {
      return this.h0;
   }

   public final double a6() {
      return t2.l6(this.k5, this.a6);
   }

   public final double u9() {
      return t2.l6(this.u3, this.u9);
   }
}
