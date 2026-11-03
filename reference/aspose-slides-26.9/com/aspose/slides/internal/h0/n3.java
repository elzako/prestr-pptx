package com.aspose.slides.internal.h0;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.d1;

public class n3 extends n5 implements com.aspose.slides.internal.k5.t4 {
   private t9 n5 = new t9(this);
   private c4 l6 = new c4(this);

   public n3(q0 var1, com.aspose.slides.internal.k5.q0 var2) {
      super(var1, var2, (short)6);
   }

   @Override
   public String l6() {
      return d1.n5("{0} {{{1}}}", this.k5(), this.u9());
   }

   @Override
   public void l6(String var1) {
      throw new NotImplementedException();
   }

   @Override
   public final String k5() {
      return this.n5.n5() == 0 ? "@page" : d1.n5("{0} {1}", "@page", this.h0());
   }

   @Override
   public final com.aspose.slides.internal.k5.m3 u9() {
      return this.l6;
   }

   public final t9 h0() {
      return this.n5;
   }
}
