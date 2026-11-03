package com.aspose.slides.internal.a0;

import com.aspose.slides.exceptions.NotSupportedException;

public class y1 extends l6 {
   private y2 c8;
   private com.aspose.slides.internal.o9b.y1 t2 = new com.aspose.slides.internal.o9b.y1();
   private boolean s7 = false;

   public y1(com.aspose.slides.internal.o9b.y1 var1) {
      var1.a6(this.t2);
      this.n5(32, true);
   }

   public final void n5(y2 var1) {
      this.c8 = var1;
   }

   public final y2 m1() {
      return this.c8;
   }

   public final void l6(boolean var1) {
      this.s7 = var1;
   }

   public final com.aspose.slides.internal.o9b.y1 k7() {
      return this.s7 ? new com.aspose.slides.internal.o9b.y1(0.0F, 0.0F, this.l6(), this.e_()) : com.aspose.slides.internal.o9b.y1.n5;
   }

   public final com.aspose.slides.internal.o9b.y1 m3() {
      return this.t2;
   }

   @Override
   public final Object clone() {
      throw new NotSupportedException();
   }

   @Override
   public void n5(com.aspose.slides.internal.v8.u3 var1) {
      if (this.c8 != null) {
         this.c8.n5(var1);
      }
   }
}
