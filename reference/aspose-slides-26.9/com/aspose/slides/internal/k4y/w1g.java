package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class w1g extends k7 implements e9, t1 {
   private c8q n5;
   private List<g4d> l6;
   private a4s k5;
   private c8q u3;
   private c3g a6;
   private c8q u9;
   private g3x h0;
   private List<y4x> c8;
   private a9t t2;
   private static final com.aspose.slides.internal.v6g.u9 s7 = new com.aspose.slides.internal.v6g.u9(
      "varyColors", "ser", "dLbls", "bubble3D", "bubbleScale", "showNegBubbles", "sizeRepresents", "axId", "extLst"
   );

   public w1g(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.t1();
      n5(var1, new w1g$1(this, var1));
   }

   public w1g() {
      this.t1();
      this.c8.addItem(new y4x());
      this.c8.addItem(new y4x());
   }

   private void t1() {
      this.l6 = new List<>();
      this.c8 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("c", var2, "varyColors");
      }

      List$Enumerator var4 = this.l6.iterator();

      try {
         while (var4.hasNext()) {
            g4d var5 = (g4d)var4.next();
            var5.n5("c", var2, "ser");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (this.k5 != null) {
         this.k5.n5("c", var2, "dLbls");
      }

      if (this.u3 != null) {
         this.u3.n5("c", var2, "bubble3D");
      }

      if (this.a6 != null) {
         this.a6.n5("c", var2, "bubbleScale");
      }

      if (this.u9 != null) {
         this.u9.n5("c", var2, "showNegBubbles");
      }

      if (this.h0 != null) {
         this.h0.n5("c", var2, "sizeRepresents");
      }

      this.aw_().n5("c", var2, "axId");
      this.u9().n5("c", var2, "axId");
      if (this.t2 != null) {
         this.t2.n5("c", var2, "extLst");
      }

      var2.s7();
   }

   @Override
   public final c8q y2() {
      if (this.n5 != null) {
         throw new Exception("Only one <varyColors> element can be added.");
      }

      this.n5 = new c8q();
      return this.n5;
   }

   @Override
   public m3 k5() {
      g4d var1 = new g4d();
      this.l6.addItem(var1);
      return var1;
   }

   @Override
   public final a4s c4() {
      if (this.k5 != null) {
         throw new Exception("Only one <dLbls> element can be added.");
      }

      this.k5 = new a4s();
      return this.k5;
   }

   public final c3g o0() {
      if (this.a6 != null) {
         throw new Exception("Only one <bubbleScale> element can be added.");
      }

      this.a6 = new c3g();
      return this.a6;
   }

   public final c8q z7() {
      if (this.u9 != null) {
         throw new Exception("Only one <showNegBubbles> element can be added.");
      }

      this.u9 = new c8q();
      return this.u9;
   }

   public final g3x v4() {
      if (this.h0 != null) {
         throw new Exception("Only one <sizeRepresents> element can be added.");
      }

      this.h0 = new g3x();
      return this.h0;
   }

   @Override
   public void n5(x8 var1) {
      this.t2 = (a9t)var1;
   }

   @Override
   public c8q y4() {
      return this.n5;
   }

   @Override
   public m3[] l6() {
      return this.l6.toArray(new g4d[0]);
   }

   @Override
   public a4s t2() {
      return this.k5;
   }

   @Override
   public c8q e5() {
      return this.u3;
   }

   @Override
   public c3g y1() {
      return this.a6;
   }

   @Override
   public c8q z8() {
      return this.u9;
   }

   @Override
   public g3x j5() {
      return this.h0;
   }

   @Override
   public y4x aw_() {
      return this.c8.get_Item(0);
   }

   @Override
   public y4x u9() {
      return this.c8.get_Item(1);
   }

   @Override
   public x8 c8() {
      return this.t2;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u6() {
      return s7;
   }

   // $VF: synthetic method
   static c8q n5(w1g var0, c8q var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static List n5(w1g var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static a4s n5(w1g var0, a4s var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static c8q l6(w1g var0, c8q var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static c3g n5(w1g var0, c3g var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static c8q k5(w1g var0, c8q var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static g3x n5(w1g var0, g3x var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static List l6(w1g var0) {
      return var0.c8;
   }

   // $VF: synthetic method
   static a9t n5(w1g var0, a9t var1) {
      return var0.t2 = var1;
   }
}
