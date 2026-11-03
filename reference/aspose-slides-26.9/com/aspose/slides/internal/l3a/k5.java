package com.aspose.slides.internal.l3a;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.p3;

public final class k5 extends com.aspose.slides.internal.g4d.l6 {
   private long n5;

   public k5(String var1) {
      if (d1.n5(var1)) {
         throw new ArgumentNullException("value");
      }

      long var2 = p3.n5(var1);
      this.n5(var2);
   }

   public final long l6() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   @Override
   public String n5() {
      return p3.l6(this.l6());
   }
}
