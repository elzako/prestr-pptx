package com.aspose.slides.internal.k4y;

public class g2u extends b3 {
   private boolean l6;
   private int k5;
   private String u3;
   private String a6;
   private g7 u9;
   private y1g h0;
   public static final int n5 = h3o.n5("v3v4");
   private static final com.aspose.slides.internal.v6g.u9 c8 = new com.aspose.slides.internal.v6g.u9(
      "showSpeakerNotes", "pubBrowser", "title", "r:id", "sldAll", "sldRg", "custShow", "extLst"
   );

   public g2u(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      g2u$1 var2 = new g2u$1(this);
      n5(var1, var2);
      n5(var1, new g2u$2(this, var1));
   }

   public g2u() {
      this.l6();
   }

   private void l6() {
      this.l6 = true;
      this.k5 = n5;
      this.u3 = "";
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (!this.l6) {
         var2.l6("showSpeakerNotes", this.l6 ? "1" : "0");
      }

      if (this.k5 != n5) {
         var2.l6("pubBrowser", h3o.n5(this.k5));
      }

      if (!"".equals(this.u3)) {
         var2.l6("title", this.u3);
      }

      if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
         var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
      }

      var2.l6("r:id", this.a6);
      if (this.u9 != null) {
         switch (c8.n5(this.u9.n5())) {
            case 4:
               ((e0j)this.u9.k5()).n5("p", var2, this.u9.n5());
               break;
            case 5:
               ((v6b)this.u9.k5()).n5("p", var2, this.u9.n5());
               break;
            case 6:
               ((v4z)this.u9.k5()).n5("p", var2, this.u9.n5());
         }
      }

      if (this.h0 != null) {
         this.h0.n5("p", var2, "extLst");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return c8;
   }

   // $VF: synthetic method
   static boolean n5(g2u var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int n5(g2u var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String n5(g2u var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String l6(g2u var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static g7 n5(g2u var0, g7 var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static y1g n5(g2u var0, y1g var1) {
      return var0.h0 = var1;
   }
}
