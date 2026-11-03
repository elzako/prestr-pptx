package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class n9q extends b3 {
   private byte n5;
   private z4 l6;
   private z4 k5;
   private static final com.aspose.slides.internal.v6g.u9 u3 = new com.aspose.slides.internal.v6g.u9("prst", "fgClr", "bgClr");

   public n9q(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.h0();
      n9q$1 var2 = new n9q$1(this);
      n5(var1, var2);
      n5(var1, new n9q$2(this, var1));
   }

   public n9q() {
      this.h0();
   }

   private void h0() {
      this.n5 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      if (!"a".equals(var2.n5("http://schemas.openxmlformats.org/drawingml/2006/main"))) {
         var2.n5(var1, var3, "http://schemas.openxmlformats.org/drawingml/2006/main");
      } else {
         var2.n5(var1, var3, null);
      }

      if (this.n5 != 0) {
         var2.l6("prst", c5.n5(this.n5));
      }

      if (this.l6 != null) {
         this.l6.n5("a", var2, "fgClr");
      }

      if (this.k5 != null) {
         this.k5.n5("a", var2, "bgClr");
      }

      var2.s7();
   }

   public final z4 n5() {
      if (this.l6 != null) {
         throw new Exception("Only one <fgClr> element can be added.");
      }

      this.l6 = new z4();
      return this.l6;
   }

   public final z4 l6() {
      if (this.k5 != null) {
         throw new Exception("Only one <bgClr> element can be added.");
      }

      this.k5 = new z4();
      return this.k5;
   }

   public final byte k5() {
      return this.n5;
   }

   public final void n5(byte var1) {
      this.n5 = var1;
   }

   public final z4 u3() {
      return this.l6;
   }

   public final z4 a6() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u9() {
      return u3;
   }

   // $VF: synthetic method
   static byte n5(n9q var0, byte var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static z4 n5(n9q var0, z4 var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static z4 l6(n9q var0, z4 var1) {
      return var0.k5 = var1;
   }
}
