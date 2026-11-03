package com.aspose.slides.internal.k4y;

public class z4h extends b3 {
   private long n5;
   private long l6;
   private String k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("sb", "eb", "t");

   public z4h(com.aspose.slides.ms.System.Xml.c7 var1) {
      z4h$1 var2 = new z4h$1(this);
      n5(var1, var2);
      n5(var1, new z4h$2(this, var1));
   }

   public z4h() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("sb", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      var2.l6("eb", com.aspose.slides.ms.System.Xml.f4.l6(this.l6));
      this.n5("ssml", var2, "t", this.k5, true);
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u3;
   }

   // $VF: synthetic method
   static long n5(z4h var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static long l6(z4h var0, long var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String n5(z4h var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String n5(z4h var0) {
      return var0.k5;
   }
}
