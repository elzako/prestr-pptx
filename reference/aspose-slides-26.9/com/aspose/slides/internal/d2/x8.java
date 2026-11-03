package com.aspose.slides.internal.d2;

import com.aspose.slides.internal.o9b.p8;
import com.aspose.slides.internal.o9b.y1;

public class x8 extends c8 {
   private com.aspose.slides.internal.a0.l6 x8;
   private boolean n3 = false;
   private y1 y4 = new y1();

   public x8(com.aspose.slides.internal.a0.l6 var1) {
      this(var1, -1);
   }

   public x8(com.aspose.slides.internal.a0.l6 var1, int var2) {
      super(0, var2);
      this.x8 = var1;
   }

   public final void l6(boolean var1) {
      this.n3 = var1;
   }

   public final boolean m1() {
      return this.n3;
   }

   public final void n5(y1 var1) {
      var1.a6(this.y4);
   }

   public final y1 k7() {
      return this.y4;
   }

   public final void k5(com.aspose.slides.internal.a0.l6 var1) {
      this.x8 = var1;
   }

   public final com.aspose.slides.internal.a0.l6 m3() {
      return this.x8;
   }

   @Override
   public p8 n5(boolean var1) {
      com.aspose.slides.internal.a0.l6 var2 = this.m3();
      if (var2 != null) {
         p8 var3 = var2.n5(var1).u3();
         if (!var3.n5()) {
            return var3;
         }
      }

      return this.a6() > 0 ? super.n5(var1) : p8.n5;
   }
}
