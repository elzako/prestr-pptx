package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class u1s extends b3 {
   private u6p n5;
   private u6p l6;
   private x2 k5;
   private z6z u3;
   private o8m a6;
   private j8m u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9("avLst", "gdLst", "ahLst", "cxnLst", "rect", "pathLst");

   public u1s(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new u1s$1(this, var1));
   }

   public u1s() {
      this.u9 = new j8m();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      if (!"a".equals(var2.n5("http://schemas.openxmlformats.org/drawingml/2006/main"))) {
         var2.n5(var1, var3, "http://schemas.openxmlformats.org/drawingml/2006/main");
      } else {
         var2.n5(var1, var3, null);
      }

      if (this.n5 != null) {
         this.n5.n5("a", var2, "avLst");
      }

      if (this.l6 != null) {
         this.l6.n5("a", var2, "gdLst");
      }

      if (this.k5 != null) {
         this.k5.n5("a", var2, "ahLst");
      }

      if (this.u3 != null) {
         this.u3.n5("a", var2, "cxnLst");
      }

      if (this.a6 != null) {
         this.a6.n5("a", var2, "rect");
      }

      this.u9.n5("a", var2, "pathLst");
      var2.s7();
   }

   public final u6p n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <avLst> element can be added.");
      }

      this.n5 = new u6p();
      return this.n5;
   }

   public final u6p l6() {
      if (this.l6 != null) {
         throw new Exception("Only one <gdLst> element can be added.");
      }

      this.l6 = new u6p();
      return this.l6;
   }

   public final x2 k5() {
      if (this.k5 != null) {
         throw new Exception("Only one <ahLst> element can be added.");
      }

      this.k5 = new x2();
      return this.k5;
   }

   public final z6z u3() {
      if (this.u3 != null) {
         throw new Exception("Only one <cxnLst> element can be added.");
      }

      this.u3 = new z6z();
      return this.u3;
   }

   public final o8m a6() {
      if (this.a6 != null) {
         throw new Exception("Only one <rect> element can be added.");
      }

      this.a6 = new o8m();
      return this.a6;
   }

   public final u6p u9() {
      return this.n5;
   }

   public final u6p h0() {
      return this.l6;
   }

   public final x2 c8() {
      return this.k5;
   }

   public final z6z t2() {
      return this.u3;
   }

   public final o8m s7() {
      return this.a6;
   }

   public final j8m x8() {
      return this.u9;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n3() {
      return h0;
   }

   // $VF: synthetic method
   static u6p n5(u1s var0, u6p var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static u6p l6(u1s var0, u6p var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static x2 n5(u1s var0, x2 var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static z6z n5(u1s var0, z6z var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static o8m n5(u1s var0, o8m var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static j8m n5(u1s var0, j8m var1) {
      return var0.u9 = var1;
   }
}
