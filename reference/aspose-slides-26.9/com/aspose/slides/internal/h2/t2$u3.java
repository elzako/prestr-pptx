package com.aspose.slides.internal.h2;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.n1;
import com.aspose.slides.ms.System.o5;
import com.aspose.slides.ms.System.q1;

public class t2$u3 extends t2$k5 {
   private int n5;
   private float l6;
   private List<t2$u3$n5> k5;

   public t2$u3(String var1) {
      super(0);
      String[] var2 = d1.n5(var1, new char[]{','}, (short)1);
      if (var2.length > 0) {
         float[] var3 = new float[]{this.l6};
         boolean var4 = !n1.n5(d1.l6(var2[0]), var3);
         this.l6 = var3[0];
         if (var4) {
            switch (t2.u9().n5(d1.s7(d1.l6(var2[0])))) {
               case 0:
                  this.n5 = 0;
                  break;
               case 1:
                  this.n5 = 1;
                  break;
               case 2:
                  this.n5 = 2;
                  break;
               case 3:
                  this.n5 = 3;
            }
         } else {
            this.n5 = 4;
         }

         this.k5 = new List<>(var2.length - 1);

         for (int var5 = 1; var5 < var2.length; var5++) {
            String[] var6 = d1.n5(var2[var5], new char[]{' '}, (short)1);
            com.aspose.slides.internal.r7c.c8 var7 = new com.aspose.slides.internal.r7c.c8(
               "#([0-9a-f][0-9a-f])([0-9a-f][0-9a-f])([0-9a-f][0-9a-f])([0-9a-f][0-9a-f])", 66
            );
            com.aspose.slides.internal.r7c.u3 var8 = var7.l6(var6[0]);
            t2$u3$n5 var9 = new t2$u3$n5(null);
            var9.n5(
               com.aspose.slides.internal.p1s.n5.n5(
                  com.aspose.slides.ms.System.z3.l6(var8.a6().n5(1).k5(), 16),
                  com.aspose.slides.ms.System.z3.l6(var8.a6().n5(2).k5(), 16),
                  com.aspose.slides.ms.System.z3.l6(var8.a6().n5(3).k5(), 16),
                  com.aspose.slides.ms.System.z3.l6(var8.a6().n5(4).k5(), 16)
               )
            );
            if (var6.length > 1) {
               var9.n5(new o5<>(n1.n5(var6[1], com.aspose.slides.internal.x7n.l6.k5())));
            }

            this.k5.addItem(var9);
         }
      }
   }

   private float l6(com.aspose.slides.internal.o9b.y1 var1) {
      if (this.n5 == 4) {
         return this.l6 - 90.0F;
      }

      float var2 = (float)(q1.t9(var1.k5() / var1.s7()) * 180.0 / Math.PI);
      switch (this.n5) {
         case 0:
            return -(var2 + 90.0F);
         case 1:
            return -(90.0F - var2);
         case 2:
            return var2 + 90.0F;
         case 3:
            return 90.0F - var2;
         default:
            return 0.0F;
      }
   }

   private com.aspose.slides.internal.w0.u9[] n5() {
      List var1 = new List(this.k5.size());
      List var2 = new List(this.k5.size());
      List$Enumerator var3 = this.k5.iterator();

      try {
         while (var3.hasNext()) {
            t2$u3$n5 var4 = (t2$u3$n5)var3.next();
            t2$u3$n5 var5 = new t2$u3$n5(null);
            var5.n5(new com.aspose.slides.internal.p1s.n5(var4.n5().h0()));
            var5.n5(var4.l6().k5());
            var2.addItem(var5);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }

      if (!((t2$u3$n5)var2.get_Item(0)).l6().l6()) {
         ((t2$u3$n5)var2.get_Item(0)).n5(new o5<>(0.0F));
      }

      if (!((t2$u3$n5)var2.get_Item(this.k5.size() - 1)).l6().l6()) {
         ((t2$u3$n5)var2.get_Item(this.k5.size() - 1)).n5(new o5<>(1.0F));
      }

      for (int var17 = 1; var17 < this.k5.size() - 1; var17++) {
         if (!((t2$u3$n5)var2.get_Item(var17)).l6().l6()) {
            float var21 = ((t2$u3$n5)var2.get_Item(var17 - 1)).l6().n5();
            float var6 = 0.0F;
            int var7 = 1;

            for (int var8 = var17 + 1; var8 < this.k5.size(); var8++) {
               if (((t2$u3$n5)var2.get_Item(var8)).l6().l6()) {
                  var6 = ((t2$u3$n5)var2.get_Item(var8)).l6().n5();
                  break;
               }

               var7++;
            }

            float var23 = (var6 - var21) / (var7 + 1);

            for (int var9 = var17; var9 < var17 + var7; var9++) {
               ((t2$u3$n5)var2.get_Item(var9)).n5(new o5<>(var21 + var23 * (var9 - var17 + 1)));
            }
         }
      }

      if (((t2$u3$n5)var2.get_Item(0)).l6().n5() != 0.0F) {
         t2$u3$n5 var18 = new t2$u3$n5(null);
         var18.n5(new com.aspose.slides.internal.p1s.n5(0, 255, 255, 255));
         var18.n5(new o5<>(0.0F));
         var2.insertItem(0, var18);
      }

      if (((t2$u3$n5)var2.get_Item(var2.size() - 1)).l6().n5() != 1.0F) {
         t2$u3$n5 var19 = new t2$u3$n5(null);
         var19.n5(new com.aspose.slides.internal.p1s.n5(0, 255, 255, 255));
         var19.n5(new o5<>(1.0F));
         var2.addItem(var19);
      }

      List$Enumerator var20 = var2.iterator();

      try {
         while (var20.hasNext()) {
            t2$u3$n5 var22 = (t2$u3$n5)var20.next();
            var1.addItem(new com.aspose.slides.internal.w0.u9(var22.n5(), var22.l6().n5()));
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var20, IDisposable.class)) {
            var20.dispose();
         }
      }

      return (com.aspose.slides.internal.w0.u9[])var1.toArray(new com.aspose.slides.internal.w0.u9[0]);
   }

   @Override
   public com.aspose.slides.internal.w0.l6 n5(com.aspose.slides.internal.o9b.y1 var1) {
      com.aspose.slides.internal.w0.h0 var2 = new com.aspose.slides.internal.w0.h0(var1.y4(), this.l6(var1.y4()), true);
      var2.n5(this.n5());
      return var2;
   }
}
