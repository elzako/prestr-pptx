package com.aspose.slides.internal.e4;

public abstract class u3 extends com.aspose.slides.internal.l7.a6 {
   protected volatile boolean l6 = false;
   protected Object k5 = new Object();
   private int u3;
   private int a6;

   protected u3(com.aspose.slides.internal.m9.h0 var1, int var2, int var3, int var4) {
      super(var1, var2, var3);
      this.u3 = var4;
      if (this.n5.n5() == 0) {
         this.a6 = 0;
      } else {
         this.a6 = this.n5.u9(0);
      }
   }

   public static int n5(com.aspose.slides.internal.m9.h0 var0, int var1, int var2) {
      if (var2 == 0) {
         return 0;
      }

      int var3 = var0.u9(var1);
      return var3 >= 0 ? 0 : 1;
   }

   public static u3 n5(u9 var0, com.aspose.slides.internal.m9.h0 var1, int var2, int var3) {
      int var4 = n5(var1, var2, var3);
      return var4 == 0 ? new c8(var1, var2, var3) : new n5(var1, var2, var3);
   }

   protected abstract void k5();

   public final int h0() {
      return this.a6;
   }

   public final int c8() {
      return this.n5.u9(2);
   }

   public final int t2() {
      return this.n5.u9(6);
   }

   public final int s7() {
      return this.n5.u9(4);
   }

   public final int x8() {
      return this.n5.u9(8);
   }

   public abstract int a6();

   public abstract com.aspose.slides.internal.m9.h0 u9();
}
