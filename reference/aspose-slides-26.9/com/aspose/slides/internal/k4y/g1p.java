package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class g1p extends b3 {
   private y9w n5;
   private e6r l6;
   private e6r k5;
   private l8r u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("cxnSpLocks", "stCxn", "endCxn", "extLst");

   public g1p(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new g1p$1(this, var1));
   }

   public g1p() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("a", var2, "cxnSpLocks");
      }

      if (this.l6 != null) {
         this.l6.n5("a", var2, "stCxn");
      }

      if (this.k5 != null) {
         this.k5.n5("a", var2, "endCxn");
      }

      if (this.u3 != null) {
         this.u3.n5("a", var2, "extLst");
      }

      var2.s7();
   }

   public final y9w n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <cxnSpLocks> element can be added.");
      }

      this.n5 = new y9w();
      return this.n5;
   }

   public final e6r l6() {
      if (this.l6 != null) {
         throw new Exception("Only one <stCxn> element can be added.");
      }

      this.l6 = new e6r();
      return this.l6;
   }

   public final e6r k5() {
      if (this.k5 != null) {
         throw new Exception("Only one <endCxn> element can be added.");
      }

      this.k5 = new e6r();
      return this.k5;
   }

   public final void n5(x8 var1) {
      this.u3 = (l8r)var1;
   }

   public final y9w u3() {
      return this.n5;
   }

   public final e6r a6() {
      return this.l6;
   }

   public final e6r u9() {
      return this.k5;
   }

   public final x8 h0() {
      return this.u3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 c8() {
      return a6;
   }

   // $VF: synthetic method
   static y9w n5(g1p var0, y9w var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static e6r n5(g1p var0, e6r var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static e6r l6(g1p var0, e6r var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static l8r n5(g1p var0, l8r var1) {
      return var0.u3 = var1;
   }
}
