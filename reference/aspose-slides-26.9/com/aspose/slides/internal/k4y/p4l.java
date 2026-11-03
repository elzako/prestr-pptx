package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class p4l extends b3 {
   private q5v n5;
   private q5v l6;
   private q5v k5;
   private List<x5h> u3;
   private l8r a6;
   private static final com.aspose.slides.internal.v6g.u9 u9 = new com.aspose.slides.internal.v6g.u9("latin", "ea", "cs", "font", "extLst");

   public p4l(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.c8();
      n5(var1, new p4l$1(this, var1));
   }

   public p4l() {
      this.c8();
      this.n5 = new q5v();
      this.l6 = new q5v();
      this.k5 = new q5v();
   }

   private void c8() {
      this.u3 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      this.n5.n5("a", var2, "latin");
      this.l6.n5("a", var2, "ea");
      this.k5.n5("a", var2, "cs");
      List$Enumerator var4 = this.u3.iterator();

      try {
         while (var4.hasNext()) {
            x5h var5 = (x5h)var4.next();
            var5.n5("a", var2, "font");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      if (this.a6 != null) {
         this.a6.n5("a", var2, "extLst");
      }

      var2.s7();
   }

   public final x5h n5() {
      x5h var1 = new x5h();
      this.u3.addItem(var1);
      return var1;
   }

   public final void n5(x8 var1) {
      this.a6 = (l8r)var1;
   }

   public final q5v l6() {
      return this.n5;
   }

   public final q5v k5() {
      return this.l6;
   }

   public final q5v u3() {
      return this.k5;
   }

   public final x5h[] a6() {
      return this.u3.toArray(new x5h[0]);
   }

   public final x8 u9() {
      return this.a6;
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 h0() {
      return u9;
   }

   // $VF: synthetic method
   static q5v n5(p4l var0, q5v var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static q5v l6(p4l var0, q5v var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static q5v k5(p4l var0, q5v var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static List n5(p4l var0) {
      return var0.u3;
   }

   // $VF: synthetic method
   static l8r n5(p4l var0, l8r var1) {
      return var0.a6 = var1;
   }
}
