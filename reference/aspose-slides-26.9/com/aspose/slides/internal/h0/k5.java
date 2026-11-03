package com.aspose.slides.internal.h0;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.ms.System.d1;

public class k5 extends n5 implements com.aspose.slides.internal.k5.x8 {
   private String n5;

   public k5(q0 var1, com.aspose.slides.internal.k5.q0 var2) {
      super(var1, var2, (short)2);
      this.n5 = d1.n5;
   }

   @Override
   public String l6() {
      return d1.n5("@charset \"{0}\";", new Object[]{this.n5});
   }

   @Override
   public void l6(String var1) {
      throw new NotImplementedException();
   }

   @Override
   public final String k5() {
      return this.n5;
   }

   @Override
   public final void n5(String var1) {
      this.n5 = var1;
   }
}
