package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class l6o extends m3 implements z6 {
   private b8n n5;
   private b8n l6;
   private w1c k5;
   private b9y u3;
   private l0u a6;
   private l6s u9;
   private a9t h0;
   private static final com.aspose.slides.internal.v6g.u9 c8 = new com.aspose.slides.internal.v6g.u9("idx", "order", "tx", "spPr", "cat", "val", "extLst");

   public l6o(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new l6o$1(this, var1));
   }

   public l6o() {
      this.n5 = new b8n();
      this.l6 = new b8n();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5.n5("c", var2, "idx");
      this.l6.n5("c", var2, "order");
      if (this.k5 != null) {
         this.k5.n5("c", var2, "tx");
      }

      if (this.u3 != null) {
         this.u3.n5("c", var2, "spPr");
      }

      if (this.a6 != null) {
         this.a6.n5("c", var2, "cat");
      }

      if (this.u9 != null) {
         this.u9.n5("c", var2, "val");
      }

      if (this.h0 != null) {
         this.h0.n5("c", var2, "extLst");
      }

      var2.s7();
   }

   @Override
   public w1c c8() {
      if (this.k5 != null) {
         throw new Exception("Only one <tx> element can be added.");
      }

      this.k5 = new w1c();
      return this.k5;
   }

   @Override
   public b9y u3() {
      if (this.u3 != null) {
         throw new Exception("Only one <spPr> element can be added.");
      }

      this.u3 = new b9y();
      return this.u3;
   }

   @Override
   public final l0u n3() {
      if (this.a6 != null) {
         throw new Exception("Only one <cat> element can be added.");
      }

      this.a6 = new l0u();
      return this.a6;
   }

   @Override
   public final l6s x8() {
      if (this.u9 != null) {
         throw new Exception("Only one <val> element can be added.");
      }

      this.u9 = new l6s();
      return this.u9;
   }

   @Override
   public x8 u9() {
      if (this.h0 != null) {
         throw new Exception("Only one <extLst> element can be added.");
      }

      this.h0 = new a9t();
      return this.h0;
   }

   @Override
   public void n5(x8 var1) {
      this.h0 = (a9t)var1;
   }

   @Override
   public b8n n5() {
      return this.n5;
   }

   @Override
   public b8n l6() {
      return this.l6;
   }

   @Override
   public w1c h0() {
      return this.k5;
   }

   @Override
   public b9y k5() {
      return this.u3;
   }

   @Override
   public l0u aF_() {
      return this.a6;
   }

   @Override
   public l6s aG_() {
      return this.u9;
   }

   @Override
   public x8 a6() {
      return this.h0;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 p8() {
      return c8;
   }

   // $VF: synthetic method
   static b8n n5(l6o var0, b8n var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static b8n l6(l6o var0, b8n var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static w1c n5(l6o var0, w1c var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static b9y n5(l6o var0, b9y var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static l0u n5(l6o var0, l0u var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static l6s n5(l6o var0, l6s var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static a9t n5(l6o var0, a9t var1) {
      return var0.h0 = var1;
   }
}
