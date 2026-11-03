package com.aspose.slides.internal.c4i;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class t4 extends m1 {
   private float n5;
   private float l6;
   private com.aspose.slides.internal.y5s.w1 k5 = new com.aspose.slides.internal.y5s.w1();

   public t4(e5 var1) {
      super(var1);
   }

   public final boolean u3() {
      return this.h0(14);
   }

   public final float u9() {
      return this.n5;
   }

   public final void n5(float var1) {
      this.n5 = var1;
   }

   public final float h0() {
      return this.l6;
   }

   public final void l6(float var1) {
      if (!(var1 < -360.0F) && !(var1 > 360.0F)) {
         this.l6 = var1;
      } else {
         throw new ArgumentOutOfRangeException("value");
      }
   }

   public final com.aspose.slides.internal.y5s.w1 c8() {
      return this.k5;
   }

   public final void n5(com.aspose.slides.internal.y5s.w1 var1) {
      var1.n5(this.k5);
   }
}
