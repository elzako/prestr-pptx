package com.aspose.slides.internal.k0r;

public class a9 extends e6r {
   private int[] n5 = null;
   private final w8 l6 = new w8();

   public a9() {
      this.w1().n5(61730);
      this.w1().n5((byte)3);
      this.n5((int[])null);
   }

   public final w8 l6() {
      return this.l6;
   }

   @Override
   protected void n5(com.aspose.slides.internal.z0k.n5 var1) {
      this.l6.l6();
      this.l6.n5(var1, this.w1().a6(), this.w1().k5());
      b2 var2 = com.aspose.slides.internal.v6g.k5.n5(this.l6().n5(928), b2.class);
      if (var2 != null) {
         int var3 = var2.u3() & 65535;
         this.n5 = new int[var3];

         for (int var4 = 0; var4 < var3; var4++) {
            this.n5[var4] = (int)var2.l6(var4);
         }
      }
   }

   private void a6() {
      int var1 = this.n5.length;
      b2 var2 = new b2(928, com.aspose.slides.internal.n8e.v4.n5(var1), 4);

      for (int var3 = 0; var3 < var1; var3++) {
         var2.n5(var3, this.n5[var3] & 4294967295L);
      }

      this.l6().n5(928, var2);
   }

   @Override
   public void n5(com.aspose.slides.internal.z0k.l6 var1) {
      if (this.n5 != null && this.n5.length > 0) {
         this.a6();
      }

      this.w1().n5((short)this.l6.n5());
      this.l6.n5(var1);
   }

   @Override
   public int n5() {
      if (this.n5 != null && this.n5.length > 0) {
         this.a6();
      }

      return this.l6.k5();
   }

   public final int[] k5() {
      return this.n5;
   }

   public final void n5(int[] var1) {
      if (var1 != null) {
         this.n5 = var1;
      } else {
         this.n5 = new int[0];
      }
   }

   public final boolean u3() {
      s4 var1 = com.aspose.slides.internal.v6g.k5.n5(this.l6().n5(927), s4.class);
      return var1 != null ? var1.l6() : false;
   }
}
