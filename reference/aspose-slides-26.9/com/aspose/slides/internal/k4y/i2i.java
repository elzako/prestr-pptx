package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class i2i extends k7 implements e9, h2, t1 {
   private c8q n5;
   private List<t6w> l6;
   private a4s k5;
   private n4m u3;
   private w2f a6;
   private a9t u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9(
      "varyColors", "ser", "dLbls", "firstSliceAng", "holeSize", "extLst"
   );

   public i2i(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.v4();
      n5(var1, new i2i$1(this, var1));
   }

   public i2i() {
      this.v4();
   }

   private void v4() {
      this.l6 = new List<>();
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
            t6w var5 = (t6w)var4.next();
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
         this.u3.n5("c", var2, "firstSliceAng");
      }

      if (this.a6 != null) {
         this.a6.n5("c", var2, "holeSize");
      }

      if (this.u9 != null) {
         this.u9.n5("c", var2, "extLst");
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
      t6w var1 = new t6w();
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

   @Override
   public final n4m n5() {
      if (this.u3 != null) {
         throw new Exception("Only one <firstSliceAng> element can be added.");
      }

      this.u3 = new n4m();
      return this.u3;
   }

   public final w2f o0() {
      if (this.a6 != null) {
         throw new Exception("Only one <holeSize> element can be added.");
      }

      this.a6 = new w2f();
      return this.a6;
   }

   @Override
   public void n5(x8 var1) {
      this.u9 = (a9t)var1;
   }

   @Override
   public c8q y4() {
      return this.n5;
   }

   @Override
   public m3[] l6() {
      return this.l6.toArray(new t6w[0]);
   }

   @Override
   public a4s t2() {
      return this.k5;
   }

   @Override
   public n4m z3() {
      return this.u3;
   }

   @Override
   public w2f m1() {
      return this.a6;
   }

   @Override
   public x8 c8() {
      return this.u9;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 z7() {
      return h0;
   }

   // $VF: synthetic method
   static c8q n5(i2i var0, c8q var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static List n5(i2i var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static a4s n5(i2i var0, a4s var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static n4m n5(i2i var0, n4m var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static w2f n5(i2i var0, w2f var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static a9t n5(i2i var0, a9t var1) {
      return var0.u9 = var1;
   }
}
