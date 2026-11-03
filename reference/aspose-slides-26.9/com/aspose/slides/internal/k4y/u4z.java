package com.aspose.slides.internal.k4y;

public class u4z extends b3 {
   private String n5;
   private String l6;
   private o0s k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("xml:id", "traceformatRef", "traceFormat");

   public u4z(com.aspose.slides.ms.System.Xml.c7 var1) {
      u4z$1 var2 = new u4z$1(this);
      n5(var1, var2);
      n5(var1, new u4z$2(this, var1));
   }

   public u4z() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("xml:id", this.n5);
      }

      if (this.l6 != null) {
         var2.l6("traceFormatRef", this.l6);
      }

      if (this.k5 != null) {
         this.k5.n5("inkml", var2, "traceFormat");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u3;
   }

   // $VF: synthetic method
   static String n5(u4z var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(u4z var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static o0s n5(u4z var0, o0s var1) {
      return var0.k5 = var1;
   }
}
