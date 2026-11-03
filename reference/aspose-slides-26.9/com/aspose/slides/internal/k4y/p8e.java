package com.aspose.slides.internal.k4y;

public class p8e extends b3 {
   private long n5;
   private String l6;
   private y1g k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("id", "r:id", "extLst");

   public p8e(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      p8e$1 var2 = new p8e$1(this);
      n5(var1, var2);
      n5(var1, new p8e$2(this, var1));
   }

   public p8e() {
      this.a6();
   }

   private void a6() {
      this.n5 = 4294967295L;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if ((this.n5 & 4294967295L) != 4294967295L) {
         var2.l6("id", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      }

      if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
         var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
      }

      var2.l6("r:id", this.l6);
      if (this.k5 != null) {
         this.k5.n5("p", var2, "extLst");
      }

      var2.s7();
   }

   public final void n5(x8 var1) {
      this.k5 = (y1g)var1;
   }

   public final long n5() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final String l6() {
      return this.l6;
   }

   public final void n5(String var1) {
      this.l6 = var1;
   }

   public final x8 k5() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return u3;
   }

   // $VF: synthetic method
   static long n5(p8e var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(p8e var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static y1g n5(p8e var0, y1g var1) {
      return var0.k5 = var1;
   }
}
