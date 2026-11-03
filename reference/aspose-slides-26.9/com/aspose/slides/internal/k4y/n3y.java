package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class n3y extends b3 {
   private boolean l6;
   private boolean k5;
   private boolean u3;
   private boolean a6;
   private boolean u9;
   private boolean h0;
   private boolean c8;
   private boolean t2;
   private boolean s7;
   private boolean x8;
   private boolean n3;
   private int y4;
   private String e2;
   private long t9;
   private long z1;
   private long t4;
   private long q0;
   private long z3;
   private long m1;
   private c5r k7;
   private List<t4w> m3;
   private List<q1f> z8;
   private l0k j5;
   public static final int n5 = o9z.n5("normal");
   private static final com.aspose.slides.internal.v6g.u9 w1 = new com.aspose.slides.internal.v6g.u9(
      "windowProtection",
      "showFormulas",
      "showGridLines",
      "showRowColHeaders",
      "showZeros",
      "rightToLeft",
      "tabSelected",
      "showRuler",
      "showOutlineSymbols",
      "defaultGridColor",
      "showWhiteSpace",
      "view",
      "topLeftCell",
      "colorId",
      "zoomScale",
      "zoomScaleNormal",
      "zoomScaleSheetLayoutView",
      "zoomScalePageLayoutView",
      "workbookViewId",
      "pane",
      "selection",
      "pivotSelection",
      "extLst"
   );

   public n3y(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      n3y$1 var2 = new n3y$1(this);
      n5(var1, var2);
      n5(var1, new n3y$2(this, var1));
   }

   public n3y() {
      this.l6();
   }

   private void l6() {
      this.l6 = false;
      this.k5 = false;
      this.u3 = true;
      this.a6 = true;
      this.u9 = true;
      this.h0 = false;
      this.c8 = false;
      this.t2 = true;
      this.s7 = true;
      this.x8 = true;
      this.n3 = true;
      this.y4 = n5;
      this.t9 = 64L;
      this.z1 = 100L;
      this.t4 = 0L;
      this.q0 = 0L;
      this.z3 = 0L;
      this.m3 = new List<>();
      this.z8 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.l6) {
         var2.l6("windowProtection", this.l6 ? "1" : "0");
      }

      if (this.k5) {
         var2.l6("showFormulas", this.k5 ? "1" : "0");
      }

      if (!this.u3) {
         var2.l6("showGridLines", this.u3 ? "1" : "0");
      }

      if (!this.a6) {
         var2.l6("showRowColHeaders", this.a6 ? "1" : "0");
      }

      if (!this.u9) {
         var2.l6("showZeros", this.u9 ? "1" : "0");
      }

      if (this.h0) {
         var2.l6("rightToLeft", this.h0 ? "1" : "0");
      }

      if (this.c8) {
         var2.l6("tabSelected", this.c8 ? "1" : "0");
      }

      if (!this.t2) {
         var2.l6("showRuler", this.t2 ? "1" : "0");
      }

      if (!this.s7) {
         var2.l6("showOutlineSymbols", this.s7 ? "1" : "0");
      }

      if (!this.x8) {
         var2.l6("defaultGridColor", this.x8 ? "1" : "0");
      }

      if (!this.n3) {
         var2.l6("showWhiteSpace", this.n3 ? "1" : "0");
      }

      if (this.y4 != n5) {
         var2.l6("view", o9z.n5(this.y4));
      }

      if (this.e2 != null) {
         var2.l6("topLeftCell", this.e2);
      }

      if ((this.t9 & 4294967295L) != 64L) {
         var2.l6("colorId", com.aspose.slides.ms.System.Xml.f4.l6(this.t9));
      }

      if ((this.z1 & 4294967295L) != 100L) {
         var2.l6("zoomScale", com.aspose.slides.ms.System.Xml.f4.l6(this.z1));
      }

      if ((this.t4 & 4294967295L) != 0L) {
         var2.l6("zoomScaleNormal", com.aspose.slides.ms.System.Xml.f4.l6(this.t4));
      }

      if ((this.q0 & 4294967295L) != 0L) {
         var2.l6("zoomScaleSheetLayoutView", com.aspose.slides.ms.System.Xml.f4.l6(this.q0));
      }

      if ((this.z3 & 4294967295L) != 0L) {
         var2.l6("zoomScalePageLayoutView", com.aspose.slides.ms.System.Xml.f4.l6(this.z3));
      }

      var2.l6("workbookViewId", com.aspose.slides.ms.System.Xml.f4.l6(this.m1));
      if (this.k7 != null) {
         this.k7.n5("ssml", var2, "pane");
      }

      List$Enumerator var4 = this.m3.iterator();

      try {
         while (var4.hasNext()) {
            t4w var5 = (t4w)var4.next();
            var5.n5("ssml", var2, "selection");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      List$Enumerator var14 = this.z8.iterator();

      try {
         while (var14.hasNext()) {
            q1f var6 = (q1f)var14.next();
            var6.n5("ssml", var2, "pivotSelection");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
            var14.dispose();
         }
      }

      if (this.j5 != null) {
         this.j5.n5("ssml", var2, "extLst");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return w1;
   }

   // $VF: synthetic method
   static boolean n5(n3y var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean l6(n3y var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static boolean k5(n3y var0, boolean var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean u3(n3y var0, boolean var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean a6(n3y var0, boolean var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static boolean u9(n3y var0, boolean var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static boolean h0(n3y var0, boolean var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static boolean c8(n3y var0, boolean var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static boolean t2(n3y var0, boolean var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static boolean s7(n3y var0, boolean var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static boolean x8(n3y var0, boolean var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static int n5(n3y var0, int var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static String n5(n3y var0, String var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static long n5(n3y var0, long var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static long l6(n3y var0, long var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static long k5(n3y var0, long var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static long u3(n3y var0, long var1) {
      return var0.q0 = var1;
   }

   // $VF: synthetic method
   static long a6(n3y var0, long var1) {
      return var0.z3 = var1;
   }

   // $VF: synthetic method
   static long u9(n3y var0, long var1) {
      return var0.m1 = var1;
   }

   // $VF: synthetic method
   static c5r n5(n3y var0, c5r var1) {
      return var0.k7 = var1;
   }

   // $VF: synthetic method
   static List n5(n3y var0) {
      return var0.m3;
   }

   // $VF: synthetic method
   static List l6(n3y var0) {
      return var0.z8;
   }

   // $VF: synthetic method
   static l0k n5(n3y var0, l0k var1) {
      return var0.j5 = var1;
   }
}
