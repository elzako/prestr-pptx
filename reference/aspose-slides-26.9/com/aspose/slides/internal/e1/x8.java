package com.aspose.slides.internal.e1;

import com.aspose.slides.Collections.Generic.List;

public class x8 extends t9 {
   private int n5;
   private List<String> l6;
   private com.aspose.slides.internal.p1s.l6 k5;
   private com.aspose.slides.internal.o9b.f2 u3;
   private static final com.aspose.slides.internal.p1s.l6 a6 = com.aspose.slides.internal.e1x.x8.u3().n5("Times New Roman", 12.0F, 0);

   public x8(com.aspose.slides.internal.o9b.w1 var1, String var2, List<String> var3, int var4) {
      super(new com.aspose.slides.internal.o9b.w1(var1.l6() - 1.75F, var1.k5()), var2);
      this.k5 = a6;
      this.u3 = com.aspose.slides.internal.o9b.f2.n5.a6();
      this.l6 = var3;
      this.n5 = var4;
   }

   public x8() {
      this.k5 = a6;
      this.u3 = com.aspose.slides.internal.o9b.f2.n5.a6();
   }

   public final com.aspose.slides.internal.p1s.l6 n5() {
      return this.k5;
   }

   public final void n5(com.aspose.slides.internal.p1s.l6 var1) {
      this.k5 = var1;
   }

   public final List<String> l6() {
      return this.l6;
   }

   public final void n5(List<String> var1) {
      this.l6 = var1;
   }

   public final int k5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   @Override
   public com.aspose.slides.internal.o9b.y1 u3() {
      if (!this.u3.n5()) {
         return new com.aspose.slides.internal.o9b.y1(this.u9().u3(), this.u3.a6());
      }

      float var1 = this.k5.c8();
      float var2 = this.k5.c8();

      for (int var3 = 0; var3 < this.l6.size(); var3++) {
         String var4 = this.l6.get_Item(var3);
         com.aspose.slides.internal.o9b.f2 var5 = this.k5.l6(var4).a6();
         if (var5.l6() > var1) {
            var1 = var5.l6();
         }

         if (var5.k5() > var2) {
            var2 = var5.k5();
         }
      }

      return new com.aspose.slides.internal.o9b.y1(this.u9().u3(), new com.aspose.slides.internal.o9b.f2(var1 + 3.5F, var2));
   }

   public final com.aspose.slides.internal.o9b.f2 a6() {
      return this.u3;
   }

   public final void n5(com.aspose.slides.internal.o9b.f2 var1) {
      var1.l6(this.u3);
   }
}
