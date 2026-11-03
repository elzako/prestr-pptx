package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class b1m extends b3 {
   private w9c n5;
   private k3w l6;
   private x8w k5;
   private x8w u3;
   private a9t a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9("logBase", "orientation", "max", "min", "extLst");

   public b1m(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new b1m$1(this, var1));
   }

   public b1m() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("c", var2, "logBase");
      }

      if (this.l6 != null) {
         this.l6.n5("c", var2, "orientation");
      }

      if (this.k5 != null) {
         this.k5.n5("c", var2, "max");
      }

      if (this.u3 != null) {
         this.u3.n5("c", var2, "min");
      }

      if (this.a6 != null) {
         this.a6.n5("c", var2, "extLst");
      }

      var2.s7();
   }

   public final w9c n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <logBase> element can be added.");
      }

      this.n5 = new w9c();
      return this.n5;
   }

   public final k3w l6() {
      if (this.l6 != null) {
         throw new Exception("Only one <orientation> element can be added.");
      }

      this.l6 = new k3w();
      return this.l6;
   }

   public final x8w k5() {
      if (this.k5 != null) {
         throw new Exception("Only one <max> element can be added.");
      }

      this.k5 = new x8w();
      return this.k5;
   }

   public final x8w u3() {
      if (this.u3 != null) {
         throw new Exception("Only one <min> element can be added.");
      }

      this.u3 = new x8w();
      return this.u3;
   }

   public final void n5(x8 var1) {
      this.a6 = (a9t)var1;
   }

   public final w9c a6() {
      return this.n5;
   }

   public final k3w u9() {
      return this.l6;
   }

   public final x8w h0() {
      return this.k5;
   }

   public final x8w c8() {
      return this.u3;
   }

   public final x8 t2() {
      return this.a6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 s7() {
      return u9;
   }

   // $VF: synthetic method
   static w9c n5(b1m var0, w9c var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static k3w n5(b1m var0, k3w var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static x8w n5(b1m var0, x8w var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static x8w l6(b1m var0, x8w var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static a9t n5(b1m var0, a9t var1) {
      return var0.a6 = var1;
   }
}
