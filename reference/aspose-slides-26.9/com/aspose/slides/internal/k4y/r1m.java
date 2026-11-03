package com.aspose.slides.internal.k4y;

public class r1m extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("name", "value", "units");

   public r1m(com.aspose.slides.ms.System.Xml.c7 var1) {
      r1m$1 var2 = new r1m$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public r1m() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("name", this.n5);
      var2.l6("value", this.l6);
      if (this.k5 != null) {
         var2.l6("units", this.k5);
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u3;
   }

   // $VF: synthetic method
   static String n5(r1m var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(r1m var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(r1m var0, String var1) {
      return var0.k5 = var1;
   }
}
