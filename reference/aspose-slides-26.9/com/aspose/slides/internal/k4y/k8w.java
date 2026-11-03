package com.aspose.slides.internal.k4y;

public class k8w extends b3 {
   private com.aspose.slides.ms.System.o0 n5 = new com.aspose.slides.ms.System.o0();
   private String l6;
   private String k5;
   private float u3;
   private float a6;
   private float u9;
   private float h0;
   private c3j c8;
   private y1g t2;
   private static final com.aspose.slides.internal.v6g.u9 s7 = new com.aspose.slides.internal.v6g.u9(
      "sectionId", "title", "descr", "offsetFactorX", "offsetFactorY", "scaleFactorX", "scaleFactorY", "zmPr", "extLst"
   );

   public k8w(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.s7();
      k8w$1 var2 = new k8w$1(this);
      n5(var1, var2);
      n5(var1, new k8w$2(this, var1));
   }

   public k8w() {
      this.s7();
      this.c8 = new c3j();
   }

   private void s7() {
      com.aspose.slides.ms.System.o0.n5.k5(this.n5);
      this.l6 = "";
      this.k5 = "";
      this.u3 = 0.0F;
      this.a6 = 0.0F;
      this.u9 = 100.0F;
      this.h0 = 100.0F;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("sectionId", com.aspose.slides.ms.System.d1.n5(new String[]{"{", com.aspose.slides.ms.System.d1.t2(com.aspose.slides.ms.System.Xml.f4.n5(this.n5.k5())), "}"}));
      if (!"".equals(this.l6)) {
         var2.l6("title", this.l6);
      }

      if (!"".equals(this.k5)) {
         var2.l6("descr", this.k5);
      }

      if (this.u3 != 0.0F) {
         if (var2.n5) {
            var2.l6("offsetFactorX", com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.Xml.f4.n5(this.u3), "%"}));
         } else {
            var2.l6(
               "offsetFactorX",
               com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.u3 * 1000.0F), 14))
            );
         }
      }

      if (this.a6 != 0.0F) {
         if (var2.n5) {
            var2.l6("offsetFactorY", com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.Xml.f4.n5(this.a6), "%"}));
         } else {
            var2.l6(
               "offsetFactorY",
               com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.a6 * 1000.0F), 14))
            );
         }
      }

      if (this.u9 != 100.0F) {
         if (var2.n5) {
            var2.l6("scaleFactorX", com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.Xml.f4.n5(this.u9), "%"}));
         } else {
            var2.l6(
               "scaleFactorX",
               com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.u9 * 1000.0F), 14))
            );
         }
      }

      if (this.h0 != 100.0F) {
         if (var2.n5) {
            var2.l6("scaleFactorY", com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.Xml.f4.n5(this.h0), "%"}));
         } else {
            var2.l6(
               "scaleFactorY",
               com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.h0 * 1000.0F), 14))
            );
         }
      }

      this.c8.n5("psuz", var2, "zmPr");
      if (this.t2 != null) {
         this.t2.n5("psuz", var2, "extLst");
      }

      var2.s7();
   }

   public final com.aspose.slides.ms.System.o0 n5() {
      return this.n5;
   }

   public final void n5(com.aspose.slides.ms.System.o0 var1) {
      var1.k5(this.n5);
   }

   public final String l6() {
      return this.l6;
   }

   public final void n5(String var1) {
      this.l6 = var1;
   }

   public final String k5() {
      return this.k5;
   }

   public final void l6(String var1) {
      this.k5 = var1;
   }

   public final float u3() {
      return this.u3;
   }

   public final void n5(float var1) {
      this.u3 = var1;
   }

   public final float a6() {
      return this.a6;
   }

   public final void l6(float var1) {
      this.a6 = var1;
   }

   public final float u9() {
      return this.u9;
   }

   public final void k5(float var1) {
      this.u9 = var1;
   }

   public final float h0() {
      return this.h0;
   }

   public final void u3(float var1) {
      this.h0 = var1;
   }

   public final c3j c8() {
      return this.c8;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 t2() {
      return s7;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.o0 n5(k8w var0, com.aspose.slides.ms.System.o0 var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(k8w var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(k8w var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static float n5(k8w var0, float var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static float l6(k8w var0, float var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static float k5(k8w var0, float var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static float u3(k8w var0, float var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static c3j n5(k8w var0, c3j var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static y1g n5(k8w var0, y1g var1) {
      return var0.t2 = var1;
   }
}
