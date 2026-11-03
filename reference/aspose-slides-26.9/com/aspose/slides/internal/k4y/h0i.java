package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class h0i extends b3 {
   private m9a n5;
   private w9s l6;
   private w9s k5;
   private a9t u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("gapWidth", "upBars", "downBars", "extLst");

   public h0i(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new h0i$1(this, var1));
   }

   public h0i() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("c", var2, "gapWidth");
      }

      if (this.l6 != null) {
         this.l6.n5("c", var2, "upBars");
      }

      if (this.k5 != null) {
         this.k5.n5("c", var2, "downBars");
      }

      if (this.u3 != null) {
         this.u3.n5("c", var2, "extLst");
      }

      var2.s7();
   }

   public final m9a n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <gapWidth> element can be added.");
      }

      this.n5 = new m9a();
      return this.n5;
   }

   public final w9s l6() {
      if (this.l6 != null) {
         throw new Exception("Only one <upBars> element can be added.");
      }

      this.l6 = new w9s();
      return this.l6;
   }

   public final w9s k5() {
      if (this.k5 != null) {
         throw new Exception("Only one <downBars> element can be added.");
      }

      this.k5 = new w9s();
      return this.k5;
   }

   public final void n5(x8 var1) {
      this.u3 = (a9t)var1;
   }

   public final m9a u3() {
      return this.n5;
   }

   public final w9s a6() {
      return this.l6;
   }

   public final w9s u9() {
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
   static m9a n5(h0i var0, m9a var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static w9s n5(h0i var0, w9s var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static w9s l6(h0i var0, w9s var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static a9t n5(h0i var0, a9t var1) {
      return var0.u3 = var1;
   }
}
