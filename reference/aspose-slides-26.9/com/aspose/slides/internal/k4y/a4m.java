package com.aspose.slides.internal.k4y;

public class a4m extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("w_Uri", "w_Name", "w_Val");

   public a4m(com.aspose.slides.ms.System.Xml.c7 var1) {
      a4m$1 var2 = new a4m$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public a4m() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("w:uri", this.n5);
      }

      var2.l6("w:name", this.l6);
      var2.l6("w:val", this.k5);
      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u3;
   }

   // $VF: synthetic method
   static String n5(a4m var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(a4m var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(a4m var0, String var1) {
      return var0.k5 = var1;
   }
}
