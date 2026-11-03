package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class x1s extends b3 {
   private byte n5;
   private String l6;
   private v5b k5;
   private e8b u3;
   private j9y a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9("p14:bwMode", "r:id", "nvContentPartPr", "xfrm", "extLst");

   public x1s(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.c8();
      x1s$1 var2 = new x1s$1(this);
      n5(var1, var2);
      n5(var1, new x1s$2(this, var1));
   }

   public x1s() {
      this.c8();
   }

   private void c8() {
      this.n5 = -1;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != -1) {
         var2.l6("p14:bwMode", s4.n5(this.n5));
      }

      if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
         var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
      }

      var2.l6("r:id", this.l6);
      if (this.k5 != null) {
         this.k5.n5("p14", var2, "nvContentPartPr");
      }

      if (this.u3 != null) {
         this.u3.n5("p14", var2, "xfrm");
      }

      if (this.a6 != null) {
         this.a6.n5("p14", var2, "extLst");
      }

      var2.s7();
   }

   public final v5b n5() {
      if (this.k5 != null) {
         throw new Exception("Only one <nvContentPartPr> element can be added.");
      }

      this.k5 = new v5b();
      return this.k5;
   }

   public final e8b l6() {
      if (this.u3 != null) {
         throw new Exception("Only one <xfrm> element can be added.");
      }

      this.u3 = new e8b();
      return this.u3;
   }

   public final byte k5() {
      return this.n5;
   }

   public final void n5(byte var1) {
      this.n5 = var1;
   }

   public final String u3() {
      return this.l6;
   }

   public final void n5(String var1) {
      this.l6 = var1;
   }

   public final v5b a6() {
      return this.k5;
   }

   public final e8b u9() {
      return this.u3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 h0() {
      return u9;
   }

   // $VF: synthetic method
   static byte n5(x1s var0, byte var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String n5(x1s var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static v5b n5(x1s var0, v5b var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static e8b n5(x1s var0, e8b var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static j9y n5(x1s var0, j9y var1) {
      return var0.a6 = var1;
   }
}
