package com.aspose.slides.internal.f5;

import com.aspose.slides.exceptions.NotImplementedException;

public class s3 implements com.aspose.slides.internal.j3.y2 {
   private r4 n5;

   s3(r4 var1) {
      this.n5 = var1;
   }

   public final String n5() {
      if (this.n5.n3() == 2) {
         return "attribute";
      } else {
         return this.n5.n3() == 1 ? "element" : null;
      }
   }

   public final String l6() {
      return this.n5.n3() != 2 && this.n5.n3() != 1 ? null : this.n5.s7();
   }

   public final boolean n5(String var1, String var2, byte var3) {
      throw new NotImplementedException();
   }
}
