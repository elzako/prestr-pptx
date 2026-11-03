package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class f3p extends b3 {
   private z9o n5;
   private z5b l6;
   private w3j k5;
   private a0n u3;
   private p2m a6;
   private s8u u9;
   private v3z h0;
   private b1n c8;
   private w8w t2;
   private i8s s7;
   private l0k x8;
   private static final com.aspose.slides.internal.v6g.u9 n3 = new com.aspose.slides.internal.v6g.u9(
      "numFmts", "fonts", "fills", "borders", "cellStyleXfs", "cellXfs", "cellStyles", "dxfs", "tableStyles", "colors", "extLst"
   );

   public f3p(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new f3p$1(this, var1));
   }

   public f3p() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("ssml", var3, "http://schemas.openxmlformats.org/spreadsheetml/2006/main");
      if (this.n5 != null) {
         this.n5.n5("ssml", var2, "numFmts");
      }

      if (this.l6 != null) {
         this.l6.n5("ssml", var2, "fonts");
      }

      if (this.k5 != null) {
         this.k5.n5("ssml", var2, "fills");
      }

      if (this.u3 != null) {
         this.u3.n5("ssml", var2, "borders");
      }

      if (this.a6 != null) {
         this.a6.n5("ssml", var2, "cellStyleXfs");
      }

      if (this.u9 != null) {
         this.u9.n5("ssml", var2, "cellXfs");
      }

      if (this.h0 != null) {
         this.h0.n5("ssml", var2, "cellStyles");
      }

      if (this.c8 != null) {
         this.c8.n5("ssml", var2, "dxfs");
      }

      if (this.t2 != null) {
         this.t2.n5("ssml", var2, "tableStyles");
      }

      if (this.s7 != null) {
         this.s7.n5("ssml", var2, "colors");
      }

      if (this.x8 != null) {
         this.x8.n5("ssml", var2, "extLst");
      }

      var2.s7();
   }

   public final z9o n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <numFmts> element can be added.");
      }

      this.n5 = new z9o();
      return this.n5;
   }

   public final void n5(z5b var1) {
      this.l6 = var1;
   }

   public final void n5(w3j var1) {
      this.k5 = var1;
   }

   public final void n5(a0n var1) {
      this.u3 = var1;
   }

   public final void n5(p2m var1) {
      this.a6 = var1;
   }

   public final s8u l6() {
      if (this.u9 != null) {
         throw new Exception("Only one <cellXfs> element can be added.");
      }

      this.u9 = new s8u();
      return this.u9;
   }

   public final void n5(v3z var1) {
      this.h0 = var1;
   }

   public final void n5(b1n var1) {
      this.c8 = var1;
   }

   public final void n5(w8w var1) {
      this.t2 = var1;
   }

   public final void n5(i8s var1) {
      this.s7 = var1;
   }

   public final void n5(l0k var1) {
      this.x8 = var1;
   }

   public final z9o k5() {
      return this.n5;
   }

   public final z5b u3() {
      return this.l6;
   }

   public final w3j a6() {
      return this.k5;
   }

   public final a0n u9() {
      return this.u3;
   }

   public final p2m h0() {
      return this.a6;
   }

   public final s8u c8() {
      return this.u9;
   }

   public final v3z t2() {
      return this.h0;
   }

   public final b1n s7() {
      return this.c8;
   }

   public final w8w x8() {
      return this.t2;
   }

   public final i8s n3() {
      return this.s7;
   }

   public final l0k y4() {
      return this.x8;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 e2() {
      return n3;
   }

   // $VF: synthetic method
   static z9o n5(f3p var0, z9o var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static z5b n5(f3p var0, z5b var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static w3j n5(f3p var0, w3j var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static a0n n5(f3p var0, a0n var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static p2m n5(f3p var0, p2m var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static s8u n5(f3p var0, s8u var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static v3z n5(f3p var0, v3z var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static b1n n5(f3p var0, b1n var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static w8w n5(f3p var0, w8w var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static i8s n5(f3p var0, i8s var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static l0k n5(f3p var0, l0k var1) {
      return var0.x8 = var1;
   }
}
