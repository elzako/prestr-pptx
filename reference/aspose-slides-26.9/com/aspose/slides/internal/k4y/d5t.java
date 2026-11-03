package com.aspose.slides.internal.k4y;

public class d5t extends b3 {
   private long n5;
   private boolean l6;
   private boolean k5;
   private g7 u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9(
      "colId", "hiddenButton", "showButton", "filters", "top10", "customFilters", "dynamicFilter", "colorFilter", "iconFilter", "extLst"
   );

   public d5t(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      d5t$1 var2 = new d5t$1(this);
      n5(var1, var2);
      n5(var1, new d5t$2(this, var1));
   }

   public d5t() {
      this.l6();
   }

   private void l6() {
      this.l6 = false;
      this.k5 = true;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("colId", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      if (this.l6) {
         var2.l6("hiddenButton", this.l6 ? "1" : "0");
      }

      if (!this.k5) {
         var2.l6("showButton", this.k5 ? "1" : "0");
      }

      if (this.u3 != null) {
         switch (a6.n5(this.u3.n5())) {
            case 3:
               ((e2p)this.u3.k5()).n5("ssml", var2, this.u3.n5());
               break;
            case 4:
               ((o3a)this.u3.k5()).n5("ssml", var2, this.u3.n5());
               break;
            case 5:
               ((y6k)this.u3.k5()).n5("ssml", var2, this.u3.n5());
               break;
            case 6:
               ((k1v)this.u3.k5()).n5("ssml", var2, this.u3.n5());
               break;
            case 7:
               ((d7f)this.u3.k5()).n5("ssml", var2, this.u3.n5());
               break;
            case 8:
               ((m7a)this.u3.k5()).n5("ssml", var2, this.u3.n5());
               break;
            case 9:
               ((l0k)this.u3.k5()).n5("ssml", var2, this.u3.n5());
         }
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return a6;
   }

   // $VF: synthetic method
   static long n5(d5t var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean n5(d5t var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean l6(d5t var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static g7 n5(d5t var0, g7 var1) {
      return var0.u3 = var1;
   }
}
