package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public final class m3e extends b3 {
   private int k5;
   private int u3;
   private boolean a6;
   private b9y u9;
   private j3z h0;
   private h6m c8;
   public static final int n5 = a4e.n5("r");
   public static final int l6 = u3y.n5("ctr");
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9("pos", "align", "overlay", "spPr", "txPr", "extLst");

   public m3e(com.aspose.slides.ms.System.Xml.c7 var1) {
      this();
      n5(var1, new m3e$1(this));
      n5(var1, new m3e$2(this, var1));
   }

   public m3e() {
      this.k5 = n5;
      this.u3 = l6;
      this.a6 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("pos", a4e.n5(this.k5));
      if (this.u3 != l6 && this.u3 != 0) {
         var2.l6("align", u3y.n5(this.u3));
      }

      if (this.a6) {
         var2.l6("overlay", this.a6 ? "1" : "0");
      }

      if (this.u9 != null) {
         this.u9.n5("cx", var2, "spPr");
      }

      if (this.h0 != null) {
         this.h0.n5("cx", var2, "txPr");
      }

      if (this.c8 != null) {
         this.c8.n5("cx", var2, "extLst");
      }

      var2.s7();
   }

   public final b9y n5() {
      if (this.u9 != null) {
         throw new Exception("Only one <spPr> element can be added.");
      }

      this.u9 = new b9y();
      return this.u9;
   }

   public final j3z l6() {
      if (this.h0 != null) {
         throw new Exception("Only one <txPr> element can be added.");
      }

      this.h0 = new j3z();
      return this.h0;
   }

   public final void n5(h6m var1) {
      this.c8 = var1;
   }

   public final int k5() {
      return this.k5;
   }

   public final void n5(int var1) {
      this.k5 = var1;
   }

   public final int u3() {
      return this.u3;
   }

   public final void l6(int var1) {
      this.u3 = var1;
   }

   public final boolean a6() {
      return this.a6;
   }

   public final void n5(boolean var1) {
      this.a6 = var1;
   }

   public final b9y u9() {
      return this.u9;
   }

   public final j3z h0() {
      return this.h0;
   }

   public final h6m c8() {
      return this.c8;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 t2() {
      return t2;
   }

   // $VF: synthetic method
   static int n5(m3e var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int l6(m3e var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean n5(m3e var0, boolean var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static b9y n5(m3e var0, b9y var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static j3z n5(m3e var0, j3z var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static h6m n5(m3e var0, h6m var1) {
      return var0.c8 = var1;
   }
}
