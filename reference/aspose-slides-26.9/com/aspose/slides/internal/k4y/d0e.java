package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class d0e extends b3 {
   private p9w n5;
   private n6d l6;
   private a9y k5;
   private f7v u3;
   private c8q a6;
   private z5p u9;
   private a9t h0;
   private static final com.aspose.slides.internal.v6g.u9 c8 = new com.aspose.slides.internal.v6g.u9(
      "rotX", "hPercent", "rotY", "depthPercent", "rAngAx", "perspective", "extLst"
   );

   public d0e(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new d0e$1(this, var1));
   }

   public d0e() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("c", var2, "rotX");
      }

      if (this.l6 != null) {
         this.l6.n5("c", var2, "hPercent");
      }

      if (this.k5 != null) {
         this.k5.n5("c", var2, "rotY");
      }

      if (this.u3 != null) {
         this.u3.n5("c", var2, "depthPercent");
      }

      if (this.a6 != null) {
         this.a6.n5("c", var2, "rAngAx");
      }

      if (this.u9 != null) {
         this.u9.n5("c", var2, "perspective");
      }

      if (this.h0 != null) {
         this.h0.n5("c", var2, "extLst");
      }

      var2.s7();
   }

   public final p9w n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <rotX> element can be added.");
      }

      this.n5 = new p9w();
      return this.n5;
   }

   public final n6d l6() {
      if (this.l6 != null) {
         throw new Exception("Only one <hPercent> element can be added.");
      }

      this.l6 = new n6d();
      return this.l6;
   }

   public final a9y k5() {
      if (this.k5 != null) {
         throw new Exception("Only one <rotY> element can be added.");
      }

      this.k5 = new a9y();
      return this.k5;
   }

   public final f7v u3() {
      if (this.u3 != null) {
         throw new Exception("Only one <depthPercent> element can be added.");
      }

      this.u3 = new f7v();
      return this.u3;
   }

   public final c8q a6() {
      if (this.a6 != null) {
         throw new Exception("Only one <rAngAx> element can be added.");
      }

      this.a6 = new c8q();
      return this.a6;
   }

   public final z5p u9() {
      if (this.u9 != null) {
         throw new Exception("Only one <perspective> element can be added.");
      }

      this.u9 = new z5p();
      return this.u9;
   }

   public final void n5(x8 var1) {
      this.h0 = (a9t)var1;
   }

   public final p9w h0() {
      return this.n5;
   }

   public final n6d c8() {
      return this.l6;
   }

   public final a9y t2() {
      return this.k5;
   }

   public final f7v s7() {
      return this.u3;
   }

   public final c8q x8() {
      return this.a6;
   }

   public final z5p n3() {
      return this.u9;
   }

   public final x8 y4() {
      return this.h0;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 e2() {
      return c8;
   }

   // $VF: synthetic method
   static p9w n5(d0e var0, p9w var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static n6d n5(d0e var0, n6d var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static a9y n5(d0e var0, a9y var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static f7v n5(d0e var0, f7v var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static c8q n5(d0e var0, c8q var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static z5p n5(d0e var0, z5p var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static a9t n5(d0e var0, a9t var1) {
      return var0.h0 = var1;
   }
}
