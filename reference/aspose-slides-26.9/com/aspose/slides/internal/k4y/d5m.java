package com.aspose.slides.internal.k4y;

public class d5m extends b3 {
   private int l6;
   private y1g k5;
   public static final int n5 = o5t.n5("none");
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("followColorScheme", "extLst");

   public d5m(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      d5m$1 var2 = new d5m$1(this);
      n5(var1, var2);
      n5(var1, new d5m$2(this, var1));
   }

   public d5m() {
      this.l6();
   }

   private void l6() {
      this.l6 = n5;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != n5) {
         var2.l6("followColorScheme", o5t.n5(this.l6));
      }

      if (this.k5 != null) {
         this.k5.n5("p", var2, "extLst");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return u3;
   }

   // $VF: synthetic method
   static int n5(d5m var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static y1g n5(d5m var0, y1g var1) {
      return var0.k5 = var1;
   }
}
