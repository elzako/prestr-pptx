package com.aspose.slides.internal.k4y;

public class k5d extends b3 {
   private String n5;
   private String l6;
   private int k5;
   private String u3;
   private String a6;
   private String u9;
   private String h0;
   private String c8;
   private String t2;
   private static final com.aspose.slides.internal.v6g.u9 s7 = new com.aspose.slides.internal.v6g.u9(
      "draw:name", "draw:display-name", "draw:style", "draw:cx", "draw:cy", "draw:angle", "draw:border", "draw:start", "draw:end"
   );

   public k5d(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      k5d$1 var2 = new k5d$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public k5d() {
      this.a6();
   }

   private void a6() {
      this.k5 = 0;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("draw:name", this.n5);
      if (this.l6 != null) {
         var2.l6("draw:display-name", this.l6);
      }

      var2.l6("draw:style", t8e.n5(this.k5));
      if (this.u3 != null) {
         var2.l6("draw:cx", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("draw:cy", this.a6);
      }

      if (this.u9 != null) {
         var2.l6("draw:angle", this.u9);
      }

      if (this.h0 != null) {
         var2.l6("draw:border", this.h0);
      }

      if (this.c8 != null) {
         var2.l6("draw:start", this.c8);
      }

      if (this.t2 != null) {
         var2.l6("draw:end", this.t2);
      }

      var2.s7();
   }

   public final String n5() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final void l6(String var1) {
      this.l6 = var1;
   }

   public final void n5(int var1) {
      this.k5 = var1;
   }

   public final String l6() {
      return this.c8;
   }

   public final void k5(String var1) {
      this.c8 = var1;
   }

   public final String k5() {
      return this.t2;
   }

   public final void u3(String var1) {
      this.t2 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return s7;
   }

   // $VF: synthetic method
   static String n5(k5d var0, String var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static String l6(k5d var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int n5(k5d var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static String k5(k5d var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String u3(k5d var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String a6(k5d var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String u9(k5d var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String h0(k5d var0, String var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static String c8(k5d var0, String var1) {
      return var0.t2 = var1;
   }
}
