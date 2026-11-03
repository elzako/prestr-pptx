package com.aspose.slides.internal.f4l;

public class v3 extends n1 {
   private v8 n5;
   private v8 l6;
   private int k5;

   public final void n5(int var1) {
      this.k5 = var1;
   }

   public final v8 n5() {
      return this.n5;
   }

   public final void n5(v8 var1) {
      this.n5 = var1;
   }

   public final v8 l6() {
      return this.l6;
   }

   public final void l6(v8 var1) {
      this.l6 = var1;
   }

   public int k5() {
      int var1 = 0;
      if (this.n5 != null) {
         var1 += this.n5.k5();
      }

      if (this.l6 != null) {
         var1 += this.l6.k5();
      }

      return var1;
   }
}
