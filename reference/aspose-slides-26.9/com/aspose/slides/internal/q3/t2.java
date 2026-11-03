package com.aspose.slides.internal.q3;

import com.aspose.slides.internal.i4.g7;
import com.aspose.slides.internal.i4.j4;
import com.aspose.slides.internal.i4.z8;

public abstract class t2 extends k5 {
   private z8 n5;

   @Override
   public void h0() {
      this.n5 = (z8)this.u3().n5(this.n5());
      this.l6();
   }

   protected abstract String n5();

   public final j4 k5() {
      return this.n5.z1();
   }

   protected final void k5(String var1) {
      this.k5().n5(var1, new u9(this.u3(), var1, this.k5(), new t2$1(this)), 2);
   }

   protected g7 n5(String var1, g7 var2, g7[] var3) {
      return this.u9();
   }
}
