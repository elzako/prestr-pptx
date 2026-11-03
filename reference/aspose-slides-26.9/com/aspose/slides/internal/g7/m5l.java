package com.aspose.slides.internal.g7;

public class m5l extends c5q {
   private p6w l6;
   private int k5;
   private o9i u3;

   public m5l(long var1, int var3) {
      super(var1, var3);
   }

   public final p6w l6() {
      return this.l6;
   }

   public final o9i k5() {
      return this.u3;
   }

   public final int u3() {
      return this.k5;
   }

   @Override
   public void n5(f3c var1) {
      if (var1.n5() != ((this.n5 & 4294967295L) + 2L & 4294967295L)) {
         var1.n5((this.n5 & 4294967295L) + 2L & 4294967295L);
      }

      int var2 = var1.n3() & 65535;
      this.k5 = var1.n3();
      this.u3 = (this.k5 & 65535) == 0 ? null : f1s.n5(new o9i(this.k5, var1.n5(), this.n5 & 4294967295L, false), var1);
      this.l6 = n5(new p6w(this.n5 & 4294967295L, var2), var1);
   }
}
