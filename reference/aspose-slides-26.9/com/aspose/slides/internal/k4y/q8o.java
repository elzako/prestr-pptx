package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class q8o extends b3 {
   private String n5;
   private c8q l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("r:id", "autoUpdate");

   public q8o(com.aspose.slides.ms.System.Xml.c7 var1) {
      q8o$1 var2 = new q8o$1(this);
      n5(var1, var2);
      n5(var1, new q8o$2(this, var1));
   }

   public q8o() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
         var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
      }

      var2.l6("r:id", this.n5);
      if (this.l6 != null) {
         this.l6.n5("c", var2, "autoUpdate");
      }

      var2.s7();
   }

   public final c8q n5() {
      if (this.l6 != null) {
         throw new Exception("Only one <autoUpdate> element can be added.");
      }

      this.l6 = new c8q();
      return this.l6;
   }

   public final String l6() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final c8q k5() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return k5;
   }

   // $VF: synthetic method
   static String n5(q8o var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static c8q n5(q8o var0, c8q var1) {
      return var0.l6 = var1;
   }
}
