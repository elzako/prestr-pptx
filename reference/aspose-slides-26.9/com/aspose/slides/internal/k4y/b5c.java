package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class b5c extends b3 {
   private long l6;
   private String k5;
   private int u3;
   private int a6;
   private int u9;
   private String h0;
   private j1w c8;
   public static final int n5 = v5w.n5("simple");
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9(
      "text:level", "xlink:href", "xlink:type", "xlink:show", "xlink:actuate", "binary-data", "list-level-properties"
   );

   public b5c(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u9();
      b5c$1 var2 = new b5c$1(this);
      n5(var1, var2);
      n5(var1, new b5c$2(this, var1));
   }

   public b5c() {
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
      var2.l6("text:level", com.aspose.slides.ms.System.Xml.f4.l6(this.l6));
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

      if (this.c8 != null) {
         this.c8.n5("style", var2, "list-level-properties");
      }

      var2.s7();
   }

   public final j1w n5() {
      if (this.c8 != null) {
         throw new Exception("Only one <list_level_properties> element can be added.");
      }

      this.c8 = new j1w();
      return this.c8;
   }

   public final long l6() {
      return this.l6;
   }

   public final void n5(long var1) {
      this.l6 = var1;
   }

   public final String k5() {
      return this.k5;
   }

   public final void n5(String var1) {
      this.k5 = var1;
   }

   public final void n5(int var1) {
      this.u3 = var1;
   }

   public final void l6(int var1) {
      this.a6 = var1;
   }

   public final void k5(int var1) {
      this.u9 = var1;
   }

   public final j1w u3() {
      return this.c8;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return t2;
   }

   // $VF: synthetic method
   static long n5(b5c var0, long var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static String n5(b5c var0, String var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static int n5(b5c var0, int var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int l6(b5c var0, int var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static int k5(b5c var0, int var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String l6(b5c var0, String var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static String n5(b5c var0) {
      return var0.h0;
   }

   // $VF: synthetic method
   static j1w n5(b5c var0, j1w var1) {
      return var0.c8 = var1;
   }
}
