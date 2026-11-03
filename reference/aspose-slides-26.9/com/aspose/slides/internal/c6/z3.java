package com.aspose.slides.internal.c6;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.d1;

public class z3 {
   private String n5;
   private String l6;
   private List<z8> k5;

   public z3() {
      this.n5(d1.n5);
      this.l6(d1.n5);
      this.n5(new List<>());
   }

   public String n5() {
      return this.n5;
   }

   public void n5(String var1) {
      this.n5 = var1;
   }

   public String l6() {
      return this.l6;
   }

   public void l6(String var1) {
      this.l6 = var1;
   }

   public List<z8> k5() {
      return this.k5;
   }

   public void n5(List<z8> var1) {
      this.k5 = var1;
   }

   public static z3 n5(com.aspose.slides.internal.y7.k5 var0) {
      z3 var1 = new z3();
      var1.n5 = var0.n5("title", "");
      var1.l6 = var0.n5("subtitle", "");
      if (var0.u9("sections")) {
         for (Object var3 : var0.n5("sections")) {
            if (var3 instanceof com.aspose.slides.internal.y7.k5) {
               com.aspose.slides.internal.y7.k5 var4 = (com.aspose.slides.internal.y7.k5)var3;
               var1.k5.add(z8.n5(var4));
            }
         }
      }

      return var1;
   }
}
