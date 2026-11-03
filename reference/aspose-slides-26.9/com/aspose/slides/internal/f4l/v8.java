package com.aspose.slides.internal.f4l;

public class v8 extends n1 {
   private n1 n5;
   private int l6;

   public final n1 n5() {
      return this.n5;
   }

   public final void n5(n1 var1) {
      this.n5 = var1;
   }

   public final int l6() {
      return this.l6;
   }

   public final void n5(int var1) {
      this.l6 = var1;
   }

   public int k5() {
      int var1 = 4;
      if (this.n5 != null) {
         if (this.n5 instanceof g7) {
            var1 += ((g7)this.n5).k5();
         } else if (this.n5 instanceof v3) {
            var1 += ((v3)this.n5).k5();
         } else {
            var1 += 16;
         }
      }

      return var1;
   }
}
