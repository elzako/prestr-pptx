package com.aspose.slides.internal.k4y;

public class q8l extends b3 {
   private String l6;
   private com.aspose.slides.ms.System.o0 k5 = new com.aspose.slides.ms.System.o0();
   private x4v u3;
   private y1g a6;
   public static final com.aspose.slides.ms.System.o0 n5 = com.aspose.slides.ms.System.o0.n5.k5();
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9("name", "id", "sldIdLst", "extLst");

   public q8l(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      q8l$1 var2 = new q8l$1(this);
      n5(var1, var2);
      n5(var1, new q8l$2(this, var1));
   }

   public q8l() {
      this.a6();
      this.u3 = new x4v();
   }

   private void a6() {
      n5.k5(this.k5);
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != null) {
         var2.l6("name", this.l6);
      }

      if (com.aspose.slides.ms.System.o0.l6(this.k5, n5)) {
         var2.l6("id", com.aspose.slides.ms.System.d1.n5(new String[]{"{", com.aspose.slides.ms.System.d1.t2(com.aspose.slides.ms.System.Xml.f4.n5(this.k5.k5())), "}"}));
      }

      this.u3.n5("p14", var2, "sldIdLst");
      if (this.a6 != null) {
         this.a6.n5("p14", var2, "extLst");
      }

      var2.s7();
   }

   public final String n5() {
      return this.l6;
   }

   public final void n5(String var1) {
      this.l6 = var1;
   }

   public final com.aspose.slides.ms.System.o0 l6() {
      return this.k5;
   }

   public final void n5(com.aspose.slides.ms.System.o0 var1) {
      var1.k5(this.k5);
   }

   public final x4v k5() {
      return this.u3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return u9;
   }

   // $VF: synthetic method
   static String n5(q8l var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.o0 n5(q8l var0, com.aspose.slides.ms.System.o0 var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static x4v n5(q8l var0, x4v var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static y1g n5(q8l var0, y1g var1) {
      return var0.a6 = var1;
   }
}
