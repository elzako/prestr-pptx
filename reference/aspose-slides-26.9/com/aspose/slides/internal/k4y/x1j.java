package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class x1j extends k7 implements a3, a5, e9, t1 {
   private a6z n5;
   private c8q l6;
   private List<e6q> k5;
   private a4s u3;
   private n9p a6;
   private n9p u9;
   private h0i h0;
   private c8q c8;
   private c8q t2;
   private List<y4x> s7;
   private a9t x8;
   private static final com.aspose.slides.internal.v6g.u9 n3 = new com.aspose.slides.internal.v6g.u9(
      "grouping", "varyColors", "ser", "dLbls", "dropLines", "hiLowLines", "upDownBars", "marker", "smooth", "axId", "extLst"
   );

   public x1j(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.v4();
      n5(var1, new x1j$1(this, var1));
   }

   public x1j() {
      this.v4();
      this.n5 = new a6z();
      this.s7.addItem(new y4x());
      this.s7.addItem(new y4x());
   }

   private void v4() {
      this.k5 = new List<>();
      this.s7 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5.n5("c", var2, "grouping");
      if (this.l6 != null) {
         this.l6.n5("c", var2, "varyColors");
      }

      List$Enumerator var4 = this.k5.iterator();

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

      if (this.u3 != null) {
         this.u3.n5("c", var2, "dLbls");
      }

      if (this.a6 != null) {
         this.a6.n5("c", var2, "dropLines");
      }

      if (this.u9 != null) {
         this.u9.n5("c", var2, "hiLowLines");
      }

      if (this.h0 != null) {
         this.h0.n5("c", var2, "upDownBars");
      }

      if (this.c8 != null) {
         this.c8.n5("c", var2, "marker");
      }

      if (this.t2 != null) {
         this.t2.n5("c", var2, "smooth");
      }

      this.aw_().n5("c", var2, "axId");
      this.u9().n5("c", var2, "axId");
      if (this.x8 != null) {
         this.x8.n5("c", var2, "extLst");
      }

      var2.s7();
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
      e6q var1 = new e6q();
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
   public final n9p u3() {
      if (this.u9 != null) {
         throw new Exception("Only one <hiLowLines> element can be added.");
      }

      this.u9 = new n9p();
      return this.u9;
   }

   @Override
   public final h0i h0() {
      if (this.h0 != null) {
         throw new Exception("Only one <upDownBars> element can be added.");
      }

      this.h0 = new h0i();
      return this.h0;
   }

   @Override
   public void n5(x8 var1) {
      this.x8 = (a9t)var1;
   }

   public final a6z o0() {
      return this.n5;
   }

   @Override
   public c8q y4() {
      return this.l6;
   }

   @Override
   public m3[] l6() {
      return this.k5.toArray(new e6q[0]);
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
   public n9p q0() {
      return this.u9;
   }

   @Override
   public h0i ax_() {
      return this.h0;
   }

   @Override
   public c8q b3() {
      return this.c8;
   }

   @Override
   public c8q a0() {
      return this.t2;
   }

   @Override
   public y4x aw_() {
      return this.s7.get_Item(0);
   }

   @Override
   public y4x u9() {
      return this.s7.get_Item(1);
   }

   @Override
   public x8 c8() {
      return this.x8;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 z7() {
      return n3;
   }

   // $VF: synthetic method
   static a6z n5(x1j var0, a6z var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static c8q n5(x1j var0, c8q var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static List n5(x1j var0) {
      return var0.k5;
   }

   // $VF: synthetic method
   static a4s n5(x1j var0, a4s var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static n9p n5(x1j var0, n9p var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static n9p l6(x1j var0, n9p var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static h0i n5(x1j var0, h0i var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static c8q l6(x1j var0, c8q var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static c8q k5(x1j var0, c8q var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static List l6(x1j var0) {
      return var0.s7;
   }

   // $VF: synthetic method
   static a9t n5(x1j var0, a9t var1) {
      return var0.x8 = var1;
   }
}
