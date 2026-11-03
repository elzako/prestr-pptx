package com.aspose.slides.internal.k4y;

public class y7i extends b3 {
   private boolean k5;
   private int u3;
   private String a6;
   private String u9;
   private long h0;
   private int c8;
   private long t2;
   public static final int n5 = a9f.n5("value");
   public static final int l6 = z6c.n5("3Arrows");
   private static final com.aspose.slides.internal.v6g.u9 s7 = new com.aspose.slides.internal.v6g.u9(
      "descending", "sortBy", "ref", "customList", "dxfId", "iconSet", "iconId"
   );

   public y7i(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      y7i$1 var2 = new y7i$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public y7i() {
      this.l6();
   }

   private void l6() {
      this.k5 = false;
      this.u3 = n5;
      this.h0 = 4294967295L;
      this.c8 = l6;
      this.t2 = 4294967295L;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.k5) {
         var2.l6("descending", this.k5 ? "1" : "0");
      }

      if (this.u3 != n5) {
         var2.l6("sortBy", a9f.n5(this.u3));
      }

      var2.l6("ref", this.a6);
      if (this.u9 != null) {
         var2.l6("customList", this.u9);
      }

      if ((this.h0 & 4294967295L) != 4294967295L) {
         var2.l6("dxfId", com.aspose.slides.ms.System.Xml.f4.l6(this.h0));
      }

      if (this.c8 != l6) {
         var2.l6("iconSet", z6c.n5(this.c8));
      }

      if ((this.t2 & 4294967295L) != 4294967295L) {
         var2.l6("iconId", com.aspose.slides.ms.System.Xml.f4.l6(this.t2));
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return s7;
   }

   // $VF: synthetic method
   static boolean n5(y7i var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int n5(y7i var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String n5(y7i var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String l6(y7i var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static long n5(y7i var0, long var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static int l6(y7i var0, int var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static long l6(y7i var0, long var1) {
      return var0.t2 = var1;
   }
}
