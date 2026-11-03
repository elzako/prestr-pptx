package com.aspose.slides.internal.k0r;

public class l1 extends r4 {
   private b7 n5;
   private q5 l6;
   private e4 k5;
   private static final int[] u3 = new int[]{
      61448, Integer.MAX_VALUE, 61720, Integer.MAX_VALUE, 61443, Integer.MAX_VALUE, 61444, Integer.MAX_VALUE, 61445, Integer.MAX_VALUE
   };

   public l1() {
      super(61442);
   }

   public final b7 l6() {
      if (this.n5 != null) {
         return this.n5;
      }

      this.n5 = com.aspose.slides.internal.v6g.k5.n5(this.k5(61448), b7.class);
      if (this.n5 == null && this.n3()) {
         this.n5 = new b7();
         this.n5(this.n5);
      }

      return this.n5;
   }

   public final e4 u3() {
      if (this.k5 != null) {
         return this.k5;
      }

      this.k5 = com.aspose.slides.internal.v6g.k5.n5(this.k5(61443), e4.class);
      if (this.k5 == null && this.n3()) {
         this.k5 = new e4();
         this.k5.l6(true);
         this.n5(this.k5);
      }

      return this.k5;
   }

   public final q5 a6() {
      if (this.l6 != null) {
         return this.l6;
      }

      this.l6 = com.aspose.slides.internal.v6g.k5.n5(this.k5(61444), q5.class);
      if (this.l6 == null && this.n3()) {
         this.l6 = new q5();
         this.l6.l6(true);
         this.n5(this.l6);
      }

      return this.l6;
   }

   @Override
   protected int[] k5() {
      return u3;
   }
}
