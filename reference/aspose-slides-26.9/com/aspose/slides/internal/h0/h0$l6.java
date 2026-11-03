package com.aspose.slides.internal.h0;

import com.aspose.slides.Collections.Generic.IGenericEnumerable;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.ms.System.IDisposable;

class h0$l6 implements IGenericEnumerable<h0$n5> {
   private List<h0$n5> n5 = new List<>();

   private h0$l6() {
   }

   @Override
   public final IGenericEnumerator<h0$n5> iterator() {
      return this.n5.iterator();
   }

   public final void n5(h0$n5 var1) {
      this.n5.addItem(var1);
   }

   public final int n5() {
      return this.n5.size();
   }

   public final void n5(h0$l6 var1) {
      IGenericEnumerator var2 = var1.iterator();

      try {
         while (var2.hasNext()) {
            h0$n5 var3 = (h0$n5)var2.next();
            this.n5.addItem(var3);
         }
      } finally {
         if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
            var2.dispose();
         }
      }
   }

   public final void l6() {
      if (this.n5.size() != 0) {
         h0$n5[] var1 = new h0$n5[this.n5.size()];
         this.n5.copyTo(var1);
         this.n5.clear();
         this.n5.insertItem(0, var1[0]);

         for (int var2 = 1; var2 < var1.length; var2++) {
            h0$n5 var3 = var1[var2];
            int var4 = var3.l6();
            int var5 = var2 - 1;

            while (var5 >= 0 && this.n5.get_Item(var5).l6() > var4) {
               var5--;
            }

            this.n5.insertItem(var5 + 1, var3);
         }
      }
   }

   // Restored original synthetic constructor delegation: (Lcom/aspose/slides/internal/h0/h0$1;)V -> ()V
   h0$l6(com.aspose.slides.internal.h0.h0$1 recoveredArg0) {
      this();
   }
}
