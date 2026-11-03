package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class s7k extends b3 {
   private k5w n5;
   private o9i l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("tcTxStyle", "tcStyle");

   public s7k(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new s7k$1(this, var1));
   }

   public s7k() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("a", var2, "tcTxStyle");
      }

      if (this.l6 != null) {
         this.l6.n5("a", var2, "tcStyle");
      }

      var2.s7();
   }

   public final k5w n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <tcTxStyle> element can be added.");
      }

      this.n5 = new k5w();
      return this.n5;
   }

   public final o9i l6() {
      if (this.l6 != null) {
         throw new Exception("Only one <tcStyle> element can be added.");
      }

      this.l6 = new o9i();
      return this.l6;
   }

   public final k5w k5() {
      return this.n5;
   }

   public final o9i u3() {
      return this.l6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 a6() {
      return k5;
   }

   // $VF: synthetic method
   static k5w n5(s7k var0, k5w var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static o9i n5(s7k var0, o9i var1) {
      return var0.l6 = var1;
   }
}
