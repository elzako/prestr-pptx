package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class a4s extends b3 {
   private List<l9a> n5;
   private p6x l6;
   private b9y k5;
   private j3z u3;
   private h5r a6;
   private c8q u9;
   private c8q h0;
   private c8q c8;
   private c8q t2;
   private c8q s7;
   private c8q x8;
   private String n3;
   private c8q y4;
   private n9p e2;
   private g7 t9;
   private a9t z1;
   private static final com.aspose.slides.internal.v6g.u9 t4 = new com.aspose.slides.internal.v6g.u9(
      "dLbl",
      "delete",
      "numFmt",
      "spPr",
      "txPr",
      "dLblPos",
      "showLegendKey",
      "showVal",
      "showCatName",
      "showSerName",
      "showPercent",
      "showBubbleSize",
      "separator",
      "showLeaderLines",
      "leaderLines",
      "extLst"
   );

   public a4s(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.d5();
      n5(var1, new a4s$1(this, var1));
   }

   public a4s() {
      this.d5();
   }

   private void d5() {
      this.n5 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      List$Enumerator var4 = this.n5.iterator();

      try {
         while (var4.hasNext()) {
            l9a var5 = (l9a)var4.next();
            var5.n5("c", var2, "dLbl");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (this.t9 != null) {
         switch (t4.n5(this.t9.n5())) {
            case 1:
               ((c8q)this.t9.k5()).n5("c", var2, this.t9.n5());
         }
      }

      if (this.l6 != null) {
         this.l6.n5("c", var2, "numFmt");
      }

      if (this.k5 != null) {
         this.k5.n5("c", var2, "spPr");
      }

      if (this.u3 != null) {
         this.u3.n5("c", var2, "txPr");
      }

      if (this.a6 != null) {
         this.a6.n5("c", var2, "dLblPos");
      }

      if (this.u9 != null) {
         this.u9.n5("c", var2, "showLegendKey");
      }

      if (this.h0 != null) {
         this.h0.n5("c", var2, "showVal");
      }

      if (this.c8 != null) {
         this.c8.n5("c", var2, "showCatName");
      }

      if (this.t2 != null) {
         this.t2.n5("c", var2, "showSerName");
      }

      if (this.s7 != null) {
         this.s7.n5("c", var2, "showPercent");
      }

      if (this.x8 != null) {
         this.x8.n5("c", var2, "showBubbleSize");
      }

      if (this.n3 != null) {
         this.n5("c", var2, "separator", this.n3, false);
      }

      if (this.y4 != null) {
         this.y4.n5("c", var2, "showLeaderLines");
      }

      if (this.e2 != null) {
         this.e2.n5("c", var2, "leaderLines");
      }

      if (this.z1 != null) {
         this.z1.n5("c", var2, "extLst");
      }

      var2.s7();
   }

   public final l9a n5() {
      l9a var1 = new l9a();
      this.n5.addItem(var1);
      return var1;
   }

   public final p6x l6() {
      if (this.l6 != null) {
         throw new Exception("Only one <numFmt> element can be added.");
      }

      this.l6 = new p6x();
      return this.l6;
   }

   public final b9y k5() {
      if (this.k5 != null) {
         throw new Exception("Only one <spPr> element can be added.");
      }

      this.k5 = new b9y();
      return this.k5;
   }

   public final j3z u3() {
      if (this.u3 != null) {
         throw new Exception("Only one <txPr> element can be added.");
      }

      this.u3 = new j3z();
      return this.u3;
   }

   public final h5r a6() {
      if (this.a6 != null) {
         throw new Exception("Only one <dLblPos> element can be added.");
      }

      this.a6 = new h5r();
      return this.a6;
   }

   public final c8q u9() {
      if (this.u9 != null) {
         throw new Exception("Only one <showLegendKey> element can be added.");
      }

      this.u9 = new c8q();
      return this.u9;
   }

   public final void n5(c8q var1) {
      this.u9 = var1;
   }

   public final c8q h0() {
      if (this.h0 != null) {
         throw new Exception("Only one <showVal> element can be added.");
      }

      this.h0 = new c8q();
      return this.h0;
   }

   public final void l6(c8q var1) {
      this.h0 = var1;
   }

   public final c8q c8() {
      if (this.c8 != null) {
         throw new Exception("Only one <showCatName> element can be added.");
      }

      this.c8 = new c8q();
      return this.c8;
   }

   public final void k5(c8q var1) {
      this.c8 = var1;
   }

   public final c8q t2() {
      if (this.t2 != null) {
         throw new Exception("Only one <showSerName> element can be added.");
      }

      this.t2 = new c8q();
      return this.t2;
   }

   public final void u3(c8q var1) {
      this.t2 = var1;
   }

   public final c8q s7() {
      if (this.s7 != null) {
         throw new Exception("Only one <showPercent> element can be added.");
      }

      this.s7 = new c8q();
      return this.s7;
   }

   public final void a6(c8q var1) {
      this.s7 = var1;
   }

   public final c8q x8() {
      if (this.x8 != null) {
         throw new Exception("Only one <showBubbleSize> element can be added.");
      }

      this.x8 = new c8q();
      return this.x8;
   }

   public final void u9(c8q var1) {
      this.x8 = var1;
   }

   public final c8q n3() {
      if (this.y4 != null) {
         throw new Exception("Only one <showLeaderLines> element can be added.");
      }

      this.y4 = new c8q();
      return this.y4;
   }

   public final void h0(c8q var1) {
      this.y4 = var1;
   }

   public final n9p y4() {
      if (this.e2 != null) {
         throw new Exception("Only one <leaderLines> element can be added.");
      }

      this.e2 = new n9p();
      return this.e2;
   }

   public final x8 e2() {
      if (this.z1 != null) {
         throw new Exception("Only one <extLst> element can be added.");
      }

      this.z1 = new a9t();
      return this.z1;
   }

   public final g7 n5(String var1) {
      if (this.t9 != null) {
         throw new Exception("Delete already is initialized.");
      }

      switch (t4.n5(var1)) {
         case 1:
            this.t9 = new g7("delete", new c8q());
            return this.t9;
         default:
            throw new Exception(com.aspose.slides.ms.System.d1.n5(new String[]{"Wrong element: ", var1}));
      }
   }

   public final l9a[] t9() {
      return this.n5.toArray(new l9a[0]);
   }

   public final p6x z1() {
      return this.l6;
   }

   public final b9y t4() {
      return this.k5;
   }

   public final j3z q0() {
      return this.u3;
   }

   public final h5r z3() {
      return this.a6;
   }

   public final c8q m1() {
      return this.u9;
   }

   public final c8q k7() {
      return this.h0;
   }

   public final c8q m3() {
      return this.c8;
   }

   public final c8q z8() {
      return this.t2;
   }

   public final c8q j5() {
      return this.s7;
   }

   public final c8q w1() {
      return this.x8;
   }

   public final String r4() {
      return this.n3;
   }

   public final void l6(String var1) {
      this.n3 = var1;
   }

   public final c8q c4() {
      return this.y4;
   }

   public final n9p y2() {
      return this.e2;
   }

   public final g7 y1() {
      return this.t9;
   }

   public final x8 a0() {
      return this.z1;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 d2() {
      return t4;
   }

   // $VF: synthetic method
   static List n5(a4s var0) {
      return var0.n5;
   }

   // $VF: synthetic method
   static g7 n5(a4s var0, g7 var1) {
      return var0.t9 = var1;
   }

   // $VF: synthetic method
   static p6x n5(a4s var0, p6x var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static b9y n5(a4s var0, b9y var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static j3z n5(a4s var0, j3z var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static h5r n5(a4s var0, h5r var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static c8q n5(a4s var0, c8q var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static c8q l6(a4s var0, c8q var1) {
      return var0.h0 = var1;
   }

   // $VF: synthetic method
   static c8q k5(a4s var0, c8q var1) {
      return var0.c8 = var1;
   }

   // $VF: synthetic method
   static c8q u3(a4s var0, c8q var1) {
      return var0.t2 = var1;
   }

   // $VF: synthetic method
   static c8q a6(a4s var0, c8q var1) {
      return var0.s7 = var1;
   }

   // $VF: synthetic method
   static c8q u9(a4s var0, c8q var1) {
      return var0.x8 = var1;
   }

   // $VF: synthetic method
   static String n5(a4s var0, String var1) {
      return var0.n3 = var1;
   }

   // $VF: synthetic method
   static String l6(a4s var0) {
      return var0.n3;
   }

   // $VF: synthetic method
   static c8q h0(a4s var0, c8q var1) {
      return var0.y4 = var1;
   }

   // $VF: synthetic method
   static n9p n5(a4s var0, n9p var1) {
      return var0.e2 = var1;
   }

   // $VF: synthetic method
   static a9t n5(a4s var0, a9t var1) {
      return var0.z1 = var1;
   }
}
