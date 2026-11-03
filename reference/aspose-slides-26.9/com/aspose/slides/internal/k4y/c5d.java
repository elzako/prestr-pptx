package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class c5d extends b3 {
   private String u3;
   private String a6;
   private boolean u9;
   private boolean h0;
   private com.aspose.slides.ms.System.s4 c8 = new com.aspose.slides.ms.System.s4();
   private boolean t2;
   private boolean s7;
   private boolean x8;
   private boolean n3;
   private boolean y4;
   private int e2;
   private int t9;
   private boolean z1;
   private boolean t4;
   private List<x5r> q0;
   public static final com.aspose.slides.ms.System.s4 n5 = com.aspose.slides.ms.System.s4.k5.n3();
   public static final int l6 = p1l.n5("enabled");
   public static final int k5 = n8q.n5("enabled");
   private static final com.aspose.slides.internal.v6g.u9 z3 = new com.aspose.slides.internal.v6g.u9(
      "presentation:start-page",
      "presentation:show",
      "presentation:full-screen",
      "presentation:endless",
      "presentation:pause",
      "presentation:show-logo",
      "presentation:force-manual",
      "presentation:mouse-visible",
      "presentation:mouse-as-pen",
      "presentation:start-with-navigator",
      "presentation:animations",
      "presentation:transition-on-click",
      "presentation:stay-on-top",
      "presentation:show-end-of-presentation-slide",
      "show"
   );

   public c5d(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      c5d$1 var2 = new c5d$1(this);
      n5(var1, var2);
      n5(var1, new c5d$2(this, var1));
   }

   public c5d() {
      this.l6();
   }

   private void l6() {
      this.u9 = true;
      this.h0 = false;
      n5.u3(this.c8);
      this.t2 = false;
      this.s7 = false;
      this.x8 = true;
      this.n3 = false;
      this.y4 = false;
      this.e2 = l6;
      this.t9 = k5;
      this.z1 = false;
      this.t4 = true;
      this.q0 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.u3 != null) {
         var2.l6("presentation:start-page", this.u3);
      }

      if (this.a6 != null) {
         var2.l6("presentation:show", this.a6);
      }

      if (!this.u9) {
         var2.l6("presentation:full-screen", this.u9 ? "true" : "false");
      }

      if (this.h0) {
         var2.l6("presentation:endless", this.h0 ? "true" : "false");
      }

      if (com.aspose.slides.ms.System.s4.a6(this.c8, n5)) {
         var2.l6("presentation:pause", n5(this.c8.n3()));
      }

      if (this.t2) {
         var2.l6("presentation:show-logo", this.t2 ? "true" : "false");
      }

      if (this.s7) {
         var2.l6("presentation:force-manual", this.s7 ? "true" : "false");
      }

      if (!this.x8) {
         var2.l6("presentation:mouse-visible", this.x8 ? "true" : "false");
      }

      if (this.n3) {
         var2.l6("presentation:mouse-as-pen", this.n3 ? "true" : "false");
      }

      if (this.y4) {
         var2.l6("presentation:start-with-navigator", this.y4 ? "true" : "false");
      }

      if (this.e2 != l6) {
         var2.l6("presentation:animations", p1l.n5(this.e2));
      }

      if (this.t9 != k5) {
         var2.l6("presentation:transition-on-click", n8q.n5(this.t9));
      }

      if (this.z1) {
         var2.l6("presentation:stay-on-top", this.z1 ? "true" : "false");
      }

      if (!this.t4) {
         var2.l6("presentation:show-end-of-presentation-slide", this.t4 ? "true" : "false");
      }

      List$Enumerator var4 = this.q0.iterator();

      try {
         while (var4.hasNext()) {
            x5r var5 = (x5r)var4.next();
            var5.n5("presentation", var2, "show");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return z3;
   }

   // $VF: synthetic method
   static String n5(c5d var0, String var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static String l6(c5d var0, String var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(c5d var0, boolean var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static boolean l6(c5d var0, boolean var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static com.aspose.slides.ms.System.s4 n5(c5d var0) {
      return var0.c8;
   }

   // $VF: synthetic method
   static boolean k5(c5d var0, boolean var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static boolean u3(c5d var0, boolean var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static boolean a6(c5d var0, boolean var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static boolean u9(c5d var0, boolean var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static boolean h0(c5d var0, boolean var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static int n5(c5d var0, int var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static int l6(c5d var0, int var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static boolean c8(c5d var0, boolean var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static boolean t2(c5d var0, boolean var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static List l6(c5d var0) {
      return var0.q0;
   }
}
