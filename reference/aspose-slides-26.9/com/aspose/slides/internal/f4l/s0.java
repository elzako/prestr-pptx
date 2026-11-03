package com.aspose.slides.internal.f4l;

public class s0 extends p8 {
   private int n5;
   private v8[] l6;

   public final int n5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final v8[] l6() {
      return this.l6;
   }

   public final void n5(v8[] var1) {
      this.l6 = var1;
   }

   public int k5() {
      int var1 = 8;

      for (v8 var5 : this.l6) {
         if (var5 != null) {
            var1 += var5.k5();
         }
      }

      return var1;
   }
}
