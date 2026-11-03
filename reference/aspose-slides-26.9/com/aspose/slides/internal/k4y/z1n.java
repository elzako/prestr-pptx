package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class z1n extends b3 {
   private boolean n5;
   private y5s l6;
   private l8r k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("txBox", "spLocks", "extLst");

   public z1n(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u9();
      z1n$1 var2 = new z1n$1(this);
      n5(var1, var2);
      n5(var1, new z1n$2(this, var1));
   }

   public z1n() {
      this.u9();
   }

   private void u9() {
      this.n5 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5) {
         var2.l6("txBox", this.n5 ? "1" : "0");
      }

      if (this.l6 != null) {
         this.l6.n5("a", var2, "spLocks");
      }

      if (this.k5 != null) {
         this.k5.n5("a", var2, "extLst");
      }

      var2.s7();
   }

   public final y5s n5() {
      if (this.l6 != null) {
         throw new Exception("Only one <spLocks> element can be added.");
      }

      this.l6 = new y5s();
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

   public final y5s k5() {
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
   static boolean n5(z1n var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static y5s n5(z1n var0, y5s var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static l8r n5(z1n var0, l8r var1) {
      return var0.k5 = var1;
   }
}
