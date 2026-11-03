package com.aspose.slides.internal.k4y;

public class i7 extends b3 {
   private boolean n5;
   private boolean l6;
   private boolean k5;
   private boolean u3;
   private boolean a6;
   private boolean u9;
   private boolean h0;
   private boolean c8;
   private boolean t2;
   private boolean s7;
   private l8r x8;
   private static final com.aspose.slides.internal.v6g.u9 n3 = new com.aspose.slides.internal.v6g.u9(
      "noGrp",
      "noSelect",
      "noRot",
      "noChangeAspect",
      "noMove",
      "noResize",
      "noEditPoints",
      "noAdjustHandles",
      "noChangeArrowheads",
      "noChangeShapeType",
      "extLst"
   );

   public i7(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      i7$1 var2 = new i7$1(this);
      n5(var1, var2);
      n5(var1, new i7$2(this, var1));
   }

   public i7() {
      this.l6();
   }

   private void l6() {
      this.n5 = false;
      this.l6 = false;
      this.k5 = false;
      this.u3 = false;
      this.a6 = false;
      this.u9 = false;
      this.h0 = false;
      this.c8 = false;
      this.t2 = false;
      this.s7 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5) {
         var2.l6("noGrp", this.n5 ? "1" : "0");
      }

      if (this.l6) {
         var2.l6("noSelect", this.l6 ? "1" : "0");
      }

      if (this.k5) {
         var2.l6("noRot", this.k5 ? "1" : "0");
      }

      if (this.u3) {
         var2.l6("noChangeAspect", this.u3 ? "1" : "0");
      }

      if (this.a6) {
         var2.l6("noMove", this.a6 ? "1" : "0");
      }

      if (this.u9) {
         var2.l6("noResize", this.u9 ? "1" : "0");
      }

      if (this.h0) {
         var2.l6("noEditPoints", this.h0 ? "1" : "0");
      }

      if (this.c8) {
         var2.l6("noAdjustHandles", this.c8 ? "1" : "0");
      }

      if (this.t2) {
         var2.l6("noChangeArrowheads", this.t2 ? "1" : "0");
      }

      if (this.s7) {
         var2.l6("noChangeShapeType", this.s7 ? "1" : "0");
      }

      if (this.x8 != null) {
         this.x8.n5("a14", var2, "extLst");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return n3;
   }

   // $VF: synthetic method
   static boolean n5(i7 var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean l6(i7 var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean k5(i7 var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static boolean u3(i7 var0, boolean var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean a6(i7 var0, boolean var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean u9(i7 var0, boolean var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static boolean h0(i7 var0, boolean var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static boolean c8(i7 var0, boolean var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static boolean t2(i7 var0, boolean var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static boolean s7(i7 var0, boolean var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static l8r n5(i7 var0, l8r var1) {
      return var0.x8 = var1;
   }
}
