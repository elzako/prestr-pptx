package com.aspose.slides.internal.q3;

import com.aspose.slides.internal.i4.g7;
import com.aspose.slides.internal.i4.l5;
import com.aspose.slides.internal.i4.v0;
import com.aspose.slides.ms.System.y8;

public abstract class k5 {
   private v0 n5;

   public final void n5(v0 var1) {
      this.n5 = var1;
      this.h0();
   }

   public final v0 u3() {
      return this.n5;
   }

   public String a6() {
      return null;
   }

   protected final g7 u9() {
      return l5.n5;
   }

   public void h0() {
      this.l6();
   }

   protected final c8 n5(y8 var1) {
      return this.n5.n5(var1);
   }

   protected final void n5(k5 var1) {
      this.n5.n5(var1);
   }

   public abstract void l6();

   protected final g7 n5(Object var1, y8 var2) {
      return this.u3().n5(var2).l6(var1);
   }

   protected final g7 n5(String var1) {
      return this.u3().c4().u9(var1);
   }

   protected final g7 l6(String var1) {
      return var1 == null ? this.u9() : this.n5(var1);
   }

   protected final g7 n5(double var1) {
      return this.u3().w1().n5(var1);
   }

   protected final g7 n5(boolean var1) {
      return this.u3().t9().n5(var1);
   }

   protected final g7 n5(Object var1) {
      return this.u3().n3().l6(var1);
   }
}
