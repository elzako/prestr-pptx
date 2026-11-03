package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class e6 extends m3c {
   @Override
   public int O_() {
      return 4;
   }

   e6(p7m var1, g3y var2) {
      super(var1, var2);
      List$Enumerator var3 = this.e2().c8().iterator();

      try {
         while (var3.hasNext()) {
            t9z var4 = (t9z)var3.next();
            e7 var5 = new e7(var4);
            this.l6.addItem(var5);
            this.n5(var5);
            if (!var5.e2().c8() && var4.t9() != null && var4.t9().y4() && var5.e2().k5() > 0.0) {
               q1h var6 = new q1h(var5);
               this.k5.addItem(var6);
               this.n5(var6);
               if (var4.t9().l6().getDataLabelFormat().getShowLeaderLines() || var2.u9().getLabels().getDefaultDataLabelFormat().getShowLeaderLines()) {
                  a6y var7 = new a6y(var4);
                  this.u3.addItem(var7);
                  this.n5(var7);
               }
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var3, IDisposable.class)) {
            var3.dispose();
         }
      }
   }

   @Override
   protected void n5(z5 var1) {
      this.k5(var1.n5());
      this.u3(var1.l6());
      double var2 = com.aspose.slides.internal.v6g.k5.n5(this.t9(), j0.class).u3();
      float var4 = this.u3();

      for (int var5 = 0; var5 < this.l6.size(); var5++) {
         if (com.aspose.slides.ms.System.d2.k5(this.l6.get_Item(var5).e2().k5())) {
            this.l6.get_Item(var5).n3(new z5(0.0F, 0.0F));
         } else {
            float var6 = (float)(Math.PI * com.aspose.slides.ms.System.q1.a6(var4, 2.0) / var2);
            float var7 = (float)com.aspose.slides.ms.System.q1.z3(this.l6.get_Item(var5).e2().k5() * var6 / Math.PI);
            float var8 = this.l6.get_Item(var5).e2().y4().u9().getBubbleSizeScale() / 100.0F + 1.0F;
            var7 *= (float)com.aspose.slides.ms.System.q1.n5((double)(var8), (double)(var8 < 2.0F ? 2.08F : 2.03F - var8 / 50.0F));
            ILineFormat var9 = this.l6.get_Item(var5).e2().s7().getFormat().getLine();
            if (var9.isFormatNotDefined()) {
               var9 = this.e2().u9().getFormat().getLine();
            }

            float var10 = com.aspose.slides.ms.System.d2.k5(var9.getWidth()) ? 0.0F : (float)var9.getWidth() / 2.0F;
            this.l6.get_Item(var5).n3(new z5(var7 * 2.0F - var10, var7 * 2.0F - var10));
         }
      }

      List$Enumerator var26 = this.k5.iterator();

      try {
         while (var26.hasNext()) {
            q8o var27 = (q8o)var26.next();
            var27.n3(var27.e2());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var26, IDisposable.class)) {
            var26.dispose();
         }
      }

      List$Enumerator var28 = this.u3.iterator();

      try {
         while (var28.hasNext()) {
            a6y var30 = (a6y)var28.next();
            var30.n3(var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var28, IDisposable.class)) {
            var28.dispose();
         }
      }

      List$Enumerator var31 = this.a6.iterator();

      try {
         while (var31.hasNext()) {
            e1o var32 = (e1o)var31.next();
            var32.n3(var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var31, IDisposable.class)) {
            var31.dispose();
         }
      }

      this.u9(var1);
   }

   final float u3() {
      u2w var1 = com.aspose.slides.internal.v6g.k5.n5(this.y1().y1().y1(), u2w.class);
      a9v var2 = var1.a6(new z5(this.e2().t2().c4(), this.e2().t2().y2()));
      float var3 = com.aspose.slides.ms.System.q1.l6(var2.n5(), var2.l6());
      return var3 / 8.4F;
   }
}
