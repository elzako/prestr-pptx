package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class z1o extends b3 {
   private com.aspose.slides.ms.System.o0 n5 = new com.aspose.slides.ms.System.o0();
   private o8l l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("ds:itemID", "schemaRefs");

   public z1o(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      z1o$1 var2 = new z1o$1(this);
      n5(var1, var2);
      n5(var1, new z1o$2(this, var1));
   }

   public z1o() {
      this.a6();
   }

   private void a6() {
      com.aspose.slides.ms.System.o0.n5.k5(this.n5);
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("ds", var3, "http://schemas.openxmlformats.org/officeDocument/2006/customXml");
      var2.l6("ds:itemID", com.aspose.slides.ms.System.d1.n5(new String[]{"{", com.aspose.slides.ms.System.d1.t2(com.aspose.slides.ms.System.Xml.f4.n5(this.n5.k5())), "}"}));
      if (this.l6 != null) {
         this.l6.n5("ds", var2, "schemaRefs");
      }

      var2.s7();
   }

   public final o8l n5() {
      if (this.l6 != null) {
         throw new Exception("Only one <schemaRefs> element can be added.");
      }

      this.l6 = new o8l();
      return this.l6;
   }

   public final com.aspose.slides.ms.System.o0 l6() {
      return this.n5;
   }

   public final void n5(com.aspose.slides.ms.System.o0 var1) {
      var1.k5(this.n5);
   }

   public final o8l k5() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.o0 n5(z1o var0, com.aspose.slides.ms.System.o0 var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static o8l n5(z1o var0, o8l var1) {
      return var0.l6 = var1;
   }
}
