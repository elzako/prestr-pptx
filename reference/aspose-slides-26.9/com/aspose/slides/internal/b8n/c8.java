package com.aspose.slides.internal.b8n;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.internal.b5j.n3;
import com.aspose.slides.internal.o9b.f2;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.n1;
import com.aspose.slides.ms.System.z3;

public class c8 extends com.aspose.slides.internal.k2s.k5 {
   private final u3 n5;
   private final n3 l6;
   private com.aspose.slides.internal.k2s.l6 k5 = null;
   private com.aspose.slides.internal.k2s.a6 u3 = null;
   private final com.aspose.slides.internal.e1.t2 a6;

   public c8(com.aspose.slides.internal.e1.t2 var1, u3 var2, n3 var3, com.aspose.slides.internal.k2s.l6 var4, com.aspose.slides.internal.k2s.a6 var5) {
      super(var4, var5);
      this.a6 = var1;
      this.n5 = var2;
      this.l6 = var3;
   }

   @Override
   public float n5(com.aspose.slides.internal.d0e.t2 var1, char var2, float var3, float var4, float var5, f2 var6) {
      com.aspose.slides.internal.f7k.u9 var7 = this.l6(var2);
      this.n5(var1, var7, var3, var4, var5, this.n5(), this.a6, var6.a6());
      return this.n5(var2);
   }

   private void n5(
      com.aspose.slides.internal.d0e.t2 var1,
      com.aspose.slides.internal.f7k.u9 var2,
      float var3,
      float var4,
      float var5,
      float var6,
      com.aspose.slides.internal.e1.t2 var7,
      f2 var8
   ) {
      float var9 = n3.k5();
      var3 *= var9;
      var4 *= var9;
      var6 *= var9;
      Dictionary var10 = new Dictionary();
      var10.addItem("d", var2.d5());
      String var11 = d1.n5;
      if (var1.l6.n5("transform")) {
         var11 = d1.n5(var11, var1.l6.k5("transform"));
      }

      var11 = d1.n5(
         var11, d1.n5(new String[]{" translate(", z3.n5(var3, com.aspose.slides.internal.x7n.l6.k5()), ",", z3.n5(var4, com.aspose.slides.internal.x7n.l6.k5()), ")"})
      );
      if (var1.l6.n5("rotate")) {
         var11 = d1.n5(var11, d1.n5(new String[]{" rotate(", com.aspose.slides.internal.b3z.c8.n5(var5), ")"}));
      }

      var11 = d1.n5(var11, d1.n5(" scale({0},-{0})", new Object[]{z3.n5(var6, com.aspose.slides.internal.x7n.l6.k5())}));
      if (var1.n5.l6.n5("glyph-orientation-horizontal")) {
         float var12 = this.l6.n5(var1.n5.l6.k5("glyph-orientation-horizontal"), d1.n5, var1);
         var11 = d1.n5(var11, d1.n5(new String[]{" rotate(", n1.u9(var12 * -1.0F), ")"}));
      }

      var10.addItem("transform", var11);
      IGenericEnumerator var22 = var1.l6.iterator();

      try {
         while (var22.hasNext()) {
            KeyValuePair var13 = (KeyValuePair)var22.next();
            if (!var10.containsKey(var13.getKey()) && !"rotate".equals(var13.getKey())) {
               var10.addItem(d1.l6((String)var13.getKey()), d1.l6((String)var13.getValue()));
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var22, IDisposable.class)) {
            var22.dispose();
         }
      }

      com.aspose.slides.internal.z9u.l6 var23 = new com.aspose.slides.internal.z9u.l6("path", new com.aspose.slides.internal.d0e.k5(var10), null);
      this.n5.n5(var23, var7, var8.a6());
   }
}
