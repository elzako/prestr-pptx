package com.aspose.slides.internal.k4y;

public class e4c extends b3 {
   private String l6;
   private long k5;
   private int u3;
   private String a6;
   public static final int n5 = f9h.n5("visible");
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9("name", "sheetId", "state", "r:id");

   public e4c(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      e4c$1 var2 = new e4c$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public e4c() {
      this.a6();
   }

   private void a6() {
      this.u3 = n5;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("name", this.l6);
      var2.l6("sheetId", com.aspose.slides.ms.System.Xml.f4.l6(this.k5));
      if (this.u3 != n5) {
         var2.l6("state", f9h.n5(this.u3));
      }

      if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
         var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
      }

      var2.l6("r:id", this.a6);
      var2.s7();
   }

   public final String n5() {
      return this.l6;
   }

   public final void n5(String var1) {
      this.l6 = var1;
   }

   public final long l6() {
      return this.k5;
   }

   public final void n5(long var1) {
      this.k5 = var1;
   }

   public final String k5() {
      return this.a6;
   }

   public final void l6(String var1) {
      this.a6 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return u9;
   }

   // $VF: synthetic method
   static String n5(e4c var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static long n5(e4c var0, long var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int n5(e4c var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String l6(e4c var0, String var1) {
      return var0.a6 = var1;
   }
}
