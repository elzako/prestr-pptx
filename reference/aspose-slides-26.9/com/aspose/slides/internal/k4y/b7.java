package com.aspose.slides.internal.k4y;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class b7 extends b3 {
   private float n5;
   private float l6;
   private float k5;
   private float u3;
   private List<b8> a6;
   private List<s6> u9;
   private static final com.aspose.slides.internal.v6g.u9 h0 = new com.aspose.slides.internal.v6g.u9("t", "b", "l", "r", "foregroundMark", "backgroundMark");

   public b7(com.aspose.slides.ms.System.Xml.c7 var1) {
      this.l6();
      b7$1 var2 = new b7$1(this);
      n5(var1, var2);
      n5(var1, new b7$2(this, var1));
   }

   public b7() {
      this.l6();
   }

   private void l6() {
      this.n5 = Float.NaN;
      this.l6 = Float.NaN;
      this.k5 = Float.NaN;
      this.u3 = Float.NaN;
      this.a6 = new List<>();
      this.u9 = new List<>();
   }

   @Override
   public void n5(String var1, com.aspose.slides.internal.n8e.u4 var2, String var3) {
      var2.n5(var1, var3, null);
      if (var2.n5) {
         var2.l6("t", com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.Xml.f4.n5(this.n5), "%"}));
      } else {
         var2.l6("t", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.n5 * 1000.0F), 14)));
      }

      if (var2.n5) {
         var2.l6("b", com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.Xml.f4.n5(this.l6), "%"}));
      } else {
         var2.l6("b", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.l6 * 1000.0F), 14)));
      }

      if (var2.n5) {
         var2.l6("l", com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.Xml.f4.n5(this.k5), "%"}));
      } else {
         var2.l6("l", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.k5 * 1000.0F), 14)));
      }

      if (var2.n5) {
         var2.l6("r", com.aspose.slides.ms.System.d1.n5(new String[]{com.aspose.slides.ms.System.Xml.f4.n5(this.u3), "%"}));
      } else {
         var2.l6("r", com.aspose.slides.ms.System.Xml.f4.n5(com.aspose.slides.internal.v6g.k5.u3(com.aspose.slides.ms.System.q1.u3(this.u3 * 1000.0F), 14)));
      }

      List$Enumerator var4 = this.a6.iterator();

      try {
         while (var4.hasNext()) {
            b8 var5 = (b8)var4.next();
            var5.n5("a14", var2, "foregroundMark");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }

      List$Enumerator var14 = this.u9.iterator();

      try {
         while (var14.hasNext()) {
            s6 var6 = (s6)var14.next();
            var6.n5("a14", var2, "backgroundMark");
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var14, IDisposable.class)) {
            var14.dispose();
         }
      }

      var2.s7();
   }

   // $VF: synthetic method
   static com.aspose.slides.internal.v6g.u9 n5() {
      return h0;
   }

   // $VF: synthetic method
   static float n5(b7 var0, float var1) {
      return var0.n5 = var1;
   }

   // $VF: synthetic method
   static float l6(b7 var0, float var1) {
      return var0.l6 = var1;
   }

   // $VF: synthetic method
   static float k5(b7 var0, float var1) {
      return var0.k5 = var1;
   }

   // $VF: synthetic method
   static float u3(b7 var0, float var1) {
      return var0.u3 = var1;
   }

   // $VF: synthetic method
   static List n5(b7 var0) {
      return var0.a6;
   }

   // $VF: synthetic method
   static List l6(b7 var0) {
      return var0.u9;
   }
}
