package com.aspose.slides.internal.y1;

import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;

public class l6 extends Exception {
   private String n5;
   private int l6;
   private int k5;
   private String u3;

   public l6(String var1) {
      super(var1);
   }

   public l6(String var1, com.aspose.slides.internal.w2.u9 var2) {
      super(var1);
      this.n5(var2);
   }

   public final void n5(com.aspose.slides.internal.w2.u9 var1) {
      if (var1 != null) {
         this.n5 = var1.k5();
         this.l6 = var1.n5();
         this.k5 = var1.l6();
      }
   }

   public final boolean n5() {
      return this.l6 > 0;
   }

   @Override
   public String getMessage() {
      return this.n5() ? d1.n5(this.n5, ":", a3.l6(this.l6), ":", a3.l6(this.k5), ": ", super.getMessage()) : super.getMessage();
   }

   @Override
   public final String getLocalizedMessage() {
      return this.u3 != null ? this.u3 : super.getMessage();
   }
}
