package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class k6r extends b3 {
   private h2v n5;
   private List<p2n> l6;
   private v2o k5;
   private c8q u3;
   private b9y a6;
   private j3z u9;
   private a9t h0;
   private static final com.aspose.slides.internal.v6g.u9 c8 = new com.aspose.slides.internal.v6g.u9(
      "legendPos", "legendEntry", "layout", "overlay", "spPr", "txPr", "extLst"
   );

   public k6r(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.t9();
      n5(var1, new k6r$1(this, var1));
   }

   public k6r() {
      this.t9();
   }

   private void t9() {
      this.l6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != null) {
         this.n5.n5("c", var2, "legendPos");
      }

      List$Enumerator var4 = this.l6.iterator();

      try {
         while (var4.hasNext()) {
            p2n var5 = (p2n)var4.next();
            var5.n5("c", var2, "legendEntry");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (this.k5 != null) {
         this.k5.n5("c", var2, "layout");
      }

      if (this.u3 != null) {
         this.u3.n5("c", var2, "overlay");
      }

      if (this.a6 != null) {
         this.a6.n5("c", var2, "spPr");
      }

      if (this.u9 != null) {
         this.u9.n5("c", var2, "txPr");
      }

      if (this.h0 != null) {
         this.h0.n5("c", var2, "extLst");
      }

      var2.s7();
   }

   public final h2v n5() {
      if (this.n5 != null) {
         throw new Exception("Only one <legendPos> element can be added.");
      }

      this.n5 = new h2v();
      return this.n5;
   }

   public final p2n l6() {
      p2n var1 = new p2n();
      this.l6.addItem(var1);
      return var1;
   }

   public final v2o k5() {
      if (this.k5 != null) {
         throw new Exception("Only one <layout> element can be added.");
      }

      this.k5 = new v2o();
      return this.k5;
   }

   public final c8q u3() {
      if (this.u3 != null) {
         throw new Exception("Only one <overlay> element can be added.");
      }

      this.u3 = new c8q();
      return this.u3;
   }

   public final b9y a6() {
      if (this.a6 != null) {
         throw new Exception("Only one <spPr> element can be added.");
      }

      this.a6 = new b9y();
      return this.a6;
   }

   public final j3z u9() {
      if (this.u9 != null) {
         throw new Exception("Only one <txPr> element can be added.");
      }

      this.u9 = new j3z();
      return this.u9;
   }

   public final h2v h0() {
      return this.n5;
   }

   public final p2n[] c8() {
      return this.l6.toArray(new p2n[0]);
   }

   public final v2o t2() {
      return this.k5;
   }

   public final c8q s7() {
      return this.u3;
   }

   public final b9y x8() {
      return this.a6;
   }

   public final j3z n3() {
      return this.u9;
   }

   public final x8 y4() {
      return this.h0;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 e2() {
      return c8;
   }

   // $VF: synthetic method
   static h2v n5(k6r var0, h2v var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static List n5(k6r var0) {
      return var0.l6;
   }

   // $VF: synthetic method
   static v2o n5(k6r var0, v2o var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static c8q n5(k6r var0, c8q var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static b9y n5(k6r var0, b9y var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static j3z n5(k6r var0, j3z var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static a9t n5(k6r var0, a9t var1) {
      return var0.h0 = var1;
   }
}
