package com.aspose.slides;

import com.aspose.slides.ms.System.IDisposable;

class c6 extends i8 implements IDisposable, x4j {
   private final com.aspose.slides.internal.o9b.l6 l6;
   private final y7 k5;
   private com.aspose.slides.internal.o9b.t4 u3;

   public c6(com.aspose.slides.internal.o9b.p8 var1, m0s var2) {
      super(var1.u3());
      this.l6 = new com.aspose.slides.internal.o9b.l6(var1.l6(), var1.k5());
      this.k5 = new y7(var1.u3(), var2);
   }

   @Override
   public final void dispose() {
      this.k5.dispose();
      this.l6.dispose();
   }

   public final com.aspose.slides.internal.o9b.t4 l6() {
      return this.u3;
   }

   public final void l6(com.aspose.slides.internal.o9b.t4 var1) {
      this.u3 = var1;
   }

   @Override
   public final void n5(float var1, com.aspose.slides.internal.o9b.z1 var2) {
      this.k5.n5(var1);
      com.aspose.slides.internal.o9b.z1 var3 = com.aspose.slides.internal.o9b.z1.n5(this.l6);

      try {
         var3.n5(com.aspose.slides.internal.o9b.c8.m3().o8());
         var3.l6(this.l6(), 0, 0);
      } finally {
         if (var3 != null) {
            var3.dispose();
         }
      }

      this.k5.n5(this.l6);
      var2.n5(com.aspose.slides.internal.o9b.c8.m3().o8());
      if (this.n5() != null) {
         var2.l6(this.n5(), 0, 0);
      }

      var2.l6(this.l6, 0, 0);
   }
}
