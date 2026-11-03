package com.aspose.slides.internal.o8m;

public abstract class f0 extends u8 {
   protected int n5;

   public static f0 k5() {
      return n5(a3.class.getName());
   }

   public static f0 n5(String var0) {
      return (f0)y4.n5(var0);
   }

   public int a6() {
      return this.n5 == 0 ? this.a6 : this.n5;
   }

   @Override
   public int u9() {
      return super.u9();
   }

   @Override
   public void n5(int var1) {
      super.n5(var1);
      this.n5 = var1;
   }

   protected f0() {
      this.a6 = 128;
      this.k5 = 64;
      this.t2 = 8;
      this.c8 = new e5[1];
      this.c8[0] = new e5(40, 128, 8);
      this.h0 = new e5[1];
      this.h0[0] = new e5(64, 64, 0);
   }
}
