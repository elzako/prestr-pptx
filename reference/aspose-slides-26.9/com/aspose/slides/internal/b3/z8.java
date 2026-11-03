package com.aspose.slides.internal.b3;

import com.aspose.slides.ms.System.d1;

public class z8 extends com.aspose.slides.internal.y1.l6 {
   private String n5;

   public z8(String var1) {
      super(var1);
   }

   public final void n5(j5 var1) {
      this.n5(var1.u3().n5().m_());
      this.n5 = var1.a6().u3();
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   @Override
   public String getMessage() {
      return this.n5 != null ? d1.n5(super.getMessage(), "; property:'", this.n5, "'") : super.getMessage();
   }
}
