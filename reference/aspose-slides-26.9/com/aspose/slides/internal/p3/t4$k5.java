package com.aspose.slides.internal.p3;

public class t4$k5 {
   public int n5;
   public int l6;
   public int k5;
   public int u3;
   public int a6;
   public int u9;
   public double h0;
   public int c8;
   public int t2;
   public int s7;
   public double x8;
   public t4$k5 n3;
   public t4$k5 y4;
   public int e2 = 0;

   public t4$k5(int var1, int var2, int var3, int var4, int var5, int var6, double var7, int var9, int var10, int var11, double var12, t4$k5 var14) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
      this.a6 = var5;
      this.u9 = var6;
      this.h0 = var7;
      this.c8 = var9;
      this.t2 = var10;
      this.s7 = var11;
      this.x8 = var12;
      this.n3 = var14;
   }

   @Override
   public final String toString() {
      return com.aspose.slides.ms.System.d1.n5(
         "<KnuthNode at ",
         com.aspose.slides.ms.System.a3.l6(this.n5),
         " ",
         com.aspose.slides.ms.System.a3.l6(this.u3),
         "+",
         com.aspose.slides.ms.System.a3.l6(this.a6),
         "-",
         com.aspose.slides.ms.System.a3.l6(this.u9),
         " line:",
         com.aspose.slides.ms.System.a3.l6(this.l6),
         " prev:",
         com.aspose.slides.ms.System.a3.l6(this.n3 != null ? this.n3.n5 : -1),
         " dem:",
         com.aspose.slides.ms.System.d2.u9(this.x8),
         " fitness:",
         t4$l6.n5[this.k5],
         ">"
      );
   }
}
