package com.aspose.slides.internal.j4;

import com.aspose.slides.internal.n2d.s7;
import com.aspose.slides.ms.System.d1;

public class n5 implements l6 {
   private String n5;
   private String l6;
   private String k5;
   private com.aspose.slides.internal.u3.l6 u3;

   public n5() {
      this.n5 = d1.n5;
      this.l6 = d1.n5;
      this.u3 = a6();
   }

   @Override
   public final String n5() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   @Override
   public final String l6() {
      return this.l6;
   }

   @Override
   public final String k5() {
      return this.k5;
   }

   @Override
   public final void l6(String var1) {
      this.k5 = var1;
   }

   @Override
   public final com.aspose.slides.internal.u3.l6 u3() {
      return this.u3;
   }

   @Override
   public final void n5(com.aspose.slides.internal.u3.l6 var1) {
      this.u3 = var1;
   }

   private static com.aspose.slides.internal.u3.l6 a6() {
      com.aspose.slides.internal.u3.l6 var0 = new com.aspose.slides.internal.u3.l6();
      var0.n5(7);
      var0.n5(s7.n5().u3());
      var0.l6(var0.k5().u3());
      var0.l6(var0.k5().l6() >= var0.k5().k5() ? 1 : 0);
      return var0;
   }
}
