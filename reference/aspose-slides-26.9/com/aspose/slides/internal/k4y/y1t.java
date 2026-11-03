package com.aspose.slides.internal.k4y;

public class y1t extends b3 {
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private com.aspose.slides.ms.System.o0 u9 = new com.aspose.slides.ms.System.o0();
   public static final com.aspose.slides.ms.System.o0 n5 = com.aspose.slides.ms.System.o0.n5.k5();
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "appName", "lastEdited", "lowestEdited", "rupBuild", "codeName"
   );

   public y1t(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      y1t$1 var2 = new y1t$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public y1t() {
      this.l6();
   }

   private void l6() {
      n5.k5(this.u9);
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != null) {
         var2.l6("appName", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("lastEdited", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("lowestEdited", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("rupBuild", this.a6);
      }

      if (com.aspose.slides.ms.System.o0.l6(this.u9, n5)) {
         var2.l6(
            "codeName", com.aspose.slides.ms.System.d1.n5(new String[]{"{", com.aspose.slides.ms.System.d1.t2(com.aspose.slides.ms.System.Xml.f4.n5(this.u9.k5())), "}"})
         );
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return h0;
   }

   // $VF: synthetic method
   static String n5(y1t var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(y1t var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(y1t var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String u3(y1t var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.o0 n5(y1t var0, com.aspose.slides.ms.System.o0 var1) {
      return var0.u9 = var1;
   }
}
