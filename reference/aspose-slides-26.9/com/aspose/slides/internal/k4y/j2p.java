package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class j2p extends b3 {
   private int n5;
   private byte l6;
   private w1n k5;
   private g7 u3;
   private p6r a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9("flip", "rotWithShape", "gsLst", "lin", "path", "tileRect");

   public j2p(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.t2();
      j2p$1 var2 = new j2p$1(this);
      n5(var1, var2);
      n5(var1, new j2p$2(this, var1));
   }

   public j2p() {
      this.t2();
   }

   private void t2() {
      this.n5 = -1;
      this.l6 = -1;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      if (!"a".equals(var2.n5("http://schemas.openxmlformats.org/drawingml/2006/main"))) {
         var2.n5(var1, var3, "http://schemas.openxmlformats.org/drawingml/2006/main");
      } else {
         var2.n5(var1, var3, null);
      }

      if (this.n5 != -1) {
         var2.l6("flip", t0.n5(this.n5));
      }

      if (this.l6 != -1) {
         var2.l6("rotWithShape", this.l6 == 1 ? "1" : "0");
      }

      if (this.k5 != null) {
         this.k5.n5("a", var2, "gsLst");
      }

      if (this.u3 != null) {
         switch (u9.n5(this.u3.n5())) {
            case 3:
               ((m5l)this.u3.k5()).n5("a", var2, this.u3.n5());
               break;
            case 4:
               ((l1b)this.u3.k5()).n5("a", var2, this.u3.n5());
         }
      }

      if (this.a6 != null) {
         this.a6.n5("a", var2, "tileRect");
      }

      var2.s7();
   }

   public final w1n n5() {
      if (this.k5 != null) {
         throw new Exception("Only one <gsLst> element can be added.");
      }

      this.k5 = new w1n();
      return this.k5;
   }

   public final p6r l6() {
      if (this.a6 != null) {
         throw new Exception("Only one <tileRect> element can be added.");
      }

      this.a6 = new p6r();
      return this.a6;
   }

   public final g7 n5(String var1) {
      if (this.u3 != null) {
         throw new Exception("ShadeProperties already is initialized.");
      }

      switch (u9.n5(var1)) {
         case 3:
            this.u3 = new g7("lin", new m5l());
            break;
         case 4:
            this.u3 = new g7("path", new l1b());
            break;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }

      return this.u3;
   }

   public final int k5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final byte u3() {
      return this.l6;
   }

   public final void n5(byte var1) {
      this.l6 = var1;
   }

   public final w1n a6() {
      return this.k5;
   }

   public final g7 u9() {
      return this.u3;
   }

   public final p6r h0() {
      return this.a6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 c8() {
      return u9;
   }

   // $VF: synthetic method
   static int n5(j2p var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static byte n5(j2p var0, byte var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static w1n n5(j2p var0, w1n var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static g7 n5(j2p var0, g7 var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static p6r n5(j2p var0, p6r var1) {
      return var0.a6 = var1;
   }
}
