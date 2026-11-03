package com.aspose.slides.internal.e5a;

public class s7$n5 {
   public int n5;
   public int l6;
   public int k5;
   public int u3;
   public int a6;
   private static final s7$n5[] u9 = new s7$n5[]{
      new s7$n5(0, 0, 0, 0, 0),
      new s7$n5(4, 4, 8, 4, 1),
      new s7$n5(4, 5, 16, 8, 1),
      new s7$n5(4, 6, 32, 32, 1),
      new s7$n5(4, 4, 16, 16, 2),
      new s7$n5(8, 16, 32, 32, 2),
      new s7$n5(8, 16, 128, 128, 2),
      new s7$n5(8, 32, 128, 256, 2),
      new s7$n5(32, 128, 258, 1024, 2),
      new s7$n5(32, 258, 258, 4096, 2)
   };

   private s7$n5(int var1, int var2, int var3, int var4, int var5) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
      this.a6 = var5;
   }

   public static s7$n5 n5(int var0) {
      return u9[var0];
   }
}
