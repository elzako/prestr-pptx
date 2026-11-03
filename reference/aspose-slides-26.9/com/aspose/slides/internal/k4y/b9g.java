package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class b9g extends b3 {
   private g8l n5;
   private s0m l6;
   private s0m k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("limLowPr", "e", "lim");

   public b9g(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new b9g$1(this, var1));
   }

   public b9g() {
      this.l6 = new s0m();
      this.k5 = new s0m();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("m", var2, "limLowPr");
      }

      this.l6.n5("m", var2, "e");
      this.k5.n5("m", var2, "lim");
      var2.s7();
   }

   public final g8l n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <limLowPr> element can be added.");
      }

      this.n5 = new g8l();
      return this.n5;
   }

   public final g8l l6() {
      return this.n5;
   }

   public final s0m k5() {
      return this.l6;
   }

   public final s0m u3() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return u3;
   }

   // $VF: synthetic method
   static g8l n5(b9g var0, g8l var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static s0m n5(b9g var0, s0m var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static s0m l6(b9g var0, s0m var1) {
      return var0.k5 = var1;
   }
}
