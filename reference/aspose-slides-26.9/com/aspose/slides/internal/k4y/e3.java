package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class e3 extends b3 {
   private long n5;
   private byte l6;
   private w7 k5;
   private p6r u3;
   private g7 a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9(
      "dpi", "rotWithShape", "blip", "srcRect", "tile", "stretch"
   );

   public e3(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.t2();
      e3$1 var2 = new e3$1(this);
      n5(var1, var2);
      n5(var1, new e3$2(this, var1));
   }

   public e3() {
      this.t2();
   }

   private void t2() {
      this.n5 = 4294967295L;
      this.l6 = -1;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      if (!"a".equals(var2.n5("http://schemas.openxmlformats.org/drawingml/2006/main"))) {
         var2.n5(var1, var3, "http://schemas.openxmlformats.org/drawingml/2006/main");
      } else {
         var2.n5(var1, var3, null);
      }

      if ((this.n5 & 4294967295L) != 4294967295L) {
         var2.l6("dpi", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      }

      if (this.l6 != -1) {
         var2.l6("rotWithShape", this.l6 == 1 ? "1" : "0");
      }

      if (this.k5 != null) {
         this.k5.n5("a", var2, "blip");
      }

      if (this.u3 != null) {
         this.u3.n5("a", var2, "srcRect");
      }

      if (this.a6 != null) {
         switch (u9.n5(this.a6.n5())) {
            case 4:
               ((l3e)this.a6.k5()).n5("a", var2, this.a6.n5());
               break;
            case 5:
               ((y9r)this.a6.k5()).n5("a", var2, this.a6.n5());
         }
      }

      var2.s7();
   }

   public final w7 n5() {
      if (this.k5 != null) {
         throw new Exception("Only one <blip> element can be added.");
      }

      this.k5 = new w7();
      return this.k5;
   }

   public final p6r l6() {
      if (this.u3 != null) {
         throw new Exception("Only one <srcRect> element can be added.");
      }

      this.u3 = new p6r();
      return this.u3;
   }

   public final g7 n5(String var1) {
      if (this.a6 != null) {
         throw new Exception("FillModeProperties already is initialized.");
      }

      switch (u9.n5(var1)) {
         case 4:
            this.a6 = new g7("tile", new l3e());
            break;
         case 5:
            this.a6 = new g7("stretch", new y9r());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.a6;
   }

   public final long k5() {
      return this.n5;
   }

   public final void n5(long var1) {
      this.n5 = var1;
   }

   public final byte u3() {
      return this.l6;
   }

   public final void n5(byte var1) {
      this.l6 = var1;
   }

   public final w7 a6() {
      return this.k5;
   }

   public final p6r u9() {
      return this.u3;
   }

   public final g7 h0() {
      return this.a6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 c8() {
      return u9;
   }

   // $VF: synthetic method
   static long n5(e3 var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static byte n5(e3 var0, byte var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static w7 n5(e3 var0, w7 var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static p6r n5(e3 var0, p6r var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static g7 n5(e3 var0, g7 var1) {
      return var0.a6 = var1;
   }
}
