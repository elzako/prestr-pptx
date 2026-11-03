package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.ms.System.IDisposable;

public class t7m extends b3 {
   private int n5;
   private n9v l6;
   private b9y k5;
   private j3z u3;
   private e5k a6;
   private String u9;
   private List<s7m> h0;
   private List<y8i> c8;
   private h6m t2;
   private static final com.aspose.slides.internal.v6g.u9 s7 = new com.aspose.slides.internal.v6g.u9(
      "pos", "numFmt", "spPr", "txPr", "visibility", "separator", "dataLabel", "dataLabelHidden", "extLst"
   );

   public t7m(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.t4();
      t7m$1 var2 = new t7m$1(this);
      n5(var1, var2);
      n5(var1, new t7m$2(this, var1));
   }

   public t7m() {
      this.t4();
   }

   private void t4() {
      this.n5 = 0;
      this.h0 = new List<>();
      this.c8 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != 0) {
         var2.l6("pos", v2p.n5(this.n5));
      }

      if (this.l6 != null) {
         this.l6.n5("cx", var2, "numFmt");
      }

      if (this.k5 != null) {
         this.k5.n5("cx", var2, "spPr");
      }

      if (this.u3 != null) {
         this.u3.n5("cx", var2, "txPr");
      }

      if (this.a6 != null) {
         this.a6.n5("cx", var2, "visibility");
      }

      if (this.u9 != null) {
         this.n5("cx", var2, "separator", this.u9, false);
      }

      List$Enumerator var4 = this.h0.iterator();

      try {
         while (var4.hasNext()) {
            s7m var5 = (s7m)var4.next();
            var5.n5("cx", var2, "dataLabel");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      List$Enumerator var14 = this.c8.iterator();

      try {
         while (var14.hasNext()) {
            y8i var6 = (y8i)var14.next();
            var6.n5("cx", var2, "dataLabelHidden");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
            var14.dispose();
         }
      }

      if (this.t2 != null) {
         this.t2.n5("cx", var2, "extLst");
      }

      var2.s7();
   }

   public final n9v n5() {
      if (this.l6 != null) {
         throw new Exception("Only one <numFmt> element can be added.");
      }

      this.l6 = new n9v();
      return this.l6;
   }

   public final b9y l6() {
      if (this.k5 != null) {
         throw new Exception("Only one <spPr> element can be added.");
      }

      this.k5 = new b9y();
      return this.k5;
   }

   public final j3z k5() {
      if (this.u3 != null) {
         throw new Exception("Only one <txPr> element can be added.");
      }

      this.u3 = new j3z();
      return this.u3;
   }

   public final e5k u3() {
      if (this.a6 != null) {
         throw new Exception("Only one <visibility> element can be added.");
      }

      this.a6 = new e5k();
      return this.a6;
   }

   public final s7m a6() {
      s7m var1 = new s7m();
      this.h0.addItem(var1);
      return var1;
   }

   public final y8i u9() {
      y8i var1 = new y8i();
      this.c8.addItem(var1);
      return var1;
   }

   public final void n5(h6m var1) {
      this.t2 = var1;
   }

   public final int h0() {
      return this.n5;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final n9v c8() {
      return this.l6;
   }

   public final b9y t2() {
      return this.k5;
   }

   public final j3z s7() {
      return this.u3;
   }

   public final e5k x8() {
      return this.a6;
   }

   public final String n3() {
      return this.u9;
   }

   public final void n5(String var1) {
      this.u9 = var1;
   }

   public final s7m[] y4() {
      return this.h0.toArray(new s7m[0]);
   }

   public final y8i[] e2() {
      return this.c8.toArray(new y8i[0]);
   }

   public final h6m t9() {
      return this.t2;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 z1() {
      return s7;
   }

   // $VF: synthetic method
   static int n5(t7m var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static n9v n5(t7m var0, n9v var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static b9y n5(t7m var0, b9y var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static j3z n5(t7m var0, j3z var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static e5k n5(t7m var0, e5k var1) {
      return var0.a6 = var1;
   }

   // $VF: synthetic method
   static String n5(t7m var0, String var1) {
      return var0.u9 = var1;
   }

   // $VF: synthetic method
   static String n5(t7m var0) {
      return var0.u9;
   }

   // $VF: synthetic method
   static List l6(t7m var0) {
      return var0.h0;
   }

   // $VF: synthetic method
   static List k5(t7m var0) {
      return var0.c8;
   }

   // $VF: synthetic method
   static h6m n5(t7m var0, h6m var1) {
      return var0.t2 = var1;
   }
}
