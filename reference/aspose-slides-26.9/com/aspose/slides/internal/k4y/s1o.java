package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class s1o extends b3 {
   private boolean n5;
   private g2x l6;
   private l8r k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("preferRelativeResize", "picLocks", "extLst");

   public s1o(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u9();
      s1o$1 var2 = new s1o$1(this);
      n5(var1, var2);
      n5(var1, new s1o$2(this, var1));
   }

   public s1o() {
      this.u9();
   }

   private void u9() {
      this.n5 = true;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (!this.n5) {
         var2.l6("preferRelativeResize", this.n5 ? "1" : "0");
      }

      if (this.l6 != null) {
         this.l6.n5("a", var2, "picLocks");
      }

      if (this.k5 != null) {
         this.k5.n5("a", var2, "extLst");
      }

      var2.s7();
   }

   public final g2x n5() {
      if (this.l6 != null) {
         throw new Exception("Only one <picLocks> element can be added.");
      }

      this.l6 = new g2x();
      return this.l6;
   }

   public final void n5(x8 var1) {
      this.k5 = (l8r)var1;
   }

   public final boolean l6() {
      return this.n5;
   }

   public final void n5(boolean var1) {
      this.n5 = var1;
   }

   public final g2x k5() {
      return this.l6;
   }

   public final x8 u3() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return u3;
   }

   // $VF: synthetic method
   static boolean n5(s1o var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static g2x n5(s1o var0, g2x var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static l8r n5(s1o var0, l8r var1) {
      return var0.k5 = var1;
   }
}
