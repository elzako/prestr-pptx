package com.aspose.slides.internal.k4y;

public class r9i extends b3 {
   private String l6;
   private String k5;
   private String u3;
   private String a6;
   private String u9;
   private int h0;
   private int c8;
   private int t2;
   public static final int n5 = v5w.n5("simple");
   private static final com.aspose.slides.internal.v6g.u9 s7 = new com.aspose.slides.internal.v6g.u9(
      "draw:name", "draw:display-name", "svg:width", "svg:height", "xlink:href", "xlink:type", "xlink:show", "xlink:actuate"
   );

   public r9i(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      r9i$1 var2 = new r9i$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public r9i() {
      this.u3();
   }

   private void u3() {
      this.h0 = n5;
      this.c8 = 0;
      this.t2 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("draw:name", this.l6);
      if (this.k5 != null) {
         var2.l6("draw:display-name", this.k5);
      }

      if (this.u3 != null) {
         var2.l6("svg:width", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("svg:height", this.a6);
      }

      var2.l6("xlink:href", this.u9);
      if (this.h0 != n5) {
         var2.l6("xlink:type", v5w.n5(this.h0));
      }

      if (this.c8 != 0) {
         var2.l6("xlink:show", h8e.n5(this.c8));
      }

      if (this.t2 != 0) {
         var2.l6("xlink:actuate", r5n.n5(this.t2));
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
      return this.u9;
   }

   public final void l6(String var1) {
      this.u9 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return s7;
   }

   // $VF: synthetic method
   static String n5(r9i var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String l6(r9i var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(r9i var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String u3(r9i var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String a6(r9i var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static int n5(r9i var0, int var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static int l6(r9i var0, int var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static int k5(r9i var0, int var1) {
      return var0.t2 = var1;
   }
}
