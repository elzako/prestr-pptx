package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class k4r extends b3 {
   private long n5;
   private boolean l6;
   private byte k5;
   private byte u3;
   private int a6;
   private byte u9;
   private s4r h0;
   private List<a4h> c8;
   private List<p8x> t2;
   private static final com.aspose.slides.internal.v6g.u9 s7 = new com.aspose.slides.internal.v6g.u9(
      "text:outline-level",
      "text:use-outline-level",
      "text:use-index-marks",
      "text:use-index-source-styles",
      "text:index-scope",
      "text:relative-tab-stop-position",
      "index-title-template",
      "table-of-content-entry-template",
      "index-source-styles"
   );

   public k4r(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      k4r$1 var2 = new k4r$1(this);
      n5(var1, var2);
      n5(var1, new k4r$2(this, var1));
   }

   public k4r() {
      this.l6();
   }

   private void l6() {
      this.n5 = 4294967295L;
      this.l6 = true;
      this.k5 = -1;
      this.u3 = -1;
      this.a6 = 0;
      this.u9 = -1;
      this.c8 = new List<>();
      this.t2 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if ((this.n5 & 4294967295L) != 4294967295L) {
         var2.l6("text:outline-level", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      }

      if (!this.l6) {
         var2.l6("text:use-outline-level", this.l6 ? "true" : "false");
      }

      if (this.k5 != -1) {
         var2.l6("text:use-index-marks", this.k5 == 1 ? "true" : "false");
      }

      if (this.u3 != -1) {
         var2.l6("text:use-index-source-styles", this.u3 == 1 ? "true" : "false");
      }

      if (this.a6 != 0) {
         var2.l6("text:index-scope", v0a.n5(this.a6));
      }

      if (this.u9 != -1) {
         var2.l6("text:relative-tab-stop-position", this.u9 == 1 ? "true" : "false");
      }

      if (this.h0 != null) {
         this.h0.n5("text", var2, "index-title-template");
      }

      List$Enumerator var4 = this.c8.iterator();

      try {
         while (var4.hasNext()) {
            a4h var5 = (a4h)var4.next();
            var5.n5("text", var2, "table-of-content-entry-template");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      List$Enumerator var14 = this.t2.iterator();

      try {
         while (var14.hasNext()) {
            p8x var6 = (p8x)var14.next();
            var6.n5("text", var2, "index-source-styles");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
            var14.dispose();
         }
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return s7;
   }

   // $VF: synthetic method
   static long n5(k4r var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean n5(k4r var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static byte n5(k4r var0, byte var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static byte l6(k4r var0, byte var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static int n5(k4r var0, int var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static byte k5(k4r var0, byte var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static s4r n5(k4r var0, s4r var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static List n5(k4r var0) {
      return var0.c8;
   }

   // $VF: synthetic method
   static List l6(k4r var0) {
      return var0.t2;
   }
}
