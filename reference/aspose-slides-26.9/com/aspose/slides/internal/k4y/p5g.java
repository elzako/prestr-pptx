package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class p5g extends k7 implements e9, t1 {
   private o6x n5;
   private c8q l6;
   private List<u1n> k5;
   private a4s u3;
   private List<y4x> a6;
   private a9t u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "radarStyle", "varyColors", "ser", "dLbls", "axId", "extLst"
   );

   public p5g(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.z7();
      n5(var1, new p5g$1(this, var1));
   }

   public p5g() {
      this.z7();
      this.n5 = new o6x();
      this.a6.addItem(new y4x());
      this.a6.addItem(new y4x());
   }

   private void z7() {
      this.k5 = new List<>();
      this.a6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5.n5("c", var2, "radarStyle");
      if (this.l6 != null) {
         this.l6.n5("c", var2, "varyColors");
      }

      List$Enumerator var4 = this.k5.iterator();

      try {
         while (var4.hasNext()) {
            u1n var5 = (u1n)var4.next();
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

      this.aw_().n5("c", var2, "axId");
      this.u9().n5("c", var2, "axId");
      if (this.u9 != null) {
         this.u9.n5("c", var2, "extLst");
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
      u1n var1 = new u1n();
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
   public void n5(x8 var1) {
      this.u9 = (a9t)var1;
   }

   @Override
   public o6x n3() {
      return this.n5;
   }

   @Override
   public c8q y4() {
      return this.l6;
   }

   @Override
   public m3[] l6() {
      return this.k5.toArray(new u1n[0]);
   }

   @Override
   public a4s t2() {
      return this.u3;
   }

   @Override
   public y4x aw_() {
      return this.a6.get_Item(0);
   }

   @Override
   public y4x u9() {
      return this.a6.get_Item(1);
   }

   @Override
   public x8 c8() {
      return this.u9;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 o0() {
      return h0;
   }

   // $VF: synthetic method
   static o6x n5(p5g var0, o6x var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static c8q n5(p5g var0, c8q var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static List n5(p5g var0) {
      return var0.k5;
   }

   // $VF: synthetic method
   static a4s n5(p5g var0, a4s var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static List l6(p5g var0) {
      return var0.a6;
   }

   // $VF: synthetic method
   static a9t n5(p5g var0, a9t var1) {
      return var0.u9 = var1;
   }
}
