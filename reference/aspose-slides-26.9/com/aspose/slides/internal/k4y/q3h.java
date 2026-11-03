package com.aspose.slides.internal.k4y;

public class q3h extends b3 {
   private com.aspose.slides.ms.System.o0 n5 = new com.aspose.slides.ms.System.o0();
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9("id", "label", "lang", "r:embed", "r:link");

   public q3h(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      q3h$1 var2 = new q3h$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public q3h() {
      this.a6();
   }

   private void a6() {
      com.aspose.slides.ms.System.o0.n5.k5(this.n5);
      this.u3 = "";
      this.a6 = "";
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("id", com.aspose.slides.ms.System.d1.n5(new String[]{"{", com.aspose.slides.ms.System.d1.t2(com.aspose.slides.ms.System.Xml.f4.n5(this.n5.k5())), "}"}));
      com.aspose.slides.internal.f8y.n5.n5(this.l6 != null, "Required property \"Label\" is uninitialized.");
      var2.l6("label", this.l6);
      if (this.k5 != null) {
         var2.l6("lang", this.k5);
      }

      if (!"".equals(this.u3)) {
         if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
         }

         var2.l6("r:embed", this.u3);
      }

      if (!"".equals(this.a6)) {
         if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
         }

         var2.l6("r:link", this.a6);
      }

      var2.s7();
   }

   public final void n5(com.aspose.slides.ms.System.o0 var1) {
      var1.k5(this.n5);
   }

   public final String n5() {
      return this.l6;
   }

   public final void n5(String var1) {
      this.l6 = var1;
   }

   public final String l6() {
      return this.k5;
   }

   public final void l6(String var1) {
      this.k5 = var1;
   }

   public final String k5() {
      return this.u3;
   }

   public final void k5(String var1) {
      this.u3 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return u9;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.o0 n5(q3h var0, com.aspose.slides.ms.System.o0 var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(q3h var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(q3h var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(q3h var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String u3(q3h var0, String var1) {
      return var0.a6 = var1;
   }
}
