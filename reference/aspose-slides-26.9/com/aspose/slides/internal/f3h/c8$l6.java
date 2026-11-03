package com.aspose.slides.internal.f3h;

class c8$l6 {
   int n5;
   int l6;
   int k5;
   int u3;
   int a6;
   private static c8$l6[] u9 = new c8$l6[]{
      new c8$l6(0, 0, 0, 0, 0),
      new c8$l6(4, 4, 8, 4, 1),
      new c8$l6(4, 5, 16, 8, 1),
      new c8$l6(4, 6, 32, 32, 1),
      new c8$l6(4, 4, 16, 16, 2),
      new c8$l6(8, 16, 32, 32, 2),
      new c8$l6(8, 16, 128, 128, 2),
      new c8$l6(8, 32, 128, 256, 2),
      new c8$l6(32, 128, 258, 1024, 2),
      new c8$l6(32, 258, 258, 4096, 2)
   };

   private c8$l6(int var1, int var2, int var3, int var4, int var5) {
      this.n5 = var1;
      this.l6 = var2;
      this.k5 = var3;
      this.u3 = var4;
      this.a6 = var5;
   }

   public static c8$l6 n5(int var0) {
      return u9[var0];
   }
}
