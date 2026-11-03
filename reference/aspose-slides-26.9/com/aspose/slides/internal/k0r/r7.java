package com.aspose.slides.internal.k0r;

public class r7 extends r4 {
   private static final int[] n5 = new int[]{4100, Integer.MAX_VALUE, 4026, 0};

   public r7() {
      this.w1().n5(4101);
      this.e2().addItem(new u2());
      this.e2().addItem(new z1("", (short)0));
   }

   public r7(int var1) {
      this.w1().n5(4101);
   }

   public final u2 l6() {
      return (u2)this.k5(4100);
   }

   public final z1 u3() {
      return this.l6((short)0);
   }

   public final void n5(z1 var1) {
      z1 var2 = this.l6(var1.y2());
      if (var2 == null) {
         this.e2().addItem(var1);
      }
   }

   @Override
   protected int[] k5() {
      return n5;
   }
}
