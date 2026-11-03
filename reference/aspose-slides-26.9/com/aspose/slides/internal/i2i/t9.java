package com.aspose.slides.internal.i2i;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.z0k.z1;

public class t9 {
   private String n5;
   private e2 l6;

   t9(String var1) {
      this.n5 = var1;
   }

   public e2 n5() {
      if (this.l6 == null) {
         String var1 = z1.l6(this.n5, "Trust");
         this.l6 = new e2(var1, true);
      }

      return this.l6;
   }

   public e2 n5(String var1, boolean var2) {
      if (var1 == null) {
         throw new ArgumentNullException("storeName");
      }

      String var3 = z1.l6(this.n5, var1);
      return !var2 && !com.aspose.slides.internal.z0k.u3.k5(var3) ? null : new e2(var3, true);
   }
}
