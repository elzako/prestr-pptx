package com.aspose.slides.internal.k0r;

public class y7 extends r4 {
   private o6 n5 = null;
   private q7 l6 = null;

   public y7() {
      super(61440);
      this.w1().n5((short)0);
   }

   public final q7 l6() {
      if (this.l6 != null) {
         return this.l6;
      }

      this.l6 = com.aspose.slides.internal.v6g.k5.n5(this.k5(61446), q7.class);
      if (this.l6 == null && this.n3()) {
         this.l6 = new q7();
         this.e2().insertItem(0, this.l6);
      }

      return this.l6;
   }

   public final o6 u3() {
      if (this.n5 != null) {
         return this.n5;
      }

      this.n5 = com.aspose.slides.internal.v6g.k5.n5(this.k5(61441), o6.class);
      if (this.n5 == null) {
         this.n5 = new o6();
         this.n5.w1().n5((short)0);
         if (this.e2().size() > 1) {
            this.e2().insertItem(1, this.n5);
         } else {
            this.e2().addItem(this.n5);
         }
      }

      return this.n5;
   }

   public final r3 a6() {
      return com.aspose.slides.internal.v6g.k5.n5(this.k5(61451), r3.class);
   }

   public final a9 u9() {
      return com.aspose.slides.internal.v6g.k5.n5(this.k5(61730), a9.class);
   }

   public final o3 h0() {
      return com.aspose.slides.internal.v6g.k5.n5(this.k5(61722), o3.class);
   }

   public final o9 c8() {
      return com.aspose.slides.internal.v6g.k5.n5(this.k5(61726), o9.class);
   }
}
