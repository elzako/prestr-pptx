package com.aspose.slides.internal.k4y;

public class p1i extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("w_Name", "w_Shapeid", "r:id");

   public p1i(com.aspose.slides.ms.System.Xml.c7 var1) {
      p1i$1 var2 = new p1i$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public p1i() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("w:name", this.n5);
      }

      if (this.l6 != null) {
         var2.l6("w:shapeid", this.l6);
      }

      if (this.k5 != null) {
         if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
         }

         var2.l6("r:id", this.k5);
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u3;
   }

   // $VF: synthetic method
   static String n5(p1i var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(p1i var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(p1i var0, String var1) {
      return var0.k5 = var1;
   }
}
