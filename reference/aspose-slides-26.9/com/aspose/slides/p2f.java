package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

class p2f extends m3c {
   p2f(p7m var1, g3y var2) {
      super(var1, var2);
      List$Enumerator var3 = this.e2().c8().iterator();

      try {
         while (var3.hasNext()) {
            t9z var4 = (t9z)var3.next();
            e9g var5 = new e9g(var4);
            this.l6.addItem(var5);
            this.n5(var5);
            if (!var5.e2().c8() && var4.t9() != null && var4.t9().y4()) {
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
   public int O_() {
      return 4;
   }

   @Override
   protected void n5(z5 var1) {
      this.k5(var1.n5());
      this.u3(var1.l6());

      for (int var2 = 0; var2 < this.l6.size(); var2++) {
         this.l6.get_Item(var2).n3(var1);
      }

      List$Enumerator var19 = this.k5.iterator();

      try {
         while (var19.hasNext()) {
            q8o var3 = (q8o)var19.next();
            var3.n3(var3.e2());
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var19, IDisposable.class)) {
            var19.dispose();
         }
      }

      List$Enumerator var20 = this.u3.iterator();

      try {
         while (var20.hasNext()) {
            a6y var4 = (a6y)var20.next();
            var4.n3(var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var20, IDisposable.class)) {
            var20.dispose();
         }
      }

      List$Enumerator var21 = this.a6.iterator();

      try {
         while (var21.hasNext()) {
            e1o var5 = (e1o)var21.next();
            var5.n3(var1);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var21, IDisposable.class)) {
            var21.dispose();
         }
      }

      this.u9(var1);
   }

   @Override
   protected void l6() {
      com.aspose.slides.internal.o9b.y1 var1 = new com.aspose.slides.internal.o9b.y1(this.y1().p8(), this.y1().f2(), this.y1().d2(), this.y1().d5());
      f9 var2 = new f9(this.e2().t2());
      var2.n5(var1.y4());

      try {
         List var3 = new List();

         for (int var4 = 0; var4 < this.l6.size(); var4++) {
            if (this.l6.get_Item(var4).e2().c8()) {
               if (this.e2().t2().n3().getDisplayBlanksAs() == 0) {
                  this.n5(var3);
                  var3.clear();
               }
            } else {
               var3.addItem(this.l6.get_Item(var4));
            }
         }

         if (var3.size() > 0) {
            this.n5(var3);
         }
      } finally {
         var2.n5();
      }
   }
}
