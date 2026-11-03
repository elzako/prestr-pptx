package com.aspose.slides.internal.u0a;

import com.aspose.slides.exceptions.ArgumentException;

class l6$n5 {
   private String n5;
   private String l6;

   public l6$n5(String var1, String var2) {
      if (!com.aspose.slides.internal.u0a.l6.k5(var1)) {
         throw new ArgumentException("Invalid XML attribute name: " + var1);
      }

      if (!com.aspose.slides.internal.u0a.l6.u3(var2)) {
         throw new ArgumentException("Invalid XML attribute value: " + var2);
      }

      this.n5 = var1;
      this.l6 = com.aspose.slides.internal.u0a.l6.t2(var2);
   }

   public String n5() {
      return this.n5;
   }

   public String l6() {
      return this.l6;
   }
}
