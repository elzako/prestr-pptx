package com.aspose.slides.internal.k4y;

public class t3k extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private String u3;
   private int a6;
   private int u9;
   private int h0;
   private int c8;
   private int t2;
   private int s7;
   private int x8;
   private int n3;
   private String y4;
   private String e2;
   private int t9;
   private static final com.aspose.slides.internal.v6g.u9 z1 = new com.aspose.slides.internal.v6g.u9(
      "id",
      "v",
      "limo",
      "textboxrect",
      "fillok",
      "strokeok",
      "shadowok",
      "arrowok",
      "gradientshapeok",
      "textpathok",
      "insetpenok",
      "o:connecttype",
      "o:connectlocs",
      "o:connectangles",
      "o:extrusionok"
   );

   public t3k(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.k5();
      t3k$1 var2 = new t3k$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public t3k() {
      this.k5();
   }

   private void k5() {
      this.a6 = 0;
      this.u9 = 0;
      this.h0 = 0;
      this.c8 = 0;
      this.t2 = 0;
      this.s7 = 0;
      this.x8 = 0;
      this.n3 = 0;
      this.t9 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         var2.l6("id", this.n5);
      }

      if (this.l6 != null) {
         var2.l6("v", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("limo", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("textboxrect", this.u3);
      }

      if (this.a6 != 0) {
         var2.l6("fillok", r5b.n5(this.a6));
      }

      if (this.u9 != 0) {
         var2.l6("strokeok", r5b.n5(this.u9));
      }

      if (this.h0 != 0) {
         var2.l6("shadowok", r5b.n5(this.h0));
      }

      if (this.c8 != 0) {
         var2.l6("arrowok", r5b.n5(this.c8));
      }

      if (this.t2 != 0) {
         var2.l6("gradientshapeok", r5b.n5(this.t2));
      }

      if (this.s7 != 0) {
         var2.l6("textpathok", r5b.n5(this.s7));
      }

      if (this.x8 != 0) {
         var2.l6("insetpenok", r5b.n5(this.x8));
      }

      if (this.n3 != 0) {
         var2.l6("o:connecttype", t5e.n5(this.n3));
      }

      if (this.y4 != null) {
         var2.l6("o:connectlocs", this.y4);
      }

      if (this.e2 != null) {
         var2.l6("o:connectangles", this.e2);
      }

      if (this.t9 != 0) {
         var2.l6("o:extrusionok", m4w.n5(this.t9));
      }

      var2.s7();
   }

   public final String n5() {
      return this.k5;
   }

   public final void n5(String var1) {
      this.u3 = var1;
   }

   public final void n5(int var1) {
      this.a6 = var1;
   }

   public final void l6(int var1) {
      this.c8 = var1;
   }

   public final void k5(int var1) {
      this.t2 = var1;
   }

   public final void u3(int var1) {
      this.n3 = var1;
   }

   public final void l6(String var1) {
      this.y4 = var1;
   }

   public final void a6(int var1) {
      this.t9 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 l6() {
      return z1;
   }

   // $VF: synthetic method
   static String n5(t3k var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(t3k var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String k5(t3k var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String u3(t3k var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int n5(t3k var0, int var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static int l6(t3k var0, int var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static int k5(t3k var0, int var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static int u3(t3k var0, int var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static int a6(t3k var0, int var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static int u9(t3k var0, int var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static int h0(t3k var0, int var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static int c8(t3k var0, int var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static String a6(t3k var0, String var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static String u9(t3k var0, String var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static int t2(t3k var0, int var1) {
      return var0.t9 = var1;
   }
}
