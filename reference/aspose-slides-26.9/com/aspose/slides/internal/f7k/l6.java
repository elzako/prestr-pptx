package com.aspose.slides.internal.f7k;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.d1;

public class l6 extends com.aspose.slides.internal.d0e.a6 {
   private List<String> c8 = new List<>();

   public l6() {
      this.c8.addItem("bold");
      this.c8.addItem("bolder");
      this.c8.addItem("600");
      this.c8.addItem("700");
      this.c8.addItem("800");
      this.c8.addItem("900");
      this.u9 = "font-face-name";
   }

   public final String a0() {
      return this.l6.k5("font-family");
   }

   public final String d2() {
      String var1 = this.l6.k5("font-style");
      if (var1 == null) {
         var1 = "all";
      }

      return var1;
   }

   public final boolean d5() {
      String var1 = d1.a6(d1.l6(this.d2()));
      return "italic".equals(var1) || "oblique".equals(var1);
   }

   public final String s3() {
      String var1 = this.l6.k5("font-variant");
      if (var1 == null) {
         var1 = "normal";
      }

      return var1;
   }

   public final boolean p8() {
      return "small-caps".equals(d1.a6(d1.l6(this.s3())));
   }

   public final String f2() {
      String var1 = this.l6.k5("font-weight");
      if (var1 == null) {
         var1 = "all";
      }

      return var1;
   }

   public final float i1() {
      return !this.l6.n5("units-per-em") ? 1000.0F : com.aspose.slides.internal.b3z.c8.n5(this.l6.k5("units-per-em"));
   }
}
