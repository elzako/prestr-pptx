package com.aspose.slides.internal.f4l;

import com.aspose.slides.exceptions.ArgumentOutOfRangeException;

public class z6 extends p8 {
   private int n5;
   private e9 l6;
   private t9 k5;

   public final void n5(int var1) {
      if (var1 != 0) {
         throw new ArgumentOutOfRangeException("value");
      }

      this.n5 = var1;
   }

   public final e9 n5() {
      return this.l6;
   }

   public final void n5(e9 var1) {
      this.l6 = var1;
   }

   public final t9 l6() {
      return this.k5;
   }

   public final void n5(t9 var1) {
      this.k5 = var1;
   }
}
