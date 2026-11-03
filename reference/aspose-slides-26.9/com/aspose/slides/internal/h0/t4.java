package com.aspose.slides.internal.h0;

import com.aspose.slides.ms.System.d1;

public class t4 extends n5 implements com.aspose.slides.internal.k5.z8 {
   private t9 n5 = new t9(this);
   private l6 l6 = new c4(this);

   public t4(q0 var1, com.aspose.slides.internal.k5.q0 var2) {
      super(var1, var2, (short)1);
   }

   public final t9 h0() {
      return this.n5;
   }

   @Override
   public String l6() {
      return d1.n5("{0} {{ {1} }}", this.k5(), this.u9());
   }

   @Override
   public void l6(String var1) {
      this.l6.x0(var1);
   }

   @Override
   public final String k5() {
      return this.n5.toString();
   }

   @Override
   public final com.aspose.slides.internal.k5.m3 u9() {
      return this.l6;
   }
}
