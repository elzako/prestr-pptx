package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class r6c$l6 {
   private final com.aspose.slides.internal.k4y.x4j n5;
   private final List<r6c$l6> l6;
   private com.aspose.slides.internal.k4y.m1 k5;

   public final com.aspose.slides.internal.k4y.x4j n5() {
      return this.n5;
   }

   public r6c$l6(r6c$l6 var1, com.aspose.slides.internal.k4y.x4j var2, IGenericEnumerable<com.aspose.slides.internal.k4y.m1> var3) {
      this.n5 = var2;
      this.l6 = new List<>();
      IGenericEnumerator var4 = var3.iterator();

      try {
         while (var4.hasNext()) {
            com.aspose.slides.internal.k4y.m1 var5 = (com.aspose.slides.internal.k4y.m1)var4.next();
            if (com.aspose.slides.ms.System.d1.a6(var5.n5(), com.aspose.slides.ms.System.d1.k5(var2.n5(), 1))) {
               this.k5 = var5;
               break;
            }
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var4, IDisposable.class)) {
            var4.dispose();
         }
      }
   }

   public final void n5(com.aspose.slides.internal.k4y.j2m var1, IGenericEnumerable<com.aspose.slides.internal.k4y.m1> var2) {
      for (com.aspose.slides.internal.k4y.x4j var6 : var1.l6()) {
         if (this.n5() != var6 && com.aspose.slides.ms.System.d1.a6(var6.l6(), this.n5().n5())) {
            r6c$l6 var7 = new r6c$l6(this, var6, var2);
            this.l6.addItem(var7);
            var7.n5(var1, var2);
         }
      }
   }

   public final void n5(ISmartArtNodeCollection var1, IShapeCollection var2) {
      if (this.k5 != null) {
         ISmartArtNode var3 = var1.addNode();
         long var4 = 0L;
         long[] var6 = new long[]{0L};
         boolean var7 = r6c.n5(this.k5.n5(), var6);
         var4 = var6[0];
         if (var7) {
            IGenericEnumerator var8 = var2.iterator();

            try {
               while (var8.hasNext()) {
                  IShape var9 = (IShape)var8.next();
                  AutoShape var10 = com.aspose.slides.internal.v6g.k5.n5(var9, AutoShape.class);
                  if (var10 != null
                     && var10.n5().z3() == var4
                     && var10.l6() != null
                     && !com.aspose.slides.ms.System.d1.a6(var10.l6().getText(), com.aspose.slides.ms.System.d1.n5)) {
                     var3.getTextFrame().setText(var10.l6().getText());
                  }
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var8, IDisposable.class)) {
                  var8.dispose();
               }
            }
         }

         var3.setAssistant(this.k5.u9() == 2);
         var3.setOrganizationChartLayout(this.l6());
         List$Enumerator var20 = this.l6.iterator();

         try {
            while (var20.hasNext()) {
               r6c$l6 var21 = (r6c$l6)var20.next();
               var21.n5(var3.getChildNodes(), var2);
            }
         } finally {
            if (com.aspose.slides.internal.v6g.k5.n5(var20, IDisposable.class)) {
               var20.dispose();
            }
         }
      }
   }

   private int l6() {
      switch (this.k5.a6()) {
         case 1:
            return 2;
         case 2:
            return 4;
         case 3:
            return 3;
         default:
            return 1;
      }
   }
}
