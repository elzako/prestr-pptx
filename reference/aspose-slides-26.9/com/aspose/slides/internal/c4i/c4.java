package com.aspose.slides.internal.c4i;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class c4 extends m1 {
   private int n5;
   private int l6;
   private com.aspose.slides.ms.System.u3 k5;

   public c4(e5 var1) {
      super(var1);
   }

   public final boolean u3() {
      return this.h0(15);
   }

   public final boolean u9() {
      return this.h0(14);
   }

   public final boolean h0() {
      return this.h0(11);
   }

   public final int c8() {
      return this.n5;
   }

   public final void k5(int var1) {
      this.n5 = var1;
   }

   public final int t2() {
      return this.l6;
   }

   public final void u3(int var1) {
      if (var1 < 3) {
         throw new ArgumentOutOfRangeException("value");
      }

      this.l6 = var1;
   }

   public final com.aspose.slides.ms.System.u3 s7() {
      return this.k5;
   }

   public final void n5(com.aspose.slides.ms.System.u3 var1) {
      this.k5 = var1;
   }
}
