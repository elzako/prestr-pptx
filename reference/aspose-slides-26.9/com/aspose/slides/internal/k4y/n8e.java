package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class n8e extends b3 {
   private k2s n5;
   private v2o l6;
   private c8q k5;
   private b9y u3;
   private j3z a6;
   private a9t u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9("tx", "layout", "overlay", "spPr", "txPr", "extLst");

   public n8e(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new n8e$1(this, var1));
   }

   public n8e() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("c", var2, "tx");
      }

      if (this.l6 != null) {
         this.l6.n5("c", var2, "layout");
      }

      if (this.k5 != null) {
         this.k5.n5("c", var2, "overlay");
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

   public final k2s n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <tx> element can be added.");
      }

      this.n5 = new k2s();
      return this.n5;
   }

   public final void n5(k2s var1) {
      this.n5 = var1;
   }

   public final v2o l6() {
      if (this.l6 != null) {
         throw new Exception("Only one <layout> element can be added.");
      }

      this.l6 = new v2o();
      return this.l6;
   }

   public final c8q k5() {
      if (this.k5 != null) {
         throw new Exception("Only one <overlay> element can be added.");
      }

      this.k5 = new c8q();
      return this.k5;
   }

   public final b9y u3() {
      if (this.u3 != null) {
         throw new Exception("Only one <spPr> element can be added.");
      }

      this.u3 = new b9y();
      return this.u3;
   }

   public final j3z a6() {
      if (this.a6 != null) {
         throw new Exception("Only one <txPr> element can be added.");
      }

      this.a6 = new j3z();
      return this.a6;
   }

   public final void n5(x8 var1) {
      this.u9 = (a9t)var1;
   }

   public final k2s u9() {
      return this.n5;
   }

   public final v2o h0() {
      return this.l6;
   }

   public final c8q c8() {
      return this.k5;
   }

   public final b9y t2() {
      return this.u3;
   }

   public final j3z s7() {
      return this.a6;
   }

   public final x8 x8() {
      return this.u9;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n3() {
      return h0;
   }

   // $VF: synthetic method
   static k2s n5(n8e var0, k2s var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static v2o n5(n8e var0, v2o var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static c8q n5(n8e var0, c8q var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static b9y n5(n8e var0, b9y var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static j3z n5(n8e var0, j3z var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static a9t n5(n8e var0, a9t var1) {
      return var0.u9 = var1;
   }
}
