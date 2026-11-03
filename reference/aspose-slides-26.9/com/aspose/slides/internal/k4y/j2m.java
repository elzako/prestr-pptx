package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class j2m extends b3 {
   private int n5;
   private List<x4j> l6;
   private static final com.aspose.slides.internal.v6g.u9 k5 = new com.aspose.slides.internal.v6g.u9("v:ext", "rel");

   public j2m(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.u3();
      j2m$1 var2 = new j2m$1(this);
      n5(var1, var2);
      n5(var1, new j2m$2(this, var1));
   }

   public j2m() {
      this.u3();
   }

   private void u3() {
      this.n5 = 0;
      this.l6 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (this.n5 != 0) {
         var2.l6("v:ext", a3n.n5(this.n5));
      }

      List$Enumerator var4 = this.l6.iterator();

      try {
         while (var4.hasNext()) {
            x4j var5 = (x4j)var4.next();
            var5.n5("o", var2, "rel");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      var2.s7();
   }

   public final x4j n5() {
      x4j var1 = new x4j();
      this.l6.addItem(var1);
      return var1;
   }

   public final void n5(int var1) {
      this.n5 = var1;
   }

   public final x4j[] l6() {
      return this.l6.toArray(new x4j[0]);
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 k5() {
      return k5;
   }

   // $VF: synthetic method
   static int n5(j2m var0, int var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static List n5(j2m var0) {
      return var0.l6;
   }
}
