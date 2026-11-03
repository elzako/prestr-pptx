package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class e1t extends b3 {
   private q5v n5;
   private u4o l6;
   private u4o k5;
   private u4o u3;
   private u4o a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9("font", "regular", "bold", "italic", "boldItalic");

   public e1t(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new e1t$1(this, var1));
   }

   public e1t() {
      this.n5 = new q5v();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5.n5("p", var2, "font");
      if (this.l6 != null) {
         this.l6.n5("p", var2, "regular");
      }

      if (this.k5 != null) {
         this.k5.n5("p", var2, "bold");
      }

      if (this.u3 != null) {
         this.u3.n5("p", var2, "italic");
      }

      if (this.a6 != null) {
         this.a6.n5("p", var2, "boldItalic");
      }

      var2.s7();
   }

   public final u4o n5() {
      if (this.l6 != null) {
         throw new Exception("Only one <regular> element can be added.");
      }

      this.l6 = new u4o();
      return this.l6;
   }

   public final u4o l6() {
      if (this.k5 != null) {
         throw new Exception("Only one <bold> element can be added.");
      }

      this.k5 = new u4o();
      return this.k5;
   }

   public final u4o k5() {
      if (this.u3 != null) {
         throw new Exception("Only one <italic> element can be added.");
      }

      this.u3 = new u4o();
      return this.u3;
   }

   public final u4o u3() {
      if (this.a6 != null) {
         throw new Exception("Only one <boldItalic> element can be added.");
      }

      this.a6 = new u4o();
      return this.a6;
   }

   public final q5v a6() {
      return this.n5;
   }

   public final u4o u9() {
      return this.l6;
   }

   public final u4o h0() {
      return this.k5;
   }

   public final u4o c8() {
      return this.u3;
   }

   public final u4o t2() {
      return this.a6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 s7() {
      return u9;
   }

   // $VF: synthetic method
   static q5v n5(e1t var0, q5v var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static u4o n5(e1t var0, u4o var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static u4o l6(e1t var0, u4o var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static u4o k5(e1t var0, u4o var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static u4o u3(e1t var0, u4o var1) {
      return var0.a6 = var1;
   }
}
