package com.aspose.slides.internal.l3a;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.n3;

public final class n5 extends com.aspose.slides.internal.g4d.l6 {
   private boolean n5;

   public n5(boolean var1) {
      this.n5(var1);
   }

   public n5() {
      this(false);
   }

   public n5(String var1) {
      if (d1.n5(var1)) {
         throw new ArgumentNullException("value");
      }

      boolean var2 = n3.n5(var1);
      this.n5(var2);
   }

   public final boolean l6() {
      return this.n5;
   }

   public final void n5(boolean var1) {
      this.n5 = var1;
   }

   @Override
   public String n5() {
      return n3.l6(this.l6());
   }
}
