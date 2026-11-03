package com.aspose.slides.internal.k4y;

public class d3m extends b3 {
   private long n5;
   private String l6;
   private boolean k5;
   private int u3;
   private l0k a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9("mapId", "xpath", "denormalized", "xmlDataType", "extLst");

   public d3m(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      d3m$1 var2 = new d3m$1(this);
      n5(var1, var2);
      n5(var1, new d3m$2(this, var1));
   }

   public d3m() {
      this.l6();
   }

   private void l6() {
      this.k5 = false;
      this.u3 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("mapId", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      var2.l6("xpath", this.l6);
      if (this.k5) {
         var2.l6("denormalized", this.k5 ? "1" : "0");
      }

      var2.l6("xmlDataType", s2p.n5(this.u3));
      if (this.a6 != null) {
         this.a6.n5("ssml", var2, "extLst");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u9;
   }

   // $VF: synthetic method
   static long n5(d3m var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(d3m var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(d3m var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int n5(d3m var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static l0k n5(d3m var0, l0k var1) {
      return var0.a6 = var1;
   }
}
