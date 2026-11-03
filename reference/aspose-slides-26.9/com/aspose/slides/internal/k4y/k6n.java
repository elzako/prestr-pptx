package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class k6n extends b3 {
   private boolean n5;
   private boolean l6;
   private boolean k5;
   private boolean u3;
   private g7 a6;
   private g7 u9;
   private z4 h0;
   private y1g c8;
   private static final com.aspose.slides.internal.v6g.u9 t2 = new com.aspose.slides.internal.v6g.u9(
      "loop", "showNarration", "showAnimation", "useTimings", "present", "browse", "kiosk", "sldAll", "sldRg", "custShow", "penClr", "extLst"
   );

   public k6n(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.n3();
      k6n$1 var2 = new k6n$1(this);
      n5(var1, var2);
      n5(var1, new k6n$2(this, var1));
   }

   public k6n() {
      this.n3();
   }

   private void n3() {
      this.n5 = false;
      this.l6 = false;
      this.k5 = true;
      this.u3 = true;
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5) {
         var2.l6("loop", this.n5 ? "1" : "0");
      }

      if (this.l6) {
         var2.l6("showNarration", this.l6 ? "1" : "0");
      }

      if (!this.k5) {
         var2.l6("showAnimation", this.k5 ? "1" : "0");
      }

      if (!this.u3) {
         var2.l6("useTimings", this.u3 ? "1" : "0");
      }

      if (this.a6 != null) {
         switch (t2.n5(this.a6.n5())) {
            case 4:
               ((e0j)this.a6.k5()).n5("p", var2, this.a6.n5());
               break;
            case 5:
               ((t1u)this.a6.k5()).n5("p", var2, this.a6.n5());
               break;
            case 6:
               ((v4n)this.a6.k5()).n5("p", var2, this.a6.n5());
         }
      }

      if (this.u9 != null) {
         switch (t2.n5(this.u9.n5())) {
            case 7:
               ((e0j)this.u9.k5()).n5("p", var2, this.u9.n5());
               break;
            case 8:
               ((v6b)this.u9.k5()).n5("p", var2, this.u9.n5());
               break;
            case 9:
               ((v4z)this.u9.k5()).n5("p", var2, this.u9.n5());
         }
      }

      if (this.h0 != null) {
         this.h0.n5("p", var2, "penClr");
      }

      if (this.c8 != null) {
         this.c8.n5("p", var2, "extLst");
      }

      var2.s7();
   }

   public final z4 n5() {
      if (this.h0 != null) {
         throw new Exception("Only one <penClr> element can be added.");
      }

      this.h0 = new z4();
      return this.h0;
   }

   public final void n5(z4 var1) {
      this.h0 = var1;
   }

   public final x8 l6() {
      if (this.c8 != null) {
         throw new Exception("Only one <extLst> element can be added.");
      }

      this.c8 = new y1g();
      return this.c8;
   }

   public final boolean k5() {
      return this.n5;
   }

   public final void n5(boolean var1) {
      this.n5 = var1;
   }

   public final boolean u3() {
      return this.l6;
   }

   public final void l6(boolean var1) {
      this.l6 = var1;
   }

   public final boolean a6() {
      return this.k5;
   }

   public final void k5(boolean var1) {
      this.k5 = var1;
   }

   public final boolean u9() {
      return this.u3;
   }

   public final void u3(boolean var1) {
      this.u3 = var1;
   }

   public final g7 h0() {
      return this.a6;
   }

   public final void n5(g7 var1) {
      this.a6 = var1;
   }

   public final g7 c8() {
      return this.u9;
   }

   public final void l6(g7 var1) {
      this.u9 = var1;
   }

   public final z4 t2() {
      return this.h0;
   }

   public final x8 s7() {
      return this.c8;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 x8() {
      return t2;
   }

   // $VF: synthetic method
   static boolean n5(k6n var0, boolean var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static boolean l6(k6n var0, boolean var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static boolean k5(k6n var0, boolean var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static boolean u3(k6n var0, boolean var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static g7 n5(k6n var0, g7 var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static g7 l6(k6n var0, g7 var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static z4 n5(k6n var0, z4 var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static y1g n5(k6n var0, y1g var1) {
      return var0.c8 = var1;
   }
}
