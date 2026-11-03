package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class v1y extends b3 {
   private a0p n5;
   private f3h l6;
   private f3h k5;
   private f3h u3;
   private f3h a6;
   private x8w u9;
   private x8w h0;
   private x8w c8;
   private x8w t2;
   private a9t s7;
   private static final com.aspose.slides.internal.v6g.u9 x8 = new com.aspose.slides.internal.v6g.u9(
      "layoutTarget", "xMode", "yMode", "wMode", "hMode", "x", "y", "w", "h", "extLst"
   );

   public v1y(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new v1y$1(this, var1));
   }

   public v1y() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("c", var2, "layoutTarget");
      }

      if (this.l6 != null) {
         this.l6.n5("c", var2, "xMode");
      }

      if (this.k5 != null) {
         this.k5.n5("c", var2, "yMode");
      }

      if (this.u3 != null) {
         this.u3.n5("c", var2, "wMode");
      }

      if (this.a6 != null) {
         this.a6.n5("c", var2, "hMode");
      }

      if (this.u9 != null) {
         this.u9.n5("c", var2, "x");
      }

      if (this.h0 != null) {
         this.h0.n5("c", var2, "y");
      }

      if (this.c8 != null) {
         this.c8.n5("c", var2, "w");
      }

      if (this.t2 != null) {
         this.t2.n5("c", var2, "h");
      }

      if (this.s7 != null) {
         this.s7.n5("c", var2, "extLst");
      }

      var2.s7();
   }

   public final a0p n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <layoutTarget> element can be added.");
      }

      this.n5 = new a0p();
      return this.n5;
   }

   public final void n5(f3h var1) {
      this.l6 = var1;
   }

   public final void l6(f3h var1) {
      this.k5 = var1;
   }

   public final void k5(f3h var1) {
      this.u3 = var1;
   }

   public final void u3(f3h var1) {
      this.a6 = var1;
   }

   public final x8w l6() {
      if (this.u9 != null) {
         throw new Exception("Only one <x> element can be added.");
      }

      this.u9 = new x8w();
      return this.u9;
   }

   public final x8w k5() {
      if (this.h0 != null) {
         throw new Exception("Only one <y> element can be added.");
      }

      this.h0 = new x8w();
      return this.h0;
   }

   public final x8w u3() {
      if (this.c8 != null) {
         throw new Exception("Only one <w> element can be added.");
      }

      this.c8 = new x8w();
      return this.c8;
   }

   public final x8w a6() {
      if (this.t2 != null) {
         throw new Exception("Only one <h> element can be added.");
      }

      this.t2 = new x8w();
      return this.t2;
   }

   public final void n5(x8 var1) {
      this.s7 = (a9t)var1;
   }

   public final a0p u9() {
      return this.n5;
   }

   public final f3h h0() {
      return this.l6;
   }

   public final f3h c8() {
      return this.k5;
   }

   public final f3h t2() {
      return this.u3;
   }

   public final f3h s7() {
      return this.a6;
   }

   public final x8w x8() {
      return this.u9;
   }

   public final x8w n3() {
      return this.h0;
   }

   public final x8w y4() {
      return this.c8;
   }

   public final x8w e2() {
      return this.t2;
   }

   public final x8 t9() {
      return this.s7;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 z1() {
      return x8;
   }

   // $VF: synthetic method
   static a0p n5(v1y var0, a0p var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static f3h n5(v1y var0, f3h var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static f3h l6(v1y var0, f3h var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static f3h k5(v1y var0, f3h var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static f3h u3(v1y var0, f3h var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static x8w n5(v1y var0, x8w var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static x8w l6(v1y var0, x8w var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static x8w k5(v1y var0, x8w var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static x8w u3(v1y var0, x8w var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static a9t n5(v1y var0, a9t var1) {
      return var0.s7 = var1;
   }
}
