package com.aspose.slides.internal.f7k;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.b5j.n3;
import com.aspose.slides.internal.o9b.f2;

public class u9 extends com.aspose.slides.internal.d0e.a6 {
   public u9() {
      this.u9 = "glyph";
   }

   public String a0() {
      return this.l6.k5("unicode");
   }

   public String d2() {
      return this.l6.k5("glyph-name");
   }

   public final String d5() {
      return this.l6.k5("d");
   }

   public final float s3() {
      return this.l6.n5("horiz-adv-x") ? com.aspose.slides.internal.b3z.c8.n5(this.l6.k5("horiz-adv-x")) : this.f2().a0();
   }

   public final boolean p8() {
      return this.l6.n5("horiz-adv-x") || this.f2().l6.n5("horiz-adv-x");
   }

   public final n5 f2() {
      for (com.aspose.slides.internal.d0e.t2 var1 = this.z8(); var1 != null; var1 = var1.z8()) {
         n5 var2 = com.aspose.slides.internal.v6g.k5.n5(var1, n5.class);
         if (var2 != null) {
            return var2;
         }
      }

      return null;
   }

   public final List<com.aspose.slides.internal.b5j.c8> n5(n3 var1, f2 var2) {
      return com.aspose.slides.internal.b5j.t2.n5(this.d5(), var1);
   }
}
