package com.aspose.slides.internal.p5k;

public class z3 extends com.aspose.slides.internal.e1.y4 {
   private float n5;
   private float l6;
   private float k5;
   private float u3;

   private z3() {
   }

   public static com.aspose.slides.internal.o9b.y1 k5(com.aspose.slides.internal.e1.r4 var0) {
      z3 var1 = new z3();
      var1.l6((com.aspose.slides.internal.e1.m3)var0);
      return new com.aspose.slides.internal.o9b.y1(var1.n5, var1.l6, var1.k5 - var1.n5, var1.u3 - var1.l6);
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.y2 var1) {
      for (int var2 = 0; var2 < var1.n5().size(); var2++) {
         com.aspose.slides.internal.o9b.w1 var3 = var1.n5().get_Item(var2).u3();
         this.n5(var3.u3());
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.a6 var1) {
      this.n5(var1.n5().n5().u3());
      this.n5(var1.n5().l6().u3());
      this.n5(var1.n5().k5().u3());
      this.n5(var1.n5().u3().u3());
   }

   private void n5(com.aspose.slides.internal.o9b.w1 var1) {
      if (var1.l6() > this.k5) {
         this.k5 = var1.l6();
      }

      if (var1.k5() > this.u3) {
         this.u3 = var1.k5();
      }

      if (var1.l6() < this.n5) {
         this.n5 = var1.l6();
      }

      if (var1.k5() < this.l6) {
         this.l6 = var1.k5();
      }
   }
}
