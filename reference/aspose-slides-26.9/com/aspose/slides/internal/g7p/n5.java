package com.aspose.slides.internal.g7p;

import com.aspose.slides.internal.o9b.w1;
import com.aspose.slides.internal.x4g.m3;
import java.util.ArrayList;
import java.util.List;

public abstract class n5<T extends com.aspose.slides.internal.w4c.l6> implements n3<T> {
   protected m3 n5;

   protected n5(m3 var1) {
      this.n5 = var1;
   }

   protected List<com.aspose.slides.internal.o9b.c8[]> n5(com.aspose.slides.internal.o9b.c8[] var1) {
      ArrayList var2 = new ArrayList();

      for (int var3 = 0; var3 < var1.length - 1; var3++) {
         com.aspose.slides.internal.o9b.c8 var4 = var1[var3];
         com.aspose.slides.internal.o9b.c8 var5 = var1[var3 + 1];
         var2.add(this.n5(var4, var5));
      }

      return var2;
   }

   protected com.aspose.slides.internal.o9b.c8[] n5(com.aspose.slides.internal.o9b.c8 var1, com.aspose.slides.internal.o9b.c8 var2) {
      com.aspose.slides.internal.y4x.k5 var3 = new com.aspose.slides.internal.y4x.k5(256);
      return var3.n5(var1, var2);
   }

   protected com.aspose.slides.internal.o9b.c8 n5(com.aspose.slides.internal.o9b.c8[] var1, double var2) {
      var2 = Math.max(0.0, Math.min(1.0, var2));
      int var4 = (int)Math.round(var2 * (var1.length - 1));
      return var1[var4];
   }

   protected double n5(w1 var1, com.aspose.slides.internal.w4c.k5 var2, boolean var3) {
      com.aspose.slides.internal.e3j.u3 var4 = com.aspose.slides.internal.e3j.u3.n5(var2.e2, var1);
      w1 var5 = var4.n5(var2.u9);
      if (var5 == null) {
         return -1.0;
      }

      double var6 = com.aspose.slides.internal.e3j.u9.n5(var5, var2.n5) / var2.t2;
      return var3 ? 1.0 - var6 : var6;
   }

   protected double n5(w1 var1, com.aspose.slides.internal.w4c.n5 var2, boolean var3) {
      com.aspose.slides.internal.e3j.u3 var4 = new com.aspose.slides.internal.e3j.u3(var2.l6, var1);
      w1 var5 = var2.n5 ? var2.l6 : var4.n5(var2.u3);
      w1 var6 = var4.n5(var2.k5);
      if (var5 != null && var6 != null) {
         double var7 = com.aspose.slides.internal.e3j.u9.n5(var5, var1) / com.aspose.slides.internal.e3j.u9.n5(var5, var6);
         return var3 ? 1.0 - var7 : var7;
      } else {
         return -1.0;
      }
   }

   protected com.aspose.slides.internal.o9b.c8 n5(com.aspose.slides.internal.o9b.c8 var1, double var2) {
      return com.aspose.slides.internal.o9b.c8.n5(this.n5(var1.s7(), var2), this.n5(var1.x8(), var2), this.n5(var1.n3(), var2), this.n5(var1.y4(), var2));
   }

   protected int n5(int var1, double var2) {
      return this.n5((int)((var1 & 0xFF) * var2));
   }

   protected int n5(int var1) {
      return Math.min(255, Math.max(0, var1));
   }

   protected com.aspose.slides.internal.o9b.c8 n5(int var1, int var2, int var3, int var4) {
      return com.aspose.slides.internal.o9b.c8.n5(this.n5(var1), this.n5(var2), this.n5(var3), this.n5(var4));
   }
}
