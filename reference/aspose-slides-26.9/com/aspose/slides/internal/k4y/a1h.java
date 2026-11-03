package com.aspose.slides.internal.k4y;

public class a1h extends b3 {
   private int n5;
   private int l6;
   private int k5;
   private int u3;
   private int a6;
   private int u9;
   private int h0;
   private int c8;
   private String t2;
   private int s7;
   private j2m x8;
   private static final com.aspose.slides.internal.v6g.u9 n3 = new com.aspose.slides.internal.v6g.u9(
      "v:ext",
      "dgmstyle",
      "autoformat",
      "reverse",
      "autolayout",
      "dgmscalex",
      "dgmscaley",
      "dgmfontsize",
      "constrainbounds",
      "dgmbasetextscale",
      "relationtable"
   );

   public a1h(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      a1h$1 var2 = new a1h$1(this);
      n5(var1, var2);
      n5(var1, new a1h$2(this, var1));
   }

   public a1h() {
      this.u3();
   }

   private void u3() {
      this.n5 = 0;
      this.l6 = 0;
      this.k5 = 0;
      this.u3 = 0;
      this.a6 = 0;
      this.u9 = 0;
      this.h0 = 0;
      this.c8 = 0;
      this.s7 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != 0) {
         var2.l6("v:ext", a3n.n5(this.n5));
      }

      if (this.l6 != 0) {
         var2.l6("dgmstyle", com.aspose.slides.ms.System.Xml.f4.n5(this.l6));
      }

      if (this.k5 != 0) {
         var2.l6("autoformat", m4w.n5(this.k5));
      }

      if (this.u3 != 0) {
         var2.l6("reverse", m4w.n5(this.u3));
      }

      if (this.a6 != 0) {
         var2.l6("autolayout", m4w.n5(this.a6));
      }

      if (this.u9 != 0) {
         var2.l6("dgmscalex", com.aspose.slides.ms.System.Xml.f4.n5(this.u9));
      }

      if (this.h0 != 0) {
         var2.l6("dgmscaley", com.aspose.slides.ms.System.Xml.f4.n5(this.h0));
      }

      if (this.c8 != 0) {
         var2.l6("dgmfontsize", com.aspose.slides.ms.System.Xml.f4.n5(this.c8));
      }

      if (this.t2 != null) {
         var2.l6("constrainbounds", this.t2);
      }

      if (this.s7 != 0) {
         var2.l6("dgmbasetextscale", com.aspose.slides.ms.System.Xml.f4.n5(this.s7));
      }

      if (this.x8 != null) {
         this.x8.n5("o", var2, "relationtable");
      }

      var2.s7();
   }

   public final void n5(j2m var1) {
      this.x8 = var1;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final void l6(int var1) {
      this.l6 = var1;
   }

   public final int n5() {
      return this.u3;
   }

   public final void k5(int var1) {
      this.u9 = var1;
   }

   public final void u3(int var1) {
      this.h0 = var1;
   }

   public final void a6(int var1) {
      this.c8 = var1;
   }

   public final void n5(String var1) {
      this.t2 = var1;
   }

   public final j2m l6() {
      return this.x8;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return n3;
   }

   // $VF: synthetic method
   static int n5(a1h var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int l6(a1h var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int k5(a1h var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int u3(a1h var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int a6(a1h var0, int var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static int u9(a1h var0, int var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static int h0(a1h var0, int var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static int c8(a1h var0, int var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String n5(a1h var0, String var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static int t2(a1h var0, int var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static j2m n5(a1h var0, j2m var1) {
      return var0.x8 = var1;
   }
}
