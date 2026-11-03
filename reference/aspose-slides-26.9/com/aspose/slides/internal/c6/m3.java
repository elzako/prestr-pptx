package com.aspose.slides.internal.c6;

import com.aspose.slides.Collections.Generic.List;

public class m3 {
   private List<String> n5;

   public m3() {
      this.n5(new List<>());
   }

   public List<String> n5() {
      return this.n5;
   }

   public void n5(List<String> var1) {
      this.n5 = var1;
   }

   public static m3 n5(com.aspose.slides.internal.y7.k5 var0) {
      m3 var1 = new m3();
      if (var0.u9("cells")) {
         for (Object var4 : var0.n5("cells")) {
            if (var4 instanceof String) {
               var1.n5.add((String)var4);
            }
         }
      }

      return var1;
   }
}
