package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class d9r extends k7 implements a5, e9, t1 {
   private a6z n5;
   private c8q l6;
   private List<w3u> k5;
   private a4s u3;
   private n9p a6;
   private List<y4x> u9;
   private a9t h0;
   private static final com.aspose.slides.internal.v6g.u9 c8 = new com.aspose.slides.internal.v6g.u9(
      "grouping", "varyColors", "ser", "dLbls", "dropLines", "axId", "extLst"
   );

   public d9r(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u6();
      n5(var1, new d9r$1(this, var1));
   }

   public d9r() {
      this.u6();
      this.u9.addItem(new y4x());
      this.u9.addItem(new y4x());
   }

   private void u6() {
      this.k5 = new List<>();
      this.u9 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("c", var2, "grouping");
      }

      if (this.l6 != null) {
         this.l6.n5("c", var2, "varyColors");
      }

      List$Enumerator var4 = this.k5.iterator();

      try {
         while (var4.hasNext()) {
            w3u var5 = (w3u)var4.next();
            var5.n5("c", var2, "ser");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (this.u3 != null) {
         this.u3.n5("c", var2, "dLbls");
      }

      if (this.a6 != null) {
         this.a6.n5("c", var2, "dropLines");
      }

      this.aw_().n5("c", var2, "axId");
      this.u9().n5("c", var2, "axId");
      if (this.h0 != null) {
         this.h0.n5("c", var2, "extLst");
      }

      var2.s7();
   }

   public final a6z o0() {
      if (this.n5 != null) {
         throw new Exception("Only one <grouping> element can be added.");
      }

      this.n5 = new a6z();
      return this.n5;
   }

   @Override
   public final c8q y2() {
      if (this.l6 != null) {
         throw new Exception("Only one <varyColors> element can be added.");
      }

      this.l6 = new c8q();
      return this.l6;
   }

   @Override
   public m3 k5() {
      w3u var1 = new w3u();
      this.k5.addItem(var1);
      return var1;
   }

   @Override
   public final a4s c4() {
      if (this.u3 != null) {
         throw new Exception("Only one <dLbls> element can be added.");
      }

      this.u3 = new a4s();
      return this.u3;
   }

   @Override
   public final n9p n5() {
      if (this.a6 != null) {
         throw new Exception("Only one <dropLines> element can be added.");
      }

      this.a6 = new n9p();
      return this.a6;
   }

   @Override
   public void n5(x8 var1) {
      this.h0 = (a9t)var1;
   }

   public final a6z z7() {
      return this.n5;
   }

   @Override
   public c8q y4() {
      return this.l6;
   }

   @Override
   public m3[] l6() {
      return this.k5.toArray(new w3u[0]);
   }

   @Override
   public a4s t2() {
      return this.u3;
   }

   @Override
   public n9p t4() {
      return this.a6;
   }

   @Override
   public y4x aw_() {
      return this.u9.get_Item(0);
   }

   @Override
   public y4x u9() {
      return this.u9.get_Item(1);
   }

   @Override
   public x8 c8() {
      return this.h0;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 v4() {
      return c8;
   }

   // $VF: synthetic method
   static a6z n5(d9r var0, a6z var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static c8q n5(d9r var0, c8q var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static List n5(d9r var0) {
      return var0.k5;
   }

   // $VF: synthetic method
   static a4s n5(d9r var0, a4s var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static n9p n5(d9r var0, n9p var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static List l6(d9r var0) {
      return var0.u9;
   }

   // $VF: synthetic method
   static a9t n5(d9r var0, a9t var1) {
      return var0.h0 = var1;
   }
}
