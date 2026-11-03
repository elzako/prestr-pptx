package com.aspose.slides.internal.q6;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.Generic.List$Enumerator;
import com.aspose.slides.ms.System.IDisposable;

public class s7 extends com.aspose.slides.internal.i3.v4 {
   private List<x8> n5;
   private boolean l6;

   public final boolean n5() {
      return this.l6;
   }

   private void n5(boolean var1) {
      this.l6 = var1;
   }

   public s7() {
      this.k5(65535);
      this.n5 = new List<>();
   }

   public final byte[] l6() {
      if (this.n5()) {
         com.aspose.slides.internal.z0k.e2 var1 = new com.aspose.slides.internal.z0k.e2();

         try {
            List$Enumerator var2 = this.n5.iterator();

            try {
               while (var2.hasNext()) {
                  x8 var3 = (x8)var2.next();
                  var1.write(var3.y4(), 0, var3.y4().length);
               }
            } finally {
               if (com.aspose.slides.internal.v6g.k5.n5(var2, IDisposable.class)) {
                  var2.dispose();
               }
            }

            return var1.toArray();
         } finally {
            if (var1 != null) {
               var1.dispose();
            }
         }
      } else {
         return null;
      }
   }

   public final void n5(x8 var1) {
      this.n5.addItem(var1);
      this.n5((var1.x8() & 4294967295L) == 0L && this.n5.size() == (var1.t2() & 4294967295L));
   }
}
