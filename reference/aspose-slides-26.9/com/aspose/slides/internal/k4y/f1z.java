package com.aspose.slides.internal.k4y;

public class f1z extends b3 {
   private int n5;
   private int l6;
   private int k5;
   private int u3;
   private int a6;
   private int u9;
   private int h0;
   private int c8;
   private int t2;
   private int s7;
   private int x8;
   private int n3;
   private static final com.aspose.slides.internal.v6g.u9 y4 = new com.aspose.slides.internal.v6g.u9(
      "v:ext", "position", "selection", "grouping", "ungrouping", "rotation", "cropping", "verticies", "adjusthandles", "text", "aspectratio", "shapetype"
   );

   public f1z(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      f1z$1 var2 = new f1z$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public f1z() {
      this.l6();
   }

   private void l6() {
      this.n5 = 0;
      this.l6 = 0;
      this.k5 = 0;
      this.u3 = 0;
      this.a6 = 0;
      this.u9 = 0;
      this.h0 = 0;
      this.c8 = 0;
      this.t2 = 0;
      this.s7 = 0;
      this.x8 = 0;
      this.n3 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != 0) {
         var2.l6("v:ext", a3n.n5(this.n5));
      }

      if (this.l6 != 0) {
         var2.l6("position", m4w.n5(this.l6));
      }

      if (this.k5 != 0) {
         var2.l6("selection", m4w.n5(this.k5));
      }

      if (this.u3 != 0) {
         var2.l6("grouping", m4w.n5(this.u3));
      }

      if (this.a6 != 0) {
         var2.l6("ungrouping", m4w.n5(this.a6));
      }

      if (this.u9 != 0) {
         var2.l6("rotation", m4w.n5(this.u9));
      }

      if (this.h0 != 0) {
         var2.l6("cropping", m4w.n5(this.h0));
      }

      if (this.c8 != 0) {
         var2.l6("verticies", m4w.n5(this.c8));
      }

      if (this.t2 != 0) {
         var2.l6("adjusthandles", m4w.n5(this.t2));
      }

      if (this.s7 != 0) {
         var2.l6("text", m4w.n5(this.s7));
      }

      if (this.x8 != 0) {
         var2.l6("aspectratio", m4w.n5(this.x8));
      }

      if (this.n3 != 0) {
         var2.l6("shapetype", m4w.n5(this.n3));
      }

      var2.s7();
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final void l6(int var1) {
      this.l6 = var1;
   }

   public final void k5(int var1) {
      this.k5 = var1;
   }

   public final void u3(int var1) {
      this.u3 = var1;
   }

   public final void a6(int var1) {
      this.x8 = var1;
   }

   public final void u9(int var1) {
      this.n3 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return y4;
   }

   // $VF: synthetic method
   static int n5(f1z var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int l6(f1z var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int k5(f1z var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int u3(f1z var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int a6(f1z var0, int var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static int u9(f1z var0, int var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static int h0(f1z var0, int var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static int c8(f1z var0, int var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static int t2(f1z var0, int var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static int s7(f1z var0, int var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static int x8(f1z var0, int var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static int n3(f1z var0, int var1) {
      return var0.n3 = var1;
   }
}
