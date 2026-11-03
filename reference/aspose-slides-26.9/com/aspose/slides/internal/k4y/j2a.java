package com.aspose.slides.internal.k4y;

public class j2a extends b3 {
   private d5n n5;
   private v2f l6;
   private g2g k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("sdtPr", "sdtEndPr", "sdtContent");

   public j2a(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new j2a$1(this, var1));
   }

   public j2a() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("w", var2, "sdtPr");
      }

      if (this.l6 != null) {
         this.l6.n5("w", var2, "sdtEndPr");
      }

      if (this.k5 != null) {
         this.k5.n5("w", var2, "sdtContent");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u3;
   }

   // $VF: synthetic method
   static d5n n5(j2a var0, d5n var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static v2f n5(j2a var0, v2f var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static g2g n5(j2a var0, g2g var1) {
      return var0.k5 = var1;
   }
}
