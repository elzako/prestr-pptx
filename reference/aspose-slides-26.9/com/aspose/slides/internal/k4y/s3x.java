package com.aspose.slides.internal.k4y;

public class s3x extends b3 {
   private com.aspose.slides.ms.System.o0 n5 = new com.aspose.slides.ms.System.o0();
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private y1g u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9("id", "name", "initials", "userId", "providerId", "extLst");

   public s3x(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.h0();
      s3x$1 var2 = new s3x$1(this);
      n5(var1, var2);
      n5(var1, new s3x$2(this, var1));
   }

   public s3x() {
      this.h0();
   }

   private void h0() {
      com.aspose.slides.ms.System.o0.n5.k5(this.n5);
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("id", com.aspose.slides.ms.System.d1.n5(new String[]{"{", com.aspose.slides.ms.System.d1.t2(com.aspose.slides.ms.System.Xml.f4.n5(this.n5.k5())), "}"}));
      var2.l6("name", this.l6);
      if (this.k5 != null) {
         var2.l6("initials", this.k5);
      }

      var2.l6("userId", this.u3);
      var2.l6("providerId", this.a6);
      if (this.u9 != null) {
         this.u9.n5("p188", var2, "extLst");
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

   public final String u3() {
      return this.u3;
   }

   public final void k5(String var1) {
      this.u3 = var1;
   }

   public final String a6() {
      return this.a6;
   }

   public final void u3(String var1) {
      this.a6 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u9() {
      return h0;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.o0 n5(s3x var0, com.aspose.slides.ms.System.o0 var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(s3x var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(s3x var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(s3x var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String u3(s3x var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static y1g n5(s3x var0, y1g var1) {
      return var0.u9 = var1;
   }
}
