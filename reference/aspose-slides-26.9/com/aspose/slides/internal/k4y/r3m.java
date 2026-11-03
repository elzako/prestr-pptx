package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class r3m extends b3 {
   private c9u n5;
   private s0m l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("boxPr", "e");

   public r3m(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new r3m$1(this, var1));
   }

   public r3m() {
      this.l6 = new s0m();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("m", var2, "boxPr");
      }

      this.l6.n5("m", var2, "e");
      var2.s7();
   }

   public final c9u n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <boxPr> element can be added.");
      }

      this.n5 = new c9u();
      return this.n5;
   }

   public final c9u l6() {
      return this.n5;
   }

   public final s0m k5() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return k5;
   }

   // $VF: synthetic method
   static c9u n5(r3m var0, c9u var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static s0m n5(r3m var0, s0m var1) {
      return var0.l6 = var1;
   }
}
