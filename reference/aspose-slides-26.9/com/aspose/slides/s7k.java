package com.aspose.slides;

final class s7k {
   private com.aspose.slides.internal.o9b.w1[] k5;
   private d2k u3 = new d2k();
   private d2k a6 = new d2k();
   private d2k u9 = new d2k();
   public final com.aspose.slides.internal.x4g.s7 n5 = new com.aspose.slides.internal.x4g.s7();
   public final int l6;

   public s7k(int var1) {
      this.l6 = var1;
      if (this.l6 == 3) {
         this.k5 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), 12)
         );
      } else if (this.l6 == 1) {
         this.k5 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
            com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), 4)
         );
      }
   }

   public final void n5(d2k var1, d2k var2) {
      if (this.l6 == 0) {
         d2k.n5(var2, (float)com.aspose.slides.ms.System.q1.z3(2.0)).n5(this.u3);
      } else if (this.l6 == 1) {
         d2k.n5(var2, 2.0F).n5(this.u3);
      } else {
         var2.n5(this.u3);
      }

      var1.n5(this.a6);
      d2k.l6(this.a6, d2k.n5(this.u3, 2)).n5(this.u9);
   }

   public final void n5(float var1) {
      d2k var2 = d2k.n5(this.u3, var1).u3();
      d2k var3 = d2k.n5(var2, 2).u3();
      this.n5.t2();
      d2k var4 = d2k.l6(this.a6, var3).u3();
      if (this.l6 == 0) {
         this.n5.n5(var4.n5, var4.l6, var2.n5, var2.l6);
      } else if (this.l6 == 1) {
         d2k var5 = d2k.n5(this.a6, var3).u3();
         this.k5[0] = new com.aspose.slides.internal.o9b.w1(this.a6.n5, var4.l6);
         this.k5[1] = new com.aspose.slides.internal.o9b.w1(var5.n5, this.a6.l6);
         this.k5[2] = new com.aspose.slides.internal.o9b.w1(this.a6.n5, var5.l6);
         this.k5[3] = new com.aspose.slides.internal.o9b.w1(var4.n5, this.a6.l6);
         this.n5.l6(this.k5);
      } else if (this.l6 == 2) {
         this.n5.l6(new com.aspose.slides.internal.o9b.y1(var4.n5, var4.l6, var2.n5, var2.l6));
      } else if (this.l6 == 3) {
         d2k var6 = d2k.n5(this.a6, var3).u3();
         this.k5[0] = new com.aspose.slides.internal.o9b.w1(this.u9.n5, var4.l6);
         this.k5[1] = new com.aspose.slides.internal.o9b.w1(var4.n5, var4.l6);
         this.k5[2] = new com.aspose.slides.internal.o9b.w1(var4.n5, this.u9.l6);
         this.k5[3] = new com.aspose.slides.internal.o9b.w1(var6.n5, this.u9.l6);
         this.k5[4] = new com.aspose.slides.internal.o9b.w1(var6.n5, var4.l6);
         this.k5[5] = new com.aspose.slides.internal.o9b.w1(this.u9.n5 + this.u3.n5, var4.l6);
         this.k5[6] = new com.aspose.slides.internal.o9b.w1(this.u9.n5 + this.u3.n5, var6.l6);
         this.k5[7] = new com.aspose.slides.internal.o9b.w1(var6.n5, var6.l6);
         this.k5[8] = new com.aspose.slides.internal.o9b.w1(var6.n5, this.u9.l6 + this.u3.l6);
         this.k5[9] = new com.aspose.slides.internal.o9b.w1(var4.n5, this.u9.l6 + this.u3.l6);
         this.k5[10] = new com.aspose.slides.internal.o9b.w1(var4.n5, var6.l6);
         this.k5[11] = new com.aspose.slides.internal.o9b.w1(this.u9.n5, var6.l6);
         this.n5.l6(this.k5);
      }
   }
}
