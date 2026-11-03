package com.aspose.slides.internal.a0;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.ms.System.IDisposable;
import com.aspose.slides.ms.System.a3;
import com.aspose.slides.ms.System.d1;
import com.aspose.slides.ms.System.q1;

public class d5 extends l6 {
   private List<j5> c8;
   private int t2;
   private int s7;
   private int x8;
   private int n3;

   public d5(int var1, int var2, int var3) {
      this.n5(31, true);
      this.t2 = var1;
      this.s7 = var2;
      this.n5 = var3;
      this.n3 = 0;
      this.y1();
   }

   private void y1() {
      this.c8 = new List<>(this.t2);
      this.x8 = (this.n5 - (this.t2 - 1) * this.s7) / this.t2;

      for (int var1 = 0; var1 < this.t2; var1++) {
         j5 var2 = new j5(this.x8);
         this.c8.addItem(var2);
      }
   }

   public final int m1() {
      return this.t2;
   }

   public final int k7() {
      return this.x8;
   }

   public final int m3() {
      return this.e_();
   }

   public final j5 t2(int var1) {
      if (var1 >= 0 && var1 < this.t2) {
         return this.c8.get_Item(var1);
      } else {
         throw new ArgumentException(d1.n5("Invalid column number ", a3.l6(var1), " requested; only 0-", a3.l6(this.t2 - 1), " available."));
      }
   }

   public final j5 z8() {
      return this.t2(this.n3);
   }

   public final int j5() {
      return this.n3;
   }

   public final j5 w1() {
      if (this.r4()) {
         this.n3++;
         return this.t2(this.n3);
      } else {
         throw new InvalidOperationException("(Internal error.) No more flows left in span.");
      }
   }

   public final boolean r4() {
      return this.n3 < this.t2 - 1;
   }

   public final void c4() {
      int var1 = Integer.MIN_VALUE;

      for (int var2 = 0; var2 < this.t2; var2++) {
         var1 = q1.n5(var1, this.t2(var2).a6());
      }

      this.l6 = var1;
   }

   public final boolean y2() {
      int var1 = 0;

      for (int var2 = 0; var2 < this.m1(); var2++) {
         j5 var3 = this.t2(var2);
         if (var3 != null && var3.c4() != null) {
            var1 += var3.c4().size();
         }
      }

      return var1 == 0;
   }

   @Override
   public void n5(com.aspose.slides.internal.v8.u3 var1) {
      switch (var1.e9().l6()) {
         case 202:
            this.u3(1);
            List$Enumerator var12 = this.c8.iterator();

            try {
               while (var12.hasNext()) {
                  j5 var13 = (j5)var12.next();
                  var13.u3(1);
               }
               break;
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var12, IDisposable.class)) {
                  var12.dispose();
               }
            }
         default:
            this.u9();
            List$Enumerator var2 = this.c8.iterator();

            try {
               while (var2.hasNext()) {
                  j5 var3 = (j5)var2.next();
                  var3.u9();
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
                  var2.dispose();
               }
            }
      }
   }

   @Override
   public String toString() {
      a5 var1 = new a5(super.toString());
      if (this.t2 > 1) {
         var1.n5(" {colCount=").k5(this.t2);
         var1.n5(", colWidth=").k5(this.x8);
         var1.n5(", curFlowIdx=").k5(this.n3);
         var1.n5("}");
      }

      return var1.toString();
   }
}
