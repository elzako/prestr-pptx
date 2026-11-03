package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class o9q extends b3 {
   private long n5;
   private long l6;
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
   private boolean y4;
   private boolean e2;
   private boolean t9;
   private boolean z1;
   private boolean t4;
   private List<p4d> q0;
   private l0k z3;
   private static final com.aspose.slides.internal.v6g.u9 m1 = new com.aspose.slides.internal.v6g.u9(
      "field",
      "count",
      "selected",
      "byPosition",
      "relative",
      "defaultSubtotal",
      "sumSubtotal",
      "countASubtotal",
      "avgSubtotal",
      "maxSubtotal",
      "minSubtotal",
      "productSubtotal",
      "countSubtotal",
      "stdDevSubtotal",
      "stdDevPSubtotal",
      "varSubtotal",
      "varPSubtotal",
      "x",
      "extLst"
   );

   public o9q(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      o9q$1 var2 = new o9q$1(this);
      n5(var1, var2);
      n5(var1, new o9q$2(this, var1));
   }

   public o9q() {
      this.l6();
   }

   private void l6() {
      this.n5 = 4294967295L;
      this.l6 = 4294967295L;
      this.k5 = true;
      this.u3 = false;
      this.a6 = false;
      this.u9 = false;
      this.h0 = false;
      this.c8 = false;
      this.t2 = false;
      this.s7 = false;
      this.x8 = false;
      this.n3 = false;
      this.y4 = false;
      this.e2 = false;
      this.t9 = false;
      this.z1 = false;
      this.t4 = false;
      this.q0 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if ((this.n5 & 4294967295L) != 4294967295L) {
         var2.l6("field", com.aspose.slides.ms.System.Xml.f4.l6(this.n5));
      }

      if ((this.l6 & 4294967295L) != 4294967295L) {
         var2.l6("count", com.aspose.slides.ms.System.Xml.f4.l6(this.l6));
      }

      if (!this.k5) {
         var2.l6("selected", this.k5 ? "1" : "0");
      }

      if (this.u3) {
         var2.l6("byPosition", this.u3 ? "1" : "0");
      }

      if (this.a6) {
         var2.l6("relative", this.a6 ? "1" : "0");
      }

      if (this.u9) {
         var2.l6("defaultSubtotal", this.u9 ? "1" : "0");
      }

      if (this.h0) {
         var2.l6("sumSubtotal", this.h0 ? "1" : "0");
      }

      if (this.c8) {
         var2.l6("countASubtotal", this.c8 ? "1" : "0");
      }

      if (this.t2) {
         var2.l6("avgSubtotal", this.t2 ? "1" : "0");
      }

      if (this.s7) {
         var2.l6("maxSubtotal", this.s7 ? "1" : "0");
      }

      if (this.x8) {
         var2.l6("minSubtotal", this.x8 ? "1" : "0");
      }

      if (this.n3) {
         var2.l6("productSubtotal", this.n3 ? "1" : "0");
      }

      if (this.y4) {
         var2.l6("countSubtotal", this.y4 ? "1" : "0");
      }

      if (this.e2) {
         var2.l6("stdDevSubtotal", this.e2 ? "1" : "0");
      }

      if (this.t9) {
         var2.l6("stdDevPSubtotal", this.t9 ? "1" : "0");
      }

      if (this.z1) {
         var2.l6("varSubtotal", this.z1 ? "1" : "0");
      }

      if (this.t4) {
         var2.l6("varPSubtotal", this.t4 ? "1" : "0");
      }

      List$Enumerator var4 = this.q0.iterator();

      try {
         while (var4.hasNext()) {
            p4d var5 = (p4d)var4.next();
            var5.n5("ssml", var2, "x");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (this.z3 != null) {
         this.z3.n5("ssml", var2, "extLst");
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return m1;
   }

   // $VF: synthetic method
   static long n5(o9q var0, long var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static long l6(o9q var0, long var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean n5(o9q var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static boolean l6(o9q var0, boolean var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static boolean k5(o9q var0, boolean var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static boolean u3(o9q var0, boolean var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static boolean a6(o9q var0, boolean var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static boolean u9(o9q var0, boolean var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static boolean h0(o9q var0, boolean var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static boolean c8(o9q var0, boolean var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static boolean t2(o9q var0, boolean var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static boolean s7(o9q var0, boolean var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static boolean x8(o9q var0, boolean var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static boolean n3(o9q var0, boolean var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static boolean y4(o9q var0, boolean var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static boolean e2(o9q var0, boolean var1) {
      return var0.z1 = var1;
   }

   // $VF: synthetic method
   static boolean t9(o9q var0, boolean var1) {
      return var0.t4 = var1;
   }

   // $VF: synthetic method
   static List n5(o9q var0) {
      return var0.q0;
   }

   // $VF: synthetic method
   static l0k n5(o9q var0, l0k var1) {
      return var0.z3 = var1;
   }
}
