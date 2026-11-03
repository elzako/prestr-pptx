package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class v1w extends b3 {
   private e8j n5;
   private b9y l6;
   private j3z k5;
   private h6m u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("tx", "spPr", "txPr", "extLst");

   public v1w(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new v1w$1(this, var1));
   }

   public v1w() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("cx", var2, "tx");
      }

      if (this.l6 != null) {
         this.l6.n5("cx", var2, "spPr");
      }

      if (this.k5 != null) {
         this.k5.n5("cx", var2, "txPr");
      }

      if (this.u3 != null) {
         this.u3.n5("cx", var2, "extLst");
      }

      var2.s7();
   }

   public final void n5(e8j var1) {
      this.n5 = var1;
   }

   public final b9y n5() {
      if (this.l6 != null) {
         throw new Exception("Only one <spPr> element can be added.");
      }

      this.l6 = new b9y();
      return this.l6;
   }

   public final j3z l6() {
      if (this.k5 != null) {
         throw new Exception("Only one <txPr> element can be added.");
      }

      this.k5 = new j3z();
      return this.k5;
   }

   public final void n5(h6m var1) {
      this.u3 = var1;
   }

   public final e8j k5() {
      return this.n5;
   }

   public final b9y u3() {
      return this.l6;
   }

   public final j3z a6() {
      return this.k5;
   }

   public final h6m u9() {
      return this.u3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 h0() {
      return a6;
   }

   // $VF: synthetic method
   static e8j n5(v1w var0, e8j var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static b9y n5(v1w var0, b9y var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static j3z n5(v1w var0, j3z var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static h6m n5(v1w var0, h6m var1) {
      return var0.u3 = var1;
   }
}
