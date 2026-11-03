package com.aspose.slides.internal.k4y;

public class i0e extends b3 {
   private String n5;
   private g7 l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9(
      "name", "scrgbClr", "srgbClr", "hslClr", "sysClr", "schemeClr", "prstClr"
   );

   public i0e(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      i0e$1 var2 = new i0e$1(this);
      n5(var1, var2);
      n5(var1, new i0e$2(this, var1));
   }

   public i0e() {
      this.l6();
   }

   private void l6() {
      this.n5 = "";
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (!"".equals(this.n5)) {
         var2.l6("name", this.n5);
      }

      if (this.l6 != null) {
         switch (k5.n5(this.l6.n5())) {
            case 1:
               ((e4w)this.l6.k5()).n5("a", var2, this.l6.n5());
               break;
            case 2:
               ((e8p)this.l6.k5()).n5("a", var2, this.l6.n5());
               break;
            case 3:
               ((d0p)this.l6.k5()).n5("a", var2, this.l6.n5());
               break;
            case 4:
               ((s0i)this.l6.k5()).n5("a", var2, this.l6.n5());
               break;
            case 5:
               ((q4d)this.l6.k5()).n5("a", var2, this.l6.n5());
               break;
            case 6:
               ((x4a)this.l6.k5()).n5("a", var2, this.l6.n5());
         }
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return k5;
   }

   // $VF: synthetic method
   static String n5(i0e var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static g7 n5(i0e var0, g7 var1) {
      return var0.l6 = var1;
   }
}
