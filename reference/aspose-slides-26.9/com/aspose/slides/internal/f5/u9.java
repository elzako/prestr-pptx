package com.aspose.slides.internal.f5;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;

public class u9 extends c4 {
   private r4 n5;

   public u9(r4 var1) {
      this.n5 = var1;
   }

   @Override
   public com.aspose.slides.internal.j3.z8 n5(int var1) {
      if (var1 >= 0) {
         for (r4 var2 = this.n5.a0(); var2 != null; var1--) {
            if (var1 == 0) {
               return var2;
            }

            var2 = var2.s3();
         }
      }

      return null;
   }

   @Override
   public int n5() {
      int var1 = 0;

      for (r4 var2 = this.n5.a0(); var2 != null; var2 = var2.s3()) {
         var1++;
      }

      return var1;
   }

   @Override
   public IGenericEnumerator<com.aspose.slides.internal.j3.z8> iterator() {
      return new h0(this.n5);
   }
}
