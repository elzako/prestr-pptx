package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class s0c extends b3 {
   private v2o n5;
   private k2s l6;
   private b9y k5;
   private j3z u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("layout", "tx", "spPr", "txPr");

   public s0c(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new s0c$1(this, var1));
   }

   public s0c() {
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
         this.k5.n5("c", var2, "spPr");
      }

      if (this.u3 != null) {
         this.u3.n5("c", var2, "txPr");
      }

      var2.s7();
   }

   public final v2o n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <layout> element can be added.");
      }

      this.n5 = new v2o();
      return this.n5;
   }

   public final k2s l6() {
      if (this.l6 != null) {
         throw new Exception("Only one <tx> element can be added.");
      }

      this.l6 = new k2s();
      return this.l6;
   }

   public final b9y k5() {
      if (this.k5 != null) {
         throw new Exception("Only one <spPr> element can be added.");
      }

      this.k5 = new b9y();
      return this.k5;
   }

   public final j3z u3() {
      if (this.u3 != null) {
         throw new Exception("Only one <txPr> element can be added.");
      }

      this.u3 = new j3z();
      return this.u3;
   }

   public final v2o a6() {
      return this.n5;
   }

   public final k2s u9() {
      return this.l6;
   }

   public final b9y h0() {
      return this.k5;
   }

   public final j3z c8() {
      return this.u3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 t2() {
      return a6;
   }

   // $VF: synthetic method
   static v2o n5(s0c var0, v2o var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static k2s n5(s0c var0, k2s var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static b9y n5(s0c var0, b9y var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static j3z n5(s0c var0, j3z var1) {
      return var0.u3 = var1;
   }
}
