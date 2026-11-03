package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class u7f extends b3 {
   private h3r n5;
   private l8r l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("grpSpLocks", "extLst");

   public u7f(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new u7f$1(this, var1));
   }

   public u7f() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("a", var2, "grpSpLocks");
      }

      if (this.l6 != null) {
         this.l6.n5("a", var2, "extLst");
      }

      var2.s7();
   }

   public final h3r n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <grpSpLocks> element can be added.");
      }

      this.n5 = new h3r();
      return this.n5;
   }

   public final void n5(x8 var1) {
      this.l6 = (l8r)var1;
   }

   public final h3r l6() {
      return this.n5;
   }

   public final x8 k5() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return k5;
   }

   // $VF: synthetic method
   static h3r n5(u7f var0, h3r var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static l8r n5(u7f var0, l8r var1) {
      return var0.l6 = var1;
   }
}
