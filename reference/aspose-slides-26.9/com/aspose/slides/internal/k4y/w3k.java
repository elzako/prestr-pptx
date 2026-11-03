package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class w3k extends b3 {
   private int n5;
   private int l6;
   private boolean k5;
   private boolean u3;
   private j3z a6;
   private b1r u9;
   private l8r h0;
   private static final com.aspose.slides.internal.v6g.u9 c8 = new com.aspose.slides.internal.v6g.u9(
      "rowSpan", "gridSpan", "hMerge", "vMerge", "txBody", "tcPr", "extLst"
   );

   public w3k(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.t2();
      w3k$1 var2 = new w3k$1(this);
      n5(var1, var2);
      n5(var1, new w3k$2(this, var1));
   }

   public w3k() {
      this.t2();
   }

   private void t2() {
      this.n5 = 1;
      this.l6 = 1;
      this.k5 = false;
      this.u3 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != 1) {
         var2.l6("rowSpan", com.aspose.slides.ms.System.Xml.f4.n5(this.n5));
      }

      if (this.l6 != 1) {
         var2.l6("gridSpan", com.aspose.slides.ms.System.Xml.f4.n5(this.l6));
      }

      if (this.k5) {
         var2.l6("hMerge", this.k5 ? "1" : "0");
      }

      if (this.u3) {
         var2.l6("vMerge", this.u3 ? "1" : "0");
      }

      if (this.a6 != null) {
         this.a6.n5("a", var2, "txBody");
      }

      if (this.u9 != null) {
         this.u9.n5("a", var2, "tcPr");
      }

      if (this.h0 != null) {
         this.h0.n5("a", var2, "extLst");
      }

      var2.s7();
   }

   public final j3z n5() {
      if (this.a6 != null) {
         throw new Exception("Only one <txBody> element can be added.");
      }

      this.a6 = new j3z();
      return this.a6;
   }

   public final b1r l6() {
      if (this.u9 != null) {
         throw new Exception("Only one <tcPr> element can be added.");
      }

      this.u9 = new b1r();
      return this.u9;
   }

   public final void n5(x8 var1) {
      this.h0 = (l8r)var1;
   }

   public final int k5() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final int u3() {
      return this.l6;
   }

   public final void l6(int var1) {
      this.l6 = var1;
   }

   public final void n5(boolean var1) {
      this.k5 = var1;
   }

   public final void l6(boolean var1) {
      this.u3 = var1;
   }

   public final j3z a6() {
      return this.a6;
   }

   public final b1r u9() {
      return this.u9;
   }

   public final x8 h0() {
      return this.h0;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 c8() {
      return c8;
   }

   // $VF: synthetic method
   static int n5(w3k var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int l6(w3k var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(w3k var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static boolean l6(w3k var0, boolean var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static j3z n5(w3k var0, j3z var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static b1r n5(w3k var0, b1r var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static l8r n5(w3k var0, l8r var1) {
      return var0.h0 = var1;
   }
}
