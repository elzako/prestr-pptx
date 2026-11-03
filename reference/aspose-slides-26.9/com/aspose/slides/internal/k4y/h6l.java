package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class h6l extends b3 {
   private y3 n5;
   private r5d l6;
   private i5 k5;
   private l8r u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("camera", "lightRig", "backdrop", "extLst");

   public h6l(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new h6l$1(this, var1));
   }

   public h6l() {
      this.n5 = new y3();
      this.l6 = new r5d();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      if (!"a".equals(var2.n5("http://schemas.openxmlformats.org/drawingml/2006/main"))) {
         var2.n5(var1, var3, "http://schemas.openxmlformats.org/drawingml/2006/main");
      } else {
         var2.n5(var1, var3, null);
      }

      this.n5.n5("a", var2, "camera");
      this.l6.n5("a", var2, "lightRig");
      if (this.k5 != null) {
         this.k5.n5("a", var2, "backdrop");
      }

      if (this.u3 != null) {
         this.u3.n5("a", var2, "extLst");
      }

      var2.s7();
   }

   public final i5 n5() {
      if (this.k5 != null) {
         throw new Exception("Only one <backdrop> element can be added.");
      }

      this.k5 = new i5();
      return this.k5;
   }

   public final y3 l6() {
      return this.n5;
   }

   public final r5d k5() {
      return this.l6;
   }

   public final i5 u3() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return a6;
   }

   // $VF: synthetic method
   static y3 n5(h6l var0, y3 var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static r5d n5(h6l var0, r5d var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static i5 n5(h6l var0, i5 var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static l8r n5(h6l var0, l8r var1) {
      return var0.u3 = var1;
   }
}
