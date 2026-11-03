package com.aspose.slides.internal.c0h;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.g4d.l6;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.o0;

public final class n5 extends l6 {
   private String n5;
   private o0 l6 = new o0();

   public n5(String var1) {
      if (d1.n5(var1)) {
         throw new ArgumentNullException("value");
      }

      String[] var2 = d1.u9(var1, ':');
      if (var2.length > 2) {
         throw new ArgumentException("Invalid guid form", "value");
      }

      String var3 = var2.length == 2 ? var2[1] : var2[0];

      try {
         o0 var4 = new o0(var3);
         this.n5(var4.k5());
      } catch (RuntimeException var5) {
         throw new ArgumentException("Invalid guid value", "value");
      }

      this.n5(var2.length == 2 ? var2[0] : null);
   }

   public final String l6() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final o0 k5() {
      return this.l6.k5();
   }

   public final void n5(o0 var1) {
      this.l6 = var1.k5();
   }

   @Override
   public String n5() {
      return this.l6() == null ? this.k5().toString() : d1.n5("{0}:{1}", this.l6(), this.k5().k5());
   }
}
