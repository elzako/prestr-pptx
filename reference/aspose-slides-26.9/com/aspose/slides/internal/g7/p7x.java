package com.aspose.slides.internal.g7;

public class p7x extends c5q {
   private p6w l6;
   private int k5;

   public p7x(long var1, int var3) {
      super(var1, var3);
   }

   @Override
   public void n5(f3c var1) {
      if (var1.n5() != ((this.n5 & 4294967295L) + 2L & 4294967295L)) {
         var1.n5((this.n5 & 4294967295L) + 2L & 4294967295L);
      }

      int var2 = var1.n3() & 65535;
      this.k5 = var1.n3();
      this.l6 = n5(new p6w(this.n5 & 4294967295L, var2), var1);
   }
}
