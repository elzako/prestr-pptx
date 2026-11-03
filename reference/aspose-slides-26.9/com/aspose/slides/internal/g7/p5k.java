package com.aspose.slides.internal.g7;

public class p5k extends f1s {
   private int l6;
   private short k5;
   private short u3;
   private int a6 = 0;
   private e3m u9;
   private e3m h0;

   public p5k(long var1) {
      super(var1);
   }

   public final int l6() {
      return this.l6;
   }

   public final short k5() {
      return this.k5;
   }

   public final short u3() {
      return this.u3;
   }

   public final e3m a6() {
      return this.u9;
   }

   @Override
   public void n5(f3c var1) {
      var1.n5(this.n5 & 4294967295L);
      this.l6 = var1.n3() & 65535;
      if (this.l6 >= 0 && this.l6 <= 3) {
         this.k5 = var1.t2();
         this.u3 = var1.t2();
         if (this.l6 != 1) {
            if (this.l6 == 2) {
               this.a6 = var1.n3();
            } else {
               int var2 = var1.n3() & 65535;
               int var3 = var1.n3() & 65535;
               this.u9 = var2 == 0 ? null : f1s.n5(new e3m((this.n5 & 4294967295L) + var2 & 4294967295L), var1);
               this.h0 = var3 == 0 ? null : f1s.n5(new e3m((this.n5 & 4294967295L) + var3 & 4294967295L), var1);
            }
         }
      } else {
         throw new r7c(com.aspose.slides.ms.System.d1.n5("incorrect format number = {0} for Anchor Table", new Object[]{this.l6}));
      }
   }
}
