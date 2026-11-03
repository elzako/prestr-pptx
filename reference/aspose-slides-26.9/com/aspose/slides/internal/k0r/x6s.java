package com.aspose.slides.internal.k0r;

public class x6s extends r4 {
   private static final int[] n5 = new int[]{4026, 0, 4026, 1, 4026, 2, 4026, 3, 2023, Integer.MAX_VALUE};

   public x6s() {
      this.w1().n5(2022);
      this.e2().addItem(new z1("", (short)0));
      this.e2().addItem(new z1(".WAV", (short)1));
      this.e2().addItem(new z1("0", (short)2));
      this.e2().addItem(new s5g());
   }

   public x6s(int var1) {
      this.w1().n5(2022);
   }

   public final z1 l6() {
      return this.l6((short)0);
   }

   public final z1 u3() {
      return this.l6((short)1);
   }

   public final z1 a6() {
      return this.l6((short)2);
   }

   public final s5g u9() {
      return (s5g)this.k5(2023);
   }

   public final int h0() {
      z1 var1 = this.a6();
      if (var1 != null) {
         try {
            return com.aspose.slides.ms.System.a3.n5(var1.l6());
         } catch (RuntimeException var3) {
            com.aspose.slides.internal.n8e.v4.n5(var3);
         }
      }

      return 0;
   }

   public final void n5(int var1) {
      z1 var2 = this.a6();
      if (var2 != null) {
         var2.n5(com.aspose.slides.ms.System.a3.n5(var1, com.aspose.slides.internal.x7n.l6.k5()));
      }
   }

   @Override
   protected int[] k5() {
      return n5;
   }
}
