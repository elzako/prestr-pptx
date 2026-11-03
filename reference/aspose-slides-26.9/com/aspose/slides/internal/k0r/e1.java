package com.aspose.slides.internal.k0r;

public class e1 extends h0 {
   private t9p n5;
   private static final int[] l6 = new int[]{4012, Integer.MAX_VALUE};

   public final t9p l6() {
      if (this.n5 != null) {
         return this.n5;
      }

      this.n5 = com.aspose.slides.internal.v6g.k5.n5(this.k5(4012), t9p.class);
      if (this.n5 == null && this.n3()) {
         this.n5 = new t9p();
         this.e2().addItem(this.n5);
      }

      return this.n5;
   }

   @Override
   protected int[] k5() {
      return l6;
   }
}
