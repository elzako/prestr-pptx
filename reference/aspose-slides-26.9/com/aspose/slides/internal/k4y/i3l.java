package com.aspose.slides.internal.k4y;

public class i3l extends b3 {
   private boolean k5;
   private boolean u3;
   private int a6;
   private int u9;
   private boolean h0;
   private m7p c8;
   private m7p t2;
   private y1g s7;
   public static final int n5 = j3e.n5("restored");
   public static final int l6 = j3e.n5("restored");
   private static final com.aspose.slides.internal.v6g.u9 x8 = new com.aspose.slides.internal.v6g.u9(
      "showOutlineIcons", "snapVertSplitter", "vertBarState", "horzBarState", "preferSingleView", "restoredLeft", "restoredTop", "extLst"
   );

   public i3l(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.t2();
      i3l$1 var2 = new i3l$1(this);
      n5(var1, var2);
      n5(var1, new i3l$2(this, var1));
   }

   public i3l() {
      this.t2();
      this.c8 = new m7p();
      this.t2 = new m7p();
   }

   private void t2() {
      this.k5 = true;
      this.u3 = false;
      this.a6 = n5;
      this.u9 = l6;
      this.h0 = false;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (!this.k5) {
         var2.l6("showOutlineIcons", this.k5 ? "1" : "0");
      }

      if (this.u3) {
         var2.l6("snapVertSplitter", this.u3 ? "1" : "0");
      }

      if (this.a6 != n5) {
         var2.l6("vertBarState", j3e.n5(this.a6));
      }

      if (this.u9 != l6) {
         var2.l6("horzBarState", j3e.n5(this.u9));
      }

      if (this.h0) {
         var2.l6("preferSingleView", this.h0 ? "1" : "0");
      }

      this.c8.n5("p", var2, "restoredLeft");
      this.t2.n5("p", var2, "restoredTop");
      if (this.s7 != null) {
         this.s7.n5("p", var2, "extLst");
      }

      var2.s7();
   }

   public final boolean n5() {
      return this.k5;
   }

   public final void n5(boolean var1) {
      this.k5 = var1;
   }

   public final boolean l6() {
      return this.u3;
   }

   public final void l6(boolean var1) {
      this.u3 = var1;
   }

   public final int k5() {
      return this.a6;
   }

   public final void n5(int var1) {
      this.a6 = var1;
   }

   public final int u3() {
      return this.u9;
   }

   public final void l6(int var1) {
      this.u9 = var1;
   }

   public final boolean a6() {
      return this.h0;
   }

   public final void k5(boolean var1) {
      this.h0 = var1;
   }

   public final m7p u9() {
      return this.c8;
   }

   public final m7p h0() {
      return this.t2;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 c8() {
      return x8;
   }

   // $VF: synthetic method
   static boolean n5(i3l var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static boolean l6(i3l var0, boolean var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int n5(i3l var0, int var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static int l6(i3l var0, int var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static boolean k5(i3l var0, boolean var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static m7p n5(i3l var0, m7p var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static m7p l6(i3l var0, m7p var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static y1g n5(i3l var0, y1g var1) {
      return var0.s7 = var1;
   }
}
