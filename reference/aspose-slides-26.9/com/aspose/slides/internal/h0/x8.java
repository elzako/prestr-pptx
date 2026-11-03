package com.aspose.slides.internal.h0;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.k5.d5;
import com.aspose.slides.ms.System.d1;

public class x8 extends n5 implements com.aspose.slides.internal.k5.z1 {
   private e2 n5;
   private w1 l6;

   public x8(q0 var1, com.aspose.slides.internal.k5.q0 var2) {
      super(var1, var2, (short)4);
      this.n5 = new e2(var1);
      this.l6 = new w1();
   }

   @Override
   public String l6() {
      return d1.n5("@media {0} {{ {1} }}", this.h0().n5(), this.u9());
   }

   @Override
   public void l6(String var1) {
      throw new NotImplementedException();
   }

   @Override
   public final d5 k5() {
      return this.l6;
   }

   public final w1 h0() {
      return this.l6;
   }

   @Override
   public final com.aspose.slides.internal.k5.z3 u9() {
      return this.n5;
   }

   @Override
   public final long n5(String var1, long var2) {
      throw new NotImplementedException();
   }

   @Override
   public final void n5(long var1) {
      throw new NotImplementedException();
   }
}
