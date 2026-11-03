package com.aspose.slides.ms.System;

abstract class u3$l6 extends u3 {
   private final Object n5;
   private final u3$u3 l6;
   private final com.aspose.slides.internal.w4w.n5 k5;

   u3$l6(Object var1, u3$u3 var2) {
      super(null);
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = com.aspose.slides.internal.w4w.n5.n5(u3$u3.n5(var2));
   }

   u3$l6(Object var1, int var2, boolean var3) {
      this(var1, new u3$u3(var1, var2, var3, null));
   }

   @Override
   protected Object n5() {
      return this.n5;
   }

   @Override
   protected u3$u3 l6() {
      return this.l6;
   }

   @Override
   protected com.aspose.slides.internal.w4w.n5 k5() {
      return this.k5;
   }
}
