package com.aspose.slides.internal.k4y;

public class j1a extends b3 {
   private String l6;
   private String k5;
   private int u3;
   private int a6;
   private int u9;
   private String h0;
   public static final int n5 = v5w.n5("simple");
   private static final com.aspose.slides.internal.v6g.u9 c8 = new com.aspose.slides.internal.v6g.u9(
      "draw:class-id", "xlink:href", "xlink:type", "xlink:show", "xlink:actuate", "binary-data"
   );

   public j1a(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u9();
      j1a$1 var2 = new j1a$1(this);
      n5(var1, var2);
      n5(var1, new j1a$2(this, var1));
   }

   public j1a() {
      this.u9();
   }

   private void u9() {
      this.u3 = n5;
      this.a6 = 0;
      this.u9 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6 != null) {
         var2.l6("draw:class-id", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("xlink:href", this.k5);
      }

      if (this.u3 != n5) {
         var2.l6("xlink:type", v5w.n5(this.u3));
      }

      if (this.a6 != 0) {
         var2.l6("xlink:show", h8e.n5(this.a6));
      }

      if (this.u9 != 0) {
         var2.l6("xlink:actuate", r5n.n5(this.u9));
      }

      if (this.h0 != null) {
         this.n5("office", var2, "binary-data", this.h0, false);
      }

      var2.s7();
   }

   public final String n5() {
      return this.l6;
   }

   public final void n5(String var1) {
      this.l6 = var1;
   }

   public final String l6() {
      return this.k5;
   }

   public final void l6(String var1) {
      this.k5 = var1;
   }

   public final void n5(int var1) {
      this.u3 = var1;
   }

   public final void l6(int var1) {
      this.a6 = var1;
   }

   public final int k5() {
      return this.u9;
   }

   public final void k5(int var1) {
      this.u9 = var1;
   }

   public final String u3() {
      return this.h0;
   }

   public final void k5(String var1) {
      this.h0 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return c8;
   }

   // $VF: synthetic method
   static String n5(j1a var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(j1a var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int n5(j1a var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int l6(j1a var0, int var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static int k5(j1a var0, int var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String k5(j1a var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String n5(j1a var0) {
      return var0.h0;
   }
}
