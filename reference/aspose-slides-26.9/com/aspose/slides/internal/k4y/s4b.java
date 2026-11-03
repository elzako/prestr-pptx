package com.aspose.slides.internal.k4y;

public class s4b extends b3 {
   private String n5;
   private long l6;
   private t6k k5;
   private y1g u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("name", "id", "sldLst", "extLst");

   public s4b(com.aspose.slides.ms.System.Xml.c7 var1) {
      s4b$1 var2 = new s4b$1(this);
      n5(var1, var2);
      n5(var1, new s4b$2(this, var1));
   }

   public s4b() {
      this.k5 = new t6k();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("name", this.n5);
      var2.l6("id", com.aspose.slides.ms.System.Xml.f4.l6(this.l6));
      this.k5.n5("p", var2, "sldLst");
      if (this.u3 != null) {
         this.u3.n5("p", var2, "extLst");
      }

      var2.s7();
   }

   public final String n5() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final long l6() {
      return this.l6;
   }

   public final void n5(long var1) {
      this.l6 = var1;
   }

   public final t6k k5() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return a6;
   }

   // $VF: synthetic method
   static String n5(s4b var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static long n5(s4b var0, long var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static t6k n5(s4b var0, t6k var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static y1g n5(s4b var0, y1g var1) {
      return var0.u3 = var1;
   }
}
