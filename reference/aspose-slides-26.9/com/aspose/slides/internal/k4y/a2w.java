package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class a2w extends b3 {
   private l4w n5;
   private l4w l6;
   private l4w k5;
   private l4w u3;
   private l4w a6;
   private l4w u9;
   private l4w h0;
   private l4w c8;
   private l8r t2;
   private static final com.aspose.slides.internal.v6g.u9 s7 = new com.aspose.slides.internal.v6g.u9(
      "left", "right", "top", "bottom", "insideH", "insideV", "tl2br", "tr2bl", "extLst"
   );

   public a2w(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new a2w$1(this, var1));
   }

   public a2w() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("a", var2, "left");
      }

      if (this.l6 != null) {
         this.l6.n5("a", var2, "right");
      }

      if (this.k5 != null) {
         this.k5.n5("a", var2, "top");
      }

      if (this.u3 != null) {
         this.u3.n5("a", var2, "bottom");
      }

      if (this.a6 != null) {
         this.a6.n5("a", var2, "insideH");
      }

      if (this.u9 != null) {
         this.u9.n5("a", var2, "insideV");
      }

      if (this.h0 != null) {
         this.h0.n5("a", var2, "tl2br");
      }

      if (this.c8 != null) {
         this.c8.n5("a", var2, "tr2bl");
      }

      if (this.t2 != null) {
         this.t2.n5("a", var2, "extLst");
      }

      var2.s7();
   }

   public final l4w n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <left> element can be added.");
      }

      this.n5 = new l4w();
      return this.n5;
   }

   public final l4w l6() {
      if (this.l6 != null) {
         throw new Exception("Only one <right> element can be added.");
      }

      this.l6 = new l4w();
      return this.l6;
   }

   public final l4w k5() {
      if (this.k5 != null) {
         throw new Exception("Only one <top> element can be added.");
      }

      this.k5 = new l4w();
      return this.k5;
   }

   public final l4w u3() {
      if (this.u3 != null) {
         throw new Exception("Only one <bottom> element can be added.");
      }

      this.u3 = new l4w();
      return this.u3;
   }

   public final l4w a6() {
      if (this.a6 != null) {
         throw new Exception("Only one <insideH> element can be added.");
      }

      this.a6 = new l4w();
      return this.a6;
   }

   public final l4w u9() {
      if (this.u9 != null) {
         throw new Exception("Only one <insideV> element can be added.");
      }

      this.u9 = new l4w();
      return this.u9;
   }

   public final l4w h0() {
      if (this.h0 != null) {
         throw new Exception("Only one <tl2br> element can be added.");
      }

      this.h0 = new l4w();
      return this.h0;
   }

   public final l4w c8() {
      if (this.c8 != null) {
         throw new Exception("Only one <tr2bl> element can be added.");
      }

      this.c8 = new l4w();
      return this.c8;
   }

   public final void n5(x8 var1) {
      this.t2 = (l8r)var1;
   }

   public final l4w t2() {
      return this.n5;
   }

   public final l4w s7() {
      return this.l6;
   }

   public final l4w x8() {
      return this.k5;
   }

   public final l4w n3() {
      return this.u3;
   }

   public final l4w y4() {
      return this.a6;
   }

   public final l4w e2() {
      return this.u9;
   }

   public final l4w t9() {
      return this.h0;
   }

   public final l4w z1() {
      return this.c8;
   }

   public final x8 t4() {
      return this.t2;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 q0() {
      return s7;
   }

   // $VF: synthetic method
   static l4w n5(a2w var0, l4w var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static l4w l6(a2w var0, l4w var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static l4w k5(a2w var0, l4w var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static l4w u3(a2w var0, l4w var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static l4w a6(a2w var0, l4w var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static l4w u9(a2w var0, l4w var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static l4w h0(a2w var0, l4w var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static l4w c8(a2w var0, l4w var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static l8r n5(a2w var0, l8r var1) {
      return var0.t2 = var1;
   }
}
