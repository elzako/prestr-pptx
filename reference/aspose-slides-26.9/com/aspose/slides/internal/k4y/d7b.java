package com.aspose.slides.internal.k4y;

public class d7b extends b3 {
   private long n5;
   private long l6;
   private c3j k5;
   private y1g u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("sldId", "cId", "zmPr", "extLst");

   public d7b(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      d7b$1 var2 = new d7b$1(this);
      n5(var1, var2);
      n5(var1, new d7b$2(this, var1));
   }

   public d7b() {
      this.a6();
      this.k5 = new c3j();
   }

   private void a6() {
      this.l6 = 4294967295L;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("sldId", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      if ((this.l6 & 4294967295L) != 4294967295L) {
         var2.l6("cId", com.aspose.slides.ms.System.Xml.f4.l6(this.l6));
      }

      this.k5.n5("pslz", var2, "zmPr");
      if (this.u3 != null) {
         this.u3.n5("pslz", var2, "extLst");
      }

      var2.s7();
   }

   public final long n5() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final long l6() {
      return this.l6;
   }

   public final void l6(long var1) {
      this.l6 = var1;
   }

   public final c3j k5() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return a6;
   }

   // $VF: synthetic method
   static long n5(d7b var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static long l6(d7b var0, long var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static c3j n5(d7b var0, c3j var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static y1g n5(d7b var0, y1g var1) {
      return var0.u3 = var1;
   }
}
