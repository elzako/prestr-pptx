package com.aspose.slides.internal.h0;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.k5.d5;
import com.aspose.slides.ms.System.d1;

public class s7 extends n5 implements com.aspose.slides.internal.k5.t9 {
   private String n5;
   private com.aspose.slides.internal.k5.j5 l6;
   private w1 k5 = new w1();

   public s7(q0 var1, com.aspose.slides.internal.k5.q0 var2) {
      super(var1, var2, (short)3);
   }

   @Override
   public String l6() {
      return d1.n5("@import url({0});", new Object[]{this.k5()});
   }

   @Override
   public void l6(String var1) {
      throw new NotImplementedException();
   }

   @Override
   public final String k5() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   @Override
   public final d5 u9() {
      return this.k5;
   }

   public final w1 c8() {
      return this.k5;
   }

   @Override
   public final com.aspose.slides.internal.k5.j5 h0() {
      return this.l6;
   }

   public final void n5(com.aspose.slides.internal.k5.j5 var1) {
      this.l6 = var1;
   }
}
