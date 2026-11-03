package com.aspose.slides.internal.k4y;

public class x2k extends b3 {
   private String n5;
   private String l6;
   private int k5;
   private int u3;
   private String a6;
   private int u9;
   private String h0;
   private String c8;
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9(
      "draw:name", "draw:display-name", "draw:style", "draw:dots1", "draw:dots1-length", "draw:dots2", "draw:dots2-length", "draw:distance"
   );

   public x2k(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.c8();
      x2k$1 var2 = new x2k$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public x2k() {
      this.c8();
   }

   private void c8() {
      this.k5 = 0;
      this.u3 = 0;
      this.u9 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("draw:name", this.n5);
      if (this.l6 != null) {
         var2.l6("draw:display-name", this.l6);
      }

      var2.l6("draw:style", u7n.n5(this.k5));
      if (this.u3 != 0) {
         var2.l6("draw:dots1", com.aspose.slides.ms.System.Xml.f4.n5(this.u3));
      }

      if (this.a6 != null) {
         var2.l6("draw:dots1-length", this.a6);
      }

      if (this.u9 != 0) {
         var2.l6("draw:dots2", com.aspose.slides.ms.System.Xml.f4.n5(this.u9));
      }

      if (this.h0 != null) {
         var2.l6("draw:dots2-length", this.h0);
      }

      if (this.c8 != null) {
         var2.l6("draw:distance", this.c8);
      }

      var2.s7();
   }

   public final String n5() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final void n5(int var1) {
      this.k5 = var1;
   }

   public final int l6() {
      return this.u3;
   }

   public final void l6(int var1) {
      this.u3 = var1;
   }

   public final String k5() {
      return this.a6;
   }

   public final void l6(String var1) {
      this.a6 = var1;
   }

   public final int u3() {
      return this.u9;
   }

   public final void k5(int var1) {
      this.u9 = var1;
   }

   public final String a6() {
      return this.h0;
   }

   public final void k5(String var1) {
      this.h0 = var1;
   }

   public final String u9() {
      return this.c8;
   }

   public final void u3(String var1) {
      this.c8 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 h0() {
      return t2;
   }

   // $VF: synthetic method
   static String n5(x2k var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(x2k var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int n5(x2k var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int l6(x2k var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String k5(x2k var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static int k5(x2k var0, int var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String u3(x2k var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String a6(x2k var0, String var1) {
      return var0.c8 = var1;
   }
}
