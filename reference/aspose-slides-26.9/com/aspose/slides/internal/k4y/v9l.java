package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class v9l extends k7 implements e9, f0, t1, x9 {
   private w1y n5;
   private c8q l6;
   private List<t6w> k5;
   private a4s u3;
   private m9a a6;
   private d9v u9;
   private x8w h0;
   private t7q c8;
   private g0t t2;
   private List<n9p> s7;
   private a9t x8;
   private static final com.aspose.slides.internal.v6g.u9 n3 = new com.aspose.slides.internal.v6g.u9(
      "ofPieType", "varyColors", "ser", "dLbls", "gapWidth", "splitType", "splitPos", "custSplit", "secondPieSize", "serLines", "extLst"
   );

   public v9l(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.t1();
      n5(var1, new v9l$1(this, var1));
   }

   public v9l() {
      this.t1();
      this.n5 = new w1y();
   }

   private void t1() {
      this.k5 = new List<>();
      this.s7 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5.n5("c", var2, "ofPieType");
      if (this.l6 != null) {
         this.l6.n5("c", var2, "varyColors");
      }

      List$Enumerator var4 = this.k5.iterator();

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

      if (this.u3 != null) {
         this.u3.n5("c", var2, "dLbls");
      }

      if (this.a6 != null) {
         this.a6.n5("c", var2, "gapWidth");
      }

      if (this.u9 != null) {
         this.u9.n5("c", var2, "splitType");
      }

      if (this.h0 != null) {
         this.h0.n5("c", var2, "splitPos");
      }

      if (this.c8 != null) {
         this.c8.n5("c", var2, "custSplit");
      }

      if (this.t2 != null) {
         this.t2.n5("c", var2, "secondPieSize");
      }

      List$Enumerator var14 = this.s7.iterator();

      try {
         while (var14.hasNext()) {
            n9p var6 = (n9p)var14.next();
            var6.n5("c", var2, "serLines");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
            var14.dispose();
         }
      }

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
      t6w var1 = new t6w();
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
   public final m9a h0() {
      if (this.a6 != null) {
         throw new Exception("Only one <gapWidth> element can be added.");
      }

      this.a6 = new m9a();
      return this.a6;
   }

   public final d9v o0() {
      if (this.u9 != null) {
         throw new Exception("Only one <splitType> element can be added.");
      }

      this.u9 = new d9v();
      return this.u9;
   }

   public final x8w z7() {
      if (this.h0 != null) {
         throw new Exception("Only one <splitPos> element can be added.");
      }

      this.h0 = new x8w();
      return this.h0;
   }

   @Override
   public t7q d5() {
      if (this.c8 != null) {
         throw new Exception("Only one <custSplit> element can be added.");
      }

      this.c8 = new t7q();
      return this.c8;
   }

   public final g0t v4() {
      if (this.t2 != null) {
         throw new Exception("Only one <secondPieSize> element can be added.");
      }

      this.t2 = new g0t();
      return this.t2;
   }

   @Override
   public final n9p u3() {
      n9p var1 = new n9p();
      this.s7.addItem(var1);
      return var1;
   }

   @Override
   public void n5(x8 var1) {
      this.x8 = (a9t)var1;
   }

   @Override
   public w1y x8() {
      return this.n5;
   }

   @Override
   public c8q y4() {
      return this.l6;
   }

   @Override
   public m3[] l6() {
      return this.k5.toArray(new t6w[0]);
   }

   @Override
   public a4s t2() {
      return this.u3;
   }

   @Override
   public m9a t9() {
      return this.a6;
   }

   @Override
   public d9v r4() {
      return this.u9;
   }

   @Override
   public x8w w1() {
      return this.h0;
   }

   @Override
   public t7q d2() {
      return this.c8;
   }

   @Override
   public g0t k7() {
      return this.t2;
   }

   @Override
   public n9p[] m3() {
      return this.s7.toArray(new n9p[0]);
   }

   @Override
   public x8 c8() {
      return this.x8;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 u6() {
      return n3;
   }

   // $VF: synthetic method
   static w1y n5(v9l var0, w1y var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static c8q n5(v9l var0, c8q var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static List n5(v9l var0) {
      return var0.k5;
   }

   // $VF: synthetic method
   static a4s n5(v9l var0, a4s var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static m9a n5(v9l var0, m9a var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static d9v n5(v9l var0, d9v var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static x8w n5(v9l var0, x8w var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static t7q n5(v9l var0, t7q var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static g0t n5(v9l var0, g0t var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static List l6(v9l var0) {
      return var0.s7;
   }

   // $VF: synthetic method
   static a9t n5(v9l var0, a9t var1) {
      return var0.x8 = var1;
   }
}
