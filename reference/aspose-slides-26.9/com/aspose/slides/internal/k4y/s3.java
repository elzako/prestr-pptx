package com.aspose.slides.internal.k4y;

public final class s3 extends b3 {
   private String u3;
   private String a6;
   private String u9;
   private com.aspose.slides.ms.System.j5 h0 = new com.aspose.slides.ms.System.j5();
   private String c8;
   private String t2;
   private String s7;
   private String x8;
   private com.aspose.slides.ms.System.j5 n3 = new com.aspose.slides.ms.System.j5();
   private com.aspose.slides.ms.System.j5 y4 = new com.aspose.slides.ms.System.j5();
   private String e2;
   private String t9;
   private String z1;
   static final com.aspose.slides.ms.System.j5 n5 = com.aspose.slides.ms.System.j5.l6.m3();
   static final com.aspose.slides.ms.System.j5 l6 = com.aspose.slides.ms.System.j5.l6.m3();
   static final com.aspose.slides.ms.System.j5 k5 = com.aspose.slides.ms.System.j5.l6.m3();
   private static final com.aspose.slides.internal.v6g.u9 t4 = new com.aspose.slides.internal.v6g.u9(
      "category",
      "contentStatus",
      "contentType",
      "created",
      "creator",
      "description",
      "identifier",
      "keywords",
      "language",
      "lastModifiedBy",
      "lastPrinted",
      "modified",
      "revision",
      "subject",
      "title",
      "version"
   );

   public s3(com.aspose.slides.ms.System.Xml.c7 var1) {
      this();
      n5(var1, new s3$1(this, var1));
   }

   public s3() {
      this.u3 = "";
      this.a6 = "";
      this.u9 = "";
      n5.u3(this.h0);
      this.c8 = "";
      this.t2 = "";
      this.s7 = "";
      this.x8 = "";
      l6.u3(this.n3);
      k5.u3(this.y4);
      this.e2 = "";
      this.t9 = "";
      this.z1 = "";
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("cp", var3, "http://schemas.openxmlformats.org/package/2006/metadata/core-properties");
      var2.u3("xmlns", "dc", null, "http://purl.org/dc/elements/1.1/");
      var2.u3("xmlns", "dcterms", null, "http://purl.org/dc/terms/");
      var2.u3("xmlns", "dcmitype", null, "http://purl.org/dc/dcmitype/");
      var2.u3("xmlns", "xsi", null, "http://www.w3.org/2001/XMLSchema-instance");
      if (!"".equals(this.z1)) {
         var2.a6(com.aspose.slides.ms.System.d1.n5(new String[]{"dc:", "title"}), this.z1);
      }

      if (!"".equals(this.u3)) {
         var2.a6(com.aspose.slides.ms.System.d1.n5(new String[]{"cp:", "category"}), this.u3);
      }

      if (!"".equals(this.a6)) {
         var2.a6(com.aspose.slides.ms.System.d1.n5(new String[]{"cp:", "contentStatus"}), this.a6);
      }

      if (!"".equals(this.u9)) {
         var2.a6(com.aspose.slides.ms.System.d1.n5(new String[]{"cp:", "contentType"}), this.u9);
      }

      if (!"".equals(this.c8)) {
         var2.a6(com.aspose.slides.ms.System.d1.n5(new String[]{"dc:", "creator"}), this.c8);
      }

      if (!"".equals(this.t2)) {
         var2.a6(com.aspose.slides.ms.System.d1.n5(new String[]{"dc:", "description"}), this.t2);
      }

      if (!"".equals(this.s7)) {
         var2.a6(com.aspose.slides.ms.System.d1.n5(new String[]{"cp:", "keywords"}), this.s7);
      }

      if (!"".equals(this.x8)) {
         var2.a6(com.aspose.slides.ms.System.d1.n5(new String[]{"cp:", "lastModifiedBy"}), this.x8);
      }

      if (!"".equals(this.e2)) {
         var2.a6(com.aspose.slides.ms.System.d1.n5(new String[]{"cp:", "revision"}), this.e2);
      }

      if (com.aspose.slides.ms.System.j5.c8(this.n3, com.aspose.slides.ms.System.j5.l6)) {
         var2.a6(com.aspose.slides.ms.System.d1.n5(new String[]{"cp:", "lastPrinted"}), com.aspose.slides.ms.System.Xml.f4.n5(this.n3.m3(), "yyyy-MM-ddTHH:mm:ss.fff"));
      }

      if (com.aspose.slides.ms.System.j5.c8(this.h0, com.aspose.slides.ms.System.j5.l6)) {
         var2.n5("dcterms", "created", null);
         var2.u3("xsi", "type", null, "dcterms:W3CDTF");
         var2.l6(com.aspose.slides.ms.System.Xml.f4.n5(this.h0.m3(), "yyyy-MM-ddTHH:mm:ssZ"));
         var2.s7();
      }

      if (com.aspose.slides.ms.System.j5.c8(this.y4, com.aspose.slides.ms.System.j5.l6)) {
         var2.n5("dcterms", "modified", null);
         var2.u3("xsi", "type", null, "dcterms:W3CDTF");
         var2.l6(com.aspose.slides.ms.System.Xml.f4.n5(this.y4.m3(), "yyyy-MM-ddTHH:mm:ssZ"));
         var2.s7();
      }

      if (!"".equals(this.t9)) {
         var2.a6(com.aspose.slides.ms.System.d1.n5(new String[]{"dc:", "subject"}), this.t9);
      }

      var2.s7();
   }

   public final String n5() {
      return this.u3;
   }

   public final void n5(String var1) {
      this.u3 = var1;
   }

   public final String l6() {
      return this.a6;
   }

   public final void l6(String var1) {
      this.a6 = var1;
   }

   public final String k5() {
      return this.u9;
   }

   public final void k5(String var1) {
      this.u9 = var1;
   }

   public final com.aspose.slides.ms.System.j5 u3() {
      return this.h0;
   }

   public final void n5(com.aspose.slides.ms.System.j5 var1) {
      var1.u3(this.h0);
   }

   public final String a6() {
      return this.c8;
   }

   public final void u3(String var1) {
      this.c8 = var1;
   }

   public final String u9() {
      return this.t2;
   }

   public final void a6(String var1) {
      this.t2 = var1;
   }

   public final String h0() {
      return this.s7;
   }

   public final void u9(String var1) {
      this.s7 = var1;
   }

   public final String c8() {
      return this.x8;
   }

   public final void h0(String var1) {
      this.x8 = var1;
   }

   public final com.aspose.slides.ms.System.j5 t2() {
      return this.n3;
   }

   public final void l6(com.aspose.slides.ms.System.j5 var1) {
      var1.u3(this.n3);
   }

   public final com.aspose.slides.ms.System.j5 s7() {
      return this.y4;
   }

   public final void k5(com.aspose.slides.ms.System.j5 var1) {
      var1.u3(this.y4);
   }

   public final String x8() {
      return this.e2;
   }

   public final void c8(String var1) {
      this.e2 = var1;
   }

   public final String n3() {
      return this.t9;
   }

   public final void t2(String var1) {
      this.t9 = var1;
   }

   public final String y4() {
      return this.z1;
   }

   public final void s7(String var1) {
      this.z1 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 e2() {
      return t4;
   }

   // $VF: synthetic method
   static String n5(s3 var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String n5(s3 var0) {
      return var0.u3;
   }

   // $VF: synthetic method
   static String l6(s3 var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String l6(s3 var0) {
      return var0.a6;
   }

   // $VF: synthetic method
   static String k5(s3 var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String k5(s3 var0) {
      return var0.u9;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.j5 u3(s3 var0) {
      return var0.h0;
   }

   // $VF: synthetic method
   static String u3(s3 var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String a6(s3 var0) {
      return var0.c8;
   }

   // $VF: synthetic method
   static String a6(s3 var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static String u9(s3 var0) {
      return var0.t2;
   }

   // $VF: synthetic method
   static String u9(s3 var0, String var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static String h0(s3 var0) {
      return var0.s7;
   }

   // $VF: synthetic method
   static String h0(s3 var0, String var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static String c8(s3 var0) {
      return var0.x8;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.j5 t2(s3 var0) {
      return var0.n3;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.j5 s7(s3 var0) {
      return var0.y4;
   }

   // $VF: synthetic method
   static String c8(s3 var0, String var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static String x8(s3 var0) {
      return var0.e2;
   }

   // $VF: synthetic method
   static String t2(s3 var0, String var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static String n3(s3 var0) {
      return var0.t9;
   }

   // $VF: synthetic method
   static String s7(s3 var0, String var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static String y4(s3 var0) {
      return var0.z1;
   }
}
