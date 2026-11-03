package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class i3t extends b3 {
   private h4q n5;
   private s0m l6;
   private s0m k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("funcPr", "fName", "e");

   public i3t(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new i3t$1(this, var1));
   }

   public i3t() {
      this.l6 = new s0m();
      this.k5 = new s0m();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("m", var2, "funcPr");
      }

      this.l6.n5("m", var2, "fName");
      this.k5.n5("m", var2, "e");
      var2.s7();
   }

   public final h4q n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <funcPr> element can be added.");
      }

      this.n5 = new h4q();
      return this.n5;
   }

   public final h4q l6() {
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
   static h4q n5(i3t var0, h4q var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static s0m n5(i3t var0, s0m var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static s0m l6(i3t var0, s0m var1) {
      return var0.k5 = var1;
   }
}
