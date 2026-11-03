package com.aspose.slides.internal.e1;

import com.aspose.slides.Collections.Generic.List;

public class y2 extends m3 implements f2, i1 {
   private com.aspose.slides.internal.p1s.n5 n5 = com.aspose.slides.internal.p1s.n5.c8;
   private List<com.aspose.slides.internal.o9b.w1> l6 = new List<>();

   public y2() {
   }

   public y2(com.aspose.slides.internal.p1s.n5 var1) {
      this.n5 = var1;
   }

   public y2(com.aspose.slides.internal.o9b.w1 var1, com.aspose.slides.internal.o9b.w1 var2) {
      this.l6.addItem(var1.u3());
      this.l6.addItem(var2.u3());
   }

   public y2(float[] var1) {
      int var2 = var1.length / 2;

      for (int var3 = 0; var3 < var2; var3++) {
         this.l6.addItem(new com.aspose.slides.internal.o9b.w1(var1[var3 * 2], var1[var3 * 2 + 1]));
      }
   }

   public y2(com.aspose.slides.internal.o9b.w1[] var1) {
      for (com.aspose.slides.internal.o9b.w1 var5 : var1) {
         this.l6.addItem(var5.u3());
      }
   }

   public final List<com.aspose.slides.internal.o9b.w1> n5() {
      return this.l6;
   }

   @Override
   public final void n5(com.aspose.slides.internal.w0.c8 var1) {
      com.aspose.slides.internal.o9b.w1[] var2 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), this.l6.size())
      );

      for (int var3 = 0; var3 < this.l6.size(); var3++) {
         this.l6.get_Item(var3).n5(var2[var3]);
      }

      var1.n5(var2);

      for (int var4 = 0; var4 < var2.length; var4++) {
         this.l6.set_Item(var4, var2[var4].u3());
      }
   }

   @Override
   public final m3 l6() {
      y2 var1 = new y2(this.n5);

      for (int var2 = 0; var2 < this.l6.size(); var2++) {
         com.aspose.slides.internal.o9b.w1 var3 = this.l6.get_Item(var2).u3();
         var1.l6.addItem(new com.aspose.slides.internal.o9b.w1(var3.l6(), var3.k5()));
      }

      return var1;
   }
}
