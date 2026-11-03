package com.aspose.slides.internal.e1;

public class a6 extends m3 implements f2, i1 {
   private u3 n5 = new u3();
   private com.aspose.slides.internal.p1s.n5 l6 = com.aspose.slides.internal.p1s.n5.c8;

   public a6() {
   }

   public a6(u3 var1) {
      var1.n5(this.n5);
   }

   public a6(u3 var1, com.aspose.slides.internal.p1s.n5 var2) {
      this(var1.u9());
      this.l6 = var2;
   }

   public a6(
      com.aspose.slides.internal.o9b.w1 var1,
      com.aspose.slides.internal.o9b.w1 var2,
      com.aspose.slides.internal.o9b.w1 var3,
      com.aspose.slides.internal.o9b.w1 var4
   ) {
      this.n5 = new u3();
      this.n5.n5(var1.u3());
      this.n5.l6(var2.u3());
      this.n5.k5(var3.u3());
      this.n5.u3(var4.u3());
   }

   public a6(com.aspose.slides.internal.o9b.w1 var1, com.aspose.slides.internal.o9b.w1 var2, com.aspose.slides.internal.o9b.w1 var3) {
      this.n5 = new u3(var1.u3(), var2.u3(), var3.u3());
   }

   public final u3 n5() {
      return this.n5;
   }

   public final void n5(u3 var1) {
      var1.n5(this.n5);
   }

   @Override
   public final void n5(com.aspose.slides.internal.w0.c8 var1) {
      com.aspose.slides.internal.o9b.w1[] var2 = (com.aspose.slides.internal.o9b.w1[])com.aspose.slides.ms.System.u3.n5(
         com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(com.aspose.slides.internal.o9b.w1.class), 4)
      );
      this.n5.n5().n5(var2[0]);
      this.n5.l6().n5(var2[1]);
      this.n5.k5().n5(var2[2]);
      this.n5.u3().n5(var2[3]);
      var1.n5(var2);
      this.n5.n5(var2[0].u3());
      this.n5.l6(var2[1].u3());
      this.n5.k5(var2[2].u3());
      this.n5.u3(var2[3].u3());
   }

   @Override
   public final m3 l6() {
      u3 var1 = new u3();
      var1.n5(new com.aspose.slides.internal.o9b.w1(this.n5.n5().l6(), this.n5.n5().k5()));
      var1.u3(new com.aspose.slides.internal.o9b.w1(this.n5.u3().l6(), this.n5.u3().k5()));
      var1.l6(new com.aspose.slides.internal.o9b.w1(this.n5.l6().l6(), this.n5.l6().k5()));
      var1.k5(new com.aspose.slides.internal.o9b.w1(this.n5.k5().l6(), this.n5.k5().k5()));
      a6 var2 = new a6(var1.u9(), this.l6);
      var1.n5(var2.n5);
      return var2;
   }
}
