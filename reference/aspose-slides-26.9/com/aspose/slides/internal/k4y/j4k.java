package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class j4k extends b3 {
   private String l6;
   private int k5;
   private c1h u3;
   private i5s a6;
   private c4h u9;
   public static final int n5 = q5s.n5("all");
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "style:name", "style:page-usage", "page-layout-properties", "header-style", "footer-style"
   );

   public j4k(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.a6();
      j4k$1 var2 = new j4k$1(this);
      n5(var1, var2);
      n5(var1, new j4k$2(this, var1));
   }

   public j4k() {
      this.a6();
   }

   private void a6() {
      this.k5 = n5;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      var2.l6("style:name", this.l6);
      if (this.k5 != n5) {
         var2.l6("style:page-usage", q5s.n5(this.k5));
      }

      if (this.u3 != null) {
         this.u3.n5("style", var2, "page-layout-properties");
      }

      if (this.a6 != null) {
         this.a6.n5("style", var2, "header-style");
      }

      if (this.u9 != null) {
         this.u9.n5("style", var2, "footer-style");
      }

      var2.s7();
   }

   public final c1h n5() {
      if (this.u3 != null) {
         throw new Exception("Only one <page_layout_properties> element can be added.");
      }

      this.u3 = new c1h();
      return this.u3;
   }

   public final String l6() {
      return this.l6;
   }

   public final void n5(String var1) {
      this.l6 = var1;
   }

   public final c1h k5() {
      return this.u3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u3() {
      return h0;
   }

   // $VF: synthetic method
   static String n5(j4k var0, String var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static int n5(j4k var0, int var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static c1h n5(j4k var0, c1h var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static i5s n5(j4k var0, i5s var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static c4h n5(j4k var0, c4h var1) {
      return var0.u9 = var1;
   }
}
