package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class o9b extends b3 {
   private f9 n5;
   private k1d l6;
   private f3c k5;
   private s5g u3;
   private o3i a6;
   private p2i u9;
   private d2a h0;
   private g9t c8;
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9(
      "blur", "fillOverlay", "glow", "innerShdw", "outerShdw", "prstShdw", "reflection", "softEdge"
   );

   public o9b(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new o9b$1(this, var1));
   }

   public o9b() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      if (!"a".equals(var2.n5("http://schemas.openxmlformats.org/drawingml/2006/main"))) {
         var2.n5(var1, var3, "http://schemas.openxmlformats.org/drawingml/2006/main");
      } else {
         var2.n5(var1, var3, null);
      }

      if (this.n5 != null) {
         this.n5.n5("a", var2, "blur");
      }

      if (this.l6 != null) {
         this.l6.n5("a", var2, "fillOverlay");
      }

      if (this.k5 != null) {
         this.k5.n5("a", var2, "glow");
      }

      if (this.u3 != null) {
         this.u3.n5("a", var2, "innerShdw");
      }

      if (this.a6 != null) {
         this.a6.n5("a", var2, "outerShdw");
      }

      if (this.u9 != null) {
         this.u9.n5("a", var2, "prstShdw");
      }

      if (this.h0 != null) {
         this.h0.n5("a", var2, "reflection");
      }

      if (this.c8 != null) {
         this.c8.n5("a", var2, "softEdge");
      }

      var2.s7();
   }

   public final f9 n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <blur> element can be added.");
      }

      this.n5 = new f9();
      return this.n5;
   }

   public final k1d l6() {
      if (this.l6 != null) {
         throw new Exception("Only one <fillOverlay> element can be added.");
      }

      this.l6 = new k1d();
      return this.l6;
   }

   public final f3c k5() {
      if (this.k5 != null) {
         throw new Exception("Only one <glow> element can be added.");
      }

      this.k5 = new f3c();
      return this.k5;
   }

   public final s5g u3() {
      if (this.u3 != null) {
         throw new Exception("Only one <innerShdw> element can be added.");
      }

      this.u3 = new s5g();
      return this.u3;
   }

   public final o3i a6() {
      if (this.a6 != null) {
         throw new Exception("Only one <outerShdw> element can be added.");
      }

      this.a6 = new o3i();
      return this.a6;
   }

   public final p2i u9() {
      if (this.u9 != null) {
         throw new Exception("Only one <prstShdw> element can be added.");
      }

      this.u9 = new p2i();
      return this.u9;
   }

   public final d2a h0() {
      if (this.h0 != null) {
         throw new Exception("Only one <reflection> element can be added.");
      }

      this.h0 = new d2a();
      return this.h0;
   }

   public final g9t c8() {
      if (this.c8 != null) {
         throw new Exception("Only one <softEdge> element can be added.");
      }

      this.c8 = new g9t();
      return this.c8;
   }

   public final f9 t2() {
      return this.n5;
   }

   public final k1d s7() {
      return this.l6;
   }

   public final f3c x8() {
      return this.k5;
   }

   public final s5g n3() {
      return this.u3;
   }

   public final o3i y4() {
      return this.a6;
   }

   public final p2i e2() {
      return this.u9;
   }

   public final d2a t9() {
      return this.h0;
   }

   public final g9t z1() {
      return this.c8;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 t4() {
      return t2;
   }

   // $VF: synthetic method
   static f9 n5(o9b var0, f9 var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static k1d n5(o9b var0, k1d var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static f3c n5(o9b var0, f3c var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static s5g n5(o9b var0, s5g var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static o3i n5(o9b var0, o3i var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static p2i n5(o9b var0, p2i var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static d2a n5(o9b var0, d2a var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static g9t n5(o9b var0, g9t var1) {
      return var0.c8 = var1;
   }
}
