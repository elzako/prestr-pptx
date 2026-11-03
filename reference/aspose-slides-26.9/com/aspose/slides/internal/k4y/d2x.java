package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class d2x extends b3 {
   private int k5;
   private int u3;
   private boolean a6;
   private e8j u9;
   private b9y h0;
   private j3z c8;
   private h6m t2;
   public static final int n5 = a4e.n5("t");
   public static final int l6 = u3y.n5("ctr");
   private static final com.aspose.slides.internal.v6g.u9 s7 = new com.aspose.slides.internal.v6g.u9("pos", "align", "overlay", "tx", "spPr", "txPr", "extLst");

   public d2x(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.n3();
      d2x$1 var2 = new d2x$1(this);
      n5(var1, var2);
      n5(var1, new d2x$2(this, var1));
   }

   public d2x() {
      this.n3();
   }

   private void n3() {
      this.k5 = n5;
      this.u3 = l6;
      this.a6 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.k5 != n5) {
         var2.l6("pos", a4e.n5(this.k5));
      }

      if (this.u3 != l6) {
         var2.l6("align", u3y.n5(this.u3));
      }

      if (this.a6) {
         var2.l6("overlay", this.a6 ? "1" : "0");
      }

      if (this.u9 != null) {
         this.u9.n5("cx", var2, "tx");
      }

      if (this.h0 != null) {
         this.h0.n5("cx", var2, "spPr");
      }

      if (this.c8 != null) {
         this.c8.n5("cx", var2, "txPr");
      }

      if (this.t2 != null) {
         this.t2.n5("cx", var2, "extLst");
      }

      var2.s7();
   }

   public final e8j n5() {
      if (this.u9 != null) {
         throw new Exception("Only one <tx> element can be added.");
      }

      this.u9 = new e8j();
      return this.u9;
   }

   public final b9y l6() {
      if (this.h0 != null) {
         throw new Exception("Only one <spPr> element can be added.");
      }

      this.h0 = new b9y();
      return this.h0;
   }

   public final j3z k5() {
      if (this.c8 != null) {
         throw new Exception("Only one <txPr> element can be added.");
      }

      this.c8 = new j3z();
      return this.c8;
   }

   public final int u3() {
      return this.k5;
   }

   public final void n5(int var1) {
      this.k5 = var1;
   }

   public final int a6() {
      return this.u3;
   }

   public final void l6(int var1) {
      this.u3 = var1;
   }

   public final boolean u9() {
      return this.a6;
   }

   public final void n5(boolean var1) {
      this.a6 = var1;
   }

   public final e8j h0() {
      return this.u9;
   }

   public final b9y c8() {
      return this.h0;
   }

   public final j3z t2() {
      return this.c8;
   }

   public final h6m s7() {
      return this.t2;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 x8() {
      return s7;
   }

   // $VF: synthetic method
   static int n5(d2x var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int l6(d2x var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean n5(d2x var0, boolean var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static e8j n5(d2x var0, e8j var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static b9y n5(d2x var0, b9y var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static j3z n5(d2x var0, j3z var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static h6m n5(d2x var0, h6m var1) {
      return var0.t2 = var1;
   }
}
