package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class a1g extends b3 {
   private com.aspose.slides.ms.System.o0 n5 = new com.aspose.slides.ms.System.o0();
   private String l6;
   private m0l k5;
   private y4u u3;
   private String a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9("id", "type", "rPr", "pPr", "t");

   public a1g(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.t2();
      a1g$1 var2 = new a1g$1(this);
      n5(var1, var2);
      n5(var1, new a1g$2(this, var1));
   }

   public a1g() {
      this.t2();
   }

   private void t2() {
      com.aspose.slides.ms.System.o0.n5.k5(this.n5);
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("id", com.aspose.slides.ms.System.d1.n5(new String[]{"{", com.aspose.slides.ms.System.d1.t2(com.aspose.slides.ms.System.Xml.f4.n5(this.n5.k5())), "}"}));
      if (this.l6 != null) {
         var2.l6("type", this.l6);
      }

      if (this.k5 != null) {
         this.k5.n5("a", var2, "rPr");
      }

      if (this.u3 != null) {
         this.u3.n5("a", var2, "pPr");
      }

      if (this.a6 != null) {
         this.n5("a", var2, "t", this.a6, false);
      }

      var2.s7();
   }

   public final m0l n5() {
      if (this.k5 != null) {
         throw new Exception("Only one <rPr> element can be added.");
      }

      this.k5 = new m0l();
      return this.k5;
   }

   public final y4u l6() {
      if (this.u3 != null) {
         throw new Exception("Only one <pPr> element can be added.");
      }

      this.u3 = new y4u();
      return this.u3;
   }

   public final com.aspose.slides.ms.System.o0 k5() {
      return this.n5;
   }

   public final void n5(com.aspose.slides.ms.System.o0 var1) {
      var1.k5(this.n5);
   }

   public final String u3() {
      return this.l6;
   }

   public final void n5(String var1) {
      this.l6 = var1;
   }

   public final m0l a6() {
      return this.k5;
   }

   public final y4u u9() {
      return this.u3;
   }

   public final String h0() {
      return this.a6;
   }

   public final void l6(String var1) {
      this.a6 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 c8() {
      return u9;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.o0 n5(a1g var0, com.aspose.slides.ms.System.o0 var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(a1g var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static m0l n5(a1g var0, m0l var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static y4u n5(a1g var0, y4u var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String l6(a1g var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String n5(a1g var0) {
      return var0.a6;
   }
}
