package com.aspose.slides;

import com.aspose.slides.ms.System.IDisposable;

class n4b extends i8 implements IDisposable, x4j {
   private final com.aspose.slides.internal.o9b.i1 l6;
   private com.aspose.slides.internal.o9b.c8 k5 = new com.aspose.slides.internal.o9b.c8();
   private com.aspose.slides.internal.o9b.c8 u3 = new com.aspose.slides.internal.o9b.c8();
   private com.aspose.slides.internal.o9b.y2 a6 = new com.aspose.slides.internal.o9b.y2();

   public n4b(com.aspose.slides.internal.o9b.p8 var1) {
      super(var1.u3());
      this.a6 = new com.aspose.slides.internal.o9b.y2(com.aspose.slides.internal.o9b.j5.n5.k5(), this.n5.u3());
      this.n5(com.aspose.slides.internal.o9b.c8.m3().o8());
      this.l6(com.aspose.slides.internal.o9b.c8.n5(0, com.aspose.slides.internal.o9b.c8.m3().o8()).o8());
      this.l6 = new com.aspose.slides.internal.o9b.i1(this.l6().o8());
   }

   @Override
   public final void dispose() {
      this.l6.dispose();
   }

   public final com.aspose.slides.internal.o9b.c8 l6() {
      return this.k5.o8();
   }

   public final void n5(com.aspose.slides.internal.o9b.c8 var1) {
      this.k5 = var1.o8();
   }

   public final com.aspose.slides.internal.o9b.c8 k5() {
      return this.u3.o8();
   }

   public final void l6(com.aspose.slides.internal.o9b.c8 var1) {
      this.u3 = var1.o8();
   }

   @Override
   public final void n5(float var1, com.aspose.slides.internal.o9b.z1 var2) {
      var2.n5(com.aspose.slides.internal.o9b.c8.m3().o8());
      if (this.n5() != null) {
         var2.l6(this.n5(), 0, 0);
      }

      this.l6.n5(com.aspose.slides.internal.o9.n5.n5(this.l6().o8(), this.k5().o8(), var1).o8());
      var2.l6(this.l6, this.a6.n3());
   }
}
