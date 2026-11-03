package com.aspose.slides.internal.k4y;

public class l3k extends b3 {
   private String l6;
   private int k5;
   private String u3;
   private int a6;
   private boolean u9;
   private long h0;
   private String c8;
   public static final int n5 = q1h.n5("DVASPECT_CONTENT");
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9(
      "progId", "dvAspect", "link", "oleUpdate", "autoLoad", "shapeId", "r:id"
   );

   public l3k(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      l3k$1 var2 = new l3k$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public l3k() {
      this.l6();
   }

   private void l6() {
      this.k5 = n5;
      this.a6 = 0;
      this.u9 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != null) {
         var2.l6("progId", this.l6);
      }

      if (this.k5 != n5) {
         var2.l6("dvAspect", q1h.n5(this.k5));
      }

      if (this.u3 != null) {
         var2.l6("link", this.u3);
      }

      if (this.a6 != 0) {
         var2.l6("oleUpdate", q6y.n5(this.a6));
      }

      if (this.u9) {
         var2.l6("autoLoad", this.u9 ? "1" : "0");
      }

      var2.l6("shapeId", com.aspose.slides.ms.System.Xml.f4.l6(this.h0));
      if (this.c8 != null) {
         if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
            var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
         }

         var2.l6("r:id", this.c8);
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return t2;
   }

   // $VF: synthetic method
   static String n5(l3k var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int n5(l3k var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String l6(l3k var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int l6(l3k var0, int var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(l3k var0, boolean var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static long n5(l3k var0, long var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String k5(l3k var0, String var1) {
      return var0.c8 = var1;
   }
}
