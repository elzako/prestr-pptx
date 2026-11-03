package com.aspose.slides.internal.q5;

public class u3$n5 extends com.aspose.slides.internal.l7.c8 {
   private boolean n5 = false;
   private long l6 = 0L;

   public static u3$n5 n5(com.aspose.slides.internal.l7.u3 var0, com.aspose.slides.internal.m9.c8 var1) {
      return new u3$n5(var0, var1);
   }

   protected u3$n5(com.aspose.slides.internal.l7.u3 var1, com.aspose.slides.internal.m9.c8 var2) {
      super(var1, var2);
      var2.n5(new int[]{0, 8, 12});
   }

   @Override
   public boolean s7() {
      if (this.u9()) {
         com.aspose.slides.internal.m9.h0 var1 = this.k5();
         var1.n5(com.aspose.slides.internal.q5.u3.t2());
      }

      if (this.n5) {
         com.aspose.slides.internal.m9.h0 var4 = this.k5();
         var4.n5(com.aspose.slides.internal.q5.u3.t2());
         long var2 = 2981146554L - (this.l6 + var4.k5());
         this.l6(var2);
      }

      return super.s7();
   }

   @Override
   protected com.aspose.slides.internal.l7.l6 n5(com.aspose.slides.internal.m9.h0 var1) {
      return new u3(this.y4(), var1, null);
   }

   public final void n5(long var1) {
      if (!this.n5) {
         this.n5 = true;
         this.l6 = var1;
      }
   }

   public final void l6(long var1) {
      this.u3().n5(8, var1);
   }

   public final int t9() {
      return ((u3)this.e2()).c8();
   }
}
