package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class n2u extends b3 {
   private int n5;
   private y2t l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("displayLoc", "trackLst");

   public n2u(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      n2u$1 var2 = new n2u$1(this);
      n5(var1, var2);
      n5(var1, new n2u$2(this, var1));
   }

   public n2u() {
      this.u3();
   }

   private void u3() {
      this.n5 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("p173", var3, "http://schemas.microsoft.com/office/powerpoint/2017/3/main");
      if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
         var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
      }

      var2.l6("displayLoc", i3g.n5(this.n5));
      if (this.l6 != null) {
         this.l6.n5("p173", var2, "trackLst");
      }

      var2.s7();
   }

   public final y2t n5() {
      if (this.l6 != null) {
         throw new Exception("Only one <trackLst> element can be added.");
      }

      this.l6 = new y2t();
      return this.l6;
   }

   public final void n5(y2t var1) {
      this.l6 = var1;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final y2t l6() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return k5;
   }

   // $VF: synthetic method
   static int n5(n2u var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static y2t n5(n2u var0, y2t var1) {
      return var0.l6 = var1;
   }
}
