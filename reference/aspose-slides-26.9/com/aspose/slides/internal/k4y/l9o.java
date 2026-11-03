package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class l9o extends k7 implements a3, a5, t1 {
   private List<e6q> n5;
   private a4s l6;
   private n9p k5;
   private n9p u3;
   private h0i a6;
   private List<y4x> u9;
   private a9t h0;
   private static final com.aspose.slides.internal.v6g.u9 c8 = new com.aspose.slides.internal.v6g.u9(
      "ser", "dLbls", "dropLines", "hiLowLines", "upDownBars", "axId", "extLst"
   );

   public l9o(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.z7();
      n5(var1, new l9o$1(this, var1));
   }

   public l9o() {
      this.z7();
      this.u9.addItem(new y4x());
      this.u9.addItem(new y4x());
   }

   private void z7() {
      this.n5 = new List<>();
      this.u9 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      List$Enumerator var4 = this.n5.iterator();

      try {
         while (var4.hasNext()) {
            e6q var5 = (e6q)var4.next();
            var5.n5("c", var2, "ser");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (this.l6 != null) {
         this.l6.n5("c", var2, "dLbls");
      }

      if (this.k5 != null) {
         this.k5.n5("c", var2, "dropLines");
      }

      if (this.u3 != null) {
         this.u3.n5("c", var2, "hiLowLines");
      }

      if (this.a6 != null) {
         this.a6.n5("c", var2, "upDownBars");
      }

      this.aw_().n5("c", var2, "axId");
      this.u9().n5("c", var2, "axId");
      if (this.h0 != null) {
         this.h0.n5("c", var2, "extLst");
      }

      var2.s7();
   }

   @Override
   public m3 k5() {
      e6q var1 = new e6q();
      this.n5.addItem(var1);
      return var1;
   }

   @Override
   public final a4s c4() {
      if (this.l6 != null) {
         throw new Exception("Only one <dLbls> element can be added.");
      }

      this.l6 = new a4s();
      return this.l6;
   }

   @Override
   public final n9p n5() {
      if (this.k5 != null) {
         throw new Exception("Only one <dropLines> element can be added.");
      }

      this.k5 = new n9p();
      return this.k5;
   }

   @Override
   public final n9p u3() {
      if (this.u3 != null) {
         throw new Exception("Only one <hiLowLines> element can be added.");
      }

      this.u3 = new n9p();
      return this.u3;
   }

   @Override
   public final h0i h0() {
      if (this.a6 != null) {
         throw new Exception("Only one <upDownBars> element can be added.");
      }

      this.a6 = new h0i();
      return this.a6;
   }

   @Override
   public void n5(x8 var1) {
      this.h0 = (a9t)var1;
   }

   @Override
   public m3[] l6() {
      return this.n5.toArray(new e6q[0]);
   }

   @Override
   public a4s t2() {
      return this.l6;
   }

   @Override
   public n9p t4() {
      return this.k5;
   }

   @Override
   public n9p q0() {
      return this.u3;
   }

   @Override
   public h0i ax_() {
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
   static com.aspose.slides.internal.v6g.u9 o0() {
      return c8;
   }

   // $VF: synthetic method
   static List n5(l9o var0) {
      return var0.n5;
   }

   // $VF: synthetic method
   static a4s n5(l9o var0, a4s var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static n9p n5(l9o var0, n9p var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static n9p l6(l9o var0, n9p var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static h0i n5(l9o var0, h0i var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static List l6(l9o var0) {
      return var0.u9;
   }

   // $VF: synthetic method
   static a9t n5(l9o var0, a9t var1) {
      return var0.h0 = var1;
   }
}
