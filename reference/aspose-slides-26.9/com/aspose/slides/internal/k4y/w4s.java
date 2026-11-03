package com.aspose.slides.internal.k4y;

public class w4s extends b3 {
   private String n5;
   private c8e l6;
   private double k5;
   private c8e u3;
   private c8e a6;
   private e1x u9;
   private b9y h0;
   private m0l c8;
   private f4l t2;
   private l8r s7;
   private static final com.aspose.slides.internal.v6g.u9 x8 = new com.aspose.slides.internal.v6g.u9(
      "mods", "lnRef", "lineWidthScale", "fillRef", "effectRef", "fontRef", "spPr", "defRPr", "bodyPr", "extLst"
   );

   public w4s(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.t2();
      w4s$1 var2 = new w4s$1(this);
      n5(var1, var2);
      n5(var1, new w4s$2(this, var1));
   }

   public w4s() {
      this.t2();
      this.l6 = new c8e();
      this.u3 = new c8e();
      this.a6 = new c8e();
      this.u9 = new e1x();
   }

   private void t2() {
      this.k5 = Double.NaN;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("mods", this.n5);
      }

      this.l6.n5("cs", var2, "lnRef");
      if (!com.aspose.slides.ms.System.d2.k5(this.k5)) {
         this.n5("cs", var2, "lineWidthScale", com.aspose.slides.ms.System.Xml.f4.n5(this.k5), false);
      }

      this.u3.n5("cs", var2, "fillRef");
      this.a6.n5("cs", var2, "effectRef");
      this.u9.n5("cs", var2, "fontRef");
      if (this.h0 != null) {
         this.h0.n5("cs", var2, "spPr");
      }

      if (this.c8 != null) {
         this.c8.n5("cs", var2, "defRPr");
      }

      if (this.t2 != null) {
         this.t2.n5("cs", var2, "bodyPr");
      }

      if (this.s7 != null) {
         this.s7.n5("cs", var2, "extLst");
      }

      var2.s7();
   }

   public final c8e n5() {
      return this.l6;
   }

   public final c8e l6() {
      return this.u3;
   }

   public final c8e k5() {
      return this.a6;
   }

   public final e1x u3() {
      return this.u9;
   }

   public final b9y a6() {
      return this.h0;
   }

   public final m0l u9() {
      return this.c8;
   }

   public final f4l h0() {
      return this.t2;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 c8() {
      return x8;
   }

   // $VF: synthetic method
   static String n5(w4s var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static c8e n5(w4s var0, c8e var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static double n5(w4s var0, double var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static c8e l6(w4s var0, c8e var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static c8e k5(w4s var0, c8e var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static e1x n5(w4s var0, e1x var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static b9y n5(w4s var0, b9y var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static m0l n5(w4s var0, m0l var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static f4l n5(w4s var0, f4l var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static l8r n5(w4s var0, l8r var1) {
      return var0.s7 = var1;
   }
}
