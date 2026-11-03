package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public final class n5 extends b3 {
   private String n5;
   private String l6;
   private String k5;
   private int u3 = -1;
   private List<k7m> a6 = new List<>();
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9("classid", "license", "r:id", "persistence", "ocxPr");

   public n5(com.aspose.slides.ms.System.Xml.c7 var1) {
      this();
      String var2 = var1.y4();

      while (var1.u3()) {
         if (!"xmlns".equals(var1.e2())) {
            switch (u9.n5(com.aspose.slides.ms.System.d1.a6(var1.n5(var1.e2()), var2) ? var1.n3() : var1.x8())) {
               case 0:
                  this.n5 = var1.z1();
                  break;
               case 1:
                  this.l6 = var1.z1();
                  break;
               case 2:
                  this.k5 = var1.z1();
                  break;
               case 3:
                  this.u3 = q2.n5(var1.z1());
                  break;
               default:
                  throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Unknown attribute \"", var1.x8(), "\""}));
            }
         }
      }

      var1.a6();
      n5(var1, new n5$1(this, var1));
   }

   public n5() {
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5("ax", var3, "http://schemas.microsoft.com/office/2006/activeX");
      if (var2.n5("http://schemas.openxmlformats.org/officeDocument/2006/relationships") == null) {
         var2.u3("xmlns", "r", null, "http://schemas.openxmlformats.org/officeDocument/2006/relationships");
      }

      var2.l6("ax:classid", this.n5);
      if (this.l6 != null) {
         var2.l6("license", this.l6);
      }

      if (this.k5 != null) {
         var2.l6("r:id", this.k5);
      }

      if (this.u3 != -1) {
         var2.l6("ax:persistence", q2.n5(this.u3));
      }

      List$Enumerator var4 = this.a6.iterator();

      try {
         while (var4.hasNext()) {
            k7m var5 = (k7m)var4.next();
            var5.n5("ax", var2, "ocxPr");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final k7m n5() {
      k7m var1 = new k7m();
      this.a6.addItem(var1);
      return var1;
   }

   public final String l6() {
      return this.n5;
   }

   public final void n5(String var1) {
      this.n5 = var1;
   }

   public final String k5() {
      return this.l6;
   }

   public final void l6(String var1) {
      this.l6 = var1;
   }

   public final String u3() {
      return this.k5;
   }

   public final void k5(String var1) {
      this.k5 = var1;
   }

   public final int a6() {
      return this.u3;
   }

   public final void n5(int var1) {
      this.u3 = var1;
   }

   public final k7m[] u9() {
      return this.a6.toArray(new k7m[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 h0() {
      return u9;
   }

   // $VF: synthetic method
   static List n5(n5 var0) {
      return var0.a6;
   }
}
