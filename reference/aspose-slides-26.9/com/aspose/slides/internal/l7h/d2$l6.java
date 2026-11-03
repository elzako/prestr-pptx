package com.aspose.slides.internal.l7h;

public class d2$l6 extends k7 {
   public int u9 = 0;
   public int h0 = 0;
   public boolean c8 = false;

   public d2$l6(w1 var1) {
      super(var1);
      this.h0 = this.u9 = var1.t9() - 57000;
   }

   @Override
   public void u3() {
      this.c8 = false;
      this.k5 = 0;
      if (this.l6 != null) {
         this.l6.u3();
      }
   }

   @Override
   public boolean h0() {
      return this.k5 != 0 || this.h0 != this.u9;
   }
}
