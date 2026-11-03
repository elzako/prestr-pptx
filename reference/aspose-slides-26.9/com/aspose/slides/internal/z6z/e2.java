package com.aspose.slides.internal.z6z;

import com.aspose.slides.internal.e1.c4;
import com.aspose.slides.internal.e1.r4;
import com.aspose.slides.internal.e1.y2;
import com.aspose.slides.internal.l7h.a5;
import com.aspose.slides.internal.o9b.w1;

public class e2 extends com.aspose.slides.internal.e1.y4 {
   private a5 n5;
   private boolean l6;

   public final String k5(r4 var1) {
      this.n5 = new a5();
      if (var1.h0() == 1) {
         this.n5.n5("F 1 ");
      }

      this.l6(var1);
      return this.n5.toString();
   }

   @Override
   public void n5(c4 var1) {
      this.l6 = true;
   }

   @Override
   public void l6(c4 var1) {
      if (var1.n5()) {
         this.n5.n5("Z");
      }
   }

   @Override
   public void n5(y2 var1) {
      if (var1.n5().size() > 0) {
         int var2 = 0;
         if (this.l6) {
            this.n5(var1.n5().get_Item(var2).u3());
            var2++;
            this.l6 = false;
         }

         for (int var3 = var2; var3 < var1.n5().size(); var3++) {
            w1 var4 = var1.n5().get_Item(var3).u3();
            this.l6(var4.u3());
         }
      }
   }

   @Override
   public void n5(com.aspose.slides.internal.e1.a6 var1) {
      if (this.l6) {
         this.n5(var1.n5().n5().u3());
         this.l6 = false;
      } else {
         this.l6(var1.n5().n5().u3());
      }

      w1[] var2 = (w1[])com.aspose.slides.ms.System.u3.n5(com.aspose.slides.ms.System.u3.n5(com.aspose.slides.internal.v6g.k5.n5(w1.class), 3));
      var1.n5().l6().n5(var2[0]);
      var1.n5().k5().n5(var2[1]);
      var1.n5().u3().n5(var2[2]);
      this.n5(var2);
   }

   private void n5(w1 var1) {
      this.n5.n5("M");
      this.k5(var1.u3());
   }

   private void l6(w1 var1) {
      this.n5.n5("L");
      this.k5(var1.u3());
   }

   private void n5(w1[] var1) {
      this.n5.n5("C");

      for (int var2 = 0; var2 < var1.length; var2++) {
         this.k5(var1[var2].u3());
      }
   }

   private void k5(w1 var1) {
      this.n5.n5(com.aspose.slides.internal.t6j.u3.n5(var1.l6()));
      this.n5.n5(",");
      this.n5.n5(com.aspose.slides.internal.t6j.u3.n5(var1.k5()));
      this.n5.n5(" ");
   }
}
