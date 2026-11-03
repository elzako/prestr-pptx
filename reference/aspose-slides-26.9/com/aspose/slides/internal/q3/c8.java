package com.aspose.slides.internal.q3;

import com.aspose.slides.internal.i4.g7;
import com.aspose.slides.internal.i4.j4;
import com.aspose.slides.internal.i4.u2;
import com.aspose.slides.ms.System.y8;

public abstract class c8 extends k5 {
   private h0 n5;
   private j4 l6;

   @Override
   public void h0() {
      this.n5 = new h0(this.u3(), this.a6(), new c8$1(this));
      this.n5.n5((com.aspose.slides.internal.i4.j9)(this.u3()));
      if (this.k5() != null) {
         this.l6 = (j4)this.n5(this.k5()).c8();
         this.n5.n5(this.l6);
      }

      this.l6();
   }

   public abstract y8 n5();

   protected y8 k5() {
      return null;
   }

   protected final void k5(String var1) {
      this.n5.u9(var1);
   }

   protected final void n5(String var1, int var2) {
      this.n5.n5(var1, var2);
   }

   protected final void n5(g7 var1, String var2, g7 var3) {
      j4 var4 = (j4)var1;
      u2 var5 = new u2(var4, var2, var3);
      var4.n5(var5);
   }

   protected g7 n5(String var1, g7 var2, g7[] var3) {
      return this.u9();
   }

   public final g7 l6(Object var1) {
      g7 var2 = this.n5.l6(var1);
      this.n5(var2);
      return var2;
   }

   public final g7 c8() {
      g7 var1 = this.n5.s7();
      this.n5(var1);
      return var1;
   }

   protected void n5(g7 var1) {
   }
}
