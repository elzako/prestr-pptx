package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class q0h extends b3 {
   private i8n n5;
   private i8n l6;
   private i8n k5;
   private y1g u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("titleStyle", "bodyStyle", "otherStyle", "extLst");

   public q0h(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new q0h$1(this, var1));
   }

   public q0h() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("p", var2, "titleStyle");
      }

      if (this.l6 != null) {
         this.l6.n5("p", var2, "bodyStyle");
      }

      if (this.k5 != null) {
         this.k5.n5("p", var2, "otherStyle");
      }

      if (this.u3 != null) {
         this.u3.n5("p", var2, "extLst");
      }

      var2.s7();
   }

   public final i8n n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <titleStyle> element can be added.");
      }

      this.n5 = new i8n();
      return this.n5;
   }

   public final i8n l6() {
      if (this.l6 != null) {
         throw new Exception("Only one <bodyStyle> element can be added.");
      }

      this.l6 = new i8n();
      return this.l6;
   }

   public final i8n k5() {
      if (this.k5 != null) {
         throw new Exception("Only one <otherStyle> element can be added.");
      }

      this.k5 = new i8n();
      return this.k5;
   }

   public final void n5(x8 var1) {
      this.u3 = (y1g)var1;
   }

   public final i8n u3() {
      return this.n5;
   }

   public final i8n a6() {
      return this.l6;
   }

   public final i8n u9() {
      return this.k5;
   }

   public final x8 h0() {
      return this.u3;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 c8() {
      return a6;
   }

   // $VF: synthetic method
   static i8n n5(q0h var0, i8n var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static i8n l6(q0h var0, i8n var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static i8n k5(q0h var0, i8n var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static y1g n5(q0h var0, y1g var1) {
      return var0.u3 = var1;
   }
}
