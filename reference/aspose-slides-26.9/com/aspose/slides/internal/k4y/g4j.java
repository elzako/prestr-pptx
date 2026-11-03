package com.aspose.slides.internal.k4y;

public class g4j extends b3 {
   private int n5;
   private int l6;
   private int k5;
   private int u3;
   private int a6;
   private int u9;
   private int h0;
   private int c8;
   private int t2;
   private static final com.aspose.slides.internal.v6g.u9 s7 = new com.aspose.slides.internal.v6g.u9(
      "table:column",
      "table:row",
      "table:table",
      "table:start-column",
      "table:start-row",
      "table:start-table",
      "table:end-column",
      "table:end-row",
      "table:end-table"
   );

   public g4j(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      g4j$1 var2 = new g4j$1(this);
      n5(var1, var2);
      l6(var1);
   }

   public g4j() {
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
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != 0) {
         var2.l6("table:column", com.aspose.slides.ms.System.Xml.f4.n5(this.n5));
      }

      if (this.l6 != 0) {
         var2.l6("table:row", com.aspose.slides.ms.System.Xml.f4.n5(this.l6));
      }

      if (this.k5 != 0) {
         var2.l6("table:table", com.aspose.slides.ms.System.Xml.f4.n5(this.k5));
      }

      if (this.u3 != 0) {
         var2.l6("table:start-column", com.aspose.slides.ms.System.Xml.f4.n5(this.u3));
      }

      if (this.a6 != 0) {
         var2.l6("table:start-row", com.aspose.slides.ms.System.Xml.f4.n5(this.a6));
      }

      if (this.u9 != 0) {
         var2.l6("table:start-table", com.aspose.slides.ms.System.Xml.f4.n5(this.u9));
      }

      if (this.h0 != 0) {
         var2.l6("table:end-column", com.aspose.slides.ms.System.Xml.f4.n5(this.h0));
      }

      if (this.c8 != 0) {
         var2.l6("table:end-row", com.aspose.slides.ms.System.Xml.f4.n5(this.c8));
      }

      if (this.t2 != 0) {
         var2.l6("table:end-table", com.aspose.slides.ms.System.Xml.f4.n5(this.t2));
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return s7;
   }

   // $VF: synthetic method
   static int n5(g4j var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static int l6(g4j var0, int var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int k5(g4j var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int u3(g4j var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int a6(g4j var0, int var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static int u9(g4j var0, int var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static int h0(g4j var0, int var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static int c8(g4j var0, int var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static int t2(g4j var0, int var1) {
      return var0.t2 = var1;
   }
}
