package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class n1n extends b3 {
   private v2o n5;
   private k2s l6;
   private p6x k5;
   private b9y u3;
   private j3z a6;
   private a9t u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9("layout", "tx", "numFmt", "spPr", "txPr", "extLst");

   public n1n(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new n1n$1(this, var1));
   }

   public n1n() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("c", var2, "layout");
      }

      if (this.l6 != null) {
         this.l6.n5("c", var2, "tx");
      }

      if (this.k5 != null) {
         this.k5.n5("c", var2, "numFmt");
      }

      if (this.u3 != null) {
         this.u3.n5("c", var2, "spPr");
      }

      if (this.a6 != null) {
         this.a6.n5("c", var2, "txPr");
      }

      if (this.u9 != null) {
         this.u9.n5("c", var2, "extLst");
      }

      var2.s7();
   }

   public final void n5(v2o var1) {
      this.n5 = var1;
   }

   public final k2s n5() {
      if (this.l6 != null) {
         throw new Exception("Only one <tx> element can be added.");
      }

      this.l6 = new k2s();
      return this.l6;
   }

   public final void n5(p6x var1) {
      this.k5 = var1;
   }

   public final void n5(b9y var1) {
      this.u3 = var1;
   }

   public final j3z l6() {
      if (this.a6 != null) {
         throw new Exception("Only one <txPr> element can be added.");
      }

      this.a6 = new j3z();
      return this.a6;
   }

   public final void n5(x8 var1) {
      this.u9 = (a9t)var1;
   }

   public final v2o k5() {
      return this.n5;
   }

   public final k2s u3() {
      return this.l6;
   }

   public final p6x a6() {
      return this.k5;
   }

   public final b9y u9() {
      return this.u3;
   }

   public final j3z h0() {
      return this.a6;
   }

   public final x8 c8() {
      return this.u9;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 t2() {
      return h0;
   }

   // $VF: synthetic method
   static v2o n5(n1n var0, v2o var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static k2s n5(n1n var0, k2s var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static p6x n5(n1n var0, p6x var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static b9y n5(n1n var0, b9y var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static j3z n5(n1n var0, j3z var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static a9t n5(n1n var0, a9t var1) {
      return var0.u9 = var1;
   }
}
