package com.aspose.slides.internal.l7h;

public class d2$n5 extends x8 {
   public int n5 = 0;
   public boolean u9 = false;
   public boolean h0 = false;
   public boolean c8 = false;
   public char t2 = 0;
   public char s7 = 0;

   public d2$n5(w1 var1) {
      super(var1);
      this.n5 = var1.t9() - 57000;
   }

   @Override
   public void n5() {
      this.u9 = false;
      this.h0 = false;
      this.c8 = false;
      this.t2 = 0;
      this.s7 = 0;
      if (this.k5 != null) {
         this.k5.k5();
      }
   }

   @Override
   public boolean l6() {
      return this.t2 != 0 || this.s7 != 0 || this.u9 || this.c8;
   }
}
