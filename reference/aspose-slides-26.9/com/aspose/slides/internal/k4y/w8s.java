package com.aspose.slides.internal.k4y;

import com.aspose.slides.exceptions.Exception;

public class w8s extends b3 {
   private d2x n5;
   private a1v l6;
   private m3e k5;
   private h6m u3;
   private static final com.aspose.slides.internal.v6g.u9 a6 = new com.aspose.slides.internal.v6g.u9("title", "plotArea", "legend", "extLst");

   public w8s(com.aspose.slides.ms.System.Xml.c7 var1) {
      n5(var1, new w8s$1(this, var1));
   }

   public w8s() {
      this.l6 = new a1v();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("cx", var2, "title");
      }

      this.l6.n5("cx", var2, "plotArea");
      if (this.k5 != null) {
         this.k5.n5("cx", var2, "legend");
      }

      if (this.u3 != null) {
         this.u3.n5("cx", var2, "extLst");
      }

      var2.s7();
   }

   public final d2x n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <title> element can be added.");
      }

      this.n5 = new d2x();
      return this.n5;
   }

   public final m3e l6() {
      if (this.k5 != null) {
         throw new Exception("Only one <legend> element can be added.");
      }

      this.k5 = new m3e();
      return this.k5;
   }

   public final d2x k5() {
      return this.n5;
   }

   public final a1v u3() {
      return this.l6;
   }

   public final m3e a6() {
      return this.k5;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u9() {
      return a6;
   }

   // $VF: synthetic method
   static d2x n5(w8s var0, d2x var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static a1v n5(w8s var0, a1v var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static m3e n5(w8s var0, m3e var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static h6m n5(w8s var0, h6m var1) {
      return var0.u3 = var1;
   }
}
